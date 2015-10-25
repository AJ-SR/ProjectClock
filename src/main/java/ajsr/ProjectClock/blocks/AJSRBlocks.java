package ajsr.ProjectClock.blocks;

import ajsr.ProjectClock.MainMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class AJSRBlocks extends Block{

	public AJSRBlocks(Material materialIn) {
		super(materialIn);

	}

	public AJSRBlocks(Material mat, String tex, String name, float hard, float resist, SoundType sound) {
		super(mat);
		this.setHardness(hard);
		this.setResistance(resist);
		this.setCreativeTab(MainMod.tabMod);
		this.setStepSound(sound);
	}

}
