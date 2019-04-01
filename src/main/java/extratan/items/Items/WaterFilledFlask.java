package extratan.items.Items;

import extratan.creativetabs.CreativeTabHandler;
import extratan.items.BaseDrinkableItem;
import extratan.items.ItemStorage;

public class WaterFilledFlask extends BaseDrinkableItem {
	
	public WaterFilledFlask() {
		super("waterFilledFlask", "water_filled_flask", -1, ItemStorage.Empty_Flask, CreativeTabHandler.ExtraTANDrinks);
	}
	
}
