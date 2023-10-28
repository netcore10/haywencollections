
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.haywensmpcollection.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.haywensmpcollection.block.WhiteyBlock;
import net.mcreator.haywensmpcollection.block.HwnsprucehalfdoorBlock;
import net.mcreator.haywensmpcollection.block.HwnoakhalfdoorBlock;
import net.mcreator.haywensmpcollection.block.HwnbirchhalfdoorBlock;
import net.mcreator.haywensmpcollection.HaywensmpcollectionMod;

public class HaywensmpcollectionModBlocks {
	public static Block WHITEY;
	public static Block HWNOAKHALFDOOR;
	public static Block HWN_SPRUCEHALFDOOR;
	public static Block HWNBIRCHHALFDOOR;

	public static void load() {
		WHITEY = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(HaywensmpcollectionMod.MODID, "whitey"), new WhiteyBlock());
		HWNOAKHALFDOOR = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(HaywensmpcollectionMod.MODID, "hwnoakhalfdoor"), new HwnoakhalfdoorBlock());
		HWN_SPRUCEHALFDOOR = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(HaywensmpcollectionMod.MODID, "hwn_sprucehalfdoor"), new HwnsprucehalfdoorBlock());
		HWNBIRCHHALFDOOR = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(HaywensmpcollectionMod.MODID, "hwnbirchhalfdoor"), new HwnbirchhalfdoorBlock());
	}

	public static void clientLoad() {
		WhiteyBlock.clientInit();
		HwnoakhalfdoorBlock.clientInit();
		HwnsprucehalfdoorBlock.clientInit();
		HwnbirchhalfdoorBlock.clientInit();
	}
}
