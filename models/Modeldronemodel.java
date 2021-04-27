// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modeldronemodel extends EntityModel<Entity> {
	private final ModelRenderer main;
	private final ModelRenderer rightwing;
	private final ModelRenderer leftwing;

	public Modeldronemodel() {
		textureWidth = 64;
		textureHeight = 64;

		main = new ModelRenderer(this);
		main.setRotationPoint(0.0F, 19.6667F, -0.5F);
		main.setTextureOffset(28, 0).addBox(-3.5F, -3.6667F, -4.0F, 7.0F, 7.0F, 7.0F, 0.0F, false);
		main.setTextureOffset(28, 0).addBox(-2.5F, -2.6667F, 3.0F, 5.0F, 5.0F, 1.0F, 0.0F, false);
		main.setTextureOffset(14, 0).addBox(-3.0F, -2.6667F, -5.0F, 6.0F, 3.0F, 1.0F, 0.0F, false);
		main.setTextureOffset(28, 14).addBox(-4.5F, -2.6667F, -1.0F, 9.0F, 3.0F, 3.0F, 0.0F, false);

		rightwing = new ModelRenderer(this);
		rightwing.setRotationPoint(-5.0F, -0.1667F, 0.6667F);
		main.addChild(rightwing);
		rightwing.setTextureOffset(14, 9).addBox(-0.5F, -4.5F, -6.6667F, 1.0F, 9.0F, 12.0F, 0.0F, false);
		rightwing.setTextureOffset(9, 30).addBox(-3.5F, -1.5F, -4.6667F, 1.0F, 3.0F, 7.0F, 0.0F, false);
		rightwing.setTextureOffset(4, 0).addBox(-0.5F, -3.5F, -7.6667F, 1.0F, 7.0F, 1.0F, 0.0F, false);
		rightwing.setTextureOffset(14, 0).addBox(-2.5F, -1.0F, -3.6667F, 2.0F, 2.0F, 5.0F, 0.0F, false);

		leftwing = new ModelRenderer(this);
		leftwing.setRotationPoint(5.0F, -1.1667F, 0.6667F);
		main.addChild(leftwing);
		leftwing.setTextureOffset(0, 0).addBox(-0.5F, -2.5F, -7.6667F, 1.0F, 7.0F, 1.0F, 0.0F, false);
		leftwing.setTextureOffset(0, 0).addBox(-0.5F, -3.5F, -6.6667F, 1.0F, 9.0F, 12.0F, 0.0F, false);
		leftwing.setTextureOffset(0, 23).addBox(2.5F, -0.5F, -4.6667F, 1.0F, 3.0F, 7.0F, 0.0F, false);
		leftwing.setTextureOffset(14, 0).addBox(0.5F, 0.0F, -3.6667F, 2.0F, 2.0F, 5.0F, 0.0F, false);
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
		this.main.rotateAngleX = f3 / (180F / (float) Math.PI);
		this.rightwing.rotateAngleX = f3 / (180F / (float) Math.PI);
		this.leftwing.rotateAngleX = f3 / (180F / (float) Math.PI);
	}
}