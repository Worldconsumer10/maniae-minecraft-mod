package com.maniae.functions;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class BlockUtils {
    // Find the closest block within a radius that satisfies the predicate
    public static BlockPos findClosestBlock(World world, BlockPos center, double radius, BlockPredicate predicate) {
        int centerX = center.getX();
        int centerY = center.getY();
        int centerZ = center.getZ();

        int radiusSquared = (int) Math.pow(radius, 2);

        for (int x = centerX - (int) radius; x <= centerX + radius; x++) {
            for (int y = centerY - (int) radius; y <= centerY + radius; y++) {
                for (int z = centerZ - (int) radius; z <= centerZ + radius; z++) {
                    if (x * x + y * y + z * z <= radiusSquared) {
                        BlockState block = world.getBlockState(new BlockPos(new Vec3d(x,y,z)));
                        if (predicate.test(block,new BlockPos(new Vec3d(x,y,z)))) {
                            return new BlockPos(new Vec3d(x,y,z));
                        }
                    }
                }
            }
        }

        return null; // No matching block found
    }
    public static boolean isOpenHeight(BlockPos blockPos,World world,int height){
        for (int i = 0; i < height; i++) {
            blockPos.up(1);
            if (!world.getBlockState(blockPos).isAir())
                return false;
        }
        return true;
    }
    public static boolean isRainedOn(BlockPos blockPos,World world){
        if (world != null && world.isRaining()) {
            double blockX = blockPos.getX();
            double blockZ = blockPos.getZ();

            // Check if the location is exposed to the sky (not under a block)
            return GetHighestBlock(blockPos, world) <= blockPos.getY();
        }

        return false;
    }
    public static int GetHighestBlock(BlockPos blockPos,World world){
        BlockPos initPos = new BlockPos(new Vec3d(blockPos.getX(),500, blockPos.getZ()));
        for (int i = 200; i > 0; i--) {
            initPos.down(1);
            if (!world.getBlockState(initPos).isAir())
                break;
        }
        return initPos.getY();
    }
    public interface BlockPredicate {
        boolean test(BlockState block,BlockPos blockPos);
    }
}
