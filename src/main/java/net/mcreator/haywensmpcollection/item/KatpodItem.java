
package net.mcreator.haywensmpcollection.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.haywensmpcollection.init.HaywensmpcollectionModTabs;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class KatpodItem extends Item {
	public KatpodItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
		ItemGroupEvents.modifyEntriesEvent(HaywensmpcollectionModTabs.TAB_HAYWEN_COLLECTIONS).register(content -> content.accept(this));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
