package com.maniae;


import com.maniae.functions.ClientFinder;
import com.maniae.functions.EntityDeathEventListener;
import com.maniae.items.ModItems;
import com.maniae.mobs.blockit.Blockit;
import com.maniae.mobs.gargoyle.Gargoyle;
import com.maniae.mobs.traderenderman.TraderEnderman;
import com.maniae.status_effect.Status_Effects;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.mob.EndermanEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ManiaeMod implements ModInitializer {
    public static final String MOD_ID = "maniae";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final EntityType<Blockit> BLOCKIT_ENTITY = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(MOD_ID,"blockit"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE,Blockit::new).dimensions(EntityDimensions.fixed(0.25f,0.3f)).build()
    );
    public static final EntityType<TraderEnderman> ENDER_TRADER = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(MOD_ID, "ender_trader"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, TraderEnderman::new).dimensions(EntityDimensions.fixed(0.5f, 4f)).build()
    );
    public static final EntityType<Gargoyle> GARGOYLE = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(MOD_ID, "gargoyle"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, Gargoyle::new).dimensions(EntityDimensions.fixed(1f, 1f)).build()
    );
    @Override
    public void onInitialize() {
        LOGGER.info("["+MOD_ID+"] Mod Initalized");
        EntityDeathEventListener.register();
        ModItems.RegisterItems();
        Status_Effects.RegisterStatusEffects();
        ClientFinder.initialize();
        FabricDefaultAttributeRegistry.register(BLOCKIT_ENTITY, Blockit.createMobAttributes());
        FabricDefaultAttributeRegistry.register(ENDER_TRADER, EndermanEntity.createEndermanAttributes());
        FabricDefaultAttributeRegistry.register(GARGOYLE, Gargoyle.createMobAttributes());
    }
}