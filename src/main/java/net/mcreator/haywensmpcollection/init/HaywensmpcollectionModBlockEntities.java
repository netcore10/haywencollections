
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.haywensmpcollection.init;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.haywensmpcollection.block.entity.Raspberrybushstage0BlockEntity;
import net.mcreator.haywensmpcollection.HaywensmpcollectionMod;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;

public class HaywensmpcollectionModBlockEntities {
	public static BlockEntityType<?> RASPBERRYBUSHSTAGE_0;

	public static void load() {
		RASPBERRYBUSHSTAGE_0 = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, new ResourceLocation(HaywensmpcollectionMod.MODID, "raspberrybushstage_0"),
				FabricBlockEntityTypeBuilder.create(Raspberrybushstage0BlockEntity::new, HaywensmpcollectionModBlocks.RASPBERRYBUSHSTAGE_0).build(null));
	}
}
