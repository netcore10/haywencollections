
package net.mcreator.haywensmpcollection.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.haywensmpcollection.init.HaywensmpcollectionModSounds;

public class ProtechLog309Item extends RecordItem {
	public ProtechLog309Item() {
		super(0, HaywensmpcollectionModSounds.PROTECH_LOG309, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1060);
	}
}
