package com.maniae.mobs.selino.ai;

import com.maniae.mobs.selino.SelinofosEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.TargetPredicate;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.ai.pathing.Path;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.TypeFilter;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Position;
import net.minecraft.util.math.Vec3d;

import java.util.Random;

public class UntamedAI {
    public static class TerritoryRoam extends Goal {
        SelinofosEntity entity;
        Path path;
        BlockPos targetPos;
        int reaquireTimer;
        public TerritoryRoam(SelinofosEntity selinofosEntity) {this.entity=selinofosEntity;}
        @Override
        public boolean canStart() {
            return !entity.isHungry();
        }
        public boolean shouldContinue(){
            return entity.getTarget()!=null || entity.isHungry();
        }
        private double GetRandomRange(double a, double b){
            Random random = entity.getRandom();
            return Math.min(Math.max(random.nextDouble()*b,a),b);
        }
        private BlockPos GetRandomPos(){
            BlockPos pos = new BlockPos(new Vec3d(entity.getPos().x + GetRandomRange(-50,50),300,entity.getPos().z + GetRandomRange(-50,50)));
            while(entity.world.getBlockState(pos).isAir()){
                if (entity.getRandom().nextInt() == 0 && pos.getY() < 200)
                    break; //50% chance for the height to just end making the entity fly really high up
                pos.down(1);
            }
            return pos;
        }

        @Override
        public void start() {
            this.targetPos = GetRandomPos();
            this.path = entity.getNavigation().findPathTo(this.targetPos,1);
            entity.getNavigation().startMovingAlong(this.path,1);
        }

        private boolean recalculatePath(){
            this.path = entity.getNavigation().findPathTo(this.targetPos,1);
            return entity.getNavigation().startMovingAlong(this.path,1);
        }

        @Override
        public boolean shouldRunEveryTick() {
            return true;
        }

        @Override
        public void tick() {
            if (entity.getBoundingBox().intersects(new Box(targetPos)))
                this.targetPos = GetRandomPos();
            if (this.reaquireTimer <= 0){
                recalculatePath();
                this.reaquireTimer+=15;
            }
            this.reaquireTimer--;
        }
    }
    public static class HuntFood extends Goal {
        SelinofosEntity entity;
        Path path;
        LivingEntity targetEntity;
        int reaquireTimer;
        int hitTimeout = 20;
        public HuntFood(SelinofosEntity selinofosEntity) {this.entity=selinofosEntity;}

        @Override
        public boolean canStart() {
            return entity.isHungry();
        }
        public boolean shouldContinue(){
            return !entity.isHungry() || entity.getAttacker()!=null || targetEntity==null || !(targetEntity.isAlive() && entity.canTarget(targetEntity));
        }
        private LivingEntity GetEatableEntity(){
            Vec3d position = entity.getPos();
            int range = entity.getTerritoryRange();

            Box searchBox = new Box(
                    position.x - range, position.y - range, position.z - range,
                    position.x + range, position.y + range, position.z + range
            );

            return entity.world.getClosestEntity(LivingEntity.class, TargetPredicate.DEFAULT.setPredicate(entity->{
                return entity instanceof AnimalEntity || entity instanceof CreeperEntity || entity instanceof PlayerEntity; //can target animals and creepers (due to creepers looking like plants)
            }), null, position.x, position.y, position.z, searchBox);
        }
        @Override
        public void start(){
            this.targetEntity = GetEatableEntity();
            RecalculatePath();
        }
        public void RecalculatePath() {
            if (this.targetEntity==null)
                return;
            this.path = entity.getNavigation().findPathTo(this.targetEntity,1);
            entity.getNavigation().startMovingAlong(this.path,1);
        }

        @Override
        public void stop(){
            if (targetEntity==null || targetEntity.getHealth() > 0 || targetEntity.getLastAttackedTime() > 20)
                return; //entity stopped existing or wasn't attacked recently
            entity.Feed((int) (targetEntity.getHealth()/2));
        }

        @Override
        public boolean shouldRunEveryTick() {
            return true;
        }

        @Override
        public void tick() {
            if (reaquireTimer <= 0){
                reaquireTimer+=15;
                RecalculatePath();
            }
            reaquireTimer--;
            if (hitTimeout <= 0 && entity.getBoundingBox().expand(1).intersects(targetEntity.getBoundingBox())){
                hitTimeout+=20;
                targetEntity.damage(DamageSource.mob(entity), (float) entity.getAttributes().getValue(EntityAttributes.GENERIC_ATTACK_DAMAGE));
            }
        }
    }
}
