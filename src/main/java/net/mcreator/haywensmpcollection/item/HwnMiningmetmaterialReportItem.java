
package net.mcreator.haywensmpcollection.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.haywensmpcollection.init.HaywensmpcollectionModTabs;
import net.mcreator.haywensmpcollection.init.HaywensmpcollectionModSounds;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class HwnMiningmetmaterialReportItem extends RecordItem {
	public HwnMiningmetmaterialReportItem() {
		super(0, HaywensmpcollectionModSounds.HWN_MMDR_SAI, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 900);
		ItemGroupEvents.modifyEntriesEvent(HaywensmpcollectionModTabs.TAB_HAYWEN_COLLECTIONS).register(content -> content.accept(this));
	}
}
