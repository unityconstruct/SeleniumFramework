package com.uc.test.selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page extends PageBaseClass {

	private static WebElement element;

	public Login_Page(WebDriver driver) {
		super(driver);
	}


	public static WebElement txtbx_Username() throws Exception{
		try{
			element = driver.findElement(By.id("edit-name"));
			//		          TestLog.info("POM - Username text box is found on the Login Page");
		}catch (Exception e){
			//		  		TestLog.error("POM - UserName text box is not found on the Login Page");
			throw(e);
		}
		return element;
	}

	public static WebElement txtbx_Password() throws Exception{
		try{
			element = driver.findElement(By.id("edit-pass"));
			//		      	TestLog.info("POM - Password text box is found on the Login page");
		}catch (Exception e){
			//		  		TestLog.error("POM - Password text box is not found on the Login Page");
			throw(e);
		}
		return element;
	}

	public static WebElement btn_Login() throws Exception{
		try{
			element = driver.findElement(By.id("edit-submit"));
			//		      	TestLog.info("POM - Submit button is found on the Login page");
		}catch (Exception e){
			//		  		TestLog.error("POM - Submit button is not found on the Login Page");
			throw(e);
		}
		return element;
	}




}
