
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.haywensmpcollection.init;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.haywensmpcollection.entity.SqueekeyCleanEntity;
import net.mcreator.haywensmpcollection.entity.MemeTyepodshooterEntity;
import net.mcreator.haywensmpcollection.entity.HwnplushieEntity;
import net.mcreator.haywensmpcollection.HaywensmpcollectionMod;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class HaywensmpcollectionModEntities {
	public static EntityType<MemeTyepodshooterEntity> KATSHOOTER;
	public static EntityType<SqueekeyCleanEntity> SQUEEKEY_CLEAN;
	public static EntityType<HwnplushieEntity> HWNPLUSHIE;

	public static void load() {
		KATSHOOTER = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(HaywensmpcollectionMod.MODID, "katshooter"), createArrowEntityType(MemeTyepodshooterEntity::new));
		SQUEEKEY_CLEAN = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(HaywensmpcollectionMod.MODID, "squeekey_clean"), createArrowEntityType(SqueekeyCleanEntity::new));
		HWNPLUSHIE = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(HaywensmpcollectionMod.MODID, "hwnplushie"),
				FabricEntityTypeBuilder.create(MobCategory.MONSTER, HwnplushieEntity::new).dimensions(new EntityDimensions(0.3f, 0.6f, true)).trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		HwnplushieEntity.init();
		FabricDefaultAttributeRegistry.register(HWNPLUSHIE, HwnplushieEntity.createAttributes());
	}

	private static <T extends Entity> EntityType<T> createArrowEntityType(EntityType.EntityFactory<T> factory) {
		return FabricEntityTypeBuilder.create(MobCategory.MISC, factory).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(1).trackedUpdateRate(64).build();
	}
}
