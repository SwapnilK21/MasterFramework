package com.joshsoftware.driver.manager.web.remote.selenium;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.joshsoftware.config.factory.ConfigFactory;
import com.joshsoftware.enums.BrowserType;

public final class SeleniumGridChromeManager {

	private SeleniumGridChromeManager() {}
	
	public static WebDriver getDriver() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName(BrowserType.CHROME);
		return new RemoteWebDriver(ConfigFactory.getConfig().seleniumGridURL(), capabilities);
	}
}
