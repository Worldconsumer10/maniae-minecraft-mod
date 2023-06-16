package com.maniae;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.gui.hud.ChatHud;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("maniae");
	public static final Item Custom_Item = new Item(new FabricItemSettings());
	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM,new Identifier("maniae", "custom_item"),Custom_Item);
	}
}