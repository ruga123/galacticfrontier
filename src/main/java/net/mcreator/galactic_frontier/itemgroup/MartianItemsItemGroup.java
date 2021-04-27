
package net.mcreator.galactic_frontier.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.galactic_frontier.item.MartianIngotItem;
import net.mcreator.galactic_frontier.GalacticFrontierModElements;

@GalacticFrontierModElements.ModElement.Tag
public class MartianItemsItemGroup extends GalacticFrontierModElements.ModElement {
	public MartianItemsItemGroup(GalacticFrontierModElements instance) {
		super(instance, 112);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmartian_items") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(MartianIngotItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
