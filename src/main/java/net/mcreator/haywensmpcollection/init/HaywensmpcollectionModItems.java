/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.haywensmpcollection.init;

import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.haywensmpcollection.item.SqueekeyCleanItem;
import net.mcreator.haywensmpcollection.item.ProtechlogNewEmployeeItem;
import net.mcreator.haywensmpcollection.item.Protechlog204Item;
import net.mcreator.haywensmpcollection.item.Protechlog195Item;
import net.mcreator.haywensmpcollection.item.ProtechPersonallog2Item;
import net.mcreator.haywensmpcollection.item.ProtechPersonalLog1Item;
import net.mcreator.haywensmpcollection.item.ProtechLog309Item;
import net.mcreator.haywensmpcollection.item.ProtechLog290Item;
import net.mcreator.haywensmpcollection.item.NvxaprojectBlackiceItem;
import net.mcreator.haywensmpcollection.item.Nvxacave5thfloorItem;
import net.mcreator.haywensmpcollection.item.Nvxacave2Item;
import net.mcreator.haywensmpcollection.item.Nvacave1Item;
import net.mcreator.haywensmpcollection.item.MemeTyepodshooterItem;
import net.mcreator.haywensmpcollection.item.KatpodItem;
import net.mcreator.haywensmpcollection.item.HwnRekuItem;
import net.mcreator.haywensmpcollection.item.HwnRaspberryItem;
import net.mcreator.haywensmpcollection.item.HwnNvxaSacuraBlossomsItem;
import net.mcreator.haywensmpcollection.HaywensmpcollectionMod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class HaywensmpcollectionModItems {
	public static Item HWN_PROTECHLOG_195;
	public static Item WHITEY;
	public static Item HWN_PROTECHLOG_204;
	public static Item HWN_PROTECH_LOG_290;
	public static Item HWN_PROTECH_LOG_309;
	public static Item HWN_PROTECHLOG_NEW_EMPLOYEE;
	public static Item HWN_PROTECH_PERSONAL_LOG_1;
	public static Item PROTECH_PERSONALLOG_2;
	public static Item HWN_NVACAVE_1;
	public static Item HWN_NVXACAVE_2;
	public static Item HWN_NVXACAVE_5THFLOOR;
	public static Item HWN_NVXAPROJECT_BLACKICE;
	public static Item KATSHOOTER;
	public static Item KATPOD;
	public static Item SQUEEKEY_CLEAN;
	public static Item HWN_NVXA_SACURA_BLOSSOMS;
	public static Item HWN_REKU;
	public static Item HWNOAKHALFDOOR;
	public static Item HWNPLUSHIE_SPAWN_EGG;
	public static Item HWN_RASPBERRY;

	public static void load() {
		HWN_PROTECHLOG_195 = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(HaywensmpcollectionMod.MODID, "hwn_protechlog_195"), new Protechlog195Item());
		WHITEY = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(HaywensmpcollectionMod.MODID, "whitey"), new BlockItem(HaywensmpcollectionModBlocks.WHITEY, new Item.Properties()));
		HWN_PROTECHLOG_204 = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(HaywensmpcollectionMod.MODID, "hwn_protechlog_204"), new Protechlog204Item());
		HWN_PROTECH_LOG_290 = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(HaywensmpcollectionMod.MODID, "hwn_protech_log_290"), new ProtechLog290Item());
		HWN_PROTECH_LOG_309 = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(HaywensmpcollectionMod.MODID, "hwn_protech_log_309"), new ProtechLog309Item());
		HWN_PROTECHLOG_NEW_EMPLOYEE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(HaywensmpcollectionMod.MODID, "hwn_protechlog_new_employee"), new ProtechlogNewEmployeeItem());
		HWN_PROTECH_PERSONAL_LOG_1 = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(HaywensmpcollectionMod.MODID, "hwn_protech_personal_log_1"), new ProtechPersonalLog1Item());
		PROTECH_PERSONALLOG_2 = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(HaywensmpcollectionMod.MODID, "protech_personallog_2"), new ProtechPersonallog2Item());
		HWN_NVACAVE_1 = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(HaywensmpcollectionMod.MODID, "hwn_nvacave_1"), new Nvacave1Item());
		HWN_NVXACAVE_2 = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(HaywensmpcollectionMod.MODID, "hwn_nvxacave_2"), new Nvxacave2Item());
		HWN_NVXACAVE_5THFLOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(HaywensmpcollectionMod.MODID, "hwn_nvxacave_5thfloor"), new Nvxacave5thfloorItem());
		HWN_NVXAPROJECT_BLACKICE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(HaywensmpcollectionMod.MODID, "hwn_nvxaproject_blackice"), new NvxaprojectBlackiceItem());
		KATSHOOTER = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(HaywensmpcollectionMod.MODID, "katshooter"), new MemeTyepodshooterItem());
		KATPOD = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(HaywensmpcollectionMod.MODID, "katpod"), new KatpodItem());
		SQUEEKEY_CLEAN = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(HaywensmpcollectionMod.MODID, "squeekey_clean"), new SqueekeyCleanItem());
		HWN_NVXA_SACURA_BLOSSOMS = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(HaywensmpcollectionMod.MODID, "hwn_nvxa_sacura_blossoms"), new HwnNvxaSacuraBlossomsItem());
		HWN_REKU = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(HaywensmpcollectionMod.MODID, "hwn_reku"), new HwnRekuItem());
		HWNOAKHALFDOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(HaywensmpcollectionMod.MODID, "hwnoakhalfdoor"), new BlockItem(HaywensmpcollectionModBlocks.HWNOAKHALFDOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(HaywensmpcollectionModTabs.TAB_HAYWEN_COLLECTIONS).register(content -> content.accept(HWNOAKHALFDOOR));
		HWNPLUSHIE_SPAWN_EGG = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(HaywensmpcollectionMod.MODID, "hwnplushie_spawn_egg"), new SpawnEggItem(HaywensmpcollectionModEntities.HWNPLUSHIE, -1, -1, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.SPAWN_EGGS).register(content -> content.accept(HWNPLUSHIE_SPAWN_EGG));
		HWN_RASPBERRY = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(HaywensmpcollectionMod.MODID, "hwn_raspberry"), new HwnRaspberryItem());
	}

	public static void clientLoad() {
	}
}
