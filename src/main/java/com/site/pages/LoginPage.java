package com.site.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.site.driver.Driver;

public class LoginPage {
	
	private LoginPage(){};
	
	
	static  By txtusername = By.id("txtUsername");
	static  By txtpassword = By.id("txtPassword");
	static  By btnsubmit = By.id("btnLogin");
	  
	 public static void loginApplication(String username, String password) {
		 Driver.driver.findElement(txtusername).sendKeys(username,Keys.ENTER);
		 Driver.driver.findElement(txtpassword).sendKeys(password,Keys.ENTER);
		 Driver.driver.findElement(btnsubmit).click();
	 }
	  
	 
	 
	

}
