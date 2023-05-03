package com.joshsoftware.driver.factory.mobile.remote;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

import org.openqa.selenium.WebDriver;

import com.joshsoftware.driver.manager.mobile.remote.BrowserStackAndroidManager;
import com.joshsoftware.driver.manager.mobile.remote.BrowserStackIosManager;
import com.joshsoftware.enums.MobilePlatformType;

public final class SauceLabsMobileFactory {
	
	private SauceLabsMobileFactory() {}
	
	private static final Map<MobilePlatformType, Supplier<WebDriver>> MAP = new EnumMap<>(MobilePlatformType.class);

	static {
		 MAP.put(MobilePlatformType.ANDROID, BrowserStackAndroidManager::getDriver);
		 MAP.put(MobilePlatformType.IOS, BrowserStackIosManager::getDriver);
	}

	public static WebDriver getDriver(MobilePlatformType mobilePlatformType) {
		 return MAP.get(mobilePlatformType).get();
	}
}
