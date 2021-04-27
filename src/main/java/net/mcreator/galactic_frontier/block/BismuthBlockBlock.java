
package net.mcreator.galactic_frontier.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import net.mcreator.galactic_frontier.itemgroup.MartianItemsItemGroup;
import net.mcreator.galactic_frontier.GalacticFrontierModElements;

@GalacticFrontierModElements.ModElement.Tag
public class BismuthBlockBlock extends GalacticFrontierModElements.ModElement {
	@ObjectHolder("galactic_frontier:bismuth")
	public static final Block block = null;
	public BismuthBlockBlock(GalacticFrontierModElements instance) {
		super(instance, 95);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(MartianItemsItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.8f, 1.2f).setLightLevel(s -> 0)
					.harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool());
			setRegistryName("bismuth");
		}
	}
}
