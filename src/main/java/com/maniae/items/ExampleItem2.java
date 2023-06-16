package com.maniae.items;

import net.minecraft.item.Item;

public class ExampleItem2 extends Item {
    public ExampleItem2(Settings settings) {
        super(settings);
        settings.maxCount(1);
        settings.maxDamage(2);
    }
}
