
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.haywensmpcollection.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.haywensmpcollection.block.WhiteyBlock;
import net.mcreator.haywensmpcollection.block.Raspberrybushstage3Block;
import net.mcreator.haywensmpcollection.block.Raspberrybushstage2Block;
import net.mcreator.haywensmpcollection.block.Raspberrybushstage1Block;
import net.mcreator.haywensmpcollection.block.Raspberrybushstage0Block;
import net.mcreator.haywensmpcollection.HaywensmpcollectionMod;

public class HaywensmpcollectionModBlocks {
	public static Block WHITEY;
	public static Block RASPBERRYBUSHSTAGE_0;
	public static Block RASPBERRYBUSHSTAGE_1;
	public static Block RASPBERRYBUSHSTAGE_2;
	public static Block RASPBERRYBUSHSTAGE_3;

	public static void load() {
		WHITEY = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(HaywensmpcollectionMod.MODID, "whitey"), new WhiteyBlock());
		RASPBERRYBUSHSTAGE_0 = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(HaywensmpcollectionMod.MODID, "raspberrybushstage_0"), new Raspberrybushstage0Block());
		RASPBERRYBUSHSTAGE_1 = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(HaywensmpcollectionMod.MODID, "raspberrybushstage_1"), new Raspberrybushstage1Block());
		RASPBERRYBUSHSTAGE_2 = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(HaywensmpcollectionMod.MODID, "raspberrybushstage_2"), new Raspberrybushstage2Block());
		RASPBERRYBUSHSTAGE_3 = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(HaywensmpcollectionMod.MODID, "raspberrybushstage_3"), new Raspberrybushstage3Block());
	}

	public static void clientLoad() {
		WhiteyBlock.clientInit();
		Raspberrybushstage0Block.clientInit();
		Raspberrybushstage1Block.clientInit();
		Raspberrybushstage2Block.clientInit();
		Raspberrybushstage3Block.clientInit();
	}
}
