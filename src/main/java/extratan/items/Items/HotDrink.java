package extratan.items.Items;

import extratan.creativetabs.CreativeTabHandler;
import extratan.items.BaseDrinkableItem;
import extratan.items.ItemStorage;

public class HotDrink extends BaseDrinkableItem {

	public HotDrink() {
		super("hotDrink", "flask_with_hot_water", 4, ItemStorage.Empty_Flask, CreativeTabHandler.ExtraTANDrinks);
	}
	
}
