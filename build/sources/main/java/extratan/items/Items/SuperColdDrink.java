package extratan.items.Items;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import extratan.creativetabs.CreativeTabHandler;
import extratan.items.BaseDrinkableItem;
import extratan.items.ItemStorage;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class SuperColdDrink extends BaseDrinkableItem {

	List<ItemStack> timedItems = new ArrayList<ItemStack>();
	Map<ItemStack,Timer> itemTimers = new HashMap<ItemStack,Timer>();
	
	public SuperColdDrink() {
		super("superColdDrink", "flask_with_super_cold_water", -8, ItemStorage.Empty_Flask, CreativeTabHandler.ExtraTANDrinks);
		setMaxDamage(5); // Max damage.
	}
	
	@Override
	public void onUpdate(final ItemStack stack, final World worldIn, final Entity entityIn, final int itemSlot, final boolean isSelected) 
	{
		super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected); // Do the typical action.
		
		if (!timedItems.contains(stack))
		{
			timedItems.add(stack); // Add the stack.
			Timer timer = new Timer(); // Add a new timer.
			
			itemTimers.put(stack, timer); // Add the timer to the map.
			
			timer.schedule(new TimerTask() { public void run() { damageTimer(stack, worldIn, entityIn, itemSlot); return; } }, 60000, 60000);
		}
	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack stack, World world, EntityLivingBase entity) 
	{
		itemTimers.get(stack).cancel(); // Cancel the timer when done.
		itemTimers.remove(stack); // Remove the timer.
		timedItems.remove(timedItems.indexOf(stack)); // Removed the stack from the list.
		return super.onItemUseFinish(stack, world, entity); // Super the item usage.
	}
	
	public void damageTimer(ItemStack stack, World worldIn, Entity entityIn, int itemSlot) 
	{
		setDamage(stack, getDamage(stack)+1); // Up the damage a bit
		
		if (getDamage(stack) > getMaxDamage(stack)-1)
		{
			EntityPlayer player = (EntityPlayer)entityIn; // Fetch the player.
			player.playSound(new SoundEvent(new ResourceLocation("minecraft:block.glass.break")), 1, 1); // Play a glass break sound.
			player.inventory.removeStackFromSlot(itemSlot); // Delete the item.
			itemTimers.get(stack).cancel(); // Cancel the timer when done.
			itemTimers.remove(stack); // Remove the timer.
			timedItems.remove(timedItems.indexOf(stack)); // Removed the stack from the list.
		}
	}
	
}
