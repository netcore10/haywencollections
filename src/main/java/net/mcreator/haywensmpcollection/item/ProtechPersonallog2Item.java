
package net.mcreator.haywensmpcollection.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.haywensmpcollection.init.HaywensmpcollectionModSounds;

public class ProtechPersonallog2Item extends RecordItem {
	public ProtechPersonallog2Item() {
		super(0, HaywensmpcollectionModSounds.PROTECH_PERSONALLOG2, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 880);
	}
}
