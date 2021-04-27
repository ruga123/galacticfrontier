package net.mcreator.galactic_frontier.procedures;

import net.mcreator.galactic_frontier.GalacticFrontierModElements;
import net.mcreator.galactic_frontier.GalacticFrontierMod;

import java.util.Map;

@GalacticFrontierModElements.ModElement.Tag
public class DeepSlimeNaturalEntitySpawningConditionProcedure extends GalacticFrontierModElements.ModElement {
	public DeepSlimeNaturalEntitySpawningConditionProcedure(GalacticFrontierModElements instance) {
		super(instance, 349);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency y for procedure DeepSlimeNaturalEntitySpawningCondition!");
			return false;
		}
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		if ((y < 50)) {
			return (true);
		}
		return (false);
	}
}
