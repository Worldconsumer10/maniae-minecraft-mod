package com.maniae.mobs.gargoyle;

import com.maniae.ManiaeMod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityPose;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.ai.pathing.Path;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtHelper;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import software.bernie.example.entity.GeoExampleEntity;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.IAnimationTickable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.builder.ILoopType;
import software.bernie.geckolib3.core.builder.RawAnimation;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.util.GeckoLibUtil;

public class Gargoyle extends PathAwareEntity implements IAnimatable, IAnimationTickable {
    private AnimationFactory factory = GeckoLibUtil.createFactory(this);
    private BlockPos originPos;
    private int state = 0;
    //0 = Asleep
    //1 = Waking Up
    //2 = Awake
    //3 = Falling Asleep

    @Override
    public boolean canMoveVoluntarily() {
        return super.canMoveVoluntarily() && state == 2;
    }
    public Gargoyle(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
        this.originPos = getBlockPos();
        this.state=0;
        InitGoal();
    }

    @Override
    public NbtCompound writeNbt(NbtCompound nbt) {
        nbt.put("originPos", NbtHelper.fromBlockPos(this.originPos));
        nbt.putInt("state",this.state);
        return super.writeNbt(nbt);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        if (nbt.contains("originPos"))
            this.originPos = NbtHelper.toBlockPos(nbt.getCompound("originPos"));
        if (nbt.contains("state"))
            this.state = nbt.getInt("state");
    }

    public static DefaultAttributeContainer.Builder createMobAttributes(){
        DefaultAttributeContainer.Builder builder = new DefaultAttributeContainer.Builder();
        builder.add(EntityAttributes.GENERIC_ARMOR);
        builder.add(EntityAttributes.GENERIC_ATTACK_DAMAGE);
        builder.add(EntityAttributes.GENERIC_ATTACK_KNOCKBACK);
        builder.add(EntityAttributes.GENERIC_FOLLOW_RANGE,15);
        builder.add(EntityAttributes.GENERIC_MAX_HEALTH,200);
        builder.add(EntityAttributes.GENERIC_MOVEMENT_SPEED,0.5);
        builder.add(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE);
        builder.add(EntityAttributes.GENERIC_ARMOR_TOUGHNESS);
        builder.add(EntityAttributes.GENERIC_ATTACK_SPEED);
        return builder;
    }
    private void InitGoal(){
        this.goalSelector.add(1,new HuntTarget(this));
        this.goalSelector.add(2,new ReturnToOrigin(this));
    }
    public boolean isAIActive(){
        return state==2;
    }

    @Override
    public boolean damage(DamageSource source, float amount) {
        if (this.dead)
            return false;
        if (this.getTarget() == null && source.getSource() instanceof LivingEntity && canTarget((LivingEntity) source.getSource())){
            this.setTarget((LivingEntity) source.getSource());
        }
        if (state == 0)
            state+=1;
        if (state<=1)
            amount = Math.min(amount,1); //while not in its fully awake state cannot take more than half a heart of damage
        else if (source.isFire() || source.isFromFalling())
            return false;
        return super.damage(source,amount);
    }

    @Override
    public void registerControllers(AnimationData animationData) {
        animationData.addAnimationController(new AnimationController<Gargoyle>(this,"controller",0,this::predicate));
    }

    private PlayState predicate(AnimationEvent<Gargoyle> gargoyleAnimationEvent) {
        gargoyleAnimationEvent.getController().setAnimation(new AnimationBuilder().addAnimation("animation.gargoyle.awaken",ILoopType.EDefaultLoopTypes.HOLD_ON_LAST_FRAME));
        return PlayState.CONTINUE;
    }

    @Override
    public void tickMovement() {
        super.tickMovement();
    }

    @Override
    public AnimationFactory getFactory() {
        return factory;
    }

    @Override
    public int tickTimer() {
        return 0;
    }

    static class HuntTarget extends Goal {
        final Gargoyle mob;
        LivingEntity target;
        Path path;
        int reaquireTimer = 15;
        int attackCooldown = 0;
        public HuntTarget(Gargoyle mob){this.mob=mob;}
        @Override
        public boolean canStart() {
            return mob.getTarget() != null && mob.isAIActive();
        }

        @Override
        public void start() {
            this.target=mob.getTarget();
            this.path = mob.getNavigation().findPathTo(this.target,0);
            mob.getNavigation().startMovingAlong(this.path,1);
        }
        private void ReaquireTarget(){
            this.path = mob.getNavigation().findPathTo(this.target,0);
            mob.getNavigation().startMovingAlong(this.path,1);
        }

        @Override
        public boolean shouldRunEveryTick() {
            return true;
        }

        @Override
        public void tick() {
            if (reaquireTimer <= 0){
                reaquireTimer+=15;
                ReaquireTarget();
            }
            reaquireTimer--;
            if (mob.getBoundingBox().expand(1).intersects(this.target.getBoundingBox()) && attackCooldown <= 0){
                this.attackCooldown+=10;
                attack(this.target);
            }
        }
        protected void attack(LivingEntity target) {
            this.mob.swingHand(Hand.MAIN_HAND);
            this.mob.tryAttack(target);
        }

        @Override
        public void stop() {
            mob.getNavigation().stop();
        }
    }
    static class ReturnToOrigin extends Goal {
        final Gargoyle mob;
        Path path;
        int reaquireTimer = 15;
        int attackCooldown = 0;
        public ReturnToOrigin(Gargoyle mob){this.mob=mob;}
        @Override
        public boolean canStart() {
            return mob.getTarget() == null && mob.isAIActive();
        }

        @Override
        public boolean shouldContinue() {
            return mob.state!=3;
        }

        @Override
        public void start() {
            this.path = mob.getNavigation().findPathTo(this.mob.originPos,0);
            mob.getNavigation().startMovingAlong(this.path,1);
        }
        private void ReaquireTarget(){
            this.path = mob.getNavigation().findPathTo(this.mob.originPos,0);
            mob.getNavigation().startMovingAlong(this.path,1);
        }

        @Override
        public boolean shouldRunEveryTick() {
            return true;
        }

        @Override
        public void tick() {
            if (reaquireTimer <= 0){
                reaquireTimer+=15;
                ReaquireTarget();
            }
            reaquireTimer--;
            if (this.mob.originPos.isWithinDistance(this.mob.originPos,1))
                this.mob.state=3;
        }
        @Override
        public void stop() {
            mob.getNavigation().stop();
        }
    }
}
