
package net.mcreator.haywensmpcollection.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.haywensmpcollection.procedures.KatpodPlayerFinishesUsingItemProcedure;
import net.mcreator.haywensmpcollection.init.HaywensmpcollectionModTabs;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class KatpodItem extends Item {
	public KatpodItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.3f).alwaysEat()

				.build()));
		ItemGroupEvents.modifyEntriesEvent(HaywensmpcollectionModTabs.TAB_HAYWEN_COLLECTIONS).register(content -> content.accept(this));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.NONE;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		KatpodPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}
