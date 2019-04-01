package extratan.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import extratan.core.ExtraTAN;
import net.minecraft.creativetab.CreativeTabs;

public class BaseEatableItem extends ItemFood {
	
		public BaseEatableItem(String name, String registryName, CreativeTabs creativeTab)
		{
			super(1, false); // Import the SUPER constructor.
			setUnlocalizedName(ExtraTAN.modId + "." + name);
			setRegistryName(registryName);
			setCreativeTab(creativeTab);
		}
		
		@Override
		public Item setCreativeTab(CreativeTabs tab) {
			super.setCreativeTab(tab);
			return this;
		}
}
