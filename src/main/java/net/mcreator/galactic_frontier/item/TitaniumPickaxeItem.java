
package net.mcreator.galactic_frontier.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.galactic_frontier.itemgroup.MartianItemsItemGroup;
import net.mcreator.galactic_frontier.GalacticFrontierModElements;

@GalacticFrontierModElements.ModElement.Tag
public class TitaniumPickaxeItem extends GalacticFrontierModElements.ModElement {
	@ObjectHolder("galactic_frontier:titanium_pickaxe")
	public static final Item block = null;
	public TitaniumPickaxeItem(GalacticFrontierModElements instance) {
		super(instance, 37);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 3046;
			}

			public float getEfficiency() {
				return 8f;
			}

			public float getAttackDamage() {
				return 3f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 17;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(TitaniumIngotItem.block, (int) (1)));
			}
		}, 1, -2.8f, new Item.Properties().group(MartianItemsItemGroup.tab)) {
		}.setRegistryName("titanium_pickaxe"));
	}
}
