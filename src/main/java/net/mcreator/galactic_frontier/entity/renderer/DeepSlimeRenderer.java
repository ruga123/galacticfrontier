package net.mcreator.galactic_frontier.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.IRenderTypeBuffer;

import net.mcreator.galactic_frontier.entity.DeepSlimeEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class DeepSlimeRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(DeepSlimeEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelDeepSlime(), 0.8f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("galactic_frontier:textures/deepslime.png");
					}
				};
			});
		}
	}

	@OnlyIn(Dist.CLIENT)
	private static class GlowingLayer<T extends Entity, M extends EntityModel<T>> extends LayerRenderer<T, M> {
		public GlowingLayer(IEntityRenderer<T, M> er) {
			super(er);
		}

		public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, T entitylivingbaseIn, float limbSwing,
				float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
			IVertexBuilder ivertexbuilder = bufferIn
					.getBuffer(RenderType.getEyes(new ResourceLocation("galactic_frontier:textures/deepglowtexture.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

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
			this.main.rotateAngleZ = f2 / 20.f;
		}
	}
}
