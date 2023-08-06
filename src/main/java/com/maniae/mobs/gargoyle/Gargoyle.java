package com.maniae.mobs.gargoyle;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.PathAwareEntity;
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
    private boolean isAwake = false;
    private boolean hasPlayedAwake = false;

    @Override
    public boolean canMoveVoluntarily() {
        return super.canMoveVoluntarily() && hasPlayedAwake;
    }

    public Gargoyle(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
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

    @Override
    public boolean damage(DamageSource source, float amount) {
        if (!isAwake){
            isAwake = true;
            hasPlayedAwake=false;
        }
        if (!hasPlayedAwake)
            return false; //cannot take damage while in its dormant state.
        else if (source.isFire() || source.isFromFalling())
            return false;
        return super.damage(source,amount);
    }
    boolean isDead=false;
    @Override
    public void onDeath(DamageSource source) {
        super.onDeath(source);
        isDead=true;
    }

    @Override
    public void registerControllers(AnimationData animationData) {
        animationData.addAnimationController(new AnimationController(this,"controller",0,this::predicate));
        animationData.addAnimationController(new AnimationController(this,"deathController",0,this::deathpredicate));
    }

    private PlayState deathpredicate(AnimationEvent animationEvent) {
        if (isDead){
            animationEvent.getController().setAnimation(new AnimationBuilder().addAnimation("animation.gargoyle.death", ILoopType.EDefaultLoopTypes.HOLD_ON_LAST_FRAME));
        }
        return PlayState.CONTINUE;
    }

    private PlayState predicate(AnimationEvent animationEvent) {
        if (!hasPlayedAwake && isAwake){
            animationEvent.getController().setAnimation(new AnimationBuilder().addAnimation("animation.gargoyle.awake", ILoopType.EDefaultLoopTypes.HOLD_ON_LAST_FRAME));
        }
        else if (animationEvent.isMoving() && hasPlayedAwake){
           if (this.isOnGround()){
                animationEvent.getController().setAnimation(new AnimationBuilder().addAnimation("animation.gargoyle.walk", ILoopType.EDefaultLoopTypes.LOOP));
            } else {
                animationEvent.getController().setAnimation(new AnimationBuilder().addAnimation("animation.gargoyle.flight", ILoopType.EDefaultLoopTypes.LOOP));
            }
        } else
            animationEvent.getController().setAnimation(new AnimationBuilder().addAnimation("animation.gargoyle.idle", ILoopType.EDefaultLoopTypes.LOOP));
        return PlayState.CONTINUE;
    }

    @Override
    public AnimationFactory getFactory() {
        return factory;
    }

    @Override
    public int tickTimer() {
        return 0;
    }
}
