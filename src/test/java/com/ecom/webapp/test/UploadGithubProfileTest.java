package com.ecom.webapp.test;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadGithubProfileTest {
	
	final String siteURL = "https://github.com/settings/profile";
	WebDriver driver;
	
	@BeforeEach
	void setUp() {
		InitializeDriver.init();
	}
	
	@Test
	public void testForGithubProfileUpload() throws InterruptedException, IOException {
		// 1. first login into github
		LoginGithubTest.userLogin();
		Thread.sleep(2000);
		// 2. get common driver instance -> to navigate profile page
		driver = RunTimeDriver.getDriver();
		driver.get(siteURL);
		
		// 3. find upload image button
		driver.findElement(By.xpath("//*[@id=\"js-pjax-container\"]/div/div[2]/div[2]/div[2]/div[2]/dl/dd/div/details/summary")).click();
		driver.findElement(By.xpath("//*[@id=\"js-pjax-container\"]/div/div[2]/div[2]/div[2]/div[2]/dl/dd/div/details/details-menu/label")).click();
		
		Thread.sleep(2000);
		Runtime.getRuntime().exec("AutoIT/upload-new-profile.exe");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/details/details-dialog/form/div[2]/button")).click();
		
		Thread.sleep(2000);
	}
}
