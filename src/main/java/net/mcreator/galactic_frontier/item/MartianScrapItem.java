
package net.mcreator.galactic_frontier.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.galactic_frontier.itemgroup.MartianItemsItemGroup;
import net.mcreator.galactic_frontier.GalacticFrontierModElements;

@GalacticFrontierModElements.ModElement.Tag
public class MartianScrapItem extends GalacticFrontierModElements.ModElement {
	@ObjectHolder("galactic_frontier:martian_scrap")
	public static final Item block = null;
	public MartianScrapItem(GalacticFrontierModElements instance) {
		super(instance, 64);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MartianItemsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("martian_scrap");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
