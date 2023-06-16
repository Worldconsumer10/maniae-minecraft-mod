package com.maniae.items;

import net.minecraft.item.Item;

public class ExampleItem extends Item {
    public ExampleItem(Settings settings) {
        super(settings);
        settings.maxCount(1);
        settings.maxDamage(1);
    }
}
