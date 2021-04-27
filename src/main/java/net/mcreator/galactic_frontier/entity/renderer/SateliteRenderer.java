package net.mcreator.galactic_frontier.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.galactic_frontier.entity.SateliteEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class SateliteRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(SateliteEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelcustom_model(), 0.1f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("galactic_frontier:textures/satelitentitytexture.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.3
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modelcustom_model extends EntityModel<Entity> {
		private final ModelRenderer main;
		private final ModelRenderer satelite;
		private final ModelRenderer cube_r1;
		private final ModelRenderer antena;
		public Modelcustom_model() {
			textureWidth = 64;
			textureHeight = 64;
			main = new ModelRenderer(this);
			main.setRotationPoint(0.0F, 24.0F, 0.0F);
			main.setTextureOffset(18, 16).addBox(-1.0F, -11.0F, -1.0F, 2.0F, 13.0F, 2.0F, 0.0F, false);
			satelite = new ModelRenderer(this);
			satelite.setRotationPoint(0.0F, -9.7363F, 0.0F);
			main.addChild(satelite);
			satelite.setTextureOffset(0, 0).addBox(-4.0F, -1.2637F, -4.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
			satelite.setTextureOffset(0, 18).addBox(-4.01F, -1.7605F, 2.8265F, 8.0F, 3.0F, 1.0F, 0.0005F, false);
			satelite.setTextureOffset(24, 6).addBox(-4.0F, -2.2637F, -4.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			satelite.setTextureOffset(0, 22).addBox(-4.0F, -2.2637F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			satelite.setTextureOffset(20, 9).addBox(3.0F, -2.2637F, -3.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			satelite.setTextureOffset(26, 21).addBox(3.0F, -3.2637F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			satelite.setTextureOffset(26, 16).addBox(-4.0F, -3.2637F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			satelite.setTextureOffset(24, 2).addBox(-4.0F, -3.2637F, -3.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			satelite.setTextureOffset(24, 4).addBox(-4.0F, -2.2637F, 3.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			satelite.setTextureOffset(24, 0).addBox(-4.0F, -3.2637F, 2.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-3.0F, 0.9244F, 5.9794F);
			satelite.addChild(cube_r1);
			setRotationAngle(cube_r1, 1.3526F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(0, 9).addBox(-1.0F, -10.0F, -1.0F, 8.0F, 7.0F, 2.0F, -0.01F, false);
			antena = new ModelRenderer(this);
			antena.setRotationPoint(0.0F, -0.7637F, 0.0F);
			satelite.addChild(antena);
			antena.setTextureOffset(20, 9).addBox(-0.5F, -7.5F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			antena.setTextureOffset(0, 0).addBox(-1.0F, -8.5F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			antena.setTextureOffset(8, 22).addBox(-1.0F, -3.5F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			main.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.main.rotateAngleY = f4 / (180F / (float) Math.PI);
			this.satelite.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.satelite.rotateAngleX = f4 / (180F / (float) Math.PI);
		}
	}
}
