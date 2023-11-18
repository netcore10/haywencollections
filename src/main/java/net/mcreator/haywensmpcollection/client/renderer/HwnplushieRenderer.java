package net.mcreator.haywensmpcollection.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.haywensmpcollection.entity.HwnplushieEntity;
import net.mcreator.haywensmpcollection.client.model.Modeltest;

public class HwnplushieRenderer extends MobRenderer<HwnplushieEntity, Modeltest<HwnplushieEntity>> {
	public HwnplushieRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltest(context.bakeLayer(Modeltest.LAYER_LOCATION)), 0.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(HwnplushieEntity entity) {
		return new ResourceLocation("haywensmpcollection:textures/entities/plushy.png");
	}
}
