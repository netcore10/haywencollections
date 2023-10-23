
package net.mcreator.haywensmpcollection.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.haywensmpcollection.init.HaywensmpcollectionModTabs;
import net.mcreator.haywensmpcollection.init.HaywensmpcollectionModSounds;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class HwnPraaMMDGTMUReportLogItem extends RecordItem {
	public HwnPraaMMDGTMUReportLogItem() {
		super(0, HaywensmpcollectionModSounds.HWNPRAMMD_GTMUREPORTLOG, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1120);
		ItemGroupEvents.modifyEntriesEvent(HaywensmpcollectionModTabs.TAB_HAYWEN_COLLECTIONS).register(content -> content.accept(this));
	}
}
