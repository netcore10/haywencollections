
package net.mcreator.haywensmpcollection.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.haywensmpcollection.init.HaywensmpcollectionModSounds;

public class ProtechLog290Item extends RecordItem {
	public ProtechLog290Item() {
		super(0, HaywensmpcollectionModSounds.PROTECH_LOG290, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 920);
	}
}
