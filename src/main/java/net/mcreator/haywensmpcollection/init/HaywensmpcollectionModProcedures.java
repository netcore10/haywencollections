
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.haywensmpcollection.init;

import net.mcreator.haywensmpcollection.procedures.Raspberrybushstage3OnBlockRightClickedProcedure;
import net.mcreator.haywensmpcollection.procedures.Raspberrybushstage2updatetickProcedure;
import net.mcreator.haywensmpcollection.procedures.Raspberrybushstage2OnBlockRightClickedProcedure;
import net.mcreator.haywensmpcollection.procedures.Raspberrybushstage1updatetickProcedure;
import net.mcreator.haywensmpcollection.procedures.Raspberrybushstage1OnBlockRightClickedProcedure;
import net.mcreator.haywensmpcollection.procedures.Raspberrybushstage0UpdateTickProcedure;
import net.mcreator.haywensmpcollection.procedures.Raspberrybushstage0OnBlockRightClickedProcedure;
import net.mcreator.haywensmpcollection.procedures.RaspberryRightclickedOnBlockProcedure;
import net.mcreator.haywensmpcollection.procedures.RaspberryPlayerFinishesUsingItemProcedure;
import net.mcreator.haywensmpcollection.procedures.MemeTyepodshooterRangedItemUsedProcedure;
import net.mcreator.haywensmpcollection.procedures.MemeTyepodshooterProjectileHitsLivingEntityProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class HaywensmpcollectionModProcedures {
	public static void load() {
		new RaspberryPlayerFinishesUsingItemProcedure();
		new MemeTyepodshooterRangedItemUsedProcedure();
		new MemeTyepodshooterProjectileHitsLivingEntityProcedure();
		new Raspberrybushstage0UpdateTickProcedure();
		new Raspberrybushstage1updatetickProcedure();
		new Raspberrybushstage2updatetickProcedure();
		new Raspberrybushstage3OnBlockRightClickedProcedure();
		new Raspberrybushstage0OnBlockRightClickedProcedure();
		new RaspberryRightclickedOnBlockProcedure();
		new Raspberrybushstage1OnBlockRightClickedProcedure();
		new Raspberrybushstage2OnBlockRightClickedProcedure();
	}
}
