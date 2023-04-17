package com.joshsoftware.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.joshsoftware.config.factory.ConfigFactory;
import com.joshsoftware.enums.BrowserType;

import io.github.bonigarcia.wdm.WebDriverManager;

public final class Driver {
	
	private Driver() {}
	
	public static void initDriver() {
		WebDriver driver = LocalDriverFactory.getDriver();
		driver.get("https://www.google.co.in");
	}
	
	public static void quitDriver() {
		//driver.quit();
	}
}
