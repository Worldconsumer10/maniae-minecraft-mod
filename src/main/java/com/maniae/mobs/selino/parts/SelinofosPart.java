package com.maniae.mobs.selino.parts;

import com.maniae.mobs.selino.SelinofosEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityPose;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.Packet;
import net.minecraft.util.math.Box;

public class SelinofosPart extends Entity {
    public SelinofosEntity owner;
    public SelinofosPart partOwner;

    public EntityDimensions partDimensions;
    public String name;

    public SelinofosPart(SelinofosEntity owner, String name, float width, float height) {
        super(owner.getType(), owner.world);
        this.partDimensions = EntityDimensions.changing(width, height);
        this.calculateDimensions();
        this.owner = owner;
        this.name = name;
    }

    public SelinofosPart(SelinofosPart owner, String name, float width, float height) {
        super(owner.getType(), owner.world);
        this.partDimensions = EntityDimensions.changing(width, height);
        this.calculateDimensions();
        this.partOwner = owner;
        this.name = name;
    }

    @Override
    protected void initDataTracker() {

    }
    @Override
    protected void readCustomDataFromNbt(NbtCompound nbt) {

    }

    @Override
    protected void writeCustomDataToNbt(NbtCompound nbt) {

    }

    public boolean collides() {
        return true;
    }
    public boolean damagePart(SelinofosPart part, DamageSource source, float amount){
        if (partOwner != null)
            return damagePart(part,source,amount);
        else if (owner!=null)
            return this.owner.damagePart(part,source,amount);
        else
            return false;
    }

    public boolean damage(DamageSource source, float amount) {
        if (this.owner != null)
            return !this.isInvulnerableTo(source) && this.owner.damagePart(this, source, amount);
        else
            return !this.isInvulnerableTo(source) && this.partOwner.damagePart(this, source, amount);
    }


    public boolean isPartOf(Entity entity) {
        if (this==entity)
            return true;
        if (this.owner != null)
            return entity == this.owner;
        else
            return entity == this.partOwner;
    }

    @Override
    public Packet<?> createSpawnPacket() {
        throw new UnsupportedOperationException();
    }

    public EntityDimensions getDimensions(EntityPose pose) {
        return this.partDimensions;
    }

    public boolean shouldSave() {
        return false;
    }
}
