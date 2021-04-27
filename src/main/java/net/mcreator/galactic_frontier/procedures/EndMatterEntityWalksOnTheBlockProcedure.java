package net.mcreator.galactic_frontier.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.galactic_frontier.GalacticFrontierModElements;
import net.mcreator.galactic_frontier.GalacticFrontierMod;

import java.util.Map;

@GalacticFrontierModElements.ModElement.Tag
public class EndMatterEntityWalksOnTheBlockProcedure extends GalacticFrontierModElements.ModElement {
	public EndMatterEntityWalksOnTheBlockProcedure(GalacticFrontierModElements instance) {
		super(instance, 2);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency entity for procedure EndMatterEntityWalksOnTheBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.HOT_FLOOR, (float) 2);
	}
}
