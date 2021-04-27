package net.mcreator.galactic_frontier.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Hand;
import net.minecraft.state.Property;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.galactic_frontier.block.SeaThraxStackBlock;
import net.mcreator.galactic_frontier.block.SeaThraxBlock;
import net.mcreator.galactic_frontier.GalacticFrontierModElements;
import net.mcreator.galactic_frontier.GalacticFrontierMod;

import java.util.Map;

@GalacticFrontierModElements.ModElement.Tag
public class SeaThraxOnBlockRightClickedProcedure extends GalacticFrontierModElements.ModElement {
	public SeaThraxOnBlockRightClickedProcedure(GalacticFrontierModElements instance) {
		super(instance, 353);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency entity for procedure SeaThraxOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency x for procedure SeaThraxOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency y for procedure SeaThraxOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency z for procedure SeaThraxOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency world for procedure SeaThraxOnBlockRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		ItemStack itemstackvar = ItemStack.EMPTY;
		boolean success = false;
		double loopnum = 0;
		double hand = 0;
		if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(Items.BONE_MEAL, (int) (1)).getItem())) {
			itemstackvar = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
			}
			hand = (double) 1;
		} else if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(Items.BONE_MEAL, (int) (1)).getItem())) {
			itemstackvar = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY);
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).swing(Hand.OFF_HAND, true);
			}
			hand = (double) 2;
		}
		if (((itemstackvar).getItem() == new ItemStack(Items.BONE_MEAL, (int) (1)).getItem())) {
			success = (boolean) (false);
			loopnum = (double) 0;
			while ((true)) {
				loopnum = (double) ((loopnum) + 1);
				if ((!(((world.getBlockState(new BlockPos((int) x, (int) ((loopnum) + y), (int) z))).getBlock() == SeaThraxBlock.block
						.getDefaultState().getBlock())
						|| (((world.getBlockState(new BlockPos((int) x, (int) ((loopnum) + y), (int) z))).getBlock() == SeaThraxStackBlock.block
								.getDefaultState().getBlock())
								|| ((world.getBlockState(new BlockPos((int) x, (int) ((loopnum) + y), (int) z))).getBlock() == Blocks.WATER
										.getDefaultState().getBlock()))))) {
					break;
				} else if ((!(((world.getBlockState(new BlockPos((int) x, (int) ((loopnum) + y), (int) z))).getBlock() == SeaThraxBlock.block
						.getDefaultState().getBlock())
						|| ((world.getBlockState(new BlockPos((int) x, (int) ((loopnum) + y), (int) z))).getBlock() == SeaThraxStackBlock.block
								.getDefaultState().getBlock())))) {
					if (((Math.ceil((Math.random() * 2)) == 2) && ((world.getBlockState(new BlockPos((int) x, (int) (((loopnum) + y) + 1), (int) z)))
							.getBlock() == Blocks.WATER.getDefaultState().getBlock()))) {
						if (world instanceof ServerWorld) {
							((World) world).getServer().getCommandManager()
									.handleCommand(
											new CommandSource(ICommandSource.DUMMY, new Vector3d(x, (((loopnum) + y) + 1), z), Vector2f.ZERO,
													(ServerWorld) world, 4, "", new StringTextComponent(""), ((World) world).getServer(), null)
															.withFeedbackDisabled(),
											"setblock ~ ~ ~ galactic_frontier:sea_thrax[waterlogged=true] replace");
						}
						if (world instanceof ServerWorld) {
							((World) world).getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vector3d(x, ((loopnum) + y), z), Vector2f.ZERO, (ServerWorld) world,
											4, "", new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
									"setblock ~ ~ ~ galactic_frontier:sea_thrax_stack[waterlogged=true] replace");
						}
					} else {
						if (world instanceof ServerWorld) {
							((World) world).getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vector3d(x, ((loopnum) + y), z), Vector2f.ZERO, (ServerWorld) world,
											4, "", new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
									"setblock ~ ~ ~ galactic_frontier:sea_thrax[waterlogged=true] replace");
						}
					}
					success = (boolean) (true);
					if (((world.getBlockState(new BlockPos((int) x, (int) (((loopnum) + y) - 1), (int) z))).getBlock() == SeaThraxBlock.block
							.getDefaultState().getBlock())) {
						{
							BlockPos _bp = new BlockPos((int) x, (int) (((loopnum) + y) - 1), (int) z);
							BlockState _bs = SeaThraxStackBlock.block.getDefaultState();
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
					if ((success)) {
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.HAPPY_VILLAGER, x, y, z, (int) 5, 0.4, 0.4, 0.4, 1);
						}
						if ((!((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).abilities.isCreativeMode : false))) {
							if (((hand) == 2)) {
								(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)).shrink((int) 1);
							}
							if (((hand) == 1)) {
								(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY))
										.shrink((int) 1);
							}
						}
					}
					break;
				}
			}
		}
	}
}
