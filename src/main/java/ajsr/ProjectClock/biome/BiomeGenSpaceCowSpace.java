package ajsr.ProjectClock.biome;


import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.block.*;
import net.minecraft.block.state.IBlockState;


public class BiomeGenSpaceCowSpace extends BiomeGenBase{

		public BiomeGenSpaceCowSpace(int id){
			super(id);
			
			this.spawnableCreatureList.add(new SpawnListEntry(EntitySpaceCow.class, 5, 2, 10));
			
			this.theBiomeDecorator.treesPerChunk = 5;
			this.theBiomeDecorator.grassPerChunk = 2;
			this.theBiomeDecorator.bigMushroomsPerChunk = 2;
			
			
			this.topBlock = (IBlockState) Blocks.grass;
			this.fillerBlock = (IBlockState) Blocks.dirt;
			
		}
		
	}

