package extratan.registry;

import extratan.core.ExtraTAN;
import extratan.items.ItemStorage;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
 
@EventBusSubscriber
public class RegisterHandler {
	
    @SubscribeEvent
    public static void registerBlocks(Register<Block> event) {
        final Block[] blocks = {
        	ItemStorage.Tempered_Glass_Block
        };
 
        event.getRegistry().registerAll(blocks);
    }
    
    @SubscribeEvent
    public static void registerItems(Register<Item> event) {
    	System.out.println(String.format("[%s %s] Items are registering", ExtraTAN.modId, ExtraTAN.version));
    	
    	Item[] items = {
    		ItemStorage.Empty_Flask,
    		ItemStorage.Cold_Drink,
    		ItemStorage.Hot_Drink,
    		ItemStorage.Liquid_Infuser,
    		ItemStorage.Water_Filled_Flask,
    		ItemStorage.Water_Filled_Tempered_Flask,
    		ItemStorage.Super_Hot_Drink,
    		ItemStorage.Super_Cold_Drink,
    		ItemStorage.Cold_Drink_Tempered,
    		ItemStorage.Hot_Drink_Tempered,
    		ItemStorage.Super_Cold_Drink_Tempered,
    		ItemStorage.Tempered_Glass_Flask,
    		ItemStorage.Super_Hot_Drink_Tempered,
    		ItemStorage.Tempered_Glass_Block_Item
    	};
    	
        event.getRegistry().registerAll(items); // Register an item with the value currently present.
 
        //event.getRegistry().registerAll(itemBlocks);
    }
    
}
