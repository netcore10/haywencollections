package net.mcreator.haywensmpcollection.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.haywensmpcollection.init.HaywensmpcollectionModItems;

public class MemeTyepodshooterRangedItemUsedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(HaywensmpcollectionModItems.KATSHOOTER, 250);
	}
}
