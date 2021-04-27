
package net.mcreator.galactic_frontier.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import net.mcreator.galactic_frontier.item.EndMatterContainerItem;
import net.mcreator.galactic_frontier.GalacticFrontierModElements;

@GalacticFrontierModElements.ModElement.Tag
public class RefinedEndMatterFuelFuel extends GalacticFrontierModElements.ModElement {
	public RefinedEndMatterFuelFuel(GalacticFrontierModElements instance) {
		super(instance, 11);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(EndMatterContainerItem.block, (int) (1)).getItem())
			event.setBurnTime(200000);
	}
}
