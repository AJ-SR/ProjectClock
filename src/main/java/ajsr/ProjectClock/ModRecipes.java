package ajsr.ProjectClock;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import ajsr.ProjectClock.init.ModBlocks;
import ajsr.ProjectClock.init.ModItems;

public class ModRecipes 
{
	public static void addRecipes()
	{
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cheese_block),
				"MM",
				"MM",
				'M', ModItems.milk_ingot
				);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.space_leather_block),
				"SSS",
				"SWS",
				"SSS",
				'S', ModItems.space_leather, 'W', Blocks.wool
				);
		GameRegistry.addRecipe(new ItemStack(ModItems.milk_pickaxe),
				"MMM",
				"OSO",
				"OSO",
				'M', ModItems.milk_ingot, 'O', Blocks.air, 'S', Items.stick
				);
		GameRegistry.addRecipe(new ItemStack(ModItems.milk_axe),
				"MMO",
				"MSO",
				"OSO",
				'M', ModItems.milk_ingot, 'O', Blocks.air, 'S', Items.stick
				);
		GameRegistry.addRecipe(new ItemStack(ModItems.milk_shovel),
				"OMO",
				"OSO",
				"OSO",
				'M', ModItems.milk_ingot, 'O', Blocks.air, 'S', Items.stick
				);
		GameRegistry.addRecipe(new ItemStack(ModItems.milk_sword),
				"OMO",
				"OMO",
				"OSO",
				'M', ModItems.milk_ingot, 'O', Blocks.air, 'S', Items.stick
				);
	}
}
