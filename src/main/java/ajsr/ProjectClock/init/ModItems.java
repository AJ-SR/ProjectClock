package ajsr.ProjectClock.init;

import ajsr.ProjectClock.MainMod;
import ajsr.ProjectClock.ModTab;
import ajsr.ProjectClock.Reference;
import ajsr.ProjectClock.items.ItemMilkAxe;
import ajsr.ProjectClock.items.ItemMilkPickaxe;
import ajsr.ProjectClock.items.ItemMilkShovel;
import ajsr.ProjectClock.items.ItemMilkSword;
import ajsr.ProjectClock.items.ItemSpaceCowLeather;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item milk_ingot;
	public static Item milk_pickaxe;
	public static Item space_leather;
	public static Item milk_axe;
	public static Item milk_shovel;
	public static Item milk_sword;
	
	public static ToolMaterial Milk = EnumHelper.addToolMaterial("Milk", 3, 2601, 12.0f, 3.0f, 22);
	
	public static void init()
	{
		milk_ingot = new Item().setUnlocalizedName("milk_ingot").setCreativeTab(MainMod.tabMod);
		space_leather = new ItemSpaceCowLeather().setUnlocalizedName("space_leather").setCreativeTab(MainMod.tabMod);
		milk_pickaxe = new ItemMilkPickaxe(Milk).setCreativeTab(MainMod.tabMod);
		milk_axe = new ItemMilkAxe(Milk).setCreativeTab(MainMod.tabMod);
		milk_sword = new ItemMilkSword(Milk).setCreativeTab(MainMod.tabMod);
		milk_shovel = new ItemMilkShovel(Milk).setCreativeTab(MainMod.tabMod);
	}
	public static void register()
	{
		GameRegistry.registerItem(milk_ingot, milk_ingot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(space_leather, space_leather.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(milk_pickaxe, milk_pickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(milk_axe, milk_axe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(milk_shovel, milk_shovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(milk_sword, milk_sword.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(milk_ingot);
		registerRender(space_leather);
		registerRender(milk_pickaxe);
		registerRender(milk_axe);
		registerRender(milk_shovel);
		registerRender(milk_sword);
	}
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		
	}
}
