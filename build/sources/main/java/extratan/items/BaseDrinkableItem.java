package extratan.items;

import extratan.core.ExtraTAN;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucketMilk;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import toughasnails.api.stat.capability.ITemperature;
import toughasnails.api.stat.capability.IThirst;
import toughasnails.api.temperature.Temperature;
import toughasnails.api.temperature.TemperatureHelper;
import toughasnails.api.thirst.ThirstHelper;

public class BaseDrinkableItem extends ItemBucketMilk {

	protected int tempModifier;
	protected String name;
	public ITemperature temp;
	public Item emptyVersion;
	
	public BaseDrinkableItem(String name, String registryName, int temperature, Item emptyFlask, CreativeTabs creativeTab)
	{
		this.name = name; // Set the item's name.
		this.tempModifier = temperature; // Set the item's temperature.
		this.emptyVersion = emptyFlask; // Set the empty version.
		
		setUnlocalizedName(ExtraTAN.modId + "." + name) // Set the unlocalized name.
			.setRegistryName(registryName) // Set the localized name.
			.setCreativeTab(creativeTab); // Set the creative tab.
		
		setMaxDamage(5); // Set the max damage.
		
		this.tempModifier = temperature; // The temperature modifier for the drink.
	}

	@Override
	public Item setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack stack, World world, EntityLivingBase entity)
	{
		super.onItemUseFinish(stack, world, entity); // Super the top most.
		
		EntityPlayer player = (EntityPlayer)entity; // Get the player's entity.
		
		if (player.isCreative()) // If the player is creative, return the entire stack unaltered.
			return stack;
		
		IThirst th = ThirstHelper.getThirstData(player); // Get the player's Thirst Helper.
		th.setThirst(th.getThirst() + 6); // Add 6 to the player's Thirst value.
		th.setHydration(th.getHydration() + 2); // Add 2 to the player's Hydration value.
		
		ITemperature temp = TemperatureHelper.getTemperatureData(player); // Get the player's Temperature Data.
		temp.addTemperature(new Temperature(this.tempModifier)); // Apply the temp modifier.
		
		ItemStack iStack = new ItemStack(this.emptyVersion); // Create a new stack.
		iStack.setItemDamage(stack.getItemDamage()); // Set the damage of the empty flask to the main stack's item.
		
		return iStack; // Return the new item stack.
	}
}
