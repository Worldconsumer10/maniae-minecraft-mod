package com.maniae;

import com.maniae.mobs.blockit.BlockItModel;
import com.maniae.mobs.blockit.BlockitRenderer;
import com.maniae.mobs.traderenderman.TraderEndermanModel;
import com.maniae.mobs.traderenderman.TraderEndermanRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class EntityClient implements ClientModInitializer {
    public static final EntityModelLayer MODEL_BLOCKIT_LAYER = new EntityModelLayer(new Identifier(ManiaeMod.MOD_ID, "blockit"), "main");
    public static final EntityModelLayer MODEL_ENDERTRADER_LAYER = new EntityModelLayer(new Identifier(ManiaeMod.MOD_ID, "ender_trader"), "main");
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ManiaeMod.BLOCKIT_ENTITY, BlockitRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(MODEL_BLOCKIT_LAYER, BlockItModel::getTexturedModelData);
        EntityRendererRegistry.register(ManiaeMod.ENDER_TRADER, TraderEndermanRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(MODEL_ENDERTRADER_LAYER, TraderEndermanModel::getTexturedModelData);
    }
}
