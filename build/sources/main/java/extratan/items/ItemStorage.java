package extratan.items;

import extratan.blocks.Blocks.*;
import extratan.core.ExtraTAN;
import extratan.items.Items.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(ExtraTAN.modId)
public class ItemStorage {
	
	public static final Block Tempered_Glass_Block = new TemperedGlassBlock();
	
	public static final Item Tempered_Glass_Block_Item = new ItemBlock(ItemStorage.Tempered_Glass_Block).setUnlocalizedName(ExtraTAN.modId + "." + "temperedGlassBlock").setRegistryName("tempered_glass_block");
	public static final Item Liquid_Infuser = new LiquidInfuser();
	
	public static final Item Empty_Flask = new EmptyFlask();
	public static final Item Tempered_Glass_Flask = new EmptyTemperedFlask();
	
	public static final Item Water_Filled_Flask = new WaterFilledFlask();
	public static final Item Water_Filled_Tempered_Flask = new WaterFilledTemperedFlask();
	
	public static final Item Cold_Drink = new ColdDrink();
	public static final Item Cold_Drink_Tempered = new ColdDrinkTempered();
	
	public static final Item Super_Cold_Drink = new SuperColdDrink();
	public static final Item Super_Cold_Drink_Tempered = new SuperColdDrinkTempered();
	
	public static final Item Hot_Drink = new HotDrink();
	public static final Item Hot_Drink_Tempered = new HotDrinkTempered();
	
	public static final Item Super_Hot_Drink = new SuperHotDrink();
	public static final Item Super_Hot_Drink_Tempered = new SuperHotDrinkTempered();
	
}
