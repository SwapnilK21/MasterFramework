package com.joshsoftware.driver;

import org.openqa.selenium.WebDriver;

import com.joshsoftware.config.factory.ConfigFactory;
import com.joshsoftware.driver.manager.ChromeManager;
import com.joshsoftware.driver.manager.FirefoxManager;
import com.joshsoftware.enums.BrowserType;

public final class LocalDriverFactory {

	private LocalDriverFactory() {}
	
	public static WebDriver getDriver() {
		WebDriver driver = null;
		if(isBrowserChrome()) driver = ChromeManager.getDriver();	
		else driver = FirefoxManager.getDriver();		
		return driver;		
	}

	private static boolean isBrowserChrome() {
		return ConfigFactory.getConfig().browser() == BrowserType.CHROME;
	}
}
