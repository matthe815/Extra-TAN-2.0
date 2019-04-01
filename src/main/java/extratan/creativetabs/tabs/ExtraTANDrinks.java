package extratan.creativetabs.tabs;

import extratan.core.ExtraTAN;
import extratan.items.ItemStorage;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ExtraTANDrinks extends CreativeTabs {

	public ExtraTANDrinks() {
		super(ExtraTAN.modId + "." + "extraTANDrinks");
	}

	@Override
	public Item getTabIconItem() {
		return ItemStorage.Water_Filled_Flask;
	}

}
