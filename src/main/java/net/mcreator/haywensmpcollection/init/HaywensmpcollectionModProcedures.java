
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.haywensmpcollection.init;

import net.mcreator.haywensmpcollection.procedures.RaspberryPlayerFinishesUsingItemProcedure;
import net.mcreator.haywensmpcollection.procedures.MemeTyepodshooterRangedItemUsedProcedure;
import net.mcreator.haywensmpcollection.procedures.MemeTyepodshooterProjectileHitsPlayerProcedure;
import net.mcreator.haywensmpcollection.procedures.MemeTyepodshooterProjectileHitsLivingEntityProcedure;
import net.mcreator.haywensmpcollection.procedures.KatpodPlayerFinishesUsingItemProcedure;
import net.mcreator.haywensmpcollection.procedures.HwnHalfdoorOnBlockRightClickedProcedure;
import net.mcreator.haywensmpcollection.procedures.HwnGetblock6x6x6Procedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class HaywensmpcollectionModProcedures {
	public static void load() {
		new RaspberryPlayerFinishesUsingItemProcedure();
		new MemeTyepodshooterRangedItemUsedProcedure();
		new MemeTyepodshooterProjectileHitsLivingEntityProcedure();
		new MemeTyepodshooterProjectileHitsPlayerProcedure();
		new HwnGetblock6x6x6Procedure();
		new HwnHalfdoorOnBlockRightClickedProcedure();
		new KatpodPlayerFinishesUsingItemProcedure();
	}
}
