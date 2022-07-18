package io.github.KacyBiscuit.water_scarcity;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WaterScarcity implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("Water Scarcity");

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Loading...");
	}
}
