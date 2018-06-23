package com.uc.test.selenium.tests;

//import org.apache.log4j.xml.DOMConfigurator;
//import org.apache.logging.log4j.core.config.xml.*;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.*;
//import org.apache.log4j.xml.DOMConfigurator;

import com.uc.test.selenium.pageobjects.CreateArticle_Page;
import com.uc.test.selenium.pageobjects.Home_Page;
import com.uc.test.selenium.pageobjects.Login_Page;
import com.uc.test.selenium.pageobjects.PageBaseClass;
import com.uc.test.selenium.util.BrowserUtils;
import com.uc.test.selenium.util.Constant;
import com.uc.test.selenium.util.ExcelUtils;
import com.uc.test.selenium.util.TestLog;
//import com.uc.test.selenium.util.TestLog;


public class Test_Login {

	public WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod() throws Exception {
		driver = BrowserUtils.OpenBrowser();
		new PageBaseClass(driver);
	}

	@AfterMethod
	public void afterMethod() throws Exception {
		driver.quit();
	}


	@Test
	public void test_1() throws Exception {

		try {
			//Logger Actions
			//DOMConfigurator.configure("log4j2.xml");
			//
			
			// Excel Actions
			ExcelUtils.setExcelFile("W:\\w\\svn\\java\\SeleniumFramework\\src\\com\\uc\\test\\selenium\\tests\\testdata\\TestData.xlsx", "Sheet1");
			String sTestCaseName = "ECOIOT391";
			int iTestCaseRow;
			iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,Constant.DataSheet.Col_TestCaseName.ordinal());
			String sUserName = ExcelUtils.getCellData(iTestCaseRow, Constant.DataSheet.Col_UserName.ordinal());
			TestLog.startTestCase(sTestCaseName);
			TestLog.info("TestCaseRow=" + String.valueOf(iTestCaseRow));
			// WebDriver Actions
			BrowserUtils.BrowserGet();
			Home_Page.txtbx_Search().sendKeys("1234");
			Thread.sleep(100);
			Home_Page.btn_Search().click();
			Thread.sleep(3000);
			//
			
		} catch (Exception e) {
			e.printStackTrace();
			throw(e);

		}
	}

	@Test
	public void test_2() throws Exception {
	
		try {
			BrowserUtils.BrowserGet();
			Thread.sleep(3000);
			Home_Page.link_Computing().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			throw(e);
		}
	}

	
	@Test
	public void test_createArticle() throws Exception{
		
		try {
			BrowserUtils.BrowserGet();
			//Thread.sleep(2000);
			//BrowserUtils.waitForPageToBeReady();
			Home_Page.link_Login().click();
			
			Login_Page.txtbx_Username().sendKeys("UnityAdmin");
			Login_Page.txtbx_Password().sendKeys("UnityAdmin@2017");
			Login_Page.btn_Login().click();

			
			Home_Page.link_ShortcutsToggle();
			Home_Page.link_CreateArtcle().click();

			CreateArticle_Page.txtbx_Title().sendKeys("ArticleTitle");
			CreateArticle_Page.txtbx_Body().sendKeys("1234");
			CreateArticle_Page.txtbx_Tags().sendKeys("_deleteme");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.assertEquals(false, true, "Test Failed");
		}
		
	}
	
	
	@Test
	public void test_3() throws Exception {
		try {
			BrowserUtils.BrowserGet();
			Thread.sleep(3000);
			Home_Page.link_Error().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			throw(e);
		}
	}
}
