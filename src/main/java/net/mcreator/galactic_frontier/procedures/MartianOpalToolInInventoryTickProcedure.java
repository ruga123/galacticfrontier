package net.mcreator.galactic_frontier.procedures;

import net.minecraft.item.ItemStack;

import net.mcreator.galactic_frontier.GalacticFrontierModElements;
import net.mcreator.galactic_frontier.GalacticFrontierMod;

import java.util.Random;
import java.util.Map;

@GalacticFrontierModElements.ModElement.Tag
public class MartianOpalToolInInventoryTickProcedure extends GalacticFrontierModElements.ModElement {
	public MartianOpalToolInInventoryTickProcedure(GalacticFrontierModElements instance) {
		super(instance, 136);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				GalacticFrontierMod.LOGGER.warn("Failed to load dependency itemstack for procedure MartianOpalToolInInventoryTick!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if ((Math.round((Math.random() * 1000)) == 2)) {
			{
				ItemStack _ist = (itemstack);
				if (_ist.attemptDamageItem((int) (0 - (Math.floor((Math.random() * 3)) + 1)), new Random(), null)) {
					_ist.shrink(1);
					_ist.setDamage(0);
				}
			}
		}
	}
}
