package com.maniae.mobs.selino;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class SelinoModel extends EntityModel<SelinofosEntity> {
	private final ModelPart body;
	private final ModelPart tail;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart leftWing;
	private final ModelPart RightWing;
	private final ModelPart leg2;
	private final ModelPart cube_r1;
	private final ModelPart cube_r2;
	private final ModelPart leg3;
	private final ModelPart cube_r3;
	private final ModelPart cube_r4;
	public SelinoModel(ModelPart root) {
		this.body = root.getChild("body");
		this.leg2 = root.getChild("leg2");
		this.cube_r1 = leg2.getChild("cube_r1");
		this.cube_r2 = leg2.getChild("cube_r2");
		this.leg3 = root.getChild("leg3");
		this.cube_r3 = leg3.getChild("cube_r3");
		this.cube_r4 = leg3.getChild("cube_r4");
		this.tail = body.getChild("tail");
		this.neck = body.getChild("neck");
		this.head = neck.getChild("head");
		this.leftWing = body.getChild("leftWing");
		this.RightWing=body.getChild("RightWing");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create().uv(0, 154).cuboid(-43.0F, -80.0F, -54.0F, 50.0F, 44.0F, 99.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -28.0F, 0.0F));

		ModelPartData tail = body.addChild("tail", ModelPartBuilder.create().uv(292, 335).cuboid(-29.0F, -69.0F, 14.0F, 22.0F, 22.0F, 68.0F, new Dilation(0.0F))
				.uv(112, 319).cuboid(-29.0F, -69.0F, 82.0F, 22.0F, 22.0F, 68.0F, new Dilation(0.0F))
				.uv(0, 297).cuboid(-29.0F, -69.0F, 150.0F, 22.0F, 22.0F, 68.0F, new Dilation(0.0F))
				.uv(230, 245).cuboid(-29.0F, -69.0F, 218.0F, 22.0F, 22.0F, 68.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 31.0F));

		ModelPartData neck = body.addChild("neck", ModelPartBuilder.create().uv(199, 154).cuboid(-30.0F, -70.0F, -125.0F, 20.0F, 20.0F, 71.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData head = neck.addChild("head", ModelPartBuilder.create().uv(404, 289).cuboid(-37.0F, -74.0F, -171.0F, 34.0F, 28.0F, 46.0F, new Dilation(0.0F))
				.uv(0, 387).cuboid(-33.0F, -64.0F, -217.0F, 26.0F, 18.0F, 46.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData leftWing = body.addChild("leftWing", ModelPartBuilder.create().uv(342, 245).cuboid(104.0F, -75.0F, -49.0F, 304.0F, 8.0F, 8.0F, new Dilation(0.0F))
				.uv(0, 77).cuboid(-4.0F, -71.0F, -41.0F, 412.0F, 0.0F, 77.0F, new Dilation(0.0F))
				.uv(310, 174).cuboid(-5.0F, -76.0F, -50.0F, 304.0F, 10.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(12.0F, 0.0F, 0.0F));

		ModelPartData RightWing = body.addChild("RightWing", ModelPartBuilder.create().uv(310, 194).cuboid(-0.1667F, -4.0F, -18.1667F, 304.0F, 8.0F, 8.0F, new Dilation(0.0F))
				.uv(0, 0).cuboid(-108.1667F, 0.0F, -10.1667F, 412.0F, 0.0F, 77.0F, new Dilation(0.0F))
				.uv(310, 154).cuboid(-109.1667F, -5.0F, -19.1667F, 304.0F, 10.0F, 10.0F, new Dilation(0.0F)), ModelTransform.of(-152.8333F, -71.0F, -30.8333F, 0.0F, 0.0F, -3.1416F));

		ModelPartData leg2 = modelPartData.addChild("leg2", ModelPartBuilder.create().uv(342, 261).cuboid(-11.0F, -6.0F, -18.0F, 22.0F, 11.0F, 31.0F, new Dilation(0.0F)), ModelTransform.pivot(-50.0F, 24.0F, 29.0F));

		ModelPartData cube_r1 = leg2.addChild("cube_r1", ModelPartBuilder.create().uv(199, 154).cuboid(-8.0F, -39.5F, -9.5F, 16.0F, 52.0F, 19.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.5F, -0.5F, 0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r2 = leg2.addChild("cube_r2", ModelPartBuilder.create().uv(156, 409).cuboid(-10.0F, -55.5F, -25.5F, 20.0F, 49.0F, 25.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -36.5F, 0.5F, -0.2618F, 0.0F, 0.0F));

		ModelPartData leg3 = modelPartData.addChild("leg3", ModelPartBuilder.create().uv(224, 335).cuboid(-11.0F, -6.0F, -18.0F, 22.0F, 11.0F, 31.0F, new Dilation(0.0F)), ModelTransform.pivot(16.0F, 24.0F, 29.0F));

		ModelPartData cube_r3 = leg3.addChild("cube_r3", ModelPartBuilder.create().uv(0, 0).cuboid(-8.0F, -39.5F, -9.5F, 16.0F, 52.0F, 19.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -14.5F, -0.5F, 0.3054F, 0.0F, 0.0F));

		ModelPartData cube_r4 = leg3.addChild("cube_r4", ModelPartBuilder.create().uv(0, 129).cuboid(-10.0F, -55.5F, -25.5F, 20.0F, 49.0F, 25.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -36.5F, 0.5F, -0.2618F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 1024, 1024);
	}
	@Override
	public void setAngles(SelinofosEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		body.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		leg2.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		leg3.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}