package com.site.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.site.constants.FrameworkConstants;

public class LoginPage {
	
	
	@Test
	public static void loginCase() {
		System.setProperty("webdriver.chrome.driver",FrameworkConstants.CHROMEDRIVERPATH);
		WebDriver driver= new ChromeDriver();
		driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("Rohit Singh" , Keys.ENTER);
		
		driver.close();
		
		
		
	}

}
