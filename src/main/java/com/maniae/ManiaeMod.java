package com.maniae;


import com.maniae.functions.ClientFinder;
import com.maniae.items.ModItems;
import com.maniae.status_effect.Status_Effects;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ManiaeMod implements ModInitializer {
    public static final String MOD_ID = "maniae";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
        LOGGER.info("["+MOD_ID+"] Mod Initalized");
        ModItems.RegisterItems();
        Status_Effects.RegisterStatusEffects();
        ClientFinder.initialize();

    }
}