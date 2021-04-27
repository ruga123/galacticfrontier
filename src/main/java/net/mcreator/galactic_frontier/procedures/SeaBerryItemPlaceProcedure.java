package net.mcreator.galactic_frontier.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Hand;
import net.minecraft.util.Direction;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;
import net.minecraft.block.Blocks;

import net.mcreator.galactic_frontier.block.FrostedSandBlock;
import net.mcreator.galactic_frontier.GalacticFrontierModElements;
import net.mcreator.galactic_frontier.GalacticFrontierMod;

import java.util.Map;

@GalacticFrontierModElements.ModElement.Tag
public class SeaBerryItemPlaceProcedure extends GalacticFrontierModElements.ModElement {
	public SeaBerryItemPlaceProcedure(GalacticFrontierModElements instance) {
		super(instance, 370);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("direction") == null) {
			if (!dependencies.containsKey("direction"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency direction for procedure SeaBerryItemPlace!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency entity for procedure SeaBerryItemPlace!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency itemstack for procedure SeaBerryItemPlace!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency x for procedure SeaBerryItemPlace!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency y for procedure SeaBerryItemPlace!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency z for procedure SeaBerryItemPlace!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency world for procedure SeaBerryItemPlace!");
			return;
		}
		Direction direction = (Direction) dependencies.get("direction");
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double X = 0;
		double Y = 0;
		double Z = 0;
		if ((direction == Direction.DOWN)) {
			X = (double) x;
			Y = (double) (y - 1);
			Z = (double) z;
		} else if ((direction == Direction.UP)) {
			X = (double) x;
			Y = (double) (y + 1);
			Z = (double) z;
		} else if ((direction == Direction.UP)) {
			X = (double) x;
			Y = (double) (y + 1);
			Z = (double) z;
		} else if ((direction == Direction.SOUTH)) {
			X = (double) x;
			Y = (double) y;
			Z = (double) (z + 1);
		} else if ((direction == Direction.NORTH)) {
			X = (double) x;
			Y = (double) y;
			Z = (double) (z - 1);
		} else if ((direction == Direction.EAST)) {
			X = (double) (x + 1);
			Y = (double) y;
			Z = (double) z;
		} else if ((direction == Direction.WEST)) {
			X = (double) (x - 1);
			Y = (double) y;
			Z = (double) z;
		}
		if (((world.getBlockState(new BlockPos((int) (X), (int) (Y), (int) (Z)))).getBlock() == Blocks.WATER.getDefaultState().getBlock())) {
			if (((world.getBlockState(new BlockPos((int) (X), (int) (Y), (int) (Z)))).getFluidState().isSource())) {
				if (((world.getBlockState(new BlockPos((int) (X), (int) ((Y) - 1), (int) (Z)))).getBlock() == FrostedSandBlock.block.getDefaultState()
						.getBlock())) {
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
					}
					if ((!((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).abilities.isCreativeMode : false))) {
						((itemstack)).shrink((int) 1);
					}
					if (world instanceof ServerWorld) {
						((World) world).getServer().getCommandManager().handleCommand(
								new CommandSource(ICommandSource.DUMMY, new Vector3d((X), (Y), (Z)), Vector2f.ZERO, (ServerWorld) world, 4, "",
										new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
								"setblock ~ ~ ~ galactic_frontier:sea_berry_new[waterlogged=true] replace");
					}
				}
			}
		}
	}
}
