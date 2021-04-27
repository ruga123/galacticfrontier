package net.mcreator.galactic_frontier.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.galactic_frontier.entity.SateliteEntity;
import net.mcreator.galactic_frontier.block.StableEndMatterBlock;
import net.mcreator.galactic_frontier.block.EndMatterBlock;
import net.mcreator.galactic_frontier.GalacticFrontierModElements;
import net.mcreator.galactic_frontier.GalacticFrontierMod;

import java.util.function.Function;
import java.util.Map;
import java.util.HashMap;
import java.util.Comparator;
import java.util.Collections;

@GalacticFrontierModElements.ModElement.Tag
public class MeteoriteOnInitialEntitySpawnProcedure extends GalacticFrontierModElements.ModElement {
	public MeteoriteOnInitialEntitySpawnProcedure(GalacticFrontierModElements instance) {
		super(instance, 7);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency entity for procedure MeteoriteOnInitialEntitySpawn!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency x for procedure MeteoriteOnInitialEntitySpawn!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency y for procedure MeteoriteOnInitialEntitySpawn!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency z for procedure MeteoriteOnInitialEntitySpawn!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency world for procedure MeteoriteOnInitialEntitySpawn!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double Rand = 0;
		double RandMain = 0;
		double selectblock = 0;
		double selector = 0;
		if ((((Entity) world
				.getEntitiesWithinAABB(SateliteEntity.CustomEntity.class,
						new AxisAlignedBB(x - (128 / 2d), y - (128 / 2d), z - (128 / 2d), x + (128 / 2d), y + (128 / 2d), z + (128 / 2d)), null)
				.stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null)) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				SateliteRotateProcedure.executeProcedure($_dependencies);
			}
		} else {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
			for (int index0 = 0; index0 < (int) (100); index0++) {
				if ((!(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).isSolid()))) {
					{
						Entity _ent = entity;
						_ent.setPositionAndUpdate(x, (y - 2), z);
						if (_ent instanceof ServerPlayerEntity) {
							((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, (y - 2), z, _ent.rotationYaw, _ent.rotationPitch,
									Collections.emptySet());
						}
					}
				} else {
					break;
				}
			}
			entity.rotationYaw = (float) (0);
			entity.setRenderYawOffset(entity.rotationYaw);
			entity.prevRotationYaw = entity.rotationYaw;
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
				((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
				((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
			}
			entity.rotationPitch = (float) (0);
			RandMain = (double) Math.round(((Math.random() * 3.8) + 4.8));
			if (world instanceof World && !((World) world).isRemote) {
				((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) Math.min((Math.round(((RandMain) * 4.2)) + 2), 12),
						Explosion.Mode.DESTROY);
			}
			selectblock = (double) (RandMain);
			for (int index1 = 0; index1 < (int) (100); index1++) {
				if ((!(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).isSolid()))) {
					{
						Entity _ent = entity;
						_ent.setPositionAndUpdate(x, (y - 2), z);
						if (_ent instanceof ServerPlayerEntity) {
							((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, (y - 2), z, _ent.rotationYaw, _ent.rotationPitch,
									Collections.emptySet());
						}
					}
				} else {
					break;
				}
			}
			for (int index2 = 0; index2 < (int) (((RandMain) + 5)); index2++) {
				for (int index3 = 0; index3 < (int) (60); index3++) {
					for (int index4 = 0; index4 < (int) (60); index4++) {
						if (((RandMain) == (selectblock))) {
							Rand = (double) (((Math.random() / 0.8) * Math.PI) + (RandMain));
						} else {
							Rand = (double) (RandMain);
						}
						if ((!(Blocks.BEDROCK.getDefaultState()
								.getBlock() == (world
										.getBlockState(
												new BlockPos(
														(int) (entity.world
																.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																		entity.getEyePosition(1f).add(entity.getLook(1f).x * (Rand),
																				entity.getLook(1f).y * (Rand), entity.getLook(1f).z * (Rand)),
																		RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
																.getPos().getX()),
														(int) (entity.world
																.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																		entity.getEyePosition(1f).add(entity.getLook(1f).x * (Rand),
																				entity.getLook(1f).y * (Rand), entity.getLook(1f).z * (Rand)),
																		RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
																.getPos().getY()),
														(int) (entity.world
																.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																		entity.getEyePosition(1f).add(entity.getLook(1f).x * (Rand),
																				entity.getLook(1f).y * (Rand), entity.getLook(1f).z * (Rand)),
																		RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
																.getPos().getZ())))).getBlock()))) {
							if (((RandMain) == (selectblock))) {
								if ((world
										.getBlockState(
												new BlockPos(
														(int) (entity.world
																.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																		entity.getEyePosition(1f).add(entity.getLook(1f).x * (Rand),
																				entity.getLook(1f).y * (Rand), entity.getLook(1f).z * (Rand)),
																		RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
																.getPos().getX()),
														(int) (entity.world
																.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																		entity.getEyePosition(1f).add(entity.getLook(1f).x * (Rand),
																				entity.getLook(1f).y * (Rand), entity.getLook(1f).z * (Rand)),
																		RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
																.getPos().getY()),
														(int) (entity.world
																.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																		entity.getEyePosition(1f).add(entity.getLook(1f).x * (Rand),
																				entity.getLook(1f).y * (Rand), entity.getLook(1f).z * (Rand)),
																		RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
																.getPos().getZ())))
										.isSolid())) {
									if ((Math.round((Math.random() * 15)) == 3)) {
										{
											BlockPos _bp = new BlockPos(
													(int) (entity.world
															.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * (Rand),
																			entity.getLook(1f).y * (Rand), entity.getLook(1f).z * (Rand)),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
															.getPos().getX()),
													(int) (entity.world
															.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * (Rand),
																			entity.getLook(1f).y * (Rand), entity.getLook(1f).z * (Rand)),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
															.getPos().getY()),
													(int) (entity.world
															.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * (Rand),
																			entity.getLook(1f).y * (Rand), entity.getLook(1f).z * (Rand)),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
															.getPos().getZ()));
											BlockState _bs = EndMatterBlock.block.getDefaultState();
											world.setBlockState(_bp, _bs, 3);
										}
									} else if ((Math.round((Math.random() * 25)) == 3)) {
										{
											BlockPos _bp = new BlockPos(
													(int) (entity.world
															.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * (Rand),
																			entity.getLook(1f).y * (Rand), entity.getLook(1f).z * (Rand)),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
															.getPos().getX()),
													(int) (entity.world
															.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * (Rand),
																			entity.getLook(1f).y * (Rand), entity.getLook(1f).z * (Rand)),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
															.getPos().getY()),
													(int) (entity.world
															.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * (Rand),
																			entity.getLook(1f).y * (Rand), entity.getLook(1f).z * (Rand)),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
															.getPos().getZ()));
											BlockState _bs = Blocks.OBSIDIAN.getDefaultState();
											world.setBlockState(_bp, _bs, 3);
										}
									} else {
										{
											BlockPos _bp = new BlockPos(
													(int) (entity.world
															.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * (Rand),
																			entity.getLook(1f).y * (Rand), entity.getLook(1f).z * (Rand)),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
															.getPos().getX()),
													(int) (entity.world
															.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * (Rand),
																			entity.getLook(1f).y * (Rand), entity.getLook(1f).z * (Rand)),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
															.getPos().getY()),
													(int) (entity.world
															.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * (Rand),
																			entity.getLook(1f).y * (Rand), entity.getLook(1f).z * (Rand)),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
															.getPos().getZ()));
											BlockState _bs = StableEndMatterBlock.block.getDefaultState();
											world.setBlockState(_bp, _bs, 3);
										}
									}
								}
							} else if (((RandMain) == ((selectblock) - 1))) {
								if ((Math.round((Math.random() * 8)) == 3)) {
									{
										BlockPos _bp = new BlockPos(
												(int) (entity.world
														.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																entity.getEyePosition(1f).add(entity.getLook(1f).x * (Rand),
																		entity.getLook(1f).y * (Rand), entity.getLook(1f).z * (Rand)),
																RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
														.getPos().getX()),
												(int) (entity.world
														.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																entity.getEyePosition(1f).add(entity.getLook(1f).x * (Rand),
																		entity.getLook(1f).y * (Rand), entity.getLook(1f).z * (Rand)),
																RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
														.getPos().getY()),
												(int) (entity.world
														.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																entity.getEyePosition(1f).add(entity.getLook(1f).x * (Rand),
																		entity.getLook(1f).y * (Rand), entity.getLook(1f).z * (Rand)),
																RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
														.getPos().getZ()));
										BlockState _bs = EndMatterBlock.block.getDefaultState();
										world.setBlockState(_bp, _bs, 3);
									}
								} else {
									{
										BlockPos _bp = new BlockPos(
												(int) (entity.world
														.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																entity.getEyePosition(1f).add(entity.getLook(1f).x * (Rand),
																		entity.getLook(1f).y * (Rand), entity.getLook(1f).z * (Rand)),
																RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
														.getPos().getX()),
												(int) (entity.world
														.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																entity.getEyePosition(1f).add(entity.getLook(1f).x * (Rand),
																		entity.getLook(1f).y * (Rand), entity.getLook(1f).z * (Rand)),
																RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
														.getPos().getY()),
												(int) (entity.world
														.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																entity.getEyePosition(1f).add(entity.getLook(1f).x * (Rand),
																		entity.getLook(1f).y * (Rand), entity.getLook(1f).z * (Rand)),
																RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
														.getPos().getZ()));
										BlockState _bs = StableEndMatterBlock.block.getDefaultState();
										world.setBlockState(_bp, _bs, 3);
									}
								}
							} else if (((RandMain) == ((selectblock) - 2))) {
								if ((Math.round((Math.random() * 4)) == 2)) {
									{
										BlockPos _bp = new BlockPos(
												(int) (entity.world
														.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																entity.getEyePosition(1f).add(entity.getLook(1f).x * (Rand),
																		entity.getLook(1f).y * (Rand), entity.getLook(1f).z * (Rand)),
																RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
														.getPos().getX()),
												(int) (entity.world
														.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																entity.getEyePosition(1f).add(entity.getLook(1f).x * (Rand),
																		entity.getLook(1f).y * (Rand), entity.getLook(1f).z * (Rand)),
																RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
														.getPos().getY()),
												(int) (entity.world
														.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																entity.getEyePosition(1f).add(entity.getLook(1f).x * (Rand),
																		entity.getLook(1f).y * (Rand), entity.getLook(1f).z * (Rand)),
																RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
														.getPos().getZ()));
										BlockState _bs = EndMatterBlock.block.getDefaultState();
										world.setBlockState(_bp, _bs, 3);
									}
								} else {
									{
										BlockPos _bp = new BlockPos(
												(int) (entity.world
														.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																entity.getEyePosition(1f).add(entity.getLook(1f).x * (Rand),
																		entity.getLook(1f).y * (Rand), entity.getLook(1f).z * (Rand)),
																RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
														.getPos().getX()),
												(int) (entity.world
														.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																entity.getEyePosition(1f).add(entity.getLook(1f).x * (Rand),
																		entity.getLook(1f).y * (Rand), entity.getLook(1f).z * (Rand)),
																RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
														.getPos().getY()),
												(int) (entity.world
														.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																entity.getEyePosition(1f).add(entity.getLook(1f).x * (Rand),
																		entity.getLook(1f).y * (Rand), entity.getLook(1f).z * (Rand)),
																RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
														.getPos().getZ()));
										BlockState _bs = StableEndMatterBlock.block.getDefaultState();
										world.setBlockState(_bp, _bs, 3);
									}
								}
							} else {
								{
									BlockPos _bp = new BlockPos(
											(int) (entity.world
													.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
															entity.getEyePosition(1f).add(entity.getLook(1f).x * (Rand),
																	entity.getLook(1f).y * (Rand), entity.getLook(1f).z * (Rand)),
															RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
													.getPos().getX()),
											(int) (entity.world
													.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
															entity.getEyePosition(1f).add(entity.getLook(1f).x * (Rand),
																	entity.getLook(1f).y * (Rand), entity.getLook(1f).z * (Rand)),
															RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
													.getPos().getY()),
											(int) (entity.world
													.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
															entity.getEyePosition(1f).add(entity.getLook(1f).x * (Rand),
																	entity.getLook(1f).y * (Rand), entity.getLook(1f).z * (Rand)),
															RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
													.getPos().getZ()));
									BlockState _bs = EndMatterBlock.block.getDefaultState();
									world.setBlockState(_bp, _bs, 3);
								}
							}
							entity.rotationYaw = (float) (((entity.rotationYaw) + 6));
							entity.setRenderYawOffset(entity.rotationYaw);
							entity.prevRotationYaw = entity.rotationYaw;
							if (entity instanceof LivingEntity) {
								((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
								((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
								((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
							}
							entity.rotationPitch = (float) ((entity.rotationPitch));
						}
					}
					entity.rotationYaw = (float) ((entity.rotationYaw));
					entity.setRenderYawOffset(entity.rotationYaw);
					entity.prevRotationYaw = entity.rotationYaw;
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
						((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
						((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
					}
					entity.rotationPitch = (float) (((entity.rotationPitch) + 6));
				}
				RandMain = (double) ((RandMain) - 1);
			}
			{
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				BlockState _bs = EndMatterBlock.block.getDefaultState();
				world.setBlockState(_bp, _bs, 3);
			}
			if (!entity.world.isRemote())
				entity.remove();
		}
	}
}
