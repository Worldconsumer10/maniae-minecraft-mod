package com.maniae;

import com.maniae.mobs.selino.SelinoModel;
import com.maniae.mobs.selino.SelinoRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class EntityClient implements ClientModInitializer {
    public static final EntityModelLayer MODEL_SELINO_LAYER = new EntityModelLayer(new Identifier(ManiaeMod.MOD_ID, "selino"), "main");
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ManiaeMod.SELINO, SelinoRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(MODEL_SELINO_LAYER, SelinoModel::getTexturedModelData);
    }
}
