package ajsr.ProjectClock.proxy;

import ajsr.ProjectClock.init.ModBlocks;
import ajsr.ProjectClock.init.ModItems;

public class ClientProxy extends CommonProxy{
	
	
	@Override
	public void registerRenders()
	{
		ModItems.registerRenders();
		ModBlocks.registerRenders();
		Entity.preInit();
	}

}
