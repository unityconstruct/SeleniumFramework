package com.uc.test.selenium.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import utility.TestLog;
//import utility.Constant;
//import utility.ExcelUtils;
//import utility.TestLog;





public class BrowserUtils {

	// this instance is for building up 'driver' with properties before passing to 
	//    PageBaseClass for use in tests 
	public static WebDriver driver = null;
	private static WebElement element;

	
	/**
	 * Returns a Webdriver object that has been pre-populated with applicable profile 
	 * This WebDriver is statically declared/called but returns a 'driver' object
	 * that will be instantiated with new by the rest of the framework
	 * <p>
	 * The non-static PageBaseClass will accept this returned WebDriver object
	 * and then create another 'driver' object that can use used by NON-STATIC
	 * methods 
	 *
	 * @return      WebDriver Object, ready for Firefox
	 * @throws		Exception if WebDriver can't be instantiated
	 * @see         WebDriver
	 * 
	 */
	
//	public static WebDriver OpenBrowser(int iTestCaseRow) throws Exception{
	public static WebDriver OpenBrowser() throws Exception{		
		String sBrowserName, sPlatform;
		try{
			sBrowserName = "Mozilla";
			sPlatform = "WINDOWS";

			if(sBrowserName.equalsIgnoreCase("Mozilla")){
				driver = CreateDriverFireFox(sPlatform);
			} else if(sBrowserName.equalsIgnoreCase("Chrome")){
				driver = CreateDriverFireFox(sPlatform);
			}
	
		} catch (Exception e) {
				throw(e);
		}
			return driver;
	} //end method

	
	
	private static WebDriver CreateDriverFireFox(String sPlatform) {
		// Configure Firefox for cookies acceptance
		FirefoxProfile profile = new ProfilesIni().getProfile("default");
		profile.setPreference("network.cookie.cookieBehavior", 0);

		if (sPlatform.equals("WINDOWS")){
			// Configure Firefox Gecko Driver
			// 0.20.0
			//System.setProperty("webdriver.gecko.driver","W:\\w\\Java\\lib\\Selenium.3.11.0\\SeleniumWebDrivers\\geckodriver\\geckodriver-v0.20.1-win64\\geckodriver.exe");
			// 0.19.1
			//System.setProperty("webdriver.gecko.driver","W:\\w\\tools\\SeleniumWebDrivers\\geckodriver\\geckodriver-v0.19.1-win64\\geckodriver.exe");
			System.setProperty("webdriver.gecko.driver","res\\geckodriver\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		}

		if (sPlatform.equalsIgnoreCase("LINUX")){
			// Configure Firefox Gecko Driver
			System.setProperty("webdriver.gecko.driver","res/geckodriver/geckodriver-v0.19.1-linux64/geckodriver.exe");
		}
		
		if (sPlatform.equalsIgnoreCase("MACOS")){
			// Configure Firefox Gecko Driver
			System.setProperty("webdriver.gecko.bin","/Applications/Firefox.app/Contents/MacOS/firefox-bin");
			System.setProperty("webdriver.gecko.driver","geckodriver");
		}

		// Create web driver
		driver = new FirefoxDriver();

		// driver = new FirefoxDriver();
//		TestLog.info("New driver instantiated");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		return driver;
	}
	
	private static WebDriver CreateDriverChrome(String sPlatform) {
		//Configure Chrome for cookies acceptance
		//ChromeProfile profile = new ProfilesIni().getProfile("default");
		//profile.setPreference("network.cookie.cookieBehavior", 0);

		if (sPlatform.equals("WINDOWS")){
			System.setProperty("webdriver.chrome.driver","res\\chromedriver\\chromedriver-v2.40.0-win64\\chromedriver.exe");
		}

		if (sPlatform.equalsIgnoreCase("LINUX")){
			// Configure Chrome Driver
			System.setProperty("webdriver.chrome.driver","res/chromedriver/chromedriver-v2.40.0-linux64/chromedriver.exe");
		}
		
		if (sPlatform.equalsIgnoreCase("MACOS")){
			// Configure Chrome Driver
			//System.setProperty("webdriver.gecko.bin","/Applications/Firefox.app/Contents/MacOS/firefox-bin");
			System.setProperty("webdriver.chrome.driver","chromedriver");
		}

		// Create web driver
		driver = new ChromeDriver();

//		TestLog.info("New driver instantiated");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		
		return driver;
	}

	public static void BrowserClose() {
		driver.close();
		driver.quit();		
	}

	public static void BrowserGet() {
		driver.get("http://www.unityconstruct.org");
	}
	
	public static void waitForElementToBeReady(String elType, String elTypeIdentifier) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		switch (elType) {
		case "xpath":
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(elTypeIdentifier)));	
			break;
		case "id":
			element = wait.until(ExpectedConditions.elementToBeClickable(By.id(elTypeIdentifier)));	
			break;
		default:
			break;
		}
	}
	
	public static void waitForPageToBeReady() 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//This loop will rotate for 100 times to check If page Is ready after every 1 second.
		//You can replace your if you wants to Increase or decrease wait time.
		for (int i=0; i<30; i++)
		{
			if (js.executeScript("return document.readyState").toString().equals("complete") ||
					js.executeScript("return document.readyState").toString().equals("complete")) 
					
			{ 
//				TestLog.info("waitForPageToBeReady - executeScript complete [or loaded]");
				break; 
			}
			try 
			{
//				TestLog.info("waitForPageToBeReady: Add Sleep time 1000 ms");
				Thread.sleep(1000);
			}catch (InterruptedException e) {} 
			//To check page ready state.
		}
	}
	
	
	
	
	
	
	
	
} //end class
