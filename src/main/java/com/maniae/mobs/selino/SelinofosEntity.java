package com.maniae.mobs.selino;

import com.maniae.mobs.selino.ai.UntamedAI;
import com.maniae.mobs.selino.parts.SelinofosPart;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Tameable;
import net.minecraft.entity.ai.TargetPredicate;
import net.minecraft.entity.ai.pathing.BirdNavigation;
import net.minecraft.entity.ai.pathing.EntityNavigation;
import net.minecraft.entity.ai.pathing.MobNavigation;
import net.minecraft.entity.ai.pathing.PathNodeNavigator;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.boss.dragon.EnderDragonFight;
import net.minecraft.entity.boss.dragon.EnderDragonPart;
import net.minecraft.entity.boss.dragon.phase.PhaseType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtHelper;
import net.minecraft.network.packet.s2c.play.MobSpawnS2CPacket;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

public class SelinofosEntity extends PathAwareEntity implements Tameable {
    SelinofosPart leftLeg = new SelinofosPart(this,"leftLeg",100,100);
    SelinofosPart rightLeg = new SelinofosPart(this,"rightLeg",100,100);
    SelinofosPart tail = new SelinofosPart(this,"tail",100,100);
    SelinofosPart neck = new SelinofosPart(this,"neck",100,100);
    SelinofosPart head = new SelinofosPart(neck,"head",100,100);
    private final SelinofosPart[] parts;
    private int ageTicks = 0;
    private BlockPos territoryCenterPos = BlockPos.ORIGIN;
    private int territoryRange = 0;
    private int foodLevel = 0;
    private int matureAge = 2000; //at 2000 ageticks its considered mature.
    private int maxAge = 9000; //at 9000 age ticks it can't age anymore
    private UUID ownerUUID;

    public void Feed(int amount){
        foodLevel += amount;
    }

    public int getAgeTicks() {
        return ageTicks;
    }

    public int getFoodLevel() {
        return foodLevel;
    }

    public int getTerritoryRange() {
        return territoryRange;
    }

    public boolean isHungry(){
        return getFoodLevel() <= 3000;
    }

    public boolean isAdult(){
        return ageTicks >= matureAge;
    }

    public SelinofosEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
        this.parts = new SelinofosPart[]{leftLeg,rightLeg,tail,neck,head};
        InitEntity();
        Init_WildBrain();
    }

    @Override
    public void tick() {
        super.tick();
        if (ageTicks < maxAge)
            ageTicks++;
    }

    private void InitEntity(){
        BirdNavigation birdNavigation = new BirdNavigation(this,world){
            @Override
            public boolean isValidPosition(BlockPos pos) {
                return world.getBlockState(pos).isAir() || entity.isOnGround() || this.isInLiquid();
            }
        };
        birdNavigation.setCanEnterOpenDoors(ageTicks < matureAge); //only baby dragons can enter open doors
        birdNavigation.setCanPathThroughDoors(ageTicks < matureAge);
        this.navigation=birdNavigation;
    }
    //This is the wild brain, the brain of the untamed dragon
    private void Init_WildBrain(){
        this.goalSelector.clear();//Clear our goal selector making this a new AI
        this.goalSelector.add(1, new UntamedAI.HuntFood(this));
        this.goalSelector.add(2,new UntamedAI.TerritoryRoam(this));
    }
    //This is the wild brain, the brain of the tamed dragon
    private void Init_TamedBrain(){
        this.goalSelector.clear();//Clear our goal selector making this a new AI
    }

    @Override
    public boolean isPushedByFluids() {
        return false;
    }

    @Override
    public boolean collidesWith(Entity other) {
        if (ownerUUID!=null)
            return other.getUuid() != ownerUUID && super.collidesWith(other);
        return super.collidesWith(other);
    }

    @Override
    public boolean canBeRiddenInWater() {
        return true;
    }

    @Override
    public boolean canBeControlledByRider() {
        return hasPlayerRider() && getOwner() != null; //Can only be controlled by player riders as long as its tamed
    }

    public static DefaultAttributeContainer.Builder createMobAttributes(){
        DefaultAttributeContainer.Builder attributeBuilder = new DefaultAttributeContainer.Builder();
        attributeBuilder.add(EntityAttributes.GENERIC_ATTACK_SPEED);
        attributeBuilder.add(EntityAttributes.GENERIC_ATTACK_DAMAGE);
        attributeBuilder.add(EntityAttributes.GENERIC_MOVEMENT_SPEED,0.5);
        attributeBuilder.add(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE);
        attributeBuilder.add(EntityAttributes.GENERIC_ATTACK_KNOCKBACK);
        attributeBuilder.add(EntityAttributes.GENERIC_FOLLOW_RANGE);
        attributeBuilder.add(EntityAttributes.GENERIC_FLYING_SPEED,1);
        attributeBuilder.add(EntityAttributes.GENERIC_MAX_HEALTH,400);
        return attributeBuilder;
    }

    protected boolean parentDamage(DamageSource source, float amount) {
        return super.damage(source, amount);
    }
    public boolean damagePart(SelinofosPart part, DamageSource source, float amount) {
        if (amount < 0.01F) {
            return false;
        } else {
            if (source.getAttacker() instanceof PlayerEntity || source.isExplosive()) {
                this.parentDamage(source, amount);
            }
            return true;
        }
    }
    @Override
    public boolean addStatusEffect(StatusEffectInstance effect, @Nullable Entity source) {
        return false;
    }
    private void movePart(SelinofosPart enderDragonPart, double dx, double dy, double dz) {
        enderDragonPart.setPosition(this.getX() + dx, this.getY() + dy, this.getZ() + dz);
    }

    public void setTamed(Entity entity){
        if (this.getOwner()!=null) //cannot set owner if already exists
            return;
        this.ownerUUID = entity.getUuid();
        Init_TamedBrain();
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        if (nbt.contains("owner"))
            this.ownerUUID = nbt.getUuid("owner");
        if (nbt.contains("ageTicks"))
            this.ageTicks = nbt.getInt("ageTicks");
        if (nbt.contains("territoryRange"))
            this.territoryRange = nbt.getInt("territoryRange");
        if (nbt.contains("foodLevel"))
            this.foodLevel = nbt.getInt("foodLevel");
        if (nbt.contains("territoryCenter"))
            this.territoryCenterPos = NbtHelper.toBlockPos(nbt.getCompound("territoryCenter"));
    }

    @Override
    public NbtCompound writeNbt(NbtCompound nbt) {
        if (ownerUUID!=null)
            nbt.putUuid("owner",ownerUUID);
        nbt.putInt("ageTicks",ageTicks);
        nbt.putInt("foodLevel",foodLevel);
        nbt.putInt("territoryRange",territoryRange);
        nbt.put("territoryCenter",NbtHelper.fromBlockPos(territoryCenterPos));
        return super.writeNbt(nbt);
    }

    public boolean collides() {
        return false;
    }
    protected boolean canStartRiding(Entity entity) {
        return true;
    }

    public boolean canUsePortals() {
        return true;
    }
    public SelinofosPart[] getBodyParts() {
        return this.parts;
    }
    public void readFromPacket(MobSpawnS2CPacket packet) {
        super.readFromPacket(packet);
        SelinofosPart[] enderDragonParts = this.getBodyParts();

        for(int i = 0; i < enderDragonParts.length; ++i) {
            enderDragonParts[i].setId(i + packet.getId());
        }

    }

    @Nullable
    @Override
    public UUID getOwnerUuid() {
        return ownerUUID;
    }

    @Nullable
    @Override
    public Entity getOwner() {
        return world.getPlayerByUuid(ownerUUID);
    }
}
