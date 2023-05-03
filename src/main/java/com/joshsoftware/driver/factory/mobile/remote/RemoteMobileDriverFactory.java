package com.joshsoftware.driver.factory.mobile.remote;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

import org.openqa.selenium.WebDriver;

import com.joshsoftware.enums.MobilePlatformType;
import com.joshsoftware.enums.MobileRemoteModeType;

public final class RemoteMobileDriverFactory {

	private RemoteMobileDriverFactory() {}
	private static final Map<MobileRemoteModeType, Function<MobilePlatformType, WebDriver>> MAP = new EnumMap<>(MobileRemoteModeType.class);
	
	static {
		 MAP.put(MobileRemoteModeType.SAUCE_LABS, SauceLabsMobileFactory::getDriver);
		 MAP.put(MobileRemoteModeType.BROWSER_STACK, BrowserStackMobileFactory::getDriver);
	}

	public static WebDriver getDriver(MobileRemoteModeType browserRemoteModeType, MobilePlatformType platformType) {
		    return MAP.get(browserRemoteModeType).apply(platformType);
	}
}
