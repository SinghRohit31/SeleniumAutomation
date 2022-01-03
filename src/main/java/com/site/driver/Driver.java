package com.site.driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.site.constants.FrameworkConstants;

public class Driver {

	public static WebDriver driver;
	
	public static void openBrowser() {
		if(Objects.isNull(driver)) {
		System.setProperty("webdriver.chrome.driver",FrameworkConstants.CHROMEDRIVERPATH);
		driver= new ChromeDriver();
		driver.get("https://google.com");
		}
	}
	
	public static void closeBrowser() {
		if(Objects.nonNull(driver)) {
		driver.close();
		driver=null;
		}
	}
	
	
}
