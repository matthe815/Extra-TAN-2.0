package extratan.creativetabs.tabs;

import extratan.core.ExtraTAN;
import extratan.items.ItemStorage;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ExtraTANMaterials extends CreativeTabs {
	
	public ExtraTANMaterials() {
		super(ExtraTAN.modId + "." + "extraTANMaterials");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemStorage.Liquid_Infuser);
	}

}
