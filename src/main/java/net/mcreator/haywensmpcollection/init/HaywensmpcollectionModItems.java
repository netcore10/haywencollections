/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.haywensmpcollection.init;

import net.minecraft.world.item.Item;
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
import net.mcreator.haywensmpcollection.item.HwnPraaMMDGTMUReportLogItem;
import net.mcreator.haywensmpcollection.item.HwnNvxaSacuraBlossomsItem;
import net.mcreator.haywensmpcollection.item.HwnMiningmetmaterialReportItem;
import net.mcreator.haywensmpcollection.HaywensmpcollectionMod;

public class HaywensmpcollectionModItems {
	public static Item PROTECHLOG_195;
	public static Item WHITEY;
	public static Item PROTECHLOG_204;
	public static Item PROTECH_LOG_290;
	public static Item PROTECH_LOG_309;
	public static Item PROTECHLOG_NEW_EMPLOYEE;
	public static Item PROTECH_PERSONAL_LOG_1;
	public static Item PROTECH_PERSONALLOG_2;
	public static Item NVACAVE_1;
	public static Item NVXACAVE_2;
	public static Item NVXACAVE_5THFLOOR;
	public static Item NVXAPROJECT_BLACKICE;
	public static Item KATSHOOTER;
	public static Item KATPOD;
	public static Item SQUEEKEY_CLEAN;
	public static Item HWN_MININGMETMATERIAL_REPORT;
	public static Item HWN_PRAA_MMDGTMU_REPORT_LOG;
	public static Item HWN_NVXA_SACURA_BLOSSOMS;
	public static Item HWN_REKU;

	public static void load() {
		PROTECHLOG_195 = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(HaywensmpcollectionMod.MODID, "protechlog_195"), new Protechlog195Item());
		WHITEY = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(HaywensmpcollectionMod.MODID, "whitey"), new BlockItem(HaywensmpcollectionModBlocks.WHITEY, new Item.Properties()));
		PROTECHLOG_204 = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(HaywensmpcollectionMod.MODID, "protechlog_204"), new Protechlog204Item());
		PROTECH_LOG_290 = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(HaywensmpcollectionMod.MODID, "protech_log_290"), new ProtechLog290Item());
		PROTECH_LOG_309 = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(HaywensmpcollectionMod.MODID, "protech_log_309"), new ProtechLog309Item());
		PROTECHLOG_NEW_EMPLOYEE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(HaywensmpcollectionMod.MODID, "protechlog_new_employee"), new ProtechlogNewEmployeeItem());
		PROTECH_PERSONAL_LOG_1 = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(HaywensmpcollectionMod.MODID, "protech_personal_log_1"), new ProtechPersonalLog1Item());
		PROTECH_PERSONALLOG_2 = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(HaywensmpcollectionMod.MODID, "protech_personallog_2"), new ProtechPersonallog2Item());
		NVACAVE_1 = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(HaywensmpcollectionMod.MODID, "nvacave_1"), new Nvacave1Item());
		NVXACAVE_2 = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(HaywensmpcollectionMod.MODID, "nvxacave_2"), new Nvxacave2Item());
		NVXACAVE_5THFLOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(HaywensmpcollectionMod.MODID, "nvxacave_5thfloor"), new Nvxacave5thfloorItem());
		NVXAPROJECT_BLACKICE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(HaywensmpcollectionMod.MODID, "nvxaproject_blackice"), new NvxaprojectBlackiceItem());
		KATSHOOTER = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(HaywensmpcollectionMod.MODID, "katshooter"), new MemeTyepodshooterItem());
		KATPOD = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(HaywensmpcollectionMod.MODID, "katpod"), new KatpodItem());
		SQUEEKEY_CLEAN = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(HaywensmpcollectionMod.MODID, "squeekey_clean"), new SqueekeyCleanItem());
		HWN_MININGMETMATERIAL_REPORT = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(HaywensmpcollectionMod.MODID, "hwn_miningmetmaterial_report"), new HwnMiningmetmaterialReportItem());
		HWN_PRAA_MMDGTMU_REPORT_LOG = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(HaywensmpcollectionMod.MODID, "hwn_praa_mmdgtmu_report_log"), new HwnPraaMMDGTMUReportLogItem());
		HWN_NVXA_SACURA_BLOSSOMS = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(HaywensmpcollectionMod.MODID, "hwn_nvxa_sacura_blossoms"), new HwnNvxaSacuraBlossomsItem());
		HWN_REKU = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(HaywensmpcollectionMod.MODID, "hwn_reku"), new HwnRekuItem());
	}

	public static void clientLoad() {
	}
}
