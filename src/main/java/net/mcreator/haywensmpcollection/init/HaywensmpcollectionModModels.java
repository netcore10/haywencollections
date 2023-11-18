
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.haywensmpcollection.init;

import net.mcreator.haywensmpcollection.client.model.Modeltest;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class HaywensmpcollectionModModels {
	public static void load() {
		EntityModelLayerRegistry.registerModelLayer(Modeltest.LAYER_LOCATION, Modeltest::createBodyLayer);
	}
}
