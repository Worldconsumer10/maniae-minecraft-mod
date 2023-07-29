package com.maniae.mobs.selino;

import com.maniae.EntityClient;
import com.maniae.ManiaeMod;
import net.minecraft.client.render.Frustum;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class SelinoRenderer extends MobEntityRenderer<Selinofos,SelinoModel> {
    public SelinoRenderer(EntityRendererFactory.Context context) {
        super(context, new SelinoModel(context.getPart(EntityClient.MODEL_SELINO_LAYER)), 1f);
    }
    @Override
    public boolean shouldRender(Selinofos mobEntity, Frustum frustum, double d, double e, double f) {
        return super.shouldRender(mobEntity, frustum, d, e, f);
    }

    @Override
    public Identifier getTexture(Selinofos entity) {
        return new Identifier(ManiaeMod.MOD_ID,"textures/entity/selino_texture.png");
    }
}
