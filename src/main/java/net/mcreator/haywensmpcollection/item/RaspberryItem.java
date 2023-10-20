
package net.mcreator.haywensmpcollection.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.InteractionResult;

import net.mcreator.haywensmpcollection.procedures.RaspberryRightclickedOnBlockProcedure;
import net.mcreator.haywensmpcollection.init.HaywensmpcollectionModTabs;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class RaspberryItem extends Item {
	public RaspberryItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.3f)

				.build()));
		ItemGroupEvents.modifyEntriesEvent(HaywensmpcollectionModTabs.TAB_HAYWEN_COLLECTIONS).register(content -> content.accept(this));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 32;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		RaspberryRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getItemInHand());
		return retval;
	}
}
