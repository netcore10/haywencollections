
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.haywensmpcollection.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.haywensmpcollection.block.WhiteyBlock;
import net.mcreator.haywensmpcollection.block.HwnoakhalfdoorBlock;
import net.mcreator.haywensmpcollection.HaywensmpcollectionMod;

public class HaywensmpcollectionModBlocks {
	public static Block WHITEY;
	public static Block HWNOAKHALFDOOR;

	public static void load() {
		WHITEY = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(HaywensmpcollectionMod.MODID, "whitey"), new WhiteyBlock());
		HWNOAKHALFDOOR = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(HaywensmpcollectionMod.MODID, "hwnoakhalfdoor"), new HwnoakhalfdoorBlock());
	}

	public static void clientLoad() {
		WhiteyBlock.clientInit();
		HwnoakhalfdoorBlock.clientInit();
	}
}
