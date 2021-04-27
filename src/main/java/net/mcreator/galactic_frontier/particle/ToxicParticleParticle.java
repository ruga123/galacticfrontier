
package net.mcreator.galactic_frontier.particle;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.particles.ParticleType;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.client.particle.SpriteTexturedParticle;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.IParticleRenderType;
import net.minecraft.client.particle.IParticleFactory;
import net.minecraft.client.particle.IAnimatedSprite;
import net.minecraft.client.Minecraft;

import net.mcreator.galactic_frontier.GalacticFrontierModElements;

@GalacticFrontierModElements.ModElement.Tag
public class ToxicParticleParticle extends GalacticFrontierModElements.ModElement {
	public static final BasicParticleType particle = new BasicParticleType(false);
	public ToxicParticleParticle(GalacticFrontierModElements instance) {
		super(instance, 346);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerParticleType(RegistryEvent.Register<ParticleType<?>> event) {
		event.getRegistry().register(particle.setRegistryName("toxic_particle"));
	}

	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public void registerParticle(ParticleFactoryRegisterEvent event) {
		Minecraft.getInstance().particles.registerFactory(particle, CustomParticleFactory::new);
	}
	@OnlyIn(Dist.CLIENT)
	private static class CustomParticle extends SpriteTexturedParticle {
		private final IAnimatedSprite spriteSet;
		protected CustomParticle(ClientWorld world, double x, double y, double z, double vx, double vy, double vz, IAnimatedSprite spriteSet) {
			super(world, x, y, z);
			this.spriteSet = spriteSet;
			this.setSize((float) 0.2, (float) 0.2);
			this.particleScale *= (float) 1.6;
			this.maxAge = (int) Math.max(1, 22 + (this.rand.nextInt(4) - 2));
			this.particleGravity = (float) -0.1;
			this.canCollide = true;
			this.motionX = vx * 0;
			this.motionY = vy * 0;
			this.motionZ = vz * 0;
			this.selectSpriteWithAge(spriteSet);
		}

		@Override
		public IParticleRenderType getRenderType() {
			return IParticleRenderType.PARTICLE_SHEET_TRANSLUCENT;
		}

		@Override
		public void tick() {
			super.tick();
			if (!this.isExpired) {
				this.setSprite(this.spriteSet.get((this.age / 4) % 1 + 1, 1));
			}
		}
	}

	@OnlyIn(Dist.CLIENT)
	private static class CustomParticleFactory implements IParticleFactory<BasicParticleType> {
		private final IAnimatedSprite spriteSet;
		public CustomParticleFactory(IAnimatedSprite spriteSet) {
			this.spriteSet = spriteSet;
		}

		public Particle makeParticle(BasicParticleType typeIn, ClientWorld worldIn, double x, double y, double z, double xSpeed, double ySpeed,
				double zSpeed) {
			return new CustomParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
		}
	}
}
