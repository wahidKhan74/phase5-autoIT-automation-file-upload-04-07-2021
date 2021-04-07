package com.ecom.webapp.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginGithubTest {
	
	final static String siteURL = "https://github.com/login";
	
	public static void userLogin() {
		WebDriver driver = RunTimeDriver.getDriver();
		driver.get(siteURL);
		
		driver.findElement(By.id("login_field")).sendKeys(LoginCredential.username);
		driver.findElement(By.id("password")).sendKeys(LoginCredential.password);
		
		driver.findElement(By.xpath("//*[@id=\"login\"]/div[4]/form/div/input[12]")).submit();
	}
}
