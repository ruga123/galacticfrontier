package net.mcreator.galactic_frontier.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.RegistryKey;

import net.mcreator.galactic_frontier.GalacticFrontierModVariables;
import net.mcreator.galactic_frontier.GalacticFrontierModElements;
import net.mcreator.galactic_frontier.GalacticFrontierMod;

import java.util.Map;

@GalacticFrontierModElements.ModElement.Tag
public class MeteoriteNaturalEntitySpawningConditionProcedure extends GalacticFrontierModElements.ModElement {
	public MeteoriteNaturalEntitySpawningConditionProcedure(GalacticFrontierModElements instance) {
		super(instance, 6);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency x for procedure MeteoriteNaturalEntitySpawningCondition!");
			return false;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency y for procedure MeteoriteNaturalEntitySpawningCondition!");
			return false;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency z for procedure MeteoriteNaturalEntitySpawningCondition!");
			return false;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency world for procedure MeteoriteNaturalEntitySpawningCondition!");
			return false;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((GalacticFrontierModVariables.MapVariables.get(world).DragonKilled)) {
			if ((((world instanceof World ? (((World) world).getDimensionKey()) : World.OVERWORLD) == (World.OVERWORLD))
					|| ((world instanceof World ? (((World) world).getDimensionKey()) : World.OVERWORLD) == (RegistryKey
							.getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation("galactic_frontier:mars")))))) {
				if ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).isSolid())) {
					if ((world.canBlockSeeSky(new BlockPos((int) x, (int) y, (int) z)))) {
						if ((Math.ceil((Math.random() * 20)) == 3)) {
							return (true);
						}
					}
				}
			}
		}
		return (false);
	}
}
