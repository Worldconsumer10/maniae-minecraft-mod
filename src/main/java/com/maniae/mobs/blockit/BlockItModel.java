package com.maniae.mobs.blockit;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;

@Environment(EnvType.CLIENT)
public class BlockItModel extends EntityModel<Blockit> {
    public final ModelPart leg1;
    public final ModelPart leg2;
    public final ModelPart arm1;
    public final ModelPart arm2;
    public final ModelPart body;
    public final ModelPart head;
    public final ModelPart EyeLeft;
    public final ModelPart EyeLeft2;
    public BlockItModel(ModelPart root) {
        this.leg1 = root.getChild("leg1");
        this.leg2 = root.getChild("leg2");
        this.arm1 = root.getChild("arm1");
        this.arm2 = root.getChild("arm2");
        this.body = root.getChild("body");
        this.head = root.getChild("head");
        this.EyeLeft = head.getChild("EyeLeft");
        this.EyeLeft2 = head.getChild("EyeLeft2");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData leg1 = modelPartData.addChild("leg1", ModelPartBuilder.create().uv(0, 2).cuboid(-0.125F, -0.4F, -0.125F, 0.25F, 0.9F, 0.25F, new Dilation(0.0F))
                .uv(3, 0).cuboid(-0.125F, 0.5F, -0.125F, 0.25F, 0.1F, 0.25F, new Dilation(0.0F)), ModelTransform.pivot(-0.125F, 23.4F, -0.875F));

        ModelPartData leg2 = modelPartData.addChild("leg2", ModelPartBuilder.create().uv(1, 0).mirrored().cuboid(-0.125F, -0.4F, -0.125F, 0.25F, 0.9F, 0.25F, new Dilation(0.0F)).mirrored(false)
                .uv(3, 0).cuboid(-0.125F, 0.5F, -0.125F, 0.25F, 0.1F, 0.25F, new Dilation(0.0F)), ModelTransform.pivot(0.375F, 23.4F, -0.875F));

        ModelPartData arm1 = modelPartData.addChild("arm1", ModelPartBuilder.create().uv(0, 2).cuboid(0.0F, -0.15F, -0.125F, 0.25F, 0.8F, 0.25F, new Dilation(0.0F))
                .uv(3, 2).cuboid(0.0F, 0.65F, -0.125F, 0.25F, 0.2F, 0.25F, new Dilation(0.0F)), ModelTransform.pivot(0.6F, 22.55F, -0.875F));

        ModelPartData arm2 = modelPartData.addChild("arm2", ModelPartBuilder.create().uv(0, 2).cuboid(-0.25F, -0.15F, -0.125F, 0.25F, 0.8F, 0.25F, new Dilation(0.0F))
                .uv(3, 2).cuboid(-0.25F, 0.65F, -0.125F, 0.25F, 0.2F, 0.25F, new Dilation(0.0F)), ModelTransform.pivot(-0.4F, 22.55F, -0.875F));

        ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create().uv(0, 1).cuboid(-0.5F, -0.5F, -0.25F, 1.0F, 1.0F, 0.5F, new Dilation(0.0F)), ModelTransform.pivot(0.1F, 22.9F, -0.85F));

        ModelPartData head = modelPartData.addChild("head", ModelPartBuilder.create().uv(1, 2).cuboid(-0.375F, -0.375F, -0.375F, 0.75F, 0.75F, 0.75F, new Dilation(0.0F)), ModelTransform.pivot(0.125F, 22.025F, -0.825F));

        ModelPartData EyeLeft = head.addChild("EyeLeft", ModelPartBuilder.create().uv(1, 0).cuboid(-0.125F, -0.125F, 0.0F, 0.125F, 0.25F, 0.0F, new Dilation(0.0F))
                .uv(2, 0).cuboid(0.0F, -0.125F, 0.0F, 0.125F, 0.25F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.175F, -0.15F, -0.38F));

        ModelPartData EyeLeft2 = head.addChild("EyeLeft2", ModelPartBuilder.create().uv(1, 0).cuboid(-0.125F, -0.125F, 0.0F, 0.125F, 0.25F, 0.0F, new Dilation(0.0F))
                .uv(2, 0).cuboid(0.0F, -0.125F, 0.0F, 0.125F, 0.25F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-0.175F, -0.15F, -0.38F, 0.0F, 0.0F, -3.1416F));
        return TexturedModelData.of(modelData, 4, 4);
    }
    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
        leg1.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
        leg2.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
        arm1.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
        arm2.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
        body.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
        head.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
    }

    @Override
    public void setAngles(Blockit entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
        this.head.yaw = headYaw * 0.017453292F;
        this.head.pitch = headPitch * 0.017453292F;
        this.leg1.pitch = MathHelper.cos(limbAngle * 0.6662F) * 1.4F * limbDistance;
        this.leg2.pitch = MathHelper.cos(limbAngle * 0.6662F + (float) Math.PI) * 1.4F * limbDistance;
        this.arm1.pitch = MathHelper.cos(limbAngle * 0.6662F) * 1.4F * limbDistance;
        this.arm2.pitch = MathHelper.cos(limbAngle * 0.6662F + (float) Math.PI) * 1.4F * limbDistance;
    }
}
