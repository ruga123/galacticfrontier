package net.mcreator.galactic_frontier.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.galactic_frontier.GalacticFrontierModElements;
import net.mcreator.galactic_frontier.GalacticFrontierMod;

import java.util.Map;

@GalacticFrontierModElements.ModElement.Tag
public class DeepSlimeOnEntityTickUpdateProcedure extends GalacticFrontierModElements.ModElement {
	public DeepSlimeOnEntityTickUpdateProcedure(GalacticFrontierModElements instance) {
		super(instance, 348);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency entity for procedure DeepSlimeOnEntityTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if ((Math.round((Math.random() * 24)) == 2)) {
			entity.setMotion((entity.getMotion().getX()), (((Math.random() * 3) - 1.8) / 22), (entity.getMotion().getZ()));
		}
	}
}
