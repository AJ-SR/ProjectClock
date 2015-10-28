package ajsr.ProjectClock.init;

import ajsr.ProjectClock.MainMod;
import ajsr.ProjectClock.Reference;
import ajsr.ProjectClock.blocks.AJSRBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

	
	public static Block space_leather_block;
	public static Block cheese_block;
	
	
	public static void init()
	{
		space_leather_block = new AJSRBlocks(Material.cloth, float 3, float 12, SoundType.cloth).setUnlocalizedName("space_leather_block").setCreativeTab(MainMod.tabMod);
		
		cheese_block = new AJSRBlocks(Material.clay).setUnlocalizedName("cheese_block").setCreativeTab(MainMod.tabMod);
	}
	
	public static void register()
	{
		GameRegistry.registerBlock(space_leather_block, space_leather_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(cheese_block, cheese_block.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(space_leather_block);
		registerRender(space_leather_block);
	}
	
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
