package com.uc.test.selenium.pageobjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.uc.test.selenium.util.BrowserUtils;

//import utility.TestLog;

public class Home_Page extends PageBaseClass {
	private static WebElement element = null;

	public Home_Page(WebDriver driver){
		super(driver);
	}




	public static WebElement link_Error() throws Exception{
		try{
			element = driver.findElement(By.xpath ("//a[contains(.,'Error')]"));
		}catch (Exception e){
			throw(e);
		}
		return element;
	}



	public static WebElement link_Home() throws Exception{
		try{

			element = driver.findElement(By.xpath("//a[contains(.,'Home')]"));
		}catch (Exception e){
			throw(e);
		}
		return element;
	}


	public static WebElement link_Music() throws Exception{
		try{
			element = driver.findElement(By.xpath ("//a[contains(.,'Music')]"));
		}catch (Exception e){
			throw(e);
		}
		return element;
	}	  




	public static WebElement txtbx_Search() throws Exception{
		try{
			element = driver.findElement(By.id("edit-keys"));
		}catch (Exception e){
			throw(e);
		}
		return element;
	}	  	  


	public static WebElement btn_Search() throws Exception{
		try{
			element = driver.findElement(By.id("edit-submit"));
		}catch (Exception e){
			throw(e);
		}
		return element;
	}	  	  

	public static WebElement link_CreateArtcle() throws Exception{
		try {
			element = driver.findElement(By.xpath("//a[@href='/uc/node/add/article']"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return element;


	}




	public static WebElement link_Computing() throws Exception{
		try{
			element = driver.findElement(By.xpath ("//a[@href='/uc/computing']"));
		}catch (Exception e){
			throw(e);
		}
		return element;
	}	  

	public static WebElement link_Login() throws Exception{
		BrowserUtils.waitForElementToBeReady("xpath", "//a[@href='/uc/user/login']");
		try {
			element = driver.findElement(By.xpath("//a[@href='/uc/user/login']"));
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return element;
	}


	public static WebElement link_ShortcutsToggle() throws Exception{
		try {
			if ( !driver.findElement(By.xpath("//a[@href='/uc/node/add/article']")).isDisplayed() ) {
				driver.findElement(By.id("toolbar-item-shortcuts")).click();  
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return element;
	}


}


