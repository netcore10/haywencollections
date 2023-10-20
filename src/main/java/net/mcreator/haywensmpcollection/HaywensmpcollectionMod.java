/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package net.mcreator.haywensmpcollection;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.mcreator.haywensmpcollection.init.HaywensmpcollectionModTabs;
import net.mcreator.haywensmpcollection.init.HaywensmpcollectionModSounds;
import net.mcreator.haywensmpcollection.init.HaywensmpcollectionModProcedures;
import net.mcreator.haywensmpcollection.init.HaywensmpcollectionModItems;
import net.mcreator.haywensmpcollection.init.HaywensmpcollectionModEntities;
import net.mcreator.haywensmpcollection.init.HaywensmpcollectionModBlocks;

import net.fabricmc.api.ModInitializer;

public class HaywensmpcollectionMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "haywensmpcollection";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing HaywensmpcollectionMod");

		HaywensmpcollectionModTabs.load();

		HaywensmpcollectionModEntities.load();
		HaywensmpcollectionModBlocks.load();
		HaywensmpcollectionModItems.load();

		HaywensmpcollectionModProcedures.load();

		HaywensmpcollectionModSounds.load();

	}
}
