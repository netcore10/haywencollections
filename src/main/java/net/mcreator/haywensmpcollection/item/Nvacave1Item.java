
package net.mcreator.haywensmpcollection.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.haywensmpcollection.init.HaywensmpcollectionModSounds;

public class Nvacave1Item extends RecordItem {
	public Nvacave1Item() {
		super(0, HaywensmpcollectionModSounds.NVX_CAVE1, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2060);
	}
}
