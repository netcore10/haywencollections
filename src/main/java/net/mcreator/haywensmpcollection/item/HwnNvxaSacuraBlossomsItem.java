
package net.mcreator.haywensmpcollection.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.haywensmpcollection.init.HaywensmpcollectionModSounds;

public class HwnNvxaSacuraBlossomsItem extends RecordItem {
	public HwnNvxaSacuraBlossomsItem() {
		super(0, HaywensmpcollectionModSounds.HWN_NVXA_SAKURA, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1460);
	}
}
