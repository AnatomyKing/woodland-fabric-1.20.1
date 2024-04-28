package net.anatomyworld.woodland;

import net.anatomyworld.woodland.block.ModBlocks;
import net.anatomyworld.woodland.item.ModItemGroups;
import net.anatomyworld.woodland.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WoodLand implements ModInitializer {
	public static  final String MOD_ID = "woodland";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}