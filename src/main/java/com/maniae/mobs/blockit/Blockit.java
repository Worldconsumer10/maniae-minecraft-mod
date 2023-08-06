package com.maniae.mobs.blockit;

import com.maniae.ManiaeMod;
import com.maniae.mobs.traderenderman.TraderEnderman;
import net.fabricmc.fabric.api.util.NbtType;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.ai.goal.LookAtEntityGoal;
import net.minecraft.entity.ai.goal.WanderAroundGoal;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtHelper;
import net.minecraft.screen.MerchantScreenHandler;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.village.Merchant;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOfferList;
import net.minecraft.village.TradeOffers;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.OptionalInt;
import java.util.Random;

enum BlockitOccupations {
    UNEMPLOYED(null,true),
    DEMOLITIONIST(Blocks.TNT,false);

    private final Block pointOfInterest;
    private boolean isDefaultOccupation;

    BlockitOccupations(Block pointOfInterest, boolean isDefaultOccupation) {
        this.pointOfInterest = pointOfInterest;
        this.isDefaultOccupation=isDefaultOccupation;
    }

    public Block getPointOfInterest() {
        return pointOfInterest;
    }

    public boolean getIsDefaultOccupation() {
        return isDefaultOccupation;
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
        this.tradeOffers = GetBlockitTrades.GetTradeOffers(this);
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
        builder.add(EntityAttributes.GENERIC_MOVEMENT_SPEED,0.3);
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
                    this.sendOffers(player, this.getDisplayName(), this.experience/100);
                }

            }
            return ActionResult.success(this.world.isClient);
        } else {
            return super.interactMob(player, hand);
        }
    }

    private void InitGoals(){
        this.goalSelector.add(0, new FollowCustomer(this));
        this.goalSelector.add(2, new FindBlockitOccupation(this));
        this.goalSelector.add(3, new WanderAroundGoal(this,1));
        this.goalSelector.add(1,new LookAtEntityGoal(this,PlayerEntity.class,15));
        this.goalSelector.add(1,new LookAtEntityGoal(this,Blockit.class,15));
    }

    @Override
    public NbtCompound writeNbt(NbtCompound nbt) {
        nbt.put("offers",tradeOffers.toNbt());
        nbt.putInt("experience",experience);
        nbt.putInt("level",level);
        nbt.putString("occupation",occupation.name());
        return super.writeNbt(nbt);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        if (nbt.contains("experience"))
            this.experience = nbt.getInt("experience");
        if (nbt.contains("level"))
            this.level = nbt.getInt("level");
        if (nbt.contains("occupation"))
            this.occupation = BlockitOccupations.valueOf(nbt.getString("occupation"));

        if (nbt.contains("offers")) {
            var nbtList = nbt.getList("offers", NbtType.COMPOUND);
        }
    }

    BlockPos employmentPos;
    BlockitOccupations employmentOccupation;
    private BlockPos FindEmployment(){
        if (employmentPos != null && employmentOccupation != null && world.getBlockState(employmentPos).isOf(employmentOccupation.getPointOfInterest()))
            return employmentPos;
        employmentPos=null;
        employmentOccupation=null;
        BlockPos pos = this.getBlockPos();
        for (int x = -30; x < 60; x++) {
            for (int y = -30; y < 60; y++) {
                for (int z = -30; z < 60; z++) {
                    BlockPos blockPos = new BlockPos(new Vec3d(pos.getX()+x,pos.getY()+y,pos.getZ()+z));
                    for (BlockitOccupations occupation: BlockitOccupations.values()) {
                        Block pointOfInterest = occupation.getPointOfInterest();
                        if (pointOfInterest==null || occupation.getIsDefaultOccupation())continue;
                        if (world.getBlockState(blockPos).isOf(pointOfInterest)) {
                            employmentPos=blockPos;
                            ManiaeMod.LOGGER.info("Found Occupation: "+occupation.name());
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
        private static Item[] buyItems = new Item[]{
                Items.BREAD,
                Items.COOKED_BEEF,
                Items.COOKED_CHICKEN,
                Items.COOKED_COD,
                Items.COOKED_MUTTON,
                Items.COOKED_PORKCHOP,
                Items.COOKED_RABBIT,
                Items.COOKED_SALMON,
                Items.APPLE,
                Items.MUSHROOM_STEW,
                Items.BEETROOT,
                Items.BEETROOT_SOUP,
                Items.SAND
        };
        private static Item[] toolTrades = new Item[]{
                Items.TNT,
                Items.GUNPOWDER,
                Items.IRON_PICKAXE,
                Items.DIAMOND_PICKAXE,
                Items.STONE_PICKAXE,
                Items.GOLDEN_PICKAXE
        };
        private static Item[] materialTrades = new Item[]{
                Items.COAL_ORE,
                Items.COPPER_ORE,
                Items.DEEPSLATE_COAL_ORE,
                Items.DEEPSLATE_DIAMOND_ORE,
                Items.DEEPSLATE_COPPER_ORE,
                Items.DEEPSLATE_EMERALD_ORE,
                Items.DEEPSLATE_GOLD_ORE,
                Items.DEEPSLATE_IRON_ORE,
                Items.DEEPSLATE_LAPIS_ORE,
                Items.IRON_ORE,
                Items.GOLD_ORE,
                Items.LAPIS_ORE,
                Items.REDSTONE_ORE,
                Items.COBBLED_DEEPSLATE,
                Items.COBBLESTONE
        };
        public static TradeOfferList GetTradeOffers(Blockit blockit){
            TradeOfferList tradeOfferList = new TradeOfferList();
            List<Item> materialArray = new java.util.ArrayList<>(List.of(materialTrades.clone()));
            List<Item> toolArray = new java.util.ArrayList<>(List.of(toolTrades.clone()));
            for (int i = 0; i < 6; i++) {
                try{
                    int buyIndex = Math.max(0,new Random().nextInt(0,buyItems.length));
                    int sellIndex = Math.max(0,new Random().nextInt(0,materialArray.size()));
                    Item buyItem = buyItems[buyIndex];
                    Item sellItem;
                    if (blockit.occupation == BlockitOccupations.DEMOLITIONIST){
                        sellIndex = Math.max(0,new Random().nextInt(0,toolArray.size()));
                        sellItem = toolArray.get(sellIndex);
                    } else {
                        sellItem = materialArray.get(sellIndex);
                    }
                    int maxUses = Math.min(Math.max(4,new Random().nextInt(4,20)),20);
                    int buyAmount = Math.min(Math.max(2,new Random().nextInt(2,64)),64);
                    int sellAmount = Math.min(Math.max(buyAmount,new Random().nextInt(buyAmount,64)),64);
                    tradeOfferList.add(TraderEnderman.RandomEndermanTradeGenerator.createTradeOffer(buyItem,sellItem,maxUses,1,1,buyAmount,sellAmount));
                    if (blockit.occupation == BlockitOccupations.DEMOLITIONIST)
                        toolArray.removeIf(item->{return item.equals(sellItem);});
                    materialArray.removeIf(item->{return item.equals(sellItem);});
                }catch (Exception e){
                    //Handled Exception
                }
            }
            return tradeOfferList;
        }
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
            return !targetOccupation.isWithinDistance(mob.getPos(),2);
        }

        @Override
        public void start() {
            if (targetOccupation==null) return;
            this.mob.navigation.startMovingTo(targetOccupation.getX(),targetOccupation.getY(),targetOccupation.getZ(),1);
            this.mob.lookControl.lookAt(targetOccupation.getX(),targetOccupation.getY(),targetOccupation.getZ());
        }

        @Override
        public void stop() {
            this.mob.occupation = mob.employmentOccupation;
            this.mob.navigation.stop();
        }
    }
    static class FollowCustomer extends Goal{
        final Blockit mob;
        public FollowCustomer(Blockit mob){
            this.mob=mob;
        }

        @Override
        public boolean canStart() {
            return mob.merchant.getCustomer() != null;
        }

        @Override
        public void start() {
            mob.navigation.startMovingTo(mob.merchant.getCustomer(),1);
            mob.lookControl.lookAt(mob.merchant.getCustomer());
        }

        @Override
        public void stop(){
            mob.navigation.stop();
        }
    }
}
