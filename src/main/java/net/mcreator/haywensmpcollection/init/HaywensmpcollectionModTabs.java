
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.haywensmpcollection.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.haywensmpcollection.HaywensmpcollectionMod;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

public class HaywensmpcollectionModTabs {
	public static ResourceKey<CreativeModeTab> TAB_HAYWEN_COLLECTIONS = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(HaywensmpcollectionMod.MODID, "haywen_collections"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_HAYWEN_COLLECTIONS,
				FabricItemGroup.builder().title(Component.translatable("item_group." + HaywensmpcollectionMod.MODID + ".haywen_collections")).icon(() -> new ItemStack(HaywensmpcollectionModItems.HWN_PROTECHLOG_195)).build());
	}
}
