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
    private final ModelPart master;
    private final ModelPart head;
    private final ModelPart body;
    private final ModelPart arm2;
    private final ModelPart arm1;
    private final ModelPart leg2;
    private final ModelPart leg1;
    public BlockItModel(ModelPart root) {
        this.master = root.getChild("master");
        this.head = master.getChild("head");
        this.body = master.getChild("body");
        this.arm1 = master.getChild("arm1");
        this.arm2 = master.getChild("arm2");
        this.leg1 = master.getChild("leg1");
        this.leg2 = master.getChild("leg2");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData master = modelPartData.addChild("master", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, -0.9F));

        ModelPartData head = master.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-0.75F, -1.5F, -0.75F, 1.5F, 1.5F, 1.5F, new Dilation(0.0F))
                .uv(0, 10).cuboid(-0.8F, -1.55F, -0.8F, 1.6F, 1.6F, 1.6F, new Dilation(0.0F)), ModelTransform.pivot(-0.175F, -3.2F, 0.975F));

        ModelPartData body = master.addChild("body", ModelPartBuilder.create().uv(0, 3).cuboid(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F))
                .uv(0, 6).cuboid(-1.05F, -1.05F, -0.55F, 2.1F, 2.1F, 1.1F, new Dilation(0.0F)), ModelTransform.pivot(-0.225F, -2.2F, 0.925F));

        ModelPartData arm2 = master.addChild("arm2", ModelPartBuilder.create().uv(0, 2).cuboid(-0.495F, -0.2F, -0.25F, 0.5F, 1.6F, 0.5F, new Dilation(0.0F))
                .uv(2, 7).cuboid(-0.52F, -0.225F, -0.275F, 0.55F, 1.65F, 0.55F, new Dilation(0.0F))
                .uv(6, 4).cuboid(-0.495F, 1.4F, -0.25F, 0.5F, 0.4F, 0.5F, new Dilation(0.0F)), ModelTransform.pivot(-1.23F, -3.0F, 0.875F));

        ModelPartData arm1 = master.addChild("arm1", ModelPartBuilder.create().uv(0, 2).cuboid(-0.025F, -0.2F, -0.25F, 0.5F, 1.6F, 0.5F, new Dilation(0.0F))
                .uv(3, 7).cuboid(-0.05F, -0.225F, -0.275F, 0.55F, 1.65F, 0.55F, new Dilation(0.0F))
                .uv(6, 4).cuboid(-0.025F, 1.4F, -0.25F, 0.5F, 0.4F, 0.5F, new Dilation(0.0F)), ModelTransform.pivot(0.8F, -3.0F, 0.875F));

        ModelPartData leg2 = master.addChild("leg2", ModelPartBuilder.create().uv(1, 3).mirrored().cuboid(-0.25F, -1.0F, -0.25F, 0.5F, 1.8F, 0.5F, new Dilation(0.0F)).mirrored(false)
                .uv(7, 7).mirrored().cuboid(-0.275F, -1.025F, -0.275F, 0.55F, 2.05F, 0.55F, new Dilation(0.0F)).mirrored(false)
                .uv(6, 3).cuboid(-0.25F, 0.8F, -0.25F, 0.5F, 0.2F, 0.5F, new Dilation(0.0F)), ModelTransform.pivot(0.325F, -1.0F, 0.875F));

        ModelPartData leg1 = master.addChild("leg1", ModelPartBuilder.create().uv(0, 2).cuboid(-0.25F, -1.4F, -0.25F, 0.5F, 1.8F, 0.5F, new Dilation(0.0F))
                .uv(7, 7).cuboid(-0.275F, -1.425F, -0.275F, 0.55F, 2.05F, 0.55F, new Dilation(0.0F))
                .uv(6, 3).cuboid(-0.25F, 0.4F, -0.25F, 0.5F, 0.2F, 0.5F, new Dilation(0.0F)), ModelTransform.pivot(-0.675F, -0.6F, 0.875F));
        return TexturedModelData.of(modelData, 39, 39);
    }
    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
        master.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
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
