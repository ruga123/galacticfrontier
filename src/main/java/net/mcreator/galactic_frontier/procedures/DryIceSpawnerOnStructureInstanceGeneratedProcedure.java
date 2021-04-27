package net.mcreator.galactic_frontier.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.galactic_frontier.block.DryIcBlock;
import net.mcreator.galactic_frontier.GalacticFrontierModElements;
import net.mcreator.galactic_frontier.GalacticFrontierMod;

import java.util.Map;

@GalacticFrontierModElements.ModElement.Tag
public class DryIceSpawnerOnStructureInstanceGeneratedProcedure extends GalacticFrontierModElements.ModElement {
	public DryIceSpawnerOnStructureInstanceGeneratedProcedure(GalacticFrontierModElements instance) {
		super(instance, 261);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency x for procedure DryIceSpawnerOnStructureInstanceGenerated!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency y for procedure DryIceSpawnerOnStructureInstanceGenerated!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency z for procedure DryIceSpawnerOnStructureInstanceGenerated!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency world for procedure DryIceSpawnerOnStructureInstanceGenerated!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - (-1))))).getBlock() == Blocks.WATER.getDefaultState().getBlock())) {
			{
				BlockPos _bp = new BlockPos((int) (x + 1), (int) y, (int) (z - 1));
				BlockState _bs = DryIcBlock.block.getDefaultState();
				world.setBlockState(_bp, _bs, 3);
			}
			if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - (-1))))).getBlock() == Blocks.WATER.getDefaultState()
					.getBlock())) {
				if ((Math.round((Math.random() * 12)) == 2)) {
					{
						BlockPos _bp = new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - (-1)));
						BlockState _bs = DryIcBlock.block.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
				} else if ((Math.round((Math.random() * 12)) == 2)) {
					{
						BlockPos _bp = new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - (-1)));
						BlockState _bs = Blocks.BLUE_ICE.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
				} else {
					{
						BlockPos _bp = new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - (-1)));
						BlockState _bs = Blocks.PACKED_ICE.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
				}
				if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 2), (int) (z - (-1))))).getBlock() == Blocks.WATER.getDefaultState()
						.getBlock())) {
					if ((Math.round((Math.random() * 4)) == 2)) {
						{
							BlockPos _bp = new BlockPos((int) (x + 1), (int) (y - 2), (int) (z - (-1)));
							BlockState _bs = Blocks.PACKED_ICE.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
						if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 3), (int) (z - (-1))))).getBlock() == Blocks.WATER
								.getDefaultState().getBlock())) {
							{
								BlockPos _bp = new BlockPos((int) (x + 1), (int) (y - 3), (int) (z - (-1)));
								BlockState _bs = Blocks.ICE.getDefaultState();
								world.setBlockState(_bp, _bs, 3);
							}
						}
					} else if ((Math.round((Math.random() * 4)) == 2)) {
						{
							BlockPos _bp = new BlockPos((int) (x + 1), (int) (y - 2), (int) (z - (-1)));
							BlockState _bs = Blocks.PACKED_ICE.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
					} else {
						{
							BlockPos _bp = new BlockPos((int) (x + 1), (int) (y - 2), (int) (z - (-1)));
							BlockState _bs = Blocks.BLUE_ICE.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
						if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 3), (int) (z - (-1))))).getBlock() == Blocks.WATER
								.getDefaultState().getBlock())) {
							{
								BlockPos _bp = new BlockPos((int) (x + 1), (int) (y - 3), (int) (z - (-1)));
								BlockState _bs = Blocks.ICE.getDefaultState();
								world.setBlockState(_bp, _bs, 3);
							}
						}
					}
				}
			}
		}
		if (((world.getBlockState(new BlockPos((int) (x + (-1)), (int) y, (int) (z - 1)))).getBlock() == Blocks.WATER.getDefaultState().getBlock())) {
			{
				BlockPos _bp = new BlockPos((int) (x + (-1)), (int) y, (int) (z - 1));
				BlockState _bs = DryIcBlock.block.getDefaultState();
				world.setBlockState(_bp, _bs, 3);
			}
			if (((world.getBlockState(new BlockPos((int) (x + (-1)), (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.WATER.getDefaultState()
					.getBlock())) {
				if ((Math.round((Math.random() * 12)) == 2)) {
					{
						BlockPos _bp = new BlockPos((int) (x + (-1)), (int) (y - 1), (int) (z - 1));
						BlockState _bs = DryIcBlock.block.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
				} else if ((Math.round((Math.random() * 12)) == 2)) {
					{
						BlockPos _bp = new BlockPos((int) (x + (-1)), (int) (y - 1), (int) (z - 1));
						BlockState _bs = Blocks.BLUE_ICE.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
				} else {
					{
						BlockPos _bp = new BlockPos((int) (x + (-1)), (int) (y - 1), (int) (z - 1));
						BlockState _bs = Blocks.PACKED_ICE.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
				}
				if (((world.getBlockState(new BlockPos((int) (x + (-1)), (int) (y - 2), (int) (z - 1)))).getBlock() == Blocks.WATER.getDefaultState()
						.getBlock())) {
					if ((Math.round((Math.random() * 4)) == 2)) {
						{
							BlockPos _bp = new BlockPos((int) (x + (-1)), (int) (y - 2), (int) (z - 1));
							BlockState _bs = Blocks.PACKED_ICE.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
						if (((world.getBlockState(new BlockPos((int) (x + (-1)), (int) (y - 3), (int) (z - 1)))).getBlock() == Blocks.WATER
								.getDefaultState().getBlock())) {
							{
								BlockPos _bp = new BlockPos((int) (x + (-1)), (int) (y - 3), (int) (z - 1));
								BlockState _bs = Blocks.ICE.getDefaultState();
								world.setBlockState(_bp, _bs, 3);
							}
						}
					} else if ((Math.round((Math.random() * 4)) == 2)) {
						{
							BlockPos _bp = new BlockPos((int) (x + (-1)), (int) (y - 2), (int) (z - 1));
							BlockState _bs = Blocks.PACKED_ICE.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
					} else {
						{
							BlockPos _bp = new BlockPos((int) (x + (-1)), (int) (y - 2), (int) (z - 1));
							BlockState _bs = Blocks.BLUE_ICE.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
						if (((world.getBlockState(new BlockPos((int) (x + (-1)), (int) (y - 3), (int) (z - 1)))).getBlock() == Blocks.WATER
								.getDefaultState().getBlock())) {
							{
								BlockPos _bp = new BlockPos((int) (x + (-1)), (int) (y - 3), (int) (z - 1));
								BlockState _bs = Blocks.ICE.getDefaultState();
								world.setBlockState(_bp, _bs, 3);
							}
						}
					}
				}
			}
		}
		if (((world.getBlockState(new BlockPos((int) (x + (-1)), (int) y, (int) (z - (-1))))).getBlock() == Blocks.WATER.getDefaultState()
				.getBlock())) {
			{
				BlockPos _bp = new BlockPos((int) (x + (-1)), (int) y, (int) (z - 1));
				BlockState _bs = DryIcBlock.block.getDefaultState();
				world.setBlockState(_bp, _bs, 3);
			}
			if (((world.getBlockState(new BlockPos((int) (x + (-1)), (int) (y - 1), (int) (z - (-1))))).getBlock() == Blocks.WATER.getDefaultState()
					.getBlock())) {
				if ((Math.round((Math.random() * 12)) == 2)) {
					{
						BlockPos _bp = new BlockPos((int) (x + (-1)), (int) (y - 1), (int) (z - (-1)));
						BlockState _bs = DryIcBlock.block.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
				} else if ((Math.round((Math.random() * 12)) == 2)) {
					{
						BlockPos _bp = new BlockPos((int) (x + (-1)), (int) (y - 1), (int) (z - (-1)));
						BlockState _bs = Blocks.BLUE_ICE.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
				} else {
					{
						BlockPos _bp = new BlockPos((int) (x + (-1)), (int) (y - 1), (int) (z - (-1)));
						BlockState _bs = Blocks.PACKED_ICE.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
				}
				if (((world.getBlockState(new BlockPos((int) (x + (-1)), (int) (y - 2), (int) (z - (-1))))).getBlock() == Blocks.WATER
						.getDefaultState().getBlock())) {
					if ((Math.round((Math.random() * 4)) == 2)) {
						{
							BlockPos _bp = new BlockPos((int) (x + (-1)), (int) (y - 2), (int) (z - (-1)));
							BlockState _bs = Blocks.PACKED_ICE.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
						if (((world.getBlockState(new BlockPos((int) (x + (-1)), (int) (y - 3), (int) (z - (-1))))).getBlock() == Blocks.WATER
								.getDefaultState().getBlock())) {
							{
								BlockPos _bp = new BlockPos((int) (x + (-1)), (int) (y - 3), (int) (z - (-1)));
								BlockState _bs = Blocks.ICE.getDefaultState();
								world.setBlockState(_bp, _bs, 3);
							}
						}
					} else if ((Math.round((Math.random() * 4)) == 2)) {
						{
							BlockPos _bp = new BlockPos((int) (x + (-1)), (int) (y - 2), (int) (z - (-1)));
							BlockState _bs = Blocks.PACKED_ICE.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
					} else {
						{
							BlockPos _bp = new BlockPos((int) (x + (-1)), (int) (y - 2), (int) (z - (-1)));
							BlockState _bs = Blocks.BLUE_ICE.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
						if (((world.getBlockState(new BlockPos((int) (x + (-1)), (int) (y - 3), (int) (z - (-1))))).getBlock() == Blocks.WATER
								.getDefaultState().getBlock())) {
							{
								BlockPos _bp = new BlockPos((int) (x + (-1)), (int) (y - 3), (int) (z - (-1)));
								BlockState _bs = Blocks.ICE.getDefaultState();
								world.setBlockState(_bp, _bs, 3);
							}
						}
					}
				}
			}
		}
		if (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)))).getBlock() == Blocks.WATER.getDefaultState().getBlock())) {
			{
				BlockPos _bp = new BlockPos((int) (x + 1), (int) y, (int) (z - 1));
				BlockState _bs = DryIcBlock.block.getDefaultState();
				world.setBlockState(_bp, _bs, 3);
			}
			if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.WATER.getDefaultState()
					.getBlock())) {
				if ((Math.round((Math.random() * 12)) == 2)) {
					{
						BlockPos _bp = new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1));
						BlockState _bs = DryIcBlock.block.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
				} else if ((Math.round((Math.random() * 12)) == 2)) {
					{
						BlockPos _bp = new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1));
						BlockState _bs = Blocks.BLUE_ICE.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
				} else {
					{
						BlockPos _bp = new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1));
						BlockState _bs = Blocks.PACKED_ICE.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
				}
				if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 2), (int) (z - 1)))).getBlock() == Blocks.WATER.getDefaultState()
						.getBlock())) {
					if ((Math.round((Math.random() * 4)) == 2)) {
						{
							BlockPos _bp = new BlockPos((int) (x + 1), (int) (y - 2), (int) (z - 1));
							BlockState _bs = Blocks.PACKED_ICE.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
						if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 3), (int) (z - 1)))).getBlock() == Blocks.WATER
								.getDefaultState().getBlock())) {
							{
								BlockPos _bp = new BlockPos((int) (x + 1), (int) (y - 3), (int) (z - 1));
								BlockState _bs = Blocks.ICE.getDefaultState();
								world.setBlockState(_bp, _bs, 3);
							}
						}
					} else if ((Math.round((Math.random() * 4)) == 2)) {
						{
							BlockPos _bp = new BlockPos((int) (x + 1), (int) (y - 2), (int) (z - 1));
							BlockState _bs = Blocks.PACKED_ICE.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
					} else {
						{
							BlockPos _bp = new BlockPos((int) (x + 1), (int) (y - 2), (int) (z - 1));
							BlockState _bs = Blocks.BLUE_ICE.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
						if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 3), (int) (z - 1)))).getBlock() == Blocks.WATER
								.getDefaultState().getBlock())) {
							{
								BlockPos _bp = new BlockPos((int) (x + 1), (int) (y - 3), (int) (z - 1));
								BlockState _bs = Blocks.ICE.getDefaultState();
								world.setBlockState(_bp, _bs, 3);
							}
						}
					}
				}
			}
		}
		if (((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 0)))).getBlock() == Blocks.WATER.getDefaultState().getBlock())) {
			{
				BlockPos _bp = new BlockPos((int) (x + 1), (int) y, (int) (z - 0));
				BlockState _bs = DryIcBlock.block.getDefaultState();
				world.setBlockState(_bp, _bs, 3);
			}
			if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 0)))).getBlock() == Blocks.WATER.getDefaultState()
					.getBlock())) {
				if ((Math.round((Math.random() * 12)) == 2)) {
					{
						BlockPos _bp = new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 0));
						BlockState _bs = DryIcBlock.block.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
				} else if ((Math.round((Math.random() * 12)) == 2)) {
					{
						BlockPos _bp = new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 0));
						BlockState _bs = Blocks.BLUE_ICE.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
				} else {
					{
						BlockPos _bp = new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 0));
						BlockState _bs = Blocks.PACKED_ICE.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
				}
				if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 2), (int) (z - 0)))).getBlock() == Blocks.WATER.getDefaultState()
						.getBlock())) {
					if ((Math.round((Math.random() * 4)) == 2)) {
						{
							BlockPos _bp = new BlockPos((int) (x + 1), (int) (y - 2), (int) (z - 0));
							BlockState _bs = Blocks.PACKED_ICE.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
						if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 3), (int) (z - 0)))).getBlock() == Blocks.WATER
								.getDefaultState().getBlock())) {
							{
								BlockPos _bp = new BlockPos((int) (x + 1), (int) (y - 3), (int) (z - 0));
								BlockState _bs = Blocks.ICE.getDefaultState();
								world.setBlockState(_bp, _bs, 3);
							}
						}
					} else if ((Math.round((Math.random() * 4)) == 2)) {
						{
							BlockPos _bp = new BlockPos((int) (x + 1), (int) (y - 2), (int) (z - 0));
							BlockState _bs = Blocks.PACKED_ICE.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
					} else {
						{
							BlockPos _bp = new BlockPos((int) (x + 1), (int) (y - 2), (int) (z - 0));
							BlockState _bs = Blocks.BLUE_ICE.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
						if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 3), (int) (z - 0)))).getBlock() == Blocks.WATER
								.getDefaultState().getBlock())) {
							{
								BlockPos _bp = new BlockPos((int) (x + 1), (int) (y - 3), (int) (z - 0));
								BlockState _bs = Blocks.ICE.getDefaultState();
								world.setBlockState(_bp, _bs, 3);
							}
						}
					}
				}
			}
		}
		if (((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 0)))).getBlock() == Blocks.WATER.getDefaultState().getBlock())) {
			{
				BlockPos _bp = new BlockPos((int) (x - 1), (int) y, (int) (z - 0));
				BlockState _bs = DryIcBlock.block.getDefaultState();
				world.setBlockState(_bp, _bs, 3);
			}
			if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 0)))).getBlock() == Blocks.WATER.getDefaultState()
					.getBlock())) {
				if ((Math.round((Math.random() * 12)) == 2)) {
					{
						BlockPos _bp = new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 0));
						BlockState _bs = DryIcBlock.block.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
				} else if ((Math.round((Math.random() * 12)) == 2)) {
					{
						BlockPos _bp = new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 0));
						BlockState _bs = Blocks.BLUE_ICE.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
				} else {
					{
						BlockPos _bp = new BlockPos((int) (x - 1), (int) (y - 1), (int) (z - 0));
						BlockState _bs = Blocks.PACKED_ICE.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
				}
				if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 2), (int) (z - 0)))).getBlock() == Blocks.WATER.getDefaultState()
						.getBlock())) {
					if ((Math.round((Math.random() * 4)) == 2)) {
						{
							BlockPos _bp = new BlockPos((int) (x - 1), (int) (y - 2), (int) (z - 0));
							BlockState _bs = Blocks.PACKED_ICE.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
						if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 3), (int) (z - 0)))).getBlock() == Blocks.WATER
								.getDefaultState().getBlock())) {
							{
								BlockPos _bp = new BlockPos((int) (x - 1), (int) (y - 3), (int) (z - 0));
								BlockState _bs = Blocks.ICE.getDefaultState();
								world.setBlockState(_bp, _bs, 3);
							}
						}
					} else if ((Math.round((Math.random() * 4)) == 2)) {
						{
							BlockPos _bp = new BlockPos((int) (x - 1), (int) (y - 2), (int) (z - 0));
							BlockState _bs = Blocks.PACKED_ICE.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
					} else {
						{
							BlockPos _bp = new BlockPos((int) (x - 1), (int) (y - 2), (int) (z - 0));
							BlockState _bs = Blocks.BLUE_ICE.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
						if (((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 3), (int) (z - 0)))).getBlock() == Blocks.WATER
								.getDefaultState().getBlock())) {
							{
								BlockPos _bp = new BlockPos((int) (x - 1), (int) (y - 3), (int) (z - 0));
								BlockState _bs = Blocks.ICE.getDefaultState();
								world.setBlockState(_bp, _bs, 3);
							}
						}
					}
				}
			}
		}
		if (((world.getBlockState(new BlockPos((int) (x - 0), (int) y, (int) (z - 1)))).getBlock() == Blocks.WATER.getDefaultState().getBlock())) {
			{
				BlockPos _bp = new BlockPos((int) (x - 0), (int) y, (int) (z - 1));
				BlockState _bs = DryIcBlock.block.getDefaultState();
				world.setBlockState(_bp, _bs, 3);
			}
			if (((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.WATER.getDefaultState()
					.getBlock())) {
				if ((Math.round((Math.random() * 12)) == 2)) {
					{
						BlockPos _bp = new BlockPos((int) (x - 0), (int) (y - 1), (int) (z - 1));
						BlockState _bs = DryIcBlock.block.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
				} else if ((Math.round((Math.random() * 12)) == 2)) {
					{
						BlockPos _bp = new BlockPos((int) (x - 0), (int) (y - 1), (int) (z - 1));
						BlockState _bs = Blocks.BLUE_ICE.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
				} else {
					{
						BlockPos _bp = new BlockPos((int) (x - 0), (int) (y - 1), (int) (z - 1));
						BlockState _bs = Blocks.PACKED_ICE.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
				}
				if (((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 2), (int) (z - 1)))).getBlock() == Blocks.WATER.getDefaultState()
						.getBlock())) {
					if ((Math.round((Math.random() * 4)) == 2)) {
						{
							BlockPos _bp = new BlockPos((int) (x - 0), (int) (y - 2), (int) (z - 1));
							BlockState _bs = Blocks.PACKED_ICE.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
						if (((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 3), (int) (z - 1)))).getBlock() == Blocks.WATER
								.getDefaultState().getBlock())) {
							{
								BlockPos _bp = new BlockPos((int) (x - 0), (int) (y - 3), (int) (z - 1));
								BlockState _bs = Blocks.ICE.getDefaultState();
								world.setBlockState(_bp, _bs, 3);
							}
						}
					} else if ((Math.round((Math.random() * 4)) == 2)) {
						{
							BlockPos _bp = new BlockPos((int) (x - 0), (int) (y - 2), (int) (z - 1));
							BlockState _bs = Blocks.PACKED_ICE.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
					} else {
						{
							BlockPos _bp = new BlockPos((int) (x - 0), (int) (y - 2), (int) (z - 1));
							BlockState _bs = Blocks.BLUE_ICE.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
						if (((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 3), (int) (z - 1)))).getBlock() == Blocks.WATER
								.getDefaultState().getBlock())) {
							{
								BlockPos _bp = new BlockPos((int) (x - 0), (int) (y - 3), (int) (z - 1));
								BlockState _bs = Blocks.ICE.getDefaultState();
								world.setBlockState(_bp, _bs, 3);
							}
						}
					}
				}
			}
		}
		if (((world.getBlockState(new BlockPos((int) (x - 0), (int) y, (int) (z + 1)))).getBlock() == Blocks.WATER.getDefaultState().getBlock())) {
			{
				BlockPos _bp = new BlockPos((int) (x - 0), (int) y, (int) (z + 1));
				BlockState _bs = DryIcBlock.block.getDefaultState();
				world.setBlockState(_bp, _bs, 3);
			}
			if (((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.WATER.getDefaultState()
					.getBlock())) {
				if ((Math.round((Math.random() * 12)) == 2)) {
					{
						BlockPos _bp = new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + 1));
						BlockState _bs = DryIcBlock.block.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
				} else if ((Math.round((Math.random() * 12)) == 2)) {
					{
						BlockPos _bp = new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + 1));
						BlockState _bs = Blocks.BLUE_ICE.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
				} else {
					{
						BlockPos _bp = new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + 1));
						BlockState _bs = Blocks.PACKED_ICE.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
				}
				if (((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 2), (int) (z + 1)))).getBlock() == Blocks.WATER.getDefaultState()
						.getBlock())) {
					if ((Math.round((Math.random() * 4)) == 2)) {
						{
							BlockPos _bp = new BlockPos((int) (x - 0), (int) (y - 2), (int) (z + 1));
							BlockState _bs = Blocks.PACKED_ICE.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
						if (((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 3), (int) (z + 1)))).getBlock() == Blocks.WATER
								.getDefaultState().getBlock())) {
							{
								BlockPos _bp = new BlockPos((int) (x - 0), (int) (y - 3), (int) (z + 1));
								BlockState _bs = Blocks.ICE.getDefaultState();
								world.setBlockState(_bp, _bs, 3);
							}
						}
					} else if ((Math.round((Math.random() * 4)) == 2)) {
						{
							BlockPos _bp = new BlockPos((int) (x - 0), (int) (y - 2), (int) (z + 1));
							BlockState _bs = Blocks.PACKED_ICE.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
					} else {
						{
							BlockPos _bp = new BlockPos((int) (x - 0), (int) (y - 2), (int) (z + 1));
							BlockState _bs = Blocks.BLUE_ICE.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
						if (((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 3), (int) (z + 1)))).getBlock() == Blocks.WATER
								.getDefaultState().getBlock())) {
							{
								BlockPos _bp = new BlockPos((int) (x - 0), (int) (y - 3), (int) (z + 1));
								BlockState _bs = Blocks.ICE.getDefaultState();
								world.setBlockState(_bp, _bs, 3);
							}
						}
					}
				}
			}
		}
		if (((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + 0)))).getBlock() == Blocks.WATER.getDefaultState()
				.getBlock())) {
			if ((Math.round((Math.random() * 12)) == 2)) {
				{
					BlockPos _bp = new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + 0));
					BlockState _bs = DryIcBlock.block.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
			} else if ((Math.round((Math.random() * 12)) == 2)) {
				{
					BlockPos _bp = new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + 0));
					BlockState _bs = Blocks.BLUE_ICE.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
			} else {
				{
					BlockPos _bp = new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + 0));
					BlockState _bs = Blocks.PACKED_ICE.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
			}
			if (((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 2), (int) (z + 0)))).getBlock() == Blocks.WATER.getDefaultState()
					.getBlock())) {
				if ((Math.round((Math.random() * 4)) == 2)) {
					{
						BlockPos _bp = new BlockPos((int) (x - 0), (int) (y - 2), (int) (z + 0));
						BlockState _bs = Blocks.PACKED_ICE.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 3), (int) (z + 0)))).getBlock() == Blocks.WATER.getDefaultState()
							.getBlock())) {
						{
							BlockPos _bp = new BlockPos((int) (x - 0), (int) (y - 3), (int) (z + 0));
							BlockState _bs = Blocks.ICE.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
					}
				} else if ((Math.round((Math.random() * 4)) == 2)) {
					{
						BlockPos _bp = new BlockPos((int) (x - 0), (int) (y - 2), (int) (z + 0));
						BlockState _bs = Blocks.PACKED_ICE.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
				} else {
					{
						BlockPos _bp = new BlockPos((int) (x - 0), (int) (y - 2), (int) (z + 0));
						BlockState _bs = Blocks.BLUE_ICE.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 3), (int) (z + 0)))).getBlock() == Blocks.WATER.getDefaultState()
							.getBlock())) {
						{
							BlockPos _bp = new BlockPos((int) (x - 0), (int) (y - 3), (int) (z + 0));
							BlockState _bs = Blocks.ICE.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
					}
				}
			}
		}
		if (((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + (-2))))).getBlock() == Blocks.WATER.getDefaultState()
				.getBlock())) {
			{
				BlockPos _bp = new BlockPos((int) (x - 0), (int) y, (int) (z + (-2)));
				BlockState _bs = DryIcBlock.block.getDefaultState();
				world.setBlockState(_bp, _bs, 3);
			}
			if ((Math.round((Math.random() * 12)) == 2)) {
				{
					BlockPos _bp = new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + (-2)));
					BlockState _bs = DryIcBlock.block.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
			} else if ((Math.round((Math.random() * 12)) == 2)) {
				{
					BlockPos _bp = new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + (-2)));
					BlockState _bs = Blocks.BLUE_ICE.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
			} else {
				{
					BlockPos _bp = new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + (-2)));
					BlockState _bs = Blocks.PACKED_ICE.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
			}
			if (((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 2), (int) (z + (-2))))).getBlock() == Blocks.WATER.getDefaultState()
					.getBlock())) {
				if ((Math.round((Math.random() * 4)) == 2)) {
					{
						BlockPos _bp = new BlockPos((int) (x - 0), (int) (y - 2), (int) (z + (-2)));
						BlockState _bs = Blocks.PACKED_ICE.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 3), (int) (z + (-2))))).getBlock() == Blocks.WATER
							.getDefaultState().getBlock())) {
						{
							BlockPos _bp = new BlockPos((int) (x - 0), (int) (y - 3), (int) (z + (-2)));
							BlockState _bs = Blocks.ICE.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
					}
				} else if ((Math.round((Math.random() * 4)) == 2)) {
					{
						BlockPos _bp = new BlockPos((int) (x - 0), (int) (y - 2), (int) (z + (-2)));
						BlockState _bs = Blocks.PACKED_ICE.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
				} else {
					{
						BlockPos _bp = new BlockPos((int) (x - 0), (int) (y - 2), (int) (z + (-2)));
						BlockState _bs = Blocks.BLUE_ICE.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 3), (int) (z + (-2))))).getBlock() == Blocks.WATER
							.getDefaultState().getBlock())) {
						{
							BlockPos _bp = new BlockPos((int) (x - 0), (int) (y - 3), (int) (z + (-2)));
							BlockState _bs = Blocks.ICE.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
					}
				}
			}
		}
		if (((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + 2)))).getBlock() == Blocks.WATER.getDefaultState()
				.getBlock())) {
			{
				BlockPos _bp = new BlockPos((int) (x - 0), (int) y, (int) (z + 2));
				BlockState _bs = DryIcBlock.block.getDefaultState();
				world.setBlockState(_bp, _bs, 3);
			}
			if ((Math.round((Math.random() * 12)) == 2)) {
				{
					BlockPos _bp = new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + 2));
					BlockState _bs = DryIcBlock.block.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
			} else if ((Math.round((Math.random() * 12)) == 2)) {
				{
					BlockPos _bp = new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + 2));
					BlockState _bs = Blocks.BLUE_ICE.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
			} else {
				{
					BlockPos _bp = new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + 2));
					BlockState _bs = Blocks.PACKED_ICE.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
			}
			if (((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 2), (int) (z + 2)))).getBlock() == Blocks.WATER.getDefaultState()
					.getBlock())) {
				if ((Math.round((Math.random() * 4)) == 2)) {
					{
						BlockPos _bp = new BlockPos((int) (x - 0), (int) (y - 2), (int) (z + 2));
						BlockState _bs = Blocks.PACKED_ICE.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 3), (int) (z + 2)))).getBlock() == Blocks.WATER.getDefaultState()
							.getBlock())) {
						{
							BlockPos _bp = new BlockPos((int) (x - 0), (int) (y - 3), (int) (z + 2));
							BlockState _bs = Blocks.ICE.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
					}
				} else if ((Math.round((Math.random() * 4)) == 2)) {
					{
						BlockPos _bp = new BlockPos((int) (x - 0), (int) (y - 2), (int) (z + 2));
						BlockState _bs = Blocks.PACKED_ICE.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
				} else {
					{
						BlockPos _bp = new BlockPos((int) (x - 0), (int) (y - 2), (int) (z + 2));
						BlockState _bs = Blocks.BLUE_ICE.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 0), (int) (y - 3), (int) (z + 2)))).getBlock() == Blocks.WATER.getDefaultState()
							.getBlock())) {
						{
							BlockPos _bp = new BlockPos((int) (x - 0), (int) (y - 3), (int) (z + 2));
							BlockState _bs = Blocks.ICE.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
					}
				}
			}
		}
		if (((world.getBlockState(new BlockPos((int) (x - (-2)), (int) (y - 1), (int) (z + 0)))).getBlock() == Blocks.WATER.getDefaultState()
				.getBlock())) {
			{
				BlockPos _bp = new BlockPos((int) (x + 2), (int) y, (int) (z + 0));
				BlockState _bs = DryIcBlock.block.getDefaultState();
				world.setBlockState(_bp, _bs, 3);
			}
			if ((Math.round((Math.random() * 12)) == 2)) {
				{
					BlockPos _bp = new BlockPos((int) (x - (-2)), (int) (y - 1), (int) (z + 0));
					BlockState _bs = DryIcBlock.block.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
			} else if ((Math.round((Math.random() * 12)) == 2)) {
				{
					BlockPos _bp = new BlockPos((int) (x - (-2)), (int) (y - 1), (int) (z + 0));
					BlockState _bs = Blocks.BLUE_ICE.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
			} else {
				{
					BlockPos _bp = new BlockPos((int) (x - (-2)), (int) (y - 1), (int) (z + 0));
					BlockState _bs = Blocks.PACKED_ICE.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
			}
			if (((world.getBlockState(new BlockPos((int) (x - (-2)), (int) (y - 2), (int) (z + 0)))).getBlock() == Blocks.WATER.getDefaultState()
					.getBlock())) {
				if ((Math.round((Math.random() * 4)) == 2)) {
					{
						BlockPos _bp = new BlockPos((int) (x - (-2)), (int) (y - 2), (int) (z + 0));
						BlockState _bs = Blocks.PACKED_ICE.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - (-2)), (int) (y - 3), (int) (z + 0)))).getBlock() == Blocks.WATER
							.getDefaultState().getBlock())) {
						{
							BlockPos _bp = new BlockPos((int) (x - (-2)), (int) (y - 3), (int) (z + 0));
							BlockState _bs = Blocks.ICE.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
					}
				} else if ((Math.round((Math.random() * 4)) == 2)) {
					{
						BlockPos _bp = new BlockPos((int) (x - (-2)), (int) (y - 2), (int) (z + 0));
						BlockState _bs = Blocks.PACKED_ICE.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
				} else {
					{
						BlockPos _bp = new BlockPos((int) (x - (-2)), (int) (y - 2), (int) (z + 0));
						BlockState _bs = Blocks.BLUE_ICE.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - (-2)), (int) (y - 3), (int) (z + 0)))).getBlock() == Blocks.WATER
							.getDefaultState().getBlock())) {
						{
							BlockPos _bp = new BlockPos((int) (x - (-2)), (int) (y - 3), (int) (z + 0));
							BlockState _bs = Blocks.ICE.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
					}
				}
			}
		}
		if (((world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 1), (int) (z + 0)))).getBlock() == Blocks.WATER.getDefaultState()
				.getBlock())) {
			{
				BlockPos _bp = new BlockPos((int) (x - 2), (int) y, (int) (z + 0));
				BlockState _bs = DryIcBlock.block.getDefaultState();
				world.setBlockState(_bp, _bs, 3);
			}
			if ((Math.round((Math.random() * 12)) == 2)) {
				{
					BlockPos _bp = new BlockPos((int) (x - 2), (int) (y - 1), (int) (z + 0));
					BlockState _bs = DryIcBlock.block.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
			} else if ((Math.round((Math.random() * 12)) == 2)) {
				{
					BlockPos _bp = new BlockPos((int) (x - 2), (int) (y - 1), (int) (z + 0));
					BlockState _bs = Blocks.BLUE_ICE.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
			} else {
				{
					BlockPos _bp = new BlockPos((int) (x - 2), (int) (y - 1), (int) (z + 0));
					BlockState _bs = Blocks.PACKED_ICE.getDefaultState();
					world.setBlockState(_bp, _bs, 3);
				}
			}
			if (((world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 2), (int) (z + 0)))).getBlock() == Blocks.WATER.getDefaultState()
					.getBlock())) {
				if ((Math.round((Math.random() * 4)) == 2)) {
					{
						BlockPos _bp = new BlockPos((int) (x - 2), (int) (y - 2), (int) (z + 0));
						BlockState _bs = Blocks.PACKED_ICE.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 3), (int) (z + 0)))).getBlock() == Blocks.WATER.getDefaultState()
							.getBlock())) {
						{
							BlockPos _bp = new BlockPos((int) (x - 2), (int) (y - 3), (int) (z + 0));
							BlockState _bs = Blocks.ICE.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
					}
				} else if ((Math.round((Math.random() * 4)) == 2)) {
					{
						BlockPos _bp = new BlockPos((int) (x - 2), (int) (y - 2), (int) (z + 0));
						BlockState _bs = Blocks.PACKED_ICE.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
				} else {
					{
						BlockPos _bp = new BlockPos((int) (x - 2), (int) (y - 2), (int) (z + 0));
						BlockState _bs = Blocks.BLUE_ICE.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
					if (((world.getBlockState(new BlockPos((int) (x - 2), (int) (y - 3), (int) (z + 0)))).getBlock() == Blocks.WATER.getDefaultState()
							.getBlock())) {
						{
							BlockPos _bp = new BlockPos((int) (x - 2), (int) (y - 3), (int) (z + 0));
							BlockState _bs = Blocks.ICE.getDefaultState();
							world.setBlockState(_bp, _bs, 3);
						}
					}
				}
			}
		}
	}
}
