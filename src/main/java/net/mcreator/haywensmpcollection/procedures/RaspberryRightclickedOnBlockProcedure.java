package net.mcreator.haywensmpcollection.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import net.mcreator.haywensmpcollection.init.HaywensmpcollectionModBlocks;

public class RaspberryRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.GRASS_BLOCK) {
			if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR) {
				world.setBlock(BlockPos.containing(x, y + 1, z), HaywensmpcollectionModBlocks.RASPBERRYBUSHSTAGE_0.defaultBlockState(), 3);
			} else {
				itemstack.shrink(1);
			}
		}
	}
}