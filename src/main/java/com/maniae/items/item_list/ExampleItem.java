package com.maniae.items.item_list;

import com.maniae.items.ManiaeItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;
import org.jetbrains.annotations.NotNull;

public class ExampleItem extends Item {
    public ExampleItem(Settings settings) {
        super(settings);
        settings.group(ManiaeItemGroup.Maniae_Item_Group);
    }
}