
package net.mcreator.galactic_frontier.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import net.mcreator.galactic_frontier.itemgroup.BoreasItemsItemGroup;
import net.mcreator.galactic_frontier.GalacticFrontierModElements;

@GalacticFrontierModElements.ModElement.Tag
public class DryIcBlock extends GalacticFrontierModElements.ModElement {
	@ObjectHolder("galactic_frontier:dry_ice")
	public static final Block block = null;
	public DryIcBlock(GalacticFrontierModElements instance) {
		super(instance, 144);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(BoreasItemsItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.PACKED_ICE).sound(SoundType.GLASS).hardnessAndResistance(3f, 3f).setLightLevel(s -> 0)
					.slipperiness(0.989f));
			setRegistryName("dry_ice");
		}
	}
}
