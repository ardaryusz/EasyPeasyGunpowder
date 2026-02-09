package com.ardaryusz.easypeasygunpowder;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EasyPeasyGunpowder implements ModInitializer {
	public static final String MOD_ID = "easypeasygunpowder";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Easy Peasy Gunpowder has Launched!");
	}
}