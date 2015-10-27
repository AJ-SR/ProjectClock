package ajsr.ProjectClock.entity;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class Entity {
		
	public static void preInit()
	{
		EntityRegistry.registerGlobalEntityID(EntitySpaceCow.class, "SpaceCow", EntityRegistry.findGlobalUniqueEntityId(), 0x7AE8FF, 0x47FFE2);
		
		EntityRegistry.addSpawn(EntitySpaceCow.class, 130, 2, 5, EnumCreatureType.CREATURE, BiomeGenBase.getBiomeGenArray());
	}
}
