package com.uc.test.selenium.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;


import com.uc.test.selenium.util.Constant;



public class Test_Code {


	@BeforeMethod
	public void beforeMethod() throws Exception {
	}

	@AfterMethod
	public void afterMethod() throws Exception {
	}

	@Test
	public void enumTest() {
		
		for (Constant.LoginPageElements e : Constant.LoginPageElements.values()) {
			System.out.println(
				Constant.LoginPageElements.LOGIN_TXT_USERNAME.name() + " : " + 
				Constant.LoginPageElements.LOGIN_TXT_PASSWORD.getValue()
				);
		}
			//
		System.out.println(
				Constant.DataSheet.Col_UserName.ordinal() + " : " + 
				Constant.LoginPageElements.LOGIN_TXT_USERNAME.name() + " : " + 
				Constant.LoginPageElements.LOGIN_TXT_PASSWORD.getValue() );
		System.out.println(); 
		
	}

}
