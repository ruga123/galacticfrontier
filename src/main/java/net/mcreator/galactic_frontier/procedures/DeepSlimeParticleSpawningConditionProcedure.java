package net.mcreator.galactic_frontier.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.galactic_frontier.potion.ToxicPotion;
import net.mcreator.galactic_frontier.GalacticFrontierModElements;
import net.mcreator.galactic_frontier.GalacticFrontierMod;

import java.util.Map;
import java.util.Collection;

@GalacticFrontierModElements.ModElement.Tag
public class DeepSlimeParticleSpawningConditionProcedure extends GalacticFrontierModElements.ModElement {
	public DeepSlimeParticleSpawningConditionProcedure(GalacticFrontierModElements instance) {
		super(instance, 347);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency entity for procedure DeepSlimeParticleSpawningCondition!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((new Object() {
			int check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == ToxicPotion.potion)
							return effect.getAmplifier();
					}
				}
				return 0;
			}
		}.check(entity)) >= 0)) {
			if ((Math.round((Math.random() * 10)) == 2)) {
				return (true);
			}
		}
		return (false);
	}
}
