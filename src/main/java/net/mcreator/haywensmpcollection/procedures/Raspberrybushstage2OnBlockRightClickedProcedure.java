package net.mcreator.haywensmpcollection.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.haywensmpcollection.init.HaywensmpcollectionModBlocks;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;

import java.util.Map;

public class Raspberrybushstage2OnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == HaywensmpcollectionModBlocks.RASPBERRYBUSHSTAGE_2 && Math.random() <= 0.2
					&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL) {
				new Object() {
					private int ticks = 0;

					public void startDelay(LevelAccessor world) {
						ServerTickEvents.END_SERVER_TICK.register((server) -> {
							this.ticks++;
							if (this.ticks == 5) {
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 5, 1, 1, 1, 1);
								{
									BlockPos _bp = BlockPos.containing(x, y, z);
									BlockState _bs = HaywensmpcollectionModBlocks.RASPBERRYBUSHSTAGE_3.defaultBlockState();
									BlockState _bso = world.getBlockState(_bp);
									for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
										Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
										if (_property != null && _bs.getValue(_property) != null)
											try {
												_bs = _bs.setValue(_property, (Comparable) entry.getValue());
											} catch (Exception e) {
											}
									}
									world.setBlock(_bp, _bs, 3);
								}
								return;
							}
						});
					}
				}.startDelay(world);
			}
		} else {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == HaywensmpcollectionModBlocks.RASPBERRYBUSHSTAGE_3
					&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 5, 1, 1, 1, 1);
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = HaywensmpcollectionModBlocks.RASPBERRYBUSHSTAGE_3.defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
		}
	}
}
