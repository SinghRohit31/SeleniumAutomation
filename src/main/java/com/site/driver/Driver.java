package com.site.driver;

import java.io.IOException;
import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.site.constants.FrameworkConstants;
import com.site.readProperty.ReadProperty;

public class Driver {
	
	private Driver() {}

    public static WebDriver driver;
	
	public static void openBrowser() {
		if(Objects.isNull(driver)) {
		System.setProperty("webdriver.chrome.driver",FrameworkConstants.CHROMEDRIVERPATH);
		driver= new ChromeDriver();
		try {
			driver.get(ReadProperty.readPropertyFile("url"));
		} catch (IOException e) {
			System.out.print("Unable to read Property File ..Check the Propery file again");
			e.printStackTrace();
		}
		}
	}
	
	public static void closeBrowser() {
		if(Objects.nonNull(driver)) {
		driver.close();
		driver=null;
		}
	}
	
	
}
