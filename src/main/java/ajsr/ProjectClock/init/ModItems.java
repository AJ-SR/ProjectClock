package ajsr.ProjectClock.init;

import ajsr.ProjectClock.MainMod;
import ajsr.ProjectClock.ModTab;
import ajsr.ProjectClock.Reference;
import ajsr.ProjectClock.items.ItemSpaceCowLeather;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item milk_ingot;
	
	public static Item space_leather;
	
	public static ArmorMaterial ARMOR = EnumHelper.addArmorMaterial("milk", pc:milk_armor, durability, damageReduction[], enchantability);
	
	public static void init()
	{
		milk_ingot = new Item().setUnlocalizedName("milk_ingot").setCreativeTab(MainMod.tabMod);;
		
		space_leather = new ItemSpaceCowLeather().setUnlocalizedName("space_leather").setCreativeTab(MainMod.tabMod);
	}
	public static void register()
	{
		GameRegistry.registerItem(milk_ingot, milk_ingot.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(space_leather, space_leather.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(milk_ingot);
		registerRender(space_leather);
	}
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		
	}
}
