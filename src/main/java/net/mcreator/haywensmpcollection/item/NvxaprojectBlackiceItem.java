
package net.mcreator.haywensmpcollection.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.haywensmpcollection.init.HaywensmpcollectionModSounds;

public class NvxaprojectBlackiceItem extends RecordItem {
	public NvxaprojectBlackiceItem() {
		super(0, HaywensmpcollectionModSounds.NVXA_BLACKICE, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 2980);
	}
}
