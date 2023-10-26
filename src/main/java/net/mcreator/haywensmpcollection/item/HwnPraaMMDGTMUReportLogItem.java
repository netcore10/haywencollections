
package net.mcreator.haywensmpcollection.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.haywensmpcollection.init.HaywensmpcollectionModSounds;

public class HwnPraaMMDGTMUReportLogItem extends RecordItem {
	public HwnPraaMMDGTMUReportLogItem() {
		super(0, HaywensmpcollectionModSounds.HWNPRAMMD_GTMUREPORTLOG, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1120);
	}
}
