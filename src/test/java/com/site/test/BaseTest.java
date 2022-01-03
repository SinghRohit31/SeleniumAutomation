package com.site.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.site.driver.Driver;

public class BaseTest {

	
	protected BaseTest() {}
	
	@BeforeMethod
	public void init() {
		Driver.openBrowser();
		
	}
	

	@AfterMethod
	public void tearDown() {
		Driver.closeBrowser();
	}
	
	
}
