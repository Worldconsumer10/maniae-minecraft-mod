package com.maniae.mobs.selino;

import com.maniae.mobs.selino.parts.SelinofosPart;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.boss.dragon.EnderDragonFight;
import net.minecraft.entity.boss.dragon.EnderDragonPart;
import net.minecraft.entity.boss.dragon.phase.PhaseType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.packet.s2c.play.MobSpawnS2CPacket;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class SelinofosEntity extends PathAwareEntity {
    SelinofosPart leftLeg = new SelinofosPart(this,"leftLeg",10,10);
    SelinofosPart rightLeg = new SelinofosPart(this,"rightLeg",10,10);
    SelinofosPart tail = new SelinofosPart(this,"tail",10,10);
    SelinofosPart neck = new SelinofosPart(this,"neck",10,10);
    SelinofosPart head = new SelinofosPart(neck,"head",1,1);
    private final SelinofosPart[] parts;
    public SelinofosEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
        this.parts = new SelinofosPart[]{leftLeg,rightLeg,tail,neck,head};
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
}
