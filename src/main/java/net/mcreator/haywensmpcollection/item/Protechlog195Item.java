
package net.mcreator.haywensmpcollection.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.haywensmpcollection.init.HaywensmpcollectionModSounds;

public class Protechlog195Item extends RecordItem {
	public Protechlog195Item() {
		super(0, HaywensmpcollectionModSounds.PROTECHLOG195, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 520);
	}
}
