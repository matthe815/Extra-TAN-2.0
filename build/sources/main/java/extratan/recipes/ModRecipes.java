package extratan.recipes;

import extratan.items.ItemStorage;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public ModRecipes()
	{
		
	}
	
	public static void Init()
	{
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Liquid_Infuser, 5), new Object[] { Items.COAL, Items.COAL }); // Liquid Infuser
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Empty_Flask), new Object[] { Items.GLASS_BOTTLE, ItemStorage.Liquid_Infuser, Blocks.GLASS }); // Empty Flask.
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Empty_Flask, 3), new Object[] { Items.GLASS_BOTTLE, Items.GLASS_BOTTLE, Items.GLASS_BOTTLE, ItemStorage.Liquid_Infuser, Blocks.GLASS, Blocks.GLASS }); // Empty Flask.
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Water_Filled_Flask), new Object[] { ItemStorage.Empty_Flask, Items.WATER_BUCKET }); // Filled Flask.
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Water_Filled_Flask, 1), new Object[] { new ItemStack(ItemStorage.Empty_Flask, 1, 1), Items.WATER_BUCKET }); // Filled Flask.
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Water_Filled_Flask, 2), new Object[] { new ItemStack(ItemStorage.Empty_Flask, 1, 2), Items.WATER_BUCKET }); // Filled Flask.
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Water_Filled_Flask, 3), new Object[] { new ItemStack(ItemStorage.Empty_Flask, 1, 3), Items.WATER_BUCKET }); // Filled Flask.
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Water_Filled_Flask, 4), new Object[] { new ItemStack(ItemStorage.Empty_Flask, 1, 4), Items.WATER_BUCKET }); // Filled Flask.
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Water_Filled_Flask), new Object[] { ItemStorage.Empty_Flask, new ItemStack(Items.POTIONITEM, 0) }); // Filled Flask.
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Water_Filled_Flask), new Object[] { ItemStorage.Hot_Drink, Blocks.ICE }); // Filled Flask.
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Water_Filled_Flask), new Object[] { ItemStorage.Cold_Drink, Items.FLINT_AND_STEEL }); // Filled Flask.
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Cold_Drink), new Object[] { ItemStorage.Water_Filled_Flask, Blocks.ICE }); // Cold Flask.
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Cold_Drink, 1, 1), new Object[] { new ItemStack(ItemStorage.Water_Filled_Flask, 1, 1), Blocks.ICE }); // Cold Flask.
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Cold_Drink, 1, 2), new Object[] { new ItemStack(ItemStorage.Water_Filled_Flask, 1, 2), Blocks.ICE }); // Cold Flask.
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Cold_Drink, 1, 3), new Object[] { new ItemStack(ItemStorage.Water_Filled_Flask, 1, 3), Blocks.ICE }); // Cold Flask.
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Cold_Drink, 1, 4), new Object[] { new ItemStack(ItemStorage.Water_Filled_Flask, 1, 4), Blocks.ICE }); // Cold Flask.
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Super_Cold_Drink), new Object[] { ItemStorage.Water_Filled_Flask, Blocks.ICE, Blocks.ICE, Blocks.ICE }); // Super Cold Flask.
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Super_Cold_Drink, 1, 1), new Object[] { new ItemStack(ItemStorage.Water_Filled_Flask, 1, 1), Blocks.ICE, Blocks.ICE, Blocks.ICE }); // Super Cold Flask.
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Super_Cold_Drink, 1, 2), new Object[] { new ItemStack(ItemStorage.Water_Filled_Flask, 1, 2), Blocks.ICE, Blocks.ICE, Blocks.ICE }); // Super Cold Flask.
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Super_Cold_Drink, 1, 3), new Object[] { new ItemStack(ItemStorage.Water_Filled_Flask, 1, 3), Blocks.ICE, Blocks.ICE, Blocks.ICE }); // Super Cold Flask.
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Super_Cold_Drink, 1, 4), new Object[] { new ItemStack(ItemStorage.Water_Filled_Flask, 1, 4), Blocks.ICE, Blocks.ICE, Blocks.ICE }); // Super Cold Flask.
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Super_Cold_Drink), new Object[] { ItemStorage.Cold_Drink, Blocks.ICE }); // Super Cold Flask.
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Super_Cold_Drink, 1, 1), new Object[] { new ItemStack(ItemStorage.Cold_Drink, 1, 1), Blocks.ICE }); // Super Cold Flask.
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Super_Cold_Drink, 1, 2), new Object[] { new ItemStack(ItemStorage.Cold_Drink, 1, 2), Blocks.ICE }); // Super Cold Flask.
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Super_Cold_Drink, 1, 3), new Object[] { new ItemStack(ItemStorage.Cold_Drink, 1, 3), Blocks.ICE }); // Super Cold Flask.
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Super_Cold_Drink, 1, 4), new Object[] { new ItemStack(ItemStorage.Cold_Drink, 1, 4), Blocks.ICE }); // Super Cold Flask.
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Hot_Drink), new Object[] { ItemStorage.Water_Filled_Flask, Items.FLINT_AND_STEEL }); // Hot Flask.
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Hot_Drink, 1, 1), new Object[] { new ItemStack(ItemStorage.Water_Filled_Flask, 1, 1), Items.FLINT_AND_STEEL }); // Hot Flask.
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Hot_Drink, 1, 2), new Object[] { new ItemStack(ItemStorage.Water_Filled_Flask, 1, 2), Items.FLINT_AND_STEEL }); // Hot Flask.
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Hot_Drink, 1, 3), new Object[] { new ItemStack(ItemStorage.Water_Filled_Flask, 1, 3), Items.FLINT_AND_STEEL }); // Hot Flask.
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Hot_Drink, 1, 4), new Object[] { new ItemStack(ItemStorage.Water_Filled_Flask, 1, 4), Items.FLINT_AND_STEEL }); // Hot Flask.
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Super_Hot_Drink), new Object[] { ItemStorage.Hot_Drink, Items.FLINT_AND_STEEL }); // Super Hot Flask.
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Super_Hot_Drink, 1, 1), new Object[] { new ItemStack(ItemStorage.Hot_Drink, 1, 1), Items.FLINT_AND_STEEL }); // Super Hot Flask.
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Super_Hot_Drink, 1, 2), new Object[] { new ItemStack(ItemStorage.Hot_Drink, 1, 2), Items.FLINT_AND_STEEL }); // Super Hot Flask.
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Super_Hot_Drink, 1, 3), new Object[] { new ItemStack(ItemStorage.Hot_Drink, 1, 3), Items.FLINT_AND_STEEL }); // Super Hot Flask.
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Super_Hot_Drink, 1, 4), new Object[] { new ItemStack(ItemStorage.Hot_Drink, 1, 4), Items.FLINT_AND_STEEL }); // Super Hot Flask.
		
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Tempered_Glass_Block, 8), new Object[] { Blocks.GLASS, Blocks.GLASS, Blocks.GLASS, Blocks.GLASS, Blocks.GLASS, Blocks.GLASS, Blocks.GLASS, Blocks.GLASS, Blocks.OBSIDIAN }); // Filled Flask.
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Tempered_Glass_Flask, 2), new Object[] { ItemStorage.Empty_Flask, ItemStorage.Liquid_Infuser, ItemStorage.Tempered_Glass_Block, ItemStorage.Tempered_Glass_Block, ItemStorage.Tempered_Glass_Block }); // Filled Flask.
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Water_Filled_Tempered_Flask), new Object[] { ItemStorage.Tempered_Glass_Flask, Items.WATER_BUCKET }); // Filled Flask.
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Water_Filled_Tempered_Flask), new Object[] { ItemStorage.Tempered_Glass_Flask, new ItemStack(Items.POTIONITEM, 0) }); // Filled Flask.
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Water_Filled_Tempered_Flask), new Object[] { ItemStorage.Hot_Drink_Tempered, Blocks.ICE }); // Filled Flask.
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Water_Filled_Tempered_Flask), new Object[] { ItemStorage.Cold_Drink_Tempered, Items.FLINT_AND_STEEL }); // Filled Flask.
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Cold_Drink_Tempered), new Object[] { ItemStorage.Water_Filled_Tempered_Flask, Blocks.ICE }); // Cold Flask.
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Super_Cold_Drink_Tempered), new Object[] { ItemStorage.Water_Filled_Tempered_Flask, Blocks.ICE, Blocks.ICE, Blocks.ICE }); // Super Cold Flask.
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Super_Cold_Drink_Tempered), new Object[] { ItemStorage.Cold_Drink_Tempered, Blocks.ICE }); // Super Cold Flask.
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Hot_Drink_Tempered), new Object[] { ItemStorage.Water_Filled_Tempered_Flask, Items.FLINT_AND_STEEL }); // Hot Flask.
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Super_Hot_Drink_Tempered), new Object[] { ItemStorage.Hot_Drink_Tempered, Items.FLINT_AND_STEEL }); // Super Hot Flask.
		GameRegistry.addShapelessRecipe(new ItemStack(ItemStorage.Super_Hot_Drink_Tempered), new Object[] { ItemStorage.Water_Filled_Tempered_Flask, Items.LAVA_BUCKET }); // Super Hot Flask.
	}
	
}
