package com.joshsoftware.tests;

import org.testng.annotations.Test;

import com.joshsoftware.config.factory.BrowserStackConfigFactory;
import com.joshsoftware.config.factory.ConfigFactory;

public class firstTest {

	@Test
	public void testLogin() {
		
		
		System.out.println(ConfigFactory.getConfig().browser());
		System.out.println(BrowserStackConfigFactory.getConfig().browserStackURL());
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com");
//		driver.quit();
	}
}
