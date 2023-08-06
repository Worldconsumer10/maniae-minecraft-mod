package com.maniae.mobs.blockit;

import com.maniae.EntityClient;
import com.maniae.ManiaeMod;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class BlockitRenderer extends MobEntityRenderer<Blockit,BlockItModel> {

    public BlockitRenderer(EntityRendererFactory.Context context) {
        super(context, new BlockItModel(context.getPart(EntityClient.MODEL_BLOCKIT_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(Blockit entity) {
        if (entity.occupation == BlockitOccupations.DEMOLITIONIST)
            return new Identifier(ManiaeMod.MOD_ID,"textures/entity/blockit/blockit_demolitionist.png");
        else
            return new Identifier(ManiaeMod.MOD_ID,"textures/entity/blockit/blockit_normal.png");
    }
}
