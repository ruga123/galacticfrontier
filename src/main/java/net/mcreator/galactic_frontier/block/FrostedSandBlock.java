
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

import net.mcreator.galactic_frontier.itemgroup.BoreasItemsItemGroup;
import net.mcreator.galactic_frontier.GalacticFrontierModElements;

import java.util.List;
import java.util.Collections;

@GalacticFrontierModElements.ModElement.Tag
public class FrostedSandBlock extends GalacticFrontierModElements.ModElement {
	@ObjectHolder("galactic_frontier:frosted_sand")
	public static final Block block = null;
	public FrostedSandBlock(GalacticFrontierModElements instance) {
		super(instance, 143);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(BoreasItemsItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends FallingBlock {
		public CustomBlock() {
			super(Block.Properties.create(Material.SAND).sound(SoundType.SAND).hardnessAndResistance(0.25f, 1.25f).setLightLevel(s -> 0)
					.harvestLevel(0).harvestTool(ToolType.SHOVEL).setRequiresTool().slipperiness(0.75f));
			setRegistryName("frosted_sand");
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
