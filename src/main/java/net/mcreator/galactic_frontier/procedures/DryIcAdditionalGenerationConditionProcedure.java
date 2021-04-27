package net.mcreator.galactic_frontier.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.FlowingFluidBlock;

import net.mcreator.galactic_frontier.GalacticFrontierModElements;
import net.mcreator.galactic_frontier.GalacticFrontierMod;

import java.util.Map;

@GalacticFrontierModElements.ModElement.Tag
public class DryIcAdditionalGenerationConditionProcedure extends GalacticFrontierModElements.ModElement {
	public DryIcAdditionalGenerationConditionProcedure(GalacticFrontierModElements instance) {
		super(instance, 144);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency x for procedure DryIcAdditionalGenerationCondition!");
			return false;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency y for procedure DryIcAdditionalGenerationCondition!");
			return false;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency z for procedure DryIcAdditionalGenerationCondition!");
			return false;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency world for procedure DryIcAdditionalGenerationCondition!");
			return false;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((!(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).isSolid()))
				&& (!(world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z)).isSolid())))
				&& (!((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() instanceof FlowingFluidBlock)))) {
			return (true);
		}
		return (false);
	}
}
