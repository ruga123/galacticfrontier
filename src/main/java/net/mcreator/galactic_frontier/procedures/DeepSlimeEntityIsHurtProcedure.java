package net.mcreator.galactic_frontier.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.galactic_frontier.potion.ToxicPotion;
import net.mcreator.galactic_frontier.GalacticFrontierModElements;
import net.mcreator.galactic_frontier.GalacticFrontierMod;

import java.util.Map;

@GalacticFrontierModElements.ModElement.Tag
public class DeepSlimeEntityIsHurtProcedure extends GalacticFrontierModElements.ModElement {
	public DeepSlimeEntityIsHurtProcedure(GalacticFrontierModElements instance) {
		super(instance, 345);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency entity for procedure DeepSlimeEntityIsHurt!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(ToxicPotion.potion, (int) 200, (int) 0, (false), (true)));
	}
}
