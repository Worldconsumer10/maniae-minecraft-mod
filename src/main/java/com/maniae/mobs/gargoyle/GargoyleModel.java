package com.maniae.mobs.gargoyle;

import com.maniae.ManiaeMod;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class GargoyleModel extends AnimatedGeoModel<Gargoyle> {
    @Override
    public Identifier getModelLocation(Gargoyle object) {
        return new Identifier(ManiaeMod.MOD_ID,"geo/gargoyle.geo.json");
    }

    @Override
    public Identifier getTextureLocation(Gargoyle object) {
        return new Identifier(ManiaeMod.MOD_ID,"textures/entity/gargoyle.png");
    }

    @Override
    public Identifier getAnimationFileLocation(Gargoyle animatable) {
        return new Identifier(ManiaeMod.MOD_ID,"animations/gargoyle.animation.json");
    }

    @Override
    public void setCustomAnimations(Gargoyle animatable, int instanceId, AnimationEvent animationEvent) {
        IBone head = getAnimationProcessor().getBone("head");
        if (head!=null){
            //lost rn..
        }
    }
}
