
package net.mcreator.galactic_frontier.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;
import net.minecraft.entity.Entity;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.galactic_frontier.procedures.MartianOpalToolInInventoryTickProcedure;
import net.mcreator.galactic_frontier.itemgroup.AlloysItemGroup;
import net.mcreator.galactic_frontier.GalacticFrontierModElements;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

@GalacticFrontierModElements.ModElement.Tag
public class MartianHoeItem extends GalacticFrontierModElements.ModElement {
	@ObjectHolder("galactic_frontier:martian_hoe")
	public static final Item block = null;
	public MartianHoeItem(GalacticFrontierModElements instance) {
		super(instance, 129);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 131;
			}

			public float getEfficiency() {
				return 16f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 28;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(MartianOpalItem.block, (int) (1)));
			}
		}, 0, -3f, new Item.Properties().group(AlloysItemGroup.tab)) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("\u00A7aHealing: Heals durability over time!"));
			}

			@Override
			public void inventoryTick(ItemStack itemstack, World world, Entity entity, int slot, boolean selected) {
				super.inventoryTick(itemstack, world, entity, slot, selected);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("itemstack", itemstack);
					MartianOpalToolInInventoryTickProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("martian_hoe"));
	}
}
