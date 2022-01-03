package com.site.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.site.driver.Driver;

public class LoginTest extends BaseTest{
	
	@Test
	public static void loginCase() {
		Driver.driver.findElement(By.name("q")).sendKeys("Rohit Singh" , Keys.ENTER);
	}
	

}
