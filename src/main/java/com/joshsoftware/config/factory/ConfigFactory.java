package com.joshsoftware.config.factory;

import org.aeonbits.owner.ConfigCache;

import com.joshsoftware.config.FrameworkConfig;

public final class ConfigFactory {

	private ConfigFactory() {}
	
	public static FrameworkConfig getConfig() {
		return  ConfigCache.getOrCreate(FrameworkConfig.class);
	}
}
