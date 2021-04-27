
package net.mcreator.galactic_frontier.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.mcreator.galactic_frontier.itemgroup.AlloysItemGroup;
import net.mcreator.galactic_frontier.GalacticFrontierModElements;

import java.util.List;

@GalacticFrontierModElements.ModElement.Tag
public class TemperedNetheriteIngotItem extends GalacticFrontierModElements.ModElement {
	@ObjectHolder("galactic_frontier:tempered_netherite_ingot")
	public static final Item block = null;
	public TemperedNetheriteIngotItem(GalacticFrontierModElements instance) {
		super(instance, 104);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(AlloysItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("tempered_netherite_ingot");
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

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("\u00A7dNetherite used for alloys"));
		}
	}
}
