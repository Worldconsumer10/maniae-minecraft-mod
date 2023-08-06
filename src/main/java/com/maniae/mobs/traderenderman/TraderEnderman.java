package com.maniae.mobs.traderenderman;

import com.maniae.functions.BlockUtils;
import com.maniae.functions.RandomNumber;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.TargetPredicate;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.ai.pathing.Path;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.EndermanEntity;
import net.minecraft.entity.mob.EndermiteEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtHelper;
import net.minecraft.screen.MerchantScreenHandler;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.tag.BlockTags;
import net.minecraft.tag.FluidTags;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.*;
import net.minecraft.village.Merchant;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOfferList;
import net.minecraft.village.TradeOffers;
import net.minecraft.world.GameRules;
import net.minecraft.world.Heightmap;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.function.Predicate;

public class TraderEnderman extends EndermanEntity {
    int level = 0;
    int experience = 0;
    int despawnTimer = 0;
    PlayerEntity customer;
    TradeOfferList tradeOffers;
    final Merchant merchant;
    public TraderEnderman(EntityType<? extends EndermanEntity> entityType, World world) {
        super(entityType, world);
        TraderEnderman traderEnderman = this;
        this.tradeOffers=RandomEndermanTradeGenerator.createTrades();
        despawnTimer = Math.max(4000,new Random().nextInt(8000));
        merchant = new Merchant() {
            @Override
            public void setCustomer(@Nullable PlayerEntity customer) {
                traderEnderman.customer=customer;
            }

            @Nullable
            @Override
            public PlayerEntity getCustomer() {
                return traderEnderman.customer;
            }

            @Override
            public TradeOfferList getOffers() {
                return tradeOffers;
            }

            @Override
            public void setOffersFromServer(TradeOfferList offers) {
                traderEnderman.tradeOffers=offers;
            }

            @Override
            public void trade(TradeOffer offer) {

            }

            @Override
            public void onSellingItem(ItemStack stack) {

            }

            @Override
            public int getExperience() {
                return traderEnderman.experience;
            }

            @Override
            public void setExperienceFromServer(int experience) {
                traderEnderman.experience=experience;
            }

            @Override
            public boolean isLeveledMerchant() {
                return traderEnderman.level > 0;
            }

            @Override
            public SoundEvent getYesSound() {
                return SoundEvents.ENTITY_ENDERMAN_AMBIENT;
            }

            @Override
            public boolean isClient() {
                return traderEnderman.world.isClient;
            }
        };
    }

    @Override
    protected void mobTick() {
        super.mobTick();
        despawnTimer--;
        if (despawnTimer <= 0){
            this.remove(RemovalReason.DISCARDED);
        }
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        if (nbt.contains("despawnTimer"))
            despawnTimer = nbt.getInt("despawnTimer");
    }

    @Override
    public NbtCompound writeNbt(NbtCompound nbt) {
        nbt.putInt("despawnTimer",despawnTimer);
        return super.writeNbt(nbt);
    }

    @Override
    public boolean hurtByWater() {
        return this.isTouchingWater();
    }
    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(1, new FleeFromRain(this));
        this.goalSelector.add(2, new FollowCustomer(this));
        this.goalSelector.add(3, new ChasePlayerGoal(this));
        this.goalSelector.add(4, new MeleeAttackGoal(this, 1.0, false));
        this.goalSelector.add(9, new WanderAroundFarGoal(this, 1.0, 0.0F));
        this.goalSelector.add(10, new LookAtEntityGoal(this, PlayerEntity.class, 8.0F));
        this.goalSelector.add(11, new LookAroundGoal(this));
        this.goalSelector.add(14, new PlaceBlockGoal(this));
        this.goalSelector.add(15, new PickUpBlockGoal(this));
        this.targetSelector.add(1, new TeleportTowardsPlayerGoal(this, this::shouldAngerAt));
        this.targetSelector.add(2, new RevengeGoal(this, new Class[0]));
        this.targetSelector.add(3, new ActiveTargetGoal(this, EndermiteEntity.class, true, false));
        this.targetSelector.add(4, new UniversalAngerGoal(this, false));
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
    private boolean hasCustomer(){
        return merchant.getCustomer()!=null;
    }
    @Override
    protected ActionResult interactMob(PlayerEntity player, Hand hand) {
        ItemStack itemStack = player.getStackInHand(hand);
        if (!itemStack.isOf(Items.VILLAGER_SPAWN_EGG) && this.isAlive() && !this.hasCustomer() && !this.isBaby()) {
            if (hand == Hand.MAIN_HAND) {
                player.incrementStat(Stats.TALKED_TO_VILLAGER);
            }

            if (this.merchant.getOffers().isEmpty()) {
                return ActionResult.success(this.world.isClient);
            } else {
                if (!this.world.isClient) {
                    this.merchant.setCustomer(player);
                    this.sendOffers(player, this.getDisplayName(), 1);
                }

                return ActionResult.success(this.world.isClient);
            }
        } else {
            return super.interactMob(player, hand);
        }
    }

    @Override
    public boolean damage(DamageSource source, float amount) {
        Entity entitySource = source.getSource();
        if (entitySource instanceof PlayerEntity && this.getTarget()==null){
            this.setTarget((LivingEntity) entitySource);
            this.setAngryAt(entitySource.getUuid());
            this.setAngerTime(4000);
        }
        return super.damage(source, amount);
    }

    boolean teleportTo(Entity entity) {
        Vec3d vec3d = new Vec3d(this.getX() - entity.getX(), this.getBodyY(0.5) - entity.getEyeY(), this.getZ() - entity.getZ());
        vec3d = vec3d.normalize();
        double d = 16.0;
        double e = this.getX() + (this.random.nextDouble() - 0.5) * 8.0 - vec3d.x * 16.0;
        double f = this.getY() + (double)(this.random.nextInt(16) - 8) - vec3d.y * 16.0;
        double g = this.getZ() + (this.random.nextDouble() - 0.5) * 8.0 - vec3d.z * 16.0;
        return this.teleportTo(e, f, g);
    }

    private boolean teleportTo(double x, double y, double z) {
        BlockPos.Mutable mutable = new BlockPos.Mutable(x, y, z);

        while(mutable.getY() > this.world.getBottomY() && !this.world.getBlockState(mutable).getMaterial().blocksMovement()) {
            mutable.move(Direction.DOWN);
        }

        BlockState blockState = this.world.getBlockState(mutable);
        boolean bl = blockState.getMaterial().blocksMovement();
        boolean bl2 = blockState.getFluidState().isIn(FluidTags.WATER);
        if (bl && !bl2) {
            boolean bl3 = this.teleport(x, y, z, true);
            if (bl3 && !this.isSilent()) {
                this.world.playSound((PlayerEntity)null, this.prevX, this.prevY, this.prevZ, SoundEvents.ENTITY_ENDERMAN_TELEPORT, this.getSoundCategory(), 1.0F, 1.0F);
                this.playSound(SoundEvents.ENTITY_ENDERMAN_TELEPORT, 1.0F, 1.0F);
            }

            return bl3;
        } else {
            return false;
        }
    }
    static class FleeFromRain extends Goal {
        private final TraderEnderman mob;
        private boolean completed;
        Path path;
        private BlockPos targetShelter;

        public FleeFromRain(TraderEnderman mob) {
            this.mob = mob;
            this.completed = false;
        }

        @Override
        public boolean canStart() {
            World world = mob.world;
            BlockPos mobPos = mob.getBlockPos();
            return mob.isTouchingWaterOrRain() || world.getTopPosition(Heightmap.Type.MOTION_BLOCKING, mobPos).getY() >= mobPos.getY();
        }

        @Override
        public void start() {
            World world = mob.world;
            BlockPos mobPos = mob.getBlockPos();

            // Find the nearest sheltered block
            for (int distance = 1; distance <= 50; distance++) {
                for (Direction direction : Direction.values()) {
                    BlockPos offsetPos = mobPos.offset(direction, distance);
                    if (world.isSkyVisible(offsetPos)) {
                        // The block is not covered, continue searching
                        continue;
                    }

                    int topY = world.getTopPosition(Heightmap.Type.MOTION_BLOCKING, offsetPos).getY();
                    if (topY >= offsetPos.getY()) {
                        targetShelter = offsetPos.up();
                        break;
                    }
                }
                if (targetShelter!=null)break;
            }
            this.path = mob.getNavigation().findPathTo(targetShelter,0);
            mob.getNavigation().startMovingAlong(this.path,1.25);
        }

        @Override
        public void tick() {
        }

        @Override
        public boolean shouldContinue() {
            return canStart();
        }

        @Override
        public void stop() {
            mob.navigation.stop();
        }
    }
    static class FollowCustomer extends Goal{
        TraderEnderman traderEnderman;
        Path path;
        int reaquirePath;
        public FollowCustomer(TraderEnderman mob){this.traderEnderman=mob;}
        @Override
        public boolean canStart() {
            return traderEnderman.merchant.getCustomer() != null && traderEnderman.getTarget()==null;
        }

        @Override
        public boolean shouldContinue() {
            return traderEnderman.merchant.getCustomer() != null && traderEnderman.getTarget()==null;
        }

        private void ReaquirePath(){
            this.path = traderEnderman.getNavigation().findPathTo(traderEnderman.merchant.getCustomer(),2);
            traderEnderman.getNavigation().startMovingAlong(this.path,1);
        }

        @Override
        public boolean shouldRunEveryTick() {
            return true;
        }

        @Override
        public void tick() {
            if (reaquirePath <= 0)
            {
                reaquirePath+=15;
                ReaquirePath();
            }
            reaquirePath--;
        }
    }
    static class ChasePlayerGoal extends Goal {
        private final TraderEnderman enderman;
        @Nullable
        private LivingEntity target;

        public ChasePlayerGoal(TraderEnderman enderman) {
            this.enderman = enderman;
            this.setControls(EnumSet.of(Control.JUMP, Control.MOVE));
        }

        public boolean canStart() {
            this.target = this.enderman.getTarget();
            return this.target instanceof PlayerEntity;
        }

        public void start() {
            this.enderman.getNavigation().stop();
        }

        public void tick() {
            this.enderman.getLookControl().lookAt(this.target.getX(), this.target.getEyeY(), this.target.getZ());
        }
    }
    static class TeleportTowardsPlayerGoal extends ActiveTargetGoal<PlayerEntity> {
        private final TraderEnderman enderman;
        @Nullable
        private PlayerEntity targetPlayer;
        private int lookAtPlayerWarmup;
        private int ticksSinceUnseenTeleport;
        private final TargetPredicate validTargetPredicate = TargetPredicate.createAttackable().ignoreVisibility();

        public TeleportTowardsPlayerGoal(TraderEnderman enderman, @Nullable Predicate<LivingEntity> targetPredicate) {
            super(enderman, PlayerEntity.class, 10, false, false, targetPredicate);
            this.enderman = enderman;
        }

        public boolean canStart() {
            this.targetPlayer = this.enderman.world.getClosestPlayer(TargetPredicate.DEFAULT,this.enderman);
            return this.targetPlayer != null;
        }

        public void start() {
            this.lookAtPlayerWarmup = this.getTickCount(5);
            this.ticksSinceUnseenTeleport = 0;
            this.enderman.setProvoked();
        }

        public void stop() {
            this.targetPlayer = null;
            super.stop();
        }

        public boolean shouldContinue() {
            if (this.targetPlayer != null) {
                return false;
            } else {
                return this.targetEntity != null && this.validTargetPredicate.test(this.enderman, this.targetEntity) || super.shouldContinue();
            }
        }

        public void tick() {
            if (this.enderman.getTarget() == null) {
                super.setTargetEntity((LivingEntity)null);
            }

            if (this.targetPlayer != null) {
                if (--this.lookAtPlayerWarmup <= 0) {
                    this.targetEntity = this.targetPlayer;
                    this.targetPlayer = null;
                    super.start();
                }
            } else {
                if (this.targetEntity != null && !this.enderman.hasVehicle()) {
                    if (this.targetEntity.squaredDistanceTo(this.enderman) > 256.0 && this.ticksSinceUnseenTeleport++ >= this.getTickCount(30) && this.enderman.teleportTo(this.targetEntity)) {
                        this.ticksSinceUnseenTeleport = 0;
                    }
                }

                super.tick();
            }

        }
    }

    static class PlaceBlockGoal extends Goal {
        private final TraderEnderman enderman;

        public PlaceBlockGoal(TraderEnderman enderman) {
            this.enderman = enderman;
        }

        public boolean canStart() {
            if (this.enderman.getCarriedBlock() == null) {
                return false;
            } else if (!this.enderman.world.getGameRules().getBoolean(GameRules.DO_MOB_GRIEFING)) {
                return false;
            } else {
                return this.enderman.getRandom().nextInt(toGoalTicks(2000)) == 0;
            }
        }

        public void tick() {
            Random random = this.enderman.getRandom();
            World world = this.enderman.world;
            int i = MathHelper.floor(this.enderman.getX() - 1.0 + random.nextDouble() * 2.0);
            int j = MathHelper.floor(this.enderman.getY() + random.nextDouble() * 2.0);
            int k = MathHelper.floor(this.enderman.getZ() - 1.0 + random.nextDouble() * 2.0);
            BlockPos blockPos = new BlockPos(i, j, k);
            BlockState blockState = world.getBlockState(blockPos);
            BlockPos blockPos2 = blockPos.down();
            BlockState blockState2 = world.getBlockState(blockPos2);
            BlockState blockState3 = this.enderman.getCarriedBlock();
            if (blockState3 != null) {
                blockState3 = Block.postProcessState(blockState3, this.enderman.world, blockPos);
                if (this.canPlaceOn(world, blockPos, blockState3, blockState, blockState2, blockPos2)) {
                    world.setBlockState(blockPos, blockState3, 3);
                    world.emitGameEvent(this.enderman, GameEvent.BLOCK_PLACE, blockPos);
                    this.enderman.setCarriedBlock((BlockState)null);
                }

            }
        }

        private boolean canPlaceOn(World world, BlockPos posAbove, BlockState carriedState, BlockState stateAbove, BlockState state, BlockPos pos) {
            return stateAbove.isAir() && !state.isAir() && !state.isOf(Blocks.BEDROCK) && state.isFullCube(world, pos) && carriedState.canPlaceAt(world, posAbove) && world.getOtherEntities(this.enderman, Box.from(Vec3d.of(posAbove))).isEmpty();
        }
    }

    static class PickUpBlockGoal extends Goal {
        private final TraderEnderman enderman;

        public PickUpBlockGoal(TraderEnderman enderman) {
            this.enderman = enderman;
        }

        public boolean canStart() {
            if (this.enderman.getCarriedBlock() != null) {
                return false;
            } else if (!this.enderman.world.getGameRules().getBoolean(GameRules.DO_MOB_GRIEFING)) {
                return false;
            } else {
                return this.enderman.getRandom().nextInt(toGoalTicks(20)) == 0;
            }
        }

        public void tick() {
            Random random = this.enderman.getRandom();
            World world = this.enderman.world;
            int i = MathHelper.floor(this.enderman.getX() - 2.0 + random.nextDouble() * 4.0);
            int j = MathHelper.floor(this.enderman.getY() + random.nextDouble() * 3.0);
            int k = MathHelper.floor(this.enderman.getZ() - 2.0 + random.nextDouble() * 4.0);
            BlockPos blockPos = new BlockPos(i, j, k);
            BlockState blockState = world.getBlockState(blockPos);
            Vec3d vec3d = new Vec3d((double)this.enderman.getBlockX() + 0.5, (double)j + 0.5, (double)this.enderman.getBlockZ() + 0.5);
            Vec3d vec3d2 = new Vec3d((double)i + 0.5, (double)j + 0.5, (double)k + 0.5);
            BlockHitResult blockHitResult = world.raycast(new RaycastContext(vec3d, vec3d2, RaycastContext.ShapeType.OUTLINE, RaycastContext.FluidHandling.NONE, this.enderman));
            boolean bl = blockHitResult.getBlockPos().equals(blockPos);
            if (blockState.isIn(BlockTags.ENDERMAN_HOLDABLE) && bl) {
                world.removeBlock(blockPos, false);
                world.emitGameEvent(this.enderman, GameEvent.BLOCK_DESTROY, blockPos);
                this.enderman.setCarriedBlock(blockState.getBlock().getDefaultState());
            }

        }
    }
    public static class RandomEndermanTradeGenerator{
        private static final Item[] buyItemList = new Item[]{
            Items.EMERALD,
                Items.OAK_LOG,
                Items.ACACIA_LOG,
                Items.BIRCH_LOG,
                Items.SPRUCE_LOG,
                Items.DARK_OAK_LOG,
                Items.GRASS,
                Items.COD,
                Items.TROPICAL_FISH,
                Items.INK_SAC,
                Items.GLOW_INK_SAC,
                Items.KELP,
                Items.DRIED_KELP,
                Items.CHEST
        };
        private static final Item[] sellItemList = new Item[]{
                Items.END_STONE,
                Items.END_ROD,
                Items.PURPUR_BLOCK,
                Items.PURPUR_PILLAR,
                Items.PURPUR_SLAB,
                Items.PURPUR_STAIRS,
                Items.END_STONE_BRICKS,
                Items.CHORUS_FRUIT,
                Items.CHORUS_FLOWER,
                Items.OBSIDIAN
        };
        public static TradeOfferList createTrades(){
            TradeOfferList tradeOfferList = new TradeOfferList();
            ArrayList<TradeOffer> tradeOfferSet = new ArrayList<>();
            tradeOfferSet.add(createTradeOffer(buyItemList[new Random().nextInt(buyItemList.length)],sellItemList[new Random().nextInt(sellItemList.length)],Math.max(1,new Random().nextInt(10)),1, 1,Math.max(1,new Random().nextInt(5)),Math.max(1,new Random().nextInt(5))));
            tradeOfferSet.add(createTradeOffer(buyItemList[new Random().nextInt(buyItemList.length)],sellItemList[new Random().nextInt(sellItemList.length)],Math.max(1,new Random().nextInt(10)),1, 1,Math.max(1,new Random().nextInt(5)),Math.max(1,new Random().nextInt(5))));
            tradeOfferSet.add(createTradeOffer(buyItemList[new Random().nextInt(buyItemList.length)],sellItemList[new Random().nextInt(sellItemList.length)],Math.max(1,new Random().nextInt(10)),1, 1,Math.max(1,new Random().nextInt(5)),Math.max(1,new Random().nextInt(5))));
            tradeOfferSet.add(createTradeOffer(buyItemList[new Random().nextInt(buyItemList.length)],sellItemList[new Random().nextInt(sellItemList.length)],Math.max(1,new Random().nextInt(10)),1, 1,Math.max(1,new Random().nextInt(5)),Math.max(1,new Random().nextInt(5))));
            tradeOfferSet.add(createTradeOffer(buyItemList[new Random().nextInt(buyItemList.length)],sellItemList[new Random().nextInt(sellItemList.length)],Math.max(1,new Random().nextInt(10)),1, 1,Math.max(1,new Random().nextInt(5)),Math.max(1,new Random().nextInt(5))));
            tradeOfferSet.add(createTradeOffer(buyItemList[new Random().nextInt(buyItemList.length)],sellItemList[new Random().nextInt(sellItemList.length)],Math.max(1,new Random().nextInt(10)),1, 1,Math.max(1,new Random().nextInt(5)),Math.max(1,new Random().nextInt(5))));
            tradeOfferSet.add(createTradeOffer(buyItemList[new Random().nextInt(buyItemList.length)],sellItemList[new Random().nextInt(sellItemList.length)],Math.max(1,new Random().nextInt(10)),1, 1,Math.max(1,new Random().nextInt(5)),Math.max(1,new Random().nextInt(5))));
            tradeOfferSet.add(createTradeOffer(buyItemList[new Random().nextInt(buyItemList.length)],sellItemList[new Random().nextInt(sellItemList.length)],Math.max(1,new Random().nextInt(10)),1, 1,Math.max(1,new Random().nextInt(5)),Math.max(1,new Random().nextInt(5))));
            tradeOfferSet.add(createTradeOffer(buyItemList[new Random().nextInt(buyItemList.length)],sellItemList[new Random().nextInt(sellItemList.length)],Math.max(1,new Random().nextInt(10)),1, 1,Math.max(1,new Random().nextInt(5)),Math.max(1,new Random().nextInt(5))));
            tradeOfferSet.add(createTradeOffer(buyItemList[new Random().nextInt(buyItemList.length)],sellItemList[new Random().nextInt(sellItemList.length)],Math.max(1,new Random().nextInt(10)),1, 1,Math.max(1,new Random().nextInt(5)),Math.max(1,new Random().nextInt(5))));
            tradeOfferSet.add(createTradeOffer(buyItemList[new Random().nextInt(buyItemList.length)],sellItemList[new Random().nextInt(sellItemList.length)],Math.max(1,new Random().nextInt(10)),1, 1,Math.max(1,new Random().nextInt(5)),Math.max(1,new Random().nextInt(5))));
            tradeOfferSet.add(createTradeOffer(buyItemList[new Random().nextInt(buyItemList.length)],sellItemList[new Random().nextInt(sellItemList.length)],Math.max(1,new Random().nextInt(10)),1, 1,Math.max(1,new Random().nextInt(5)),Math.max(1,new Random().nextInt(5))));
            tradeOfferSet.add(createTradeOffer(buyItemList[new Random().nextInt(buyItemList.length)],sellItemList[new Random().nextInt(sellItemList.length)],Math.max(1,new Random().nextInt(10)),1, 1,Math.max(1,new Random().nextInt(5)),Math.max(1,new Random().nextInt(5))));
            tradeOfferSet.add(createTradeOffer(buyItemList[new Random().nextInt(buyItemList.length)],sellItemList[new Random().nextInt(sellItemList.length)],Math.max(1,new Random().nextInt(10)),1, 1,Math.max(1,new Random().nextInt(5)),Math.max(1,new Random().nextInt(5))));
            tradeOfferSet.add(createTradeOffer(buyItemList[new Random().nextInt(buyItemList.length)],sellItemList[new Random().nextInt(sellItemList.length)],Math.max(1,new Random().nextInt(10)),1, 1,Math.max(1,new Random().nextInt(5)),Math.max(1,new Random().nextInt(5))));
            tradeOfferSet.add(createTradeOffer(buyItemList[new Random().nextInt(buyItemList.length)],sellItemList[new Random().nextInt(sellItemList.length)],Math.max(1,new Random().nextInt(10)),1, 1,Math.max(1,new Random().nextInt(5)),Math.max(1,new Random().nextInt(5))));
            for (int i = 0; i < 8; i++) {
                var tradeIndex = new Random().nextInt(tradeOfferSet.size());
                TradeOffer tradeOffer = tradeOfferSet.get(tradeIndex);
                if (tradeOffer==null) continue;
                tradeOfferList.add(tradeOfferSet.get(tradeIndex));
                tradeOfferSet.removeIf(tradeOffer1->{
                    return tradeOffer1.copySellItem() == tradeOffer.copySellItem() || tradeOffer1.getOriginalFirstBuyItem() == tradeOffer.getOriginalFirstBuyItem();
                });
            }
            return tradeOfferList;
        }
        public static TradeOffer createTradeOffer(Item buyItem, Item sellItem, int maxUses, int merchantExperience, int priceMultiplier, int buyAmount, int sellAmount){
            ItemStack buyItemStack = new ItemStack(buyItem);
            buyItemStack.setCount(buyAmount);
            ItemStack sellItemStack = new ItemStack(sellItem);
            sellItemStack.setCount(sellAmount);
            return new TradeOffer(buyItemStack,sellItemStack,maxUses,merchantExperience,priceMultiplier);
        }
    }
}
