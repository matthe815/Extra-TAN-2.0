package extratan.items;

import net.minecraft.item.Item;
import extratan.core.ExtraTAN;
import net.minecraft.creativetab.CreativeTabs;

public class BaseItem extends Item {
	
		public BaseItem(String name, String registryName, CreativeTabs creativeTab)
		{
			setUnlocalizedName(ExtraTAN.modId + "." + name);
			setRegistryName(registryName);
			setCreativeTab(creativeTab);
			setMaxDamage(5);
		}
		
		@Override
		public Item setCreativeTab(CreativeTabs tab) {
			super.setCreativeTab(tab);
			return this;
		}
}
