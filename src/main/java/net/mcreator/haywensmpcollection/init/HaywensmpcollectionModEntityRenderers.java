
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.haywensmpcollection.init;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.haywensmpcollection.client.renderer.HwnplushieRenderer;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class HaywensmpcollectionModEntityRenderers {
	public static void load() {
		EntityRendererRegistry.register(HaywensmpcollectionModEntities.KATSHOOTER, ThrownItemRenderer::new);
		EntityRendererRegistry.register(HaywensmpcollectionModEntities.SQUEEKEY_CLEAN, ThrownItemRenderer::new);
		EntityRendererRegistry.register(HaywensmpcollectionModEntities.HWNPLUSHIE, HwnplushieRenderer::new);
	}
}
