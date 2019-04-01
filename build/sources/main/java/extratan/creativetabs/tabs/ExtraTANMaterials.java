package extratan.creativetabs.tabs;

import extratan.core.ExtraTAN;
import extratan.items.ItemStorage;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ExtraTANMaterials extends CreativeTabs {
	
	public ExtraTANMaterials() {
		super(ExtraTAN.modId + "." + "extraTANMaterials");
	}

	@Override
	public Item getTabIconItem() {
		return ItemStorage.Liquid_Infuser;
	}

}
