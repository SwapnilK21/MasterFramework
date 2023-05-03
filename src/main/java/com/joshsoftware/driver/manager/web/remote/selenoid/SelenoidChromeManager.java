package com.joshsoftware.driver.manager.web.remote.selenoid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.joshsoftware.config.factory.ConfigFactory;

public final class SelenoidChromeManager {

	private SelenoidChromeManager() {}
	
	public static WebDriver getDriver() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("browserName", "chrome");
		capabilities.setCapability("browserVersion", "97.0");
		capabilities.setCapability("enableVNC", true);
		capabilities.setCapability("enableVideo", false);
		return new RemoteWebDriver(ConfigFactory.getConfig().selenoidURL(),capabilities);
	}

}