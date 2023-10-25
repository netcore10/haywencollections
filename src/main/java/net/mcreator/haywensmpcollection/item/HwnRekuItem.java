
package net.mcreator.haywensmpcollection.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.haywensmpcollection.init.HaywensmpcollectionModSounds;

public class HwnRekuItem extends RecordItem {
	public HwnRekuItem() {
		super(0, HaywensmpcollectionModSounds.NVX_CAVE1, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3280);
	}
}
