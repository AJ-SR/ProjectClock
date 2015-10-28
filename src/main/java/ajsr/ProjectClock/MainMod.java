package ajsr.ProjectClock;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import ajsr.ProjectClock.init.ModBlocks;
import ajsr.ProjectClock.init.ModItems;
import ajsr.ProjectClock.proxy.CommonProxy;
import ajsr.ProjectClock.biome.BiomeRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class MainMod {
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final ModTab tabMod = new ModTab("tabMod");
	
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		System.out.println("[Project Clock] Initializing mod.");
		  
		BiomeRegistry.mainRegistry();
		ModBlocks.init();
		ModBlocks.register();
		ModItems.init();
		ModItems.register();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.registerRenders();
	
		ModRecipes.addRecipes();
		
		
		
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		System.out.println("[Project Clock] Sucessfully enabled mod. Have fun!");
		
	}
}
