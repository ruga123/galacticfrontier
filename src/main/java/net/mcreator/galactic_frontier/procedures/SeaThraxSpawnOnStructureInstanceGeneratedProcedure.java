package net.mcreator.galactic_frontier.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.state.Property;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.galactic_frontier.block.SeaThraxStackBlock;
import net.mcreator.galactic_frontier.block.SeaThraxBlock;
import net.mcreator.galactic_frontier.GalacticFrontierModElements;
import net.mcreator.galactic_frontier.GalacticFrontierMod;

import java.util.Map;
import java.util.HashMap;

@GalacticFrontierModElements.ModElement.Tag
public class SeaThraxSpawnOnStructureInstanceGeneratedProcedure extends GalacticFrontierModElements.ModElement {
	public SeaThraxSpawnOnStructureInstanceGeneratedProcedure(GalacticFrontierModElements instance) {
		super(instance, 260);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency x for procedure SeaThraxSpawnOnStructureInstanceGenerated!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency y for procedure SeaThraxSpawnOnStructureInstanceGenerated!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency z for procedure SeaThraxSpawnOnStructureInstanceGenerated!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency world for procedure SeaThraxSpawnOnStructureInstanceGenerated!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double temp = 0;
		temp = (double) 8;
		for (int index0 = 0; index0 < (int) ((Math.round((Math.random() * 4)) + 1)); index0++) {
			if ((!(Math.floor((Math.random() * 5)) == 2))) {
				if (((world.getBlockState(new BlockPos((int) x, (int) (y + (temp)), (int) z))).getBlock() == SeaThraxBlock.block.getDefaultState()
						.getBlock())) {
					{
						BlockPos _bp = new BlockPos((int) x, (int) (y + (temp)), (int) z);
						BlockState _bs = Blocks.WATER.getDefaultState();
						world.setBlockState(_bp, _bs, 3);
					}
					if (((world.getBlockState(new BlockPos((int) x, (int) (y + ((temp) - 1)), (int) z))).getBlock() == SeaThraxStackBlock.block
							.getDefaultState().getBlock())) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) (y + ((temp) - 1)), (int) z);
							BlockState _bs = SeaThraxBlock.block.getDefaultState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
								if (_property != null && _bs.get(_property) != null)
									try {
										_bs = _bs.with(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlockState(_bp, _bs, 3);
						}
					}
				} else {
					break;
				}
			} else {
				break;
			}
			temp = (double) ((temp) - 1);
		}
	}

	@SubscribeEvent
	public void onBlockBreak(BlockEvent.BreakEvent event) {
		Entity entity = event.getPlayer();
		IWorld world = event.getWorld();
		Map<String, Object> dependencies = new HashMap<>();
		dependencies.put("xpAmount", event.getExpToDrop());
		dependencies.put("x", event.getPos().getX());
		dependencies.put("y", event.getPos().getY());
		dependencies.put("z", event.getPos().getZ());
		dependencies.put("px", entity.getPosX());
		dependencies.put("py", entity.getPosY());
		dependencies.put("pz", entity.getPosZ());
		dependencies.put("world", world);
		dependencies.put("entity", entity);
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}
}
