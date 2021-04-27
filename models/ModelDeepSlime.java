// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class ModelDeepSlime extends EntityModel<Entity> {
	private final ModelRenderer main;

	public ModelDeepSlime() {
		textureWidth = 64;
		textureHeight = 64;

		main = new ModelRenderer(this);
		main.setRotationPoint(-0.3667F, 15.6667F, -0.1F);
		main.setTextureOffset(0, 0).addBox(-4.6333F, -4.6667F, -4.9F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		main.setTextureOffset(30, 3).addBox(-3.6333F, 4.8333F, -3.9F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		main.setTextureOffset(19, 21).addBox(0.3667F, 4.8333F, -0.9F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		main.setTextureOffset(10, 20).addBox(1.3667F, -5.1667F, -1.9F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		main.setTextureOffset(18, 25).addBox(1.3667F, -0.1667F, -5.4F, 3.0F, 3.0F, 2.0F, 0.0F, false);
		main.setTextureOffset(8, 24).addBox(1.3667F, -0.1667F, 3.6F, 3.0F, 3.0F, 2.0F, 0.0F, false);
		main.setTextureOffset(0, 26).addBox(-2.6333F, -2.1667F, -5.4F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		main.setTextureOffset(0, 6).addBox(-0.6333F, -4.1667F, 3.6F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		main.setTextureOffset(30, 0).addBox(-3.6333F, -5.1667F, -3.9F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		main.setTextureOffset(6, 29).addBox(-5.1333F, 2.3333F, -3.9F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		main.setTextureOffset(28, 25).addBox(-5.1333F, 1.3333F, 3.6F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		main.setTextureOffset(0, 20).addBox(-5.1333F, -3.6667F, -0.9F, 2.0F, 3.0F, 3.0F, 0.0F, false);
		main.setTextureOffset(0, 0).addBox(3.8667F, -2.6667F, -2.9F, 2.0F, 3.0F, 3.0F, 0.0F, false);
		main.setTextureOffset(28, 20).addBox(3.8667F, 1.3333F, 1.1F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		main.setTextureOffset(26, 29).addBox(-2.6333F, -5.1667F, 1.1F, 2.0F, 1.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.main.rotateAngleZ = f2 / 20.f;
	}
}