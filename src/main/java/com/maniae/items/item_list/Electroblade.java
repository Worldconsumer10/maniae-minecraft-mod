package com.maniae.items.item_list;

import com.maniae.items.ManiaeItemGroup;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Rarity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Electroblade extends SwordItem {
    public Electroblade(Settings settings) {
        super(ToolMaterials.DIAMOND, 10, 1, settings);
        settings.maxDamage(-1);
        settings.group(ManiaeItemGroup.Maniae_Item_Group);
        settings.rarity(Rarity.EPIC);
    }
    @Override
    public boolean canMine(BlockState state, World world, BlockPos pos, PlayerEntity miner) {
        return !miner.isCreative();
    }
}
