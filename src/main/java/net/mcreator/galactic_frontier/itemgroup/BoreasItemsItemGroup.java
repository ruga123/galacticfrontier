
package net.mcreator.galactic_frontier.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.galactic_frontier.block.CobbledFroststoneBlock;
import net.mcreator.galactic_frontier.GalacticFrontierModElements;

@GalacticFrontierModElements.ModElement.Tag
public class BoreasItemsItemGroup extends GalacticFrontierModElements.ModElement {
	public BoreasItemsItemGroup(GalacticFrontierModElements instance) {
		super(instance, 138);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabboreas_items") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(CobbledFroststoneBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
