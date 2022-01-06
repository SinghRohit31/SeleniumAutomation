package com.site.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.site.pages.LoginPage;

public class LoginTest extends BaseTest{
	
	@Test
	public static void loginCase() {
		LoginPage.loginApplication("Admin", "admin123" );
		Assert.assertTrue(true);
	}
	
	@DataProvider
    public void getDataForLoginApplication() {
		
	}
}
