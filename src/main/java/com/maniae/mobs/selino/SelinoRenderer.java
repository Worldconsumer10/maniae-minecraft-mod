package com.maniae.mobs.selino;

import com.maniae.EntityClient;
import com.maniae.ManiaeMod;
import com.maniae.mobs.selino.parts.SelinofosPart;
import net.minecraft.client.render.Frustum;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.Identifier;

public class SelinoRenderer extends MobEntityRenderer<SelinofosEntity,SelinoModel> {
    public SelinoRenderer(EntityRendererFactory.Context context) {
        super(context, new SelinoModel(context.getPart(EntityClient.MODEL_SELINO_LAYER)), 1f);
    }
    @Override
    public boolean shouldRender(SelinofosEntity mobEntity, Frustum frustum, double d, double e, double f) {
        if (super.shouldRender(mobEntity, frustum, d, e, f)) {
            return true;
        } else {
            Entity entity = mobEntity.getHoldingEntity();
            return entity != null && allVis(mobEntity,frustum);
        }
    }

    private boolean allVis(SelinofosEntity mobEntity, Frustum frustum){
        boolean verify = false;
        for (SelinofosPart part : mobEntity.getBodyParts()) {
            if (frustum.isVisible(part.getVisibilityBoundingBox()))
                verify=true;
        }
        return frustum.isVisible(mobEntity.getVisibilityBoundingBox()) || verify;
    }

    @Override
    public Identifier getTexture(SelinofosEntity entity) {
        return new Identifier(ManiaeMod.MOD_ID,"textures/entity/selino_texture.png");
    }
}
