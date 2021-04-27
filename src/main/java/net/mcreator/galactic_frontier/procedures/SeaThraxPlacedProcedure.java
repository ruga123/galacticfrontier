package net.mcreator.galactic_frontier.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.item.ItemStack;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;
import net.minecraft.block.Blocks;

import net.mcreator.galactic_frontier.block.SeaThraxStackBlock;
import net.mcreator.galactic_frontier.block.SeaThraxBlock;
import net.mcreator.galactic_frontier.GalacticFrontierModElements;
import net.mcreator.galactic_frontier.GalacticFrontierMod;

import java.util.Map;

@GalacticFrontierModElements.ModElement.Tag
public class SeaThraxPlacedProcedure extends GalacticFrontierModElements.ModElement {
	public SeaThraxPlacedProcedure(GalacticFrontierModElements instance) {
		super(instance, 240);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency itemstack for procedure SeaThraxPlaced!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency x for procedure SeaThraxPlaced!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency y for procedure SeaThraxPlaced!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency z for procedure SeaThraxPlaced!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency world for procedure SeaThraxPlaced!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((!((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getFluidState().isSource()))) {
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == SeaThraxBlock.block.getDefaultState().getBlock())
					|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == SeaThraxStackBlock.block.getDefaultState()
							.getBlock()))) {
				if (world instanceof ServerWorld) {
					((World) world).getServer().getCommandManager().handleCommand(
							new CommandSource(ICommandSource.DUMMY, new Vector3d(x, (y - 1), z), Vector2f.ZERO, (ServerWorld) world, 4, "",
									new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
							"setblock ~ ~ ~ galactic_frontier:sea_thrax[waterlogged=true] replace");
				}
			}
			((itemstack)).grow((int) 1);
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
		} else if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == SeaThraxBlock.block.getDefaultState()
				.getBlock())
				|| ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == SeaThraxStackBlock.block.getDefaultState()
						.getBlock()))) {
			if (world instanceof ServerWorld) {
				((World) world).getServer().getCommandManager().handleCommand(
						new CommandSource(ICommandSource.DUMMY, new Vector3d(x, (y - 1), z), Vector2f.ZERO, (ServerWorld) world, 4, "",
								new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
						"setblock ~ ~ ~ galactic_frontier:sea_thrax_stack[waterlogged=true] replace");
			}
		} else if ((!(BlockTags.getCollection().getTagByID(new ResourceLocation(("forge:sand").toLowerCase(java.util.Locale.ENGLISH)))
				.contains((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock())))) {
			((itemstack)).grow((int) 1);
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
		}
	}
}
