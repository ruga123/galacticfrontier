package net.mcreator.galactic_frontier.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.galactic_frontier.entity.SateliteEntity;
import net.mcreator.galactic_frontier.GalacticFrontierModElements;
import net.mcreator.galactic_frontier.GalacticFrontierMod;

import java.util.function.Function;
import java.util.Map;
import java.util.Comparator;

@GalacticFrontierModElements.ModElement.Tag
public class SateliteRotateProcedure extends GalacticFrontierModElements.ModElement {
	public SateliteRotateProcedure(GalacticFrontierModElements instance) {
		super(instance, 53);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency entity for procedure SateliteRotate!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency x for procedure SateliteRotate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency y for procedure SateliteRotate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency z for procedure SateliteRotate!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency world for procedure SateliteRotate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double originalyaw = 0;
		double originalpitch = 0;
		double targetyaw = 0;
		double targetpitch = 0;
		if ((((Entity) world
				.getEntitiesWithinAABB(SateliteEntity.CustomEntity.class,
						new AxisAlignedBB(x - (128 / 2d), y - (128 / 2d), z - (128 / 2d), x + (128 / 2d), y + (128 / 2d), z + (128 / 2d)), null)
				.stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null)) {
			originalyaw = (double) Math.round((((Entity) world
					.getEntitiesWithinAABB(SateliteEntity.CustomEntity.class,
							new AxisAlignedBB(x - (128 / 2d), y - (128 / 2d), z - (128 / 2d), x + (128 / 2d), y + (128 / 2d), z + (128 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).rotationYaw));
			originalpitch = (double) Math.round((((Entity) world
					.getEntitiesWithinAABB(SateliteEntity.CustomEntity.class,
							new AxisAlignedBB(x - (128 / 2d), y - (128 / 2d), z - (128 / 2d), x + (128 / 2d), y + (128 / 2d), z + (128 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).rotationPitch));
			{
				Entity _ent = ((Entity) world.getEntitiesWithinAABB(SateliteEntity.CustomEntity.class,
						new AxisAlignedBB(x - (128 / 2d), y - (128 / 2d), z - (128 / 2d), x + (128 / 2d), y + (128 / 2d), z + (128 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null));
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							(("execute at @s run tp @s ~ ~ ~ facing ") + "" + (x) + "" + (" ") + "" + ((y + (Math.round((Math.random() * 20)) + 30)))
									+ "" + (" ") + "" + (z)));
				}
			}
			targetyaw = (double) (0 - Math.round((((Entity) world
					.getEntitiesWithinAABB(SateliteEntity.CustomEntity.class,
							new AxisAlignedBB(x - (128 / 2d), y - (128 / 2d), z - (128 / 2d), x + (128 / 2d), y + (128 / 2d), z + (128 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).rotationYaw)));
			targetpitch = (double) Math.round((((Entity) world
					.getEntitiesWithinAABB(SateliteEntity.CustomEntity.class,
							new AxisAlignedBB(x - (128 / 2d), y - (128 / 2d), z - (128 / 2d), x + (128 / 2d), y + (128 / 2d), z + (128 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).rotationPitch));
			entity.rotationYaw = (float) ((originalyaw));
			entity.setRenderYawOffset(entity.rotationYaw);
			entity.prevRotationYaw = entity.rotationYaw;
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
				((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
				((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
			}
			entity.rotationPitch = (float) ((originalpitch));
			for (int index0 = 0; index0 < (int) (1080); index0++) {
				if ((((targetyaw) == (originalyaw)) && ((targetpitch) == (originalpitch)))) {
					break;
				} else {
					if (((targetyaw) > (((Entity) world.getEntitiesWithinAABB(SateliteEntity.CustomEntity.class,
							new AxisAlignedBB(x - (128 / 2d), y - (128 / 2d), z - (128 / 2d), x + (128 / 2d), y + (128 / 2d), z + (128 / 2d)), null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).rotationYaw))) {
						((Entity) world.getEntitiesWithinAABB(SateliteEntity.CustomEntity.class,
								new AxisAlignedBB(x - (128 / 2d), y - (128 / 2d), z - (128 / 2d), x + (128 / 2d), y + (128 / 2d), z + (128 / 2d)),
								null).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(
										null)).rotationYaw = (float) (((((Entity) world
												.getEntitiesWithinAABB(SateliteEntity.CustomEntity.class, new AxisAlignedBB(x - (128 / 2d),
														y - (128 / 2d), z - (128 / 2d), x + (128 / 2d), y + (128 / 2d), z + (128 / 2d)), null)
												.stream().sorted(new Object() {
													Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
														return Comparator
																.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
													}
												}.compareDistOf(x, y, z)).findFirst().orElse(null)).rotationYaw) + 1));
						entity.setRenderYawOffset(entity.rotationYaw);
						entity.prevRotationYaw = entity.rotationYaw;
						if (entity instanceof LivingEntity) {
							((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
							((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
							((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
						}
						((Entity) world.getEntitiesWithinAABB(SateliteEntity.CustomEntity.class,
								new AxisAlignedBB(x - (128 / 2d), y - (128 / 2d), z - (128 / 2d), x + (128 / 2d), y + (128 / 2d), z + (128 / 2d)),
								null).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(
										null)).rotationPitch = (float) ((((Entity) world
												.getEntitiesWithinAABB(SateliteEntity.CustomEntity.class, new AxisAlignedBB(x - (128 / 2d),
														y - (128 / 2d), z - (128 / 2d), x + (128 / 2d), y + (128 / 2d), z + (128 / 2d)), null)
												.stream().sorted(new Object() {
													Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
														return Comparator
																.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
													}
												}.compareDistOf(x, y, z)).findFirst().orElse(null)).rotationPitch));
					} else if (((targetyaw) < (((Entity) world.getEntitiesWithinAABB(SateliteEntity.CustomEntity.class,
							new AxisAlignedBB(x - (128 / 2d), y - (128 / 2d), z - (128 / 2d), x + (128 / 2d), y + (128 / 2d), z + (128 / 2d)), null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).rotationYaw))) {
						((Entity) world.getEntitiesWithinAABB(SateliteEntity.CustomEntity.class,
								new AxisAlignedBB(x - (128 / 2d), y - (128 / 2d), z - (128 / 2d), x + (128 / 2d), y + (128 / 2d), z + (128 / 2d)),
								null).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(
										null)).rotationYaw = (float) (((((Entity) world
												.getEntitiesWithinAABB(SateliteEntity.CustomEntity.class, new AxisAlignedBB(x - (128 / 2d),
														y - (128 / 2d), z - (128 / 2d), x + (128 / 2d), y + (128 / 2d), z + (128 / 2d)), null)
												.stream().sorted(new Object() {
													Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
														return Comparator
																.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
													}
												}.compareDistOf(x, y, z)).findFirst().orElse(null)).rotationYaw) - 1));
						entity.setRenderYawOffset(entity.rotationYaw);
						entity.prevRotationYaw = entity.rotationYaw;
						if (entity instanceof LivingEntity) {
							((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
							((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
							((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
						}
						((Entity) world.getEntitiesWithinAABB(SateliteEntity.CustomEntity.class,
								new AxisAlignedBB(x - (128 / 2d), y - (128 / 2d), z - (128 / 2d), x + (128 / 2d), y + (128 / 2d), z + (128 / 2d)),
								null).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(
										null)).rotationPitch = (float) ((((Entity) world
												.getEntitiesWithinAABB(SateliteEntity.CustomEntity.class, new AxisAlignedBB(x - (128 / 2d),
														y - (128 / 2d), z - (128 / 2d), x + (128 / 2d), y + (128 / 2d), z + (128 / 2d)), null)
												.stream().sorted(new Object() {
													Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
														return Comparator
																.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
													}
												}.compareDistOf(x, y, z)).findFirst().orElse(null)).rotationPitch));
					}
					if (((targetpitch) > (((Entity) world.getEntitiesWithinAABB(SateliteEntity.CustomEntity.class,
							new AxisAlignedBB(x - (128 / 2d), y - (128 / 2d), z - (128 / 2d), x + (128 / 2d), y + (128 / 2d), z + (128 / 2d)), null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).rotationPitch))) {
						((Entity) world.getEntitiesWithinAABB(SateliteEntity.CustomEntity.class,
								new AxisAlignedBB(x - (128 / 2d), y - (128 / 2d), z - (128 / 2d), x + (128 / 2d), y + (128 / 2d), z + (128 / 2d)),
								null).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(
										null)).rotationYaw = (float) ((((Entity) world
												.getEntitiesWithinAABB(SateliteEntity.CustomEntity.class, new AxisAlignedBB(x - (128 / 2d),
														y - (128 / 2d), z - (128 / 2d), x + (128 / 2d), y + (128 / 2d), z + (128 / 2d)), null)
												.stream().sorted(new Object() {
													Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
														return Comparator
																.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
													}
												}.compareDistOf(x, y, z)).findFirst().orElse(null)).rotationYaw));
						entity.setRenderYawOffset(entity.rotationYaw);
						entity.prevRotationYaw = entity.rotationYaw;
						if (entity instanceof LivingEntity) {
							((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
							((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
							((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
						}
						((Entity) world.getEntitiesWithinAABB(SateliteEntity.CustomEntity.class,
								new AxisAlignedBB(x - (128 / 2d), y - (128 / 2d), z - (128 / 2d), x + (128 / 2d), y + (128 / 2d), z + (128 / 2d)),
								null).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(
										null)).rotationPitch = (float) (((((Entity) world
												.getEntitiesWithinAABB(SateliteEntity.CustomEntity.class, new AxisAlignedBB(x - (128 / 2d),
														y - (128 / 2d), z - (128 / 2d), x + (128 / 2d), y + (128 / 2d), z + (128 / 2d)), null)
												.stream().sorted(new Object() {
													Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
														return Comparator
																.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
													}
												}.compareDistOf(x, y, z)).findFirst().orElse(null)).rotationPitch) + 1));
					} else if (((targetpitch) < (((Entity) world.getEntitiesWithinAABB(SateliteEntity.CustomEntity.class,
							new AxisAlignedBB(x - (128 / 2d), y - (128 / 2d), z - (128 / 2d), x + (128 / 2d), y + (128 / 2d), z + (128 / 2d)), null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).rotationPitch))) {
						((Entity) world.getEntitiesWithinAABB(SateliteEntity.CustomEntity.class,
								new AxisAlignedBB(x - (128 / 2d), y - (128 / 2d), z - (128 / 2d), x + (128 / 2d), y + (128 / 2d), z + (128 / 2d)),
								null).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(
										null)).rotationYaw = (float) ((((Entity) world
												.getEntitiesWithinAABB(SateliteEntity.CustomEntity.class, new AxisAlignedBB(x - (128 / 2d),
														y - (128 / 2d), z - (128 / 2d), x + (128 / 2d), y + (128 / 2d), z + (128 / 2d)), null)
												.stream().sorted(new Object() {
													Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
														return Comparator
																.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
													}
												}.compareDistOf(x, y, z)).findFirst().orElse(null)).rotationYaw));
						entity.setRenderYawOffset(entity.rotationYaw);
						entity.prevRotationYaw = entity.rotationYaw;
						if (entity instanceof LivingEntity) {
							((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
							((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
							((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
						}
						((Entity) world.getEntitiesWithinAABB(SateliteEntity.CustomEntity.class,
								new AxisAlignedBB(x - (128 / 2d), y - (128 / 2d), z - (128 / 2d), x + (128 / 2d), y + (128 / 2d), z + (128 / 2d)),
								null).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(
										null)).rotationPitch = (float) (((((Entity) world
												.getEntitiesWithinAABB(SateliteEntity.CustomEntity.class, new AxisAlignedBB(x - (128 / 2d),
														y - (128 / 2d), z - (128 / 2d), x + (128 / 2d), y + (128 / 2d), z + (128 / 2d)), null)
												.stream().sorted(new Object() {
													Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
														return Comparator
																.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
													}
												}.compareDistOf(x, y, z)).findFirst().orElse(null)).rotationPitch) - 1));
					}
				}
			}
			if (!entity.world.isRemote())
				entity.remove();
		}
	}
}
