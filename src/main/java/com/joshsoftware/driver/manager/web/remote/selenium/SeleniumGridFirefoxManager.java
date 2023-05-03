package com.joshsoftware.driver.manager.web.remote.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.joshsoftware.config.factory.ConfigFactory;
import com.joshsoftware.enums.BrowserType;

public final class SeleniumGridFirefoxManager {

	private SeleniumGridFirefoxManager() {}
	
	public static WebDriver getDriver() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName(BrowserType.FIREFOX);
		return new RemoteWebDriver(ConfigFactory.getConfig().seleniumGridURL(), capabilities);
	}
}
