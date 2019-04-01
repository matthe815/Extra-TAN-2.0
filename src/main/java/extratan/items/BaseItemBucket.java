package extratan.items;

import extratan.core.ExtraTAN;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucket;

public class BaseItemBucket extends ItemBucket {
	
	public BaseItemBucket(String name, String registryName, CreativeTabs creativeTab)
	{
		super(null);
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
