package extratan.creativetabs.tabs;

import extratan.core.ExtraTAN;
import extratan.items.ItemStorage;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ExtraTANDrinks extends CreativeTabs {

	public ExtraTANDrinks() {
		super(ExtraTAN.modId + "." + "extraTANDrinks");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemStorage.Water_Filled_Flask);
	}

}
