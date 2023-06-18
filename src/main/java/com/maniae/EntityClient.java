package com.maniae;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class EntityClient implements ClientModInitializer {
    public static final EntityModelLayer MODEL_BLOCKIT_LAYER = new EntityModelLayer(new Identifier(ManiaeMod.MOD_ID, "blockit"), "main");
    @Override
    public void onInitializeClient() {
    }
}
