package extratan.core;

import extratan.proxy.CommonProxy;
import extratan.recipes.ModRecipes;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ExtraTAN.modId, version = ExtraTAN.version, name = ExtraTAN.name, dependencies = ExtraTAN.dependencies)
public class ExtraTAN {

	public static final String modId = "extratan";
	public static final String name = "extratan";
	public static final String version = "2.1";
	public static final String dependencies = "required-after:ToughAsNails";

	@Mod.Instance(modId)
	public static ExtraTAN instance;
	
	@SidedProxy(serverSide = "extratan.proxy.CommonProxy", clientSide = "extratan.proxy.ClientProxy")
	public static CommonProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(modId + " is pre-loading!");
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		System.out.println(modId + " is loading!");
		ModRecipes.Init(); // Init the recipes.
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		System.out.println(modId + " is post-loading!");
	}

}