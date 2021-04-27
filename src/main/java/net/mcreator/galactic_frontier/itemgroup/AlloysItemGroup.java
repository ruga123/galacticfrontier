
package net.mcreator.galactic_frontier.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.galactic_frontier.item.AncientAlloyIngotItem;
import net.mcreator.galactic_frontier.GalacticFrontierModElements;

@GalacticFrontierModElements.ModElement.Tag
public class AlloysItemGroup extends GalacticFrontierModElements.ModElement {
	public AlloysItemGroup(GalacticFrontierModElements instance) {
		super(instance, 113);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("taballoys") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(AncientAlloyIngotItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
