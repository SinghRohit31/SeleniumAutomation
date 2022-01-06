package com.site.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.site.driver.Driver;

public class BaseTest {

	
	protected BaseTest() {}
	
	@BeforeMethod
	protected void init() {
		Driver.openBrowser();
		
	}
	

	@AfterMethod
	protected void tearDown() {
		Driver.closeBrowser();
	}
	
	
}
