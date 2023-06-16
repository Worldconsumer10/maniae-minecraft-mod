package com.maniae;

import com.maniae.items.ExampleItem;
import com.maniae.items.ExampleItem2;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ManiaeMod implements ModInitializer {
    //Items
    public static final Item exampleItem = new ExampleItem(new Item.Settings());
    public static final Item exampleItem2 = new ExampleItem2(new Item.Settings());
    //end of items
    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("maniae", "exampleitem"),exampleItem);
        Registry.register(Registry.ITEM, new Identifier("maniae", "exampleitem2"),exampleItem2);
    }
}