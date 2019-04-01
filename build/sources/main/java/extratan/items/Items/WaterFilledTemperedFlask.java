package extratan.items.Items;

import extratan.creativetabs.CreativeTabHandler;
import extratan.items.BaseDrinkableItem;
import extratan.items.ItemStorage;

public class WaterFilledTemperedFlask extends BaseDrinkableItem {
	
	public WaterFilledTemperedFlask() {
		super("waterFilledFlask", "water_filled_tempered_flask", -1, ItemStorage.Tempered_Glass_Flask, CreativeTabHandler.ExtraTANDrinks);
	}
	
}
