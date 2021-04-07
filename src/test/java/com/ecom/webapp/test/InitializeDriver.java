package com.ecom.webapp.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitializeDriver {
	
	final static String driverPath = "driver/chromedriver.exe";
	static WebDriver driver;

	
	public static void init() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		// set a common driver instance for multiple action.
		RunTimeDriver.setDriver(driver);
	}
	
	public static void destroy() {
		driver.close();
	}
}
