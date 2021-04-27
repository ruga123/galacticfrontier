
package net.mcreator.galactic_frontier.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.galactic_frontier.itemgroup.MartianItemsItemGroup;
import net.mcreator.galactic_frontier.GalacticFrontierModElements;

import java.util.List;
import java.util.Collections;

@GalacticFrontierModElements.ModElement.Tag
public class MarsDustBlock extends GalacticFrontierModElements.ModElement {
	@ObjectHolder("galactic_frontier:mars_dust")
	public static final Block block = null;
	public MarsDustBlock(GalacticFrontierModElements instance) {
		super(instance, 21);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(MartianItemsItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends FallingBlock {
		public CustomBlock() {
			super(Block.Properties.create(Material.SAND).sound(SoundType.SAND).hardnessAndResistance(0.3f, 2f).setLightLevel(s -> 0).harvestLevel(0)
					.harvestTool(ToolType.SHOVEL).setRequiresTool());
			setRegistryName("mars_dust");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
