package extratan.creativetabs.tabs;

import extratan.core.ExtraTAN;
import extratan.items.ItemStorage;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ExtraTANBlocks extends CreativeTabs {

	public ExtraTANBlocks() {
		super(ExtraTAN.modId + "." + "extraTANBlocks");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemStorage.Tempered_Glass_Block_Item);
	}

}
