package ajsr.ProjectClock.biome;


import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;

public class BiomeRegistry {
	
	public static void mainRegsitry(){
		initializeBiome();
		registerBiome();
	}
	
	public static BiomeGenBase biomeSpaceCowSpace;
	
	public static void initializeBiome(){
		
		biomeSpaceCowSpace = new BiomeGenSpaceCowSpace(137).setBiomeName("Space Cow Space").setTemperatureRainfall(1.2F, 0.9F);
		
	}
	
	public static void registerBiome(){
		BiomeDictionary.registerBiomeType(biomeSpaceCowSpace, Type.FOREST);
		BiomeManager.addSpawnBiome(biomeSpaceCowSpace);
		
	}

}
