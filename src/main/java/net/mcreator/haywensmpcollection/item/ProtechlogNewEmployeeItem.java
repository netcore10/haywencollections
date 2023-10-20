
package net.mcreator.haywensmpcollection.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.haywensmpcollection.init.HaywensmpcollectionModSounds;

public class ProtechlogNewEmployeeItem extends RecordItem {
	public ProtechlogNewEmployeeItem() {
		super(0, HaywensmpcollectionModSounds.PROTECH_LOG_NEWEMPLOYEE, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1260);
	}
}
