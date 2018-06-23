package com.uc.test.selenium.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class PageBaseClass {

	public static WebDriver driver;
	public static boolean bResult;
	public  PageBaseClass(WebDriver driver){
		PageBaseClass.driver = driver;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PageBaseClass.bResult = true;
	}
	
}
