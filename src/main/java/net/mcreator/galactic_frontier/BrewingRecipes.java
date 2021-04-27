/**
 * This mod element is always locked. Enter your code in the methods below.
 * If you don't need some of these methods, you can remove them as they
 * are overrides of the base class GalacticFrontierModElements.ModElement.
 *
 * You can register new events in this class too.
 *
 * As this class is loaded into mod element list, it NEEDS to extend
 * ModElement class. If you remove this extend statement or remove the
 * constructor, the compilation will fail.
 *
 * If you want to make a plain independent class, create it using
 * Project Browser - New... and make sure to make the class
 * outside net.mcreator.galactic_frontier as this package is managed by MCreator.
 *
 * If you change workspace package, modid or prefix, you will need
 * to manually adapt this file to these changes or remake it.
*/
package net.mcreator.galactic_frontier;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import net.minecraft.potion.Potions;
import net.minecraft.potion.Potion;
import net.minecraft.item.Item;

import net.mcreator.galactic_frontier.potion.ToxicPotion;
import net.mcreator.galactic_frontier.item.DeepSlimeBallItem;

import java.lang.reflect.Method;

@GalacticFrontierModElements.ModElement.Tag
public class BrewingRecipes extends GalacticFrontierModElements.ModElement {
	/**
	 * Do not remove this constructor
	 */
	public BrewingRecipes(GalacticFrontierModElements instance) {
		super(instance, 350);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		try {
			Class clazz = net.minecraft.potion.PotionBrewing.class;
			Method mth = ObfuscationReflectionHelper.findMethod(clazz, "func_193357_a", Potion.class, Item.class, Potion.class);
			mth.invoke(null, Potions.AWKWARD, DeepSlimeBallItem.block, ToxicPotion.potionType);
		} catch (Throwable e) {
			System.err.println("ERROR: " + e);
		}
	}
}
