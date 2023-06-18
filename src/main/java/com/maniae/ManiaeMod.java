package com.maniae;


import com.maniae.entity.custom.BlockitEntity;
import com.maniae.functions.ClientFinder;
import com.maniae.items.ModItems;
import com.maniae.status_effect.Status_Effects;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.entity.EntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ManiaeMod implements ModInitializer {
    public static final String MOD_ID = "maniae";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
<<<<<<< Updated upstream
=======
    public static final ClientTick clientTick = new ClientTick();

>>>>>>> Stashed changes
    @Override
    public void onInitialize() {
        LOGGER.info("["+MOD_ID+"] Mod Initalized");
        ModItems.RegisterItems();
        Status_Effects.RegisterStatusEffects();
        ClientFinder.initialize();

    }
}