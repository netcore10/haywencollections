
package net.mcreator.haywensmpcollection.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.haywensmpcollection.init.HaywensmpcollectionModSounds;

public class Nvxacave2Item extends RecordItem {
	public Nvxacave2Item() {
		super(0, HaywensmpcollectionModSounds.NVXA_CAVE2, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2080);
	}
}
