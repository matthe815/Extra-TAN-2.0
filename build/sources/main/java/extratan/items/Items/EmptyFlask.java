package extratan.items.Items;

import extratan.creativetabs.CreativeTabHandler;
import extratan.items.BaseItem;
import extratan.items.ItemStorage;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EmptyFlask extends BaseItem {
	
	public EmptyFlask()
	{
		super("emptyFlask", "empty_flask", CreativeTabHandler.ExtraTANDrinks);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		ItemStack stack = playerIn.getHeldItemMainhand(); // Get the item that clicked it.
		RayTraceResult result = this.rayTrace(worldIn, playerIn, true); // Ray trace.
		
		if (result == null) // If the ray trace result comes back null...
			return new ActionResult<ItemStack>(EnumActionResult.FAIL, stack); // Fail.
		
		BlockPos pos = result.getBlockPos(); // Get the ray trace block position.
		
		if (pos == null) // If there's no block at that position somehow...
			return new ActionResult<ItemStack>(EnumActionResult.FAIL, stack); // Fail.
		
		Block block = worldIn.getBlockState(pos).getBlock(); // Get the block at that position!
		
		if (block == null) // If no block comes up at that position...
			return new ActionResult<ItemStack>(EnumActionResult.FAIL, stack); // Fail.
		
		float blockTemp = worldIn.getBiome(pos).getTemperature(pos); // The block temperature.
		ItemStack newstack; // A blank new stack reference to be filled.
		
		if (blockTemp < 0.2f) // if the block temperature is really low.
			newstack = new ItemStack(ItemStorage.Cold_Drink); // Make a new stack with a cold water filled flask.
		else if (blockTemp > 0.85f)
			newstack = new ItemStack(ItemStorage.Hot_Drink); // Make a new stack with a hot water filled flask.
		else
			newstack = new ItemStack(ItemStorage.Water_Filled_Flask); // Make a new stack with a water filled flask.
			
		newstack.setItemDamage(stack.getItemDamage()); // Get the damage of the stack.
		
		if (block.getRegistryName() != Blocks.WATER.getRegistryName())  // If it's not water you're interacting with, return the old stack.
			return new ActionResult<ItemStack>(EnumActionResult.FAIL, stack);
		
		if (stack.getCount() > 1) // If the stack count is larger than one, then we can reduce the stack by one.
		{
			stack.setCount(stack.getCount() - 1); // Reduce the stack size by one.
			
			if (!playerIn.inventory.addItemStackToInventory(newstack)) // If they don't have space to hold the new item.
				playerIn.dropItem(newstack, false); // Drop it on the ground in front of them.
			
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, stack); // Return that the action was a success.
		}
		else
		{
			stack = newstack; // Set the old stack to the new stack.
			
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, newstack); // Return that the action was a success.
		}
	}
	
}
