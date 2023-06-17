package com.maniae.items;

import com.maniae.ManiaeMod;
import com.maniae.items.item_list.ExampleItem;
import com.maniae.items.item_list.ExampleItem2;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static final Item EXAMPLE_ITEM = registerItem("example_item",new ExampleItem(new FabricItemSettings()));
    public static final Item EXAMPLE_ITEM2 = registerItem("example_item_2",new ExampleItem2(new FabricItemSettings()));
    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(ManiaeMod.MOD_ID, name),item);
    }
    public static void addItemsToItemGroup(){
        AddToItemGroup(EXAMPLE_ITEM);
        AddToItemGroup(EXAMPLE_ITEM2);
    }
    private static void AddToItemGroup(Item item){
        DefaultedList<ItemStack> itemStacks = DefaultedList.ofSize(1);
        itemStacks.add(new ItemStack(item));
        ManiaeItemGroup.Maniae_Item_Group.appendStacks(itemStacks);
    }
    public static void RegisterItems()
    {
        try{
            ManiaeMod.LOGGER.info("["+ManiaeMod.MOD_ID+"] Registering Mod Items!");
            addItemsToItemGroup();
        }catch (Exception e){
            ManiaeMod.LOGGER.error("["+ManiaeMod.MOD_ID+"] Failed to register mod items!");
            ManiaeMod.LOGGER.error("["+ManiaeMod.MOD_ID+"] "+e.toString());
        }
    }
}
