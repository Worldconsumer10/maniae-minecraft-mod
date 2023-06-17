package com.maniae.items;

import com.maniae.ManiaeMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ManiaeItemGroup {
    public static final ItemGroup Maniae_Item_Group = FabricItemGroupBuilder.build(new Identifier(ManiaeMod.MOD_ID,"maniae_mod_tab"),()->new ItemStack(ModItems.EXAMPLE_ITEM));
}
