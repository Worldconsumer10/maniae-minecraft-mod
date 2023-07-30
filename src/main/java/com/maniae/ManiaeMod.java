package com.maniae;


import com.maniae.functions.ClientFinder;
import com.maniae.items.ModItems;
import com.maniae.mobs.selino.SelinofosEntity;
import com.maniae.mobs.selino.parts.SelinofosPart;
import com.maniae.status_effect.Status_Effects;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ManiaeMod implements ModInitializer {
    public static final String MOD_ID = "maniae";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final EntityType<SelinofosEntity> SELINO = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(MOD_ID, "selino"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, SelinofosEntity::new).dimensions(EntityDimensions.fixed(6f, 9f)).build()
    );
    @Override
    public void onInitialize() {
        LOGGER.info("["+MOD_ID+"] Mod Initalized");
        ModItems.RegisterItems();
        Status_Effects.RegisterStatusEffects();
        ClientFinder.initialize();
        FabricDefaultAttributeRegistry.register(SELINO, SelinofosEntity.createMobAttributes());
    }
}