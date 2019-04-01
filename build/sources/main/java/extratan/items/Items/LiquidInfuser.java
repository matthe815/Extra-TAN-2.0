package extratan.items.Items;

import extratan.creativetabs.CreativeTabHandler;
import extratan.items.BaseEatableItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class LiquidInfuser extends BaseEatableItem {
	
		public LiquidInfuser()
		{
			super("liquidInfuser", "liquid_infuser", CreativeTabHandler.ExtraTANMaterials); // Import the BaseEatableItem SUPER constructor.
		}
		
		@Override
		protected void onFoodEaten(ItemStack item, World world, EntityPlayer player) {
			player.setHealth(player.getHealth()-4f); // Hurt the player by 2 hearts when they eat the Liquid Infuser.
			player.performHurtAnimation(); // Play the hurt a from it.
		}
		
}