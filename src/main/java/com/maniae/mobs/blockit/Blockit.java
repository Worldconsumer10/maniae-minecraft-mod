package com.maniae.mobs.blockit;

import com.maniae.mobs.traderenderman.TraderEnderman;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.ai.goal.LookAtEntityGoal;
import net.minecraft.entity.ai.goal.WanderAroundGoal;
import net.minecraft.entity.ai.pathing.Path;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.screen.MerchantScreenHandler;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.village.Merchant;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOfferList;
import net.minecraft.world.LightType;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.OptionalInt;
import java.util.concurrent.ThreadLocalRandom;

enum BlockitOccupations {
    UNEMPLOYED(null),
    DEMOLITIONIST(Blocks.TNT);

    private final Block pointOfInterest;

    BlockitOccupations(Block pointOfInterest) {
        this.pointOfInterest = pointOfInterest;
    }

    public Block getPointOfInterest() {
        return pointOfInterest;
    }
}
public class Blockit extends PathAwareEntity {
    int level = 0;
    int experience = 0;
    BlockitOccupations occupation = BlockitOccupations.UNEMPLOYED;
    PlayerEntity customer;
    TradeOfferList tradeOffers;
    final Merchant merchant;
    public Blockit(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
        Blockit blockit = this;
        merchant = new Merchant() {
            @Override
            public void setCustomer(@Nullable PlayerEntity customer) {
                blockit.customer=customer;
            }

            @Nullable
            @Override
            public PlayerEntity getCustomer() {
                return blockit.customer;
            }

            @Override
            public TradeOfferList getOffers() {
                return tradeOffers;
            }

            @Override
            public void setOffersFromServer(TradeOfferList offers) {
                blockit.tradeOffers=offers;
            }

            @Override
            public void trade(TradeOffer offer) {

            }

            @Override
            public void onSellingItem(ItemStack stack) {

            }

            @Override
            public int getExperience() {
                return blockit.experience;
            }

            @Override
            public void setExperienceFromServer(int experience) {
                blockit.experience=experience;
            }

            @Override
            public boolean isLeveledMerchant() {
                return blockit.level > 0;
            }

            @Override
            public SoundEvent getYesSound() {
                return null;
            }

            @Override
            public boolean isClient() {
                return blockit.world.isClient;
            }
        };
        InitGoals();
    }

    public static DefaultAttributeContainer.Builder createMobAttributes(){
        DefaultAttributeContainer.Builder builder = new DefaultAttributeContainer.Builder();
        builder.add(EntityAttributes.GENERIC_ARMOR);
        builder.add(EntityAttributes.GENERIC_ATTACK_DAMAGE);
        builder.add(EntityAttributes.GENERIC_ATTACK_KNOCKBACK);
        builder.add(EntityAttributes.GENERIC_FOLLOW_RANGE,15);
        builder.add(EntityAttributes.GENERIC_MAX_HEALTH,1);
        builder.add(EntityAttributes.GENERIC_MOVEMENT_SPEED,0.1);
        builder.add(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE);
        builder.add(EntityAttributes.GENERIC_ARMOR_TOUGHNESS);
        builder.add(EntityAttributes.GENERIC_ATTACK_SPEED);
        return builder;
    }
    void sendOffers(PlayerEntity player, Text test, int levelProgress) {
        OptionalInt optionalInt = player.openHandledScreen(new SimpleNamedScreenHandlerFactory((syncId, playerInventory, playerx) -> {
            return new MerchantScreenHandler(syncId, playerInventory, merchant);
        }, test));
        if (optionalInt.isPresent()) {
            TradeOfferList tradeOfferList = this.merchant.getOffers();
            if (!tradeOfferList.isEmpty()) {
                player.sendTradeOffers(optionalInt.getAsInt(), tradeOfferList, levelProgress, this.merchant.getExperience(), this.merchant.isLeveledMerchant(), this.merchant.canRefreshTrades());
            }
        }
    }

    @Override
    public boolean damage(DamageSource source, float amount) {
        if (source == DamageSource.FALL)
            return false;
        return super.damage(source, amount);
    }

    private boolean hasCustomer(){
        return merchant.getCustomer()!=null;
    }
    @Override
    protected ActionResult interactMob(PlayerEntity player, Hand hand) {
        if (this.isAlive() && !this.hasCustomer() && !this.isBaby()) {
            if (hand == Hand.MAIN_HAND) {
                player.incrementStat(Stats.TALKED_TO_VILLAGER);
            }

            if (!this.merchant.getOffers().isEmpty()) {
                if (!this.world.isClient) {
                    this.merchant.setCustomer(player);
                    this.sendOffers(player, this.getDisplayName(), 1);
                }

            }
            return ActionResult.success(this.world.isClient);
        } else {
            return super.interactMob(player, hand);
        }
    }

    private void InitGoals(){
        this.goalSelector.add(2, new FindBlockitOccupation(this));
        this.goalSelector.add(2, new WanderAroundGoal(this,1));
        this.goalSelector.add(1,new LookAtEntityGoal(this,PlayerEntity.class,15));
        this.goalSelector.add(1,new LookAtEntityGoal(this,Blockit.class,15));
    }
    BlockPos employmentPos;
    BlockitOccupations employmentOccupation;
    private BlockPos FindEmployment(){
        if (employmentPos != null && employmentOccupation != null && world.getBlockState(employmentPos).isOf(employmentOccupation.getPointOfInterest()))
            return employmentPos;
        employmentPos=null;
        employmentOccupation=null;
        Vec3d pos = this.getPos();
        for (int x = -30; x < 60; x++) {
            for (int y = -30; y < 60; y++) {
                for (int z = -30; z < 60; z++) {
                    BlockPos blockPos = new BlockPos(new Vec3d(pos.x+x,pos.y+y,pos.z+z));
                    for (BlockitOccupations occupation: BlockitOccupations.values()) {
                        Block pointOfInterest = occupation.getPointOfInterest();
                        if (pointOfInterest==null)continue;
                        if (world.getBlockState(blockPos).isOf(pointOfInterest)) {
                            employmentPos=blockPos;
                            employmentOccupation=occupation;
                            return blockPos;
                        }
                    }
                }
            }
        }
        return null;
    }
    static class GetBlockitTrades{

    }
    static class FindBlockitOccupation extends Goal{
        final Blockit mob;
        BlockPos targetOccupation;
        public FindBlockitOccupation(Blockit mob){
            this.mob=mob;
            this.targetOccupation = mob.FindEmployment();
        }

        @Override
        public boolean canStart() {
            this.targetOccupation = mob.FindEmployment();
            return mob.occupation == BlockitOccupations.UNEMPLOYED && this.targetOccupation != null;
        }

        @Override
        public boolean shouldContinue() {
            this.targetOccupation = mob.FindEmployment();
            return super.shouldContinue();
        }

        @Override
        public void start() {
            if (targetOccupation==null) return;
            this.mob.navigation.startMovingTo(targetOccupation.getX(),targetOccupation.getY(),targetOccupation.getZ(),1);
            this.mob.lookControl.lookAt(targetOccupation.getX(),targetOccupation.getY(),targetOccupation.getZ());
        }

        @Override
        public void stop() {
            this.mob.navigation.stop();
        }
    }
}
