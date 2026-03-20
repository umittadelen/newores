package net.umittadelen.newores;

import net.fabricmc.api.ModInitializer;

import net.umittadelen.newores.items.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NewOres implements ModInitializer {
	public static final String MOD_ID = "new-ores";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.initialize();
	}
}