package com.maniae.mobs.traderenderman;

import com.maniae.EntityClient;
import com.maniae.ManiaeMod;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class TraderEndermanRenderer extends MobEntityRenderer<TraderEnderman, TraderEndermanModel> {
    public TraderEndermanRenderer(EntityRendererFactory.Context context) {
        super(context, new TraderEndermanModel(context.getPart(EntityClient.MODEL_ENDERTRADER_LAYER)), 1f);
    }

    @Override
    public Identifier getTexture(TraderEnderman entity) {
        return new Identifier(ManiaeMod.MOD_ID,"textures/entity/ender_trader.png");
    }
}
