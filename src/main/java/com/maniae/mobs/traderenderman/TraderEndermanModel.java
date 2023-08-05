package com.maniae.mobs.traderenderman;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;

public class TraderEndermanModel extends EntityModel<TraderEnderman> {
    private final ModelPart body;
    private final ModelPart head;
    private final ModelPart widebrim;
    private final ModelPart headwear;
    private final ModelPart right_arm;
    private final ModelPart left_arm;
    private final ModelPart right_leg;
    private final ModelPart left_leg;
    private final ModelPart backpack;
    public TraderEndermanModel(ModelPart root) {
        this.body = root.getChild("body");
        this.head = root.getChild("head");
        this.headwear = root.getChild("headwear");
        this.right_arm = root.getChild("right_arm");
        this.left_arm = root.getChild("left_arm");
        this.right_leg = root.getChild("right_leg");
        this.left_leg = root.getChild("left_leg");
        this.backpack = root.getChild("backpack");
        this.widebrim = this.head.getChild("widebrim");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create().uv(32, 16).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -15.0F, 0.0F));

        ModelPartData head = modelPartData.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -18.8F, 0.0F));

        ModelPartData widebrim = head.addChild("widebrim", ModelPartBuilder.create().uv(3, 47).cuboid(-7.0F, -2.0F, -7.0F, 14.0F, 2.0F, 14.0F, new Dilation(0.0F))
                .uv(18, 54).cuboid(-5.0F, -14.0F, -5.0F, 10.0F, 12.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -4.2F, 0.0F));

        ModelPartData headwear = modelPartData.addChild("headwear", ModelPartBuilder.create().uv(0, 16).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(-0.5F)), ModelTransform.pivot(0.0F, -14.5F, 0.0F));

        ModelPartData right_arm = modelPartData.addChild("right_arm", ModelPartBuilder.create().uv(56, 0).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 30.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-5.0F, -13.0F, 0.0F));

        ModelPartData left_arm = modelPartData.addChild("left_arm", ModelPartBuilder.create().uv(56, 0).mirrored().cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 30.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(5.0F, -13.0F, 0.0F));

        ModelPartData right_leg = modelPartData.addChild("right_leg", ModelPartBuilder.create().uv(56, 0).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 30.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, -6.0F, 0.0F));

        ModelPartData left_leg = modelPartData.addChild("left_leg", ModelPartBuilder.create().uv(56, 0).mirrored().cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 30.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(2.0F, -6.0F, 0.0F));

        ModelPartData backpack = modelPartData.addChild("backpack", ModelPartBuilder.create().uv(34, 2).cuboid(-4.0F, -5.0F, -1.0F, 8.0F, 9.0F, 2.0F, new Dilation(0.0F))
                .uv(34, 36).cuboid(-4.0F, -8.0F, -1.0F, 8.0F, 3.0F, 2.6F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -7.0F, 3.0F));
        return TexturedModelData.of(modelData, 76, 76);
    }
    @Override
    public void setAngles(TraderEnderman entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.yaw = netHeadYaw * 0.017453292F;
        this.head.pitch = headPitch * 0.017453292F;
        this.right_leg.pitch = MathHelper.cos(limbSwing * 0.6662F) * 0.5F * limbSwingAmount;
        this.left_leg.pitch = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 0.5F * limbSwingAmount;
    }
    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
        body.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
        head.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
        headwear.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
        right_arm.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
        left_arm.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
        right_leg.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
        left_leg.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
        backpack.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
    }
}
