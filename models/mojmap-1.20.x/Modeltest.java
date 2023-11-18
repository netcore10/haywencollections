// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeltest<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "test"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart Rarm;
	private final ModelPart Larm;
	private final ModelPart Lleg;
	private final ModelPart Rleg;

	public Modeltest(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.Rarm = root.getChild("Rarm");
		this.Larm = root.getChild("Larm");
		this.Lleg = root.getChild("Lleg");
		this.Rleg = root.getChild("Rleg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(
				-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 18.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 4).addBox(
				-1.0F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 19.5F, 0.0F));

		PartDefinition Rarm = partdefinition.addOrReplaceChild("Rarm", CubeListBuilder.create().texOffs(4, 8).addBox(
				-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, 18.0F, 0.0F));

		PartDefinition Larm = partdefinition.addOrReplaceChild("Larm", CubeListBuilder.create().texOffs(8, 0).addBox(
				-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 18.0F, 0.0F));

		PartDefinition Lleg = partdefinition.addOrReplaceChild("Lleg", CubeListBuilder.create().texOffs(0, 8).addBox(
				-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, 21.0F, 0.0F));

		PartDefinition Rleg = partdefinition.addOrReplaceChild("Rleg", CubeListBuilder.create().texOffs(6, 4).addBox(
				-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, 21.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Rarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Larm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Lleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Rleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.Larm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.Lleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Rleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Rarm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}