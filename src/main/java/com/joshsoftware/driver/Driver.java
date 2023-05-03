package com.joshsoftware.driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.joshsoftware.config.factory.ConfigFactory;
import com.joshsoftware.driver.factory.mobile.local.LocalMobileDriverFactory;
import com.joshsoftware.driver.factory.mobile.remote.RemoteMobileDriverFactory;
import com.joshsoftware.driver.factory.web.remote.RemoteDriverFactory;
import com.joshsoftware.enums.MobilePlatformType;

public final class Driver {
	
	private Driver() {}
	
	//local web, remote web, local mobile, remote mobile
	@Test
	public static void initDriver() {
		//WebDriver driver = LocalDriverFactory.getDriver(ConfigFactory.getConfig().browser());
		WebDriver driver = RemoteDriverFactory.getDriver(ConfigFactory.getConfig().browserRemoteMode(), ConfigFactory.getConfig().browser());
		//WebDriver driver = RemoteMobileDriverFactory.getDriver(ConfigFactory.getConfig().mobileRemoteMode(), MobilePlatformType.ANDROID);
		
		//driver.get("https://www.google.co.in");
		driver.quit();
	}
	
	public static void quitDriver() {
		/*
		 * */
	}
}
