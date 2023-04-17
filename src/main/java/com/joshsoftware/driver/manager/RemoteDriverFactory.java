package com.joshsoftware.driver.manager;

import org.openqa.selenium.WebDriver;

import com.joshsoftware.config.factory.ConfigFactory;
import com.joshsoftware.enums.BrowserRemoteModeType;

public final class RemoteDriverFactory {

	private RemoteDriverFactory() {}
	
	public static WebDriver getDriver() {
		BrowserRemoteModeType browserRemoteModeType = ConfigFactory.getConfig().browserRemoteMode();
		if(browserRemoteModeType == BrowserRemoteModeType.SELENIUM) {
			
		}
		else if(browserRemoteModeType == BrowserRemoteModeType.SELENOID) {
			
		}
		else {
			
		}
		
		return null;
	}
}
