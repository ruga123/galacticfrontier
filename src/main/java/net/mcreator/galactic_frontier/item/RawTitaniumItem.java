
package net.mcreator.galactic_frontier.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.galactic_frontier.itemgroup.MartianItemsItemGroup;
import net.mcreator.galactic_frontier.GalacticFrontierModElements;

@GalacticFrontierModElements.ModElement.Tag
public class RawTitaniumItem extends GalacticFrontierModElements.ModElement {
	@ObjectHolder("galactic_frontier:raw_titanium")
	public static final Item block = null;
	public RawTitaniumItem(GalacticFrontierModElements instance) {
		super(instance, 27);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MartianItemsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("raw_titanium");
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
