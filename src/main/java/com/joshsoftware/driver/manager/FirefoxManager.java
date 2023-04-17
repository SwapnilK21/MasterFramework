package com.joshsoftware.driver.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxManager {

	private FirefoxManager() {}
	
	public static WebDriver getDriver() {
		WebDriverManager.firefoxdriver().setup();
		return new FirefoxDriver();
	}
}
