
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.haywensmpcollection.init;

import net.mcreator.haywensmpcollection.procedures.RaspberryPlayerFinishesUsingItemProcedure;
import net.mcreator.haywensmpcollection.procedures.MemeTyepodshooterRangedItemUsedProcedure;
import net.mcreator.haywensmpcollection.procedures.MemeTyepodshooterProjectileHitsPlayerProcedure;
import net.mcreator.haywensmpcollection.procedures.MemeTyepodshooterProjectileHitsLivingEntityProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class HaywensmpcollectionModProcedures {
	public static void load() {
		new RaspberryPlayerFinishesUsingItemProcedure();
		new MemeTyepodshooterRangedItemUsedProcedure();
		new MemeTyepodshooterProjectileHitsLivingEntityProcedure();
		new MemeTyepodshooterProjectileHitsPlayerProcedure();
	}
}
