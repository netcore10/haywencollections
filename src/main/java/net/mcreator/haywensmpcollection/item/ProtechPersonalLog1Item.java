
package net.mcreator.haywensmpcollection.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.haywensmpcollection.init.HaywensmpcollectionModSounds;

public class ProtechPersonalLog1Item extends RecordItem {
	public ProtechPersonalLog1Item() {
		super(0, HaywensmpcollectionModSounds.PROTECH_PERSONALLOG1, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 720);
	}
}
