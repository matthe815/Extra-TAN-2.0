package extratan.models;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import extratan.items.ItemStorage;

@EventBusSubscriber(Side.CLIENT)
public class ModelRegistryHandler {
 
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
		registerModel(ItemStorage.Empty_Flask);
		registerModel(ItemStorage.Cold_Drink);
		registerModel(ItemStorage.Hot_Drink);
		registerModel(ItemStorage.Liquid_Infuser);
		registerModel(ItemStorage.Water_Filled_Flask);
		registerModel(ItemStorage.Super_Hot_Drink);
		registerModel(ItemStorage.Super_Cold_Drink);
		registerModel(ItemStorage.Tempered_Glass_Flask);
		registerModel(ItemStorage.Water_Filled_Tempered_Flask);
		registerModel(ItemStorage.Cold_Drink_Tempered);
		registerModel(ItemStorage.Hot_Drink_Tempered);
		registerModel(ItemStorage.Super_Cold_Drink_Tempered);
		registerModel(ItemStorage.Super_Hot_Drink_Tempered);
		registerModel(ItemStorage.Tempered_Glass_Block_Item);
    }
 
    private static void registerModel(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "block"));
    }

}
