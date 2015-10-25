package ajsr.ProjectClock;

import ajsr.ProjectClock.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModTab extends CreativeTabs {

	public ModTab(String label) {
		super(label);

	}

	@Override
	public Item getTabIconItem() {
		return ModItems.space_leather;
	}

}
