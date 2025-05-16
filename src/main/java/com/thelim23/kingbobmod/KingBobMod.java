package com.thelim23.kingbobmod;

import com.thelim23.kingbobmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KingBobMod implements ModInitializer {
	public static final String MOD_ID = "kingbobmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}