// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class ModelBorealSquid extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer leg1;
	private final ModelRenderer cube_r5;
	private final ModelRenderer leginner;
	private final ModelRenderer cube_r6;
	private final ModelRenderer leg2;
	private final ModelRenderer cube_r7;
	private final ModelRenderer leginner2;
	private final ModelRenderer cube_r8;
	private final ModelRenderer leg5;
	private final ModelRenderer cube_r9;
	private final ModelRenderer leginner5;
	private final ModelRenderer cube_r10;
	private final ModelRenderer leg6;
	private final ModelRenderer cube_r11;
	private final ModelRenderer leginner6;
	private final ModelRenderer cube_r12;
	private final ModelRenderer leg3;
	private final ModelRenderer cube_r13;
	private final ModelRenderer leginner3;
	private final ModelRenderer cube_r14;
	private final ModelRenderer leg4;
	private final ModelRenderer cube_r15;
	private final ModelRenderer leginner4;
	private final ModelRenderer cube_r16;

	public ModelBorealSquid() {
		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.4F, 5.8348F, -6.0F);
		setRotationAngle(Head, -1.3204F, 1.2114F, -1.3358F);
		Head.setTextureOffset(0, 0).addBox(-2.7612F, -21.4854F, -6.0F, 12.0F, 13.0F, 12.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(3.0F, -5.0F, -5.5F);
		Head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.2182F);
		cube_r1.setTextureOffset(47, 86).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 11.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-6.3661F, -45.7629F, 0.0F);
		Head.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7854F);
		cube_r2.setTextureOffset(48, 0).addBox(-11.0951F, 2.5F, -4.0F, 8.0F, 16.0F, 8.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.6326F, -26.3688F, 0.0F);
		Head.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.4363F);
		cube_r3.setTextureOffset(0, 25).addBox(-3.5286F, -3.5F, -5.0F, 10.0F, 12.0F, 10.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(3.2388F, -1.9854F, 0.0F);
		Head.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.3491F);
		cube_r4.setTextureOffset(30, 37).addBox(-7.0F, -8.5F, -5.0F, 9.0F, 12.0F, 10.0F, 0.0F, false);

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(0.6357F, 0.9626F, -4.5F);
		Head.addChild(leg1);
		setRotationAngle(leg1, -0.5236F, 0.3491F, -0.3054F);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(2.6031F, -2.948F, 4.5F);
		leg1.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.8727F);
		cube_r5.setTextureOffset(48, 59).addBox(-1.0F, 2.5F, -6.0F, 3.0F, 13.0F, 3.0F, 0.0F, false);

		leginner = new ModelRenderer(this);
		leginner.setRotationPoint(-8.9534F, 7.5466F, 0.0F);
		leg1.addChild(leginner);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		leginner.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.8727F);
		cube_r6.setTextureOffset(68, 53).addBox(-1.1498F, -0.0986F, -1.0F, 2.0F, 13.0F, 2.0F, 0.0F, false);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(0.6357F, 0.9626F, 4.5F);
		Head.addChild(leg2);
		setRotationAngle(leg2, 0.3491F, -0.1745F, -0.3054F);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(2.6031F, -2.948F, 4.5F);
		leg2.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.8727F);
		cube_r7.setTextureOffset(36, 59).addBox(-1.0F, 2.5F, -6.0F, 3.0F, 13.0F, 3.0F, 0.0F, false);

		leginner2 = new ModelRenderer(this);
		leginner2.setRotationPoint(-8.9534F, 7.5466F, 0.0F);
		leg2.addChild(leginner2);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
		leginner2.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.8727F);
		cube_r8.setTextureOffset(68, 38).addBox(-1.1498F, -0.0986F, -1.0F, 2.0F, 13.0F, 2.0F, 0.0F, false);

		leg5 = new ModelRenderer(this);
		leg5.setRotationPoint(1.6357F, 0.9626F, 0.0F);
		Head.addChild(leg5);
		setRotationAngle(leg5, 0.0F, 0.0F, -0.2182F);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(2.6031F, -2.948F, 4.0F);
		leg5.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 0.8727F);
		cube_r9.setTextureOffset(12, 47).addBox(-1.0F, 2.5F, -5.5F, 3.0F, 13.0F, 3.0F, 0.0F, false);

		leginner5 = new ModelRenderer(this);
		leginner5.setRotationPoint(-8.9534F, 7.5466F, -0.5F);
		leg5.addChild(leginner5);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
		leginner5.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 0.8727F);
		cube_r10.setTextureOffset(0, 63).addBox(-1.1498F, -0.0986F, -0.5F, 2.0F, 13.0F, 2.0F, 0.0F, false);

		leg6 = new ModelRenderer(this);
		leg6.setRotationPoint(-3.3643F, -2.0374F, 0.0F);
		Head.addChild(leg6);
		setRotationAngle(leg6, 0.0F, 0.0F, 0.0436F);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(2.6031F, -2.948F, 4.0F);
		leg6.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 0.8727F);
		cube_r11.setTextureOffset(0, 47).addBox(-1.0F, 2.5F, -5.5F, 3.0F, 13.0F, 3.0F, 0.0F, false);

		leginner6 = new ModelRenderer(this);
		leginner6.setRotationPoint(-8.9534F, 7.5466F, -0.5F);
		leg6.addChild(leginner6);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
		leginner6.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, 0.8727F);
		cube_r12.setTextureOffset(60, 59).addBox(-1.1498F, -0.0986F, -0.5F, 2.0F, 13.0F, 2.0F, 0.0F, false);

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(-2.3643F, -3.0374F, 4.5F);
		Head.addChild(leg3);
		setRotationAngle(leg3, 0.0F, 0.3054F, 0.0F);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(2.6031F, -2.948F, 4.5F);
		leg3.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, 0.8727F);
		cube_r13.setTextureOffset(24, 59).addBox(-1.0F, 2.5F, -6.0F, 3.0F, 13.0F, 3.0F, 0.0F, false);

		leginner3 = new ModelRenderer(this);
		leginner3.setRotationPoint(-8.9534F, 7.5466F, 0.0F);
		leg3.addChild(leginner3);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
		leginner3.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, 0.8727F);
		cube_r14.setTextureOffset(16, 63).addBox(-1.1498F, -0.0986F, -1.0F, 2.0F, 13.0F, 2.0F, 0.0F, false);

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(-2.3643F, -3.0374F, -4.5F);
		Head.addChild(leg4);
		setRotationAngle(leg4, 0.0F, -0.2618F, 0.0F);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(2.6031F, -2.948F, 4.5F);
		leg4.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, 0.8727F);
		cube_r15.setTextureOffset(58, 24).addBox(-1.0F, 2.5F, -6.0F, 3.0F, 13.0F, 3.0F, 0.0F, false);

		leginner4 = new ModelRenderer(this);
		leginner4.setRotationPoint(-8.9534F, 7.5466F, 0.0F);
		leg4.addChild(leginner4);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
		leginner4.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, 0.8727F);
		cube_r16.setTextureOffset(8, 63).addBox(-1.1498F, -0.0986F, -1.0F, 2.0F, 13.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.leg1.rotateAngleZ = MathHelper.cos(f * 0.6662F) * f1;
		this.leg4.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leg5.rotateAngleZ = MathHelper.cos(f * 0.6662F) * f1;
		this.leg2.rotateAngleZ = MathHelper.cos(f * 0.6662F) * f1;
		this.leg3.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leginner.rotateAngleZ = MathHelper.cos(f * 0.6662F) * f1;
		this.leg6.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.leginner5.rotateAngleZ = MathHelper.cos(f * 0.6662F) * f1;
		this.leginner4.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leginner6.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leginner3.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leginner2.rotateAngleZ = MathHelper.cos(f * 0.6662F) * f1;
	}
}