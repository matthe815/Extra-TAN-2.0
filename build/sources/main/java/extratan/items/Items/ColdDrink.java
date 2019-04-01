package extratan.items.Items;

import extratan.creativetabs.CreativeTabHandler;
import extratan.items.BaseDrinkableItem;
import extratan.items.ItemStorage;

public class ColdDrink extends BaseDrinkableItem {

	public ColdDrink() {
		super("coldDrink", "flask_with_cold_water", -4, ItemStorage.Empty_Flask, CreativeTabHandler.ExtraTANDrinks);
	}
	
}
