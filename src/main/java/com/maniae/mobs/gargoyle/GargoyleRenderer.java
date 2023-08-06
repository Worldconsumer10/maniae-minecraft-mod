package com.maniae.mobs.gargoyle;

import com.maniae.ManiaeMod;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class GargoyleRenderer extends GeoEntityRenderer<Gargoyle> {
    public GargoyleRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new GargoyleModel());
    }

    @Override
    public Identifier getTextureLocation(Gargoyle animatable) {
        return new Identifier(ManiaeMod.MOD_ID,"textures/entity/gargoyle.png");
    }

    @Override
    public void render(Gargoyle animatable, float entityYaw, float partialTick, MatrixStack poseStack, VertexConsumerProvider bufferSource, int packedLight) {
        super.render(animatable, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
