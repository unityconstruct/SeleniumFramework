package com.uc.test.selenium.bdd.definitions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.uc.test.selenium.pageobjects.CreateArticle_Page;
import com.uc.test.selenium.pageobjects.Home_Page;
import com.uc.test.selenium.pageobjects.Login_Page;
import com.uc.test.selenium.pageobjects.PageBaseClass;
import com.uc.test.selenium.util.BrowserUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateArticle_Definitions {
	WebDriver driver;
	WebElement element;
	
	
	//@Before
	public void getDriver() throws Exception {
		driver = BrowserUtils.OpenBrowser();
		new PageBaseClass(driver);
	}
	
	//@After
	public void closeBrowser() {
		driver.close();
	}
	
	
	
	
	
	@Given("^User is on home page$")
	public void user_is_on_home_page() throws Exception {
		driver = BrowserUtils.OpenBrowser();
		new PageBaseClass(driver);
		BrowserUtils.BrowserGet();
	}

	@When("^title of home page is correct$")
	public void title_of_home_page_is_correct() {
		String title = driver.getTitle();
		System.out.println(title);
		assertTrue("Checking if Home Page Title is Correct","UntyConstruct.org".equals(driver.getTitle()) );	    
	}

	@Then("^user clicks on LoginLink$")
	public void user_clicks_on_LoginLink() {
		try {
			Home_Page.link_Login().click();
		} catch (Exception e) {
			assertTrue("Home Page Login link wan't clicked", false);
		}
	    
	}

	@Then("^user enters username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enters_username_and_password(String username, String password) {
		try {
			Login_Page.txtbx_Username().sendKeys(username);
			Login_Page.txtbx_Password().sendKeys(password);
			Login_Page.btn_Login().click();
		} catch (Exception e) {
			assertTrue("Entering Login Credentials", false);
		}

	    
	}

	@Then("^user clicks new article link$")
	public void user_clicks_new_article_link() {
		try {
			Home_Page.link_ShortcutsToggle();
			Home_Page.link_CreateArtcle().click();
		} catch (Exception e) {
			assertTrue("Clicking new article link", false);
		}


	    
	}

	@Then("^user enters title \"([^\"]*)\" and body \"([^\"]*)\" and tags \"([^\"]*)\"$")
	public void user_enters_title_and_body_and_tags(String title, String body, String tags) {
	    
		try {
			CreateArticle_Page.txtbx_Title().sendKeys(title);
			CreateArticle_Page.txtbx_Body().sendKeys(body);
			CreateArticle_Page.txtbx_Tags().sendKeys(tags);
		} catch (Exception e) {
			e.printStackTrace();
			assertTrue("Entering New Article Info", false);
		}	    
	}

	
	@Then("^user closes browser$")
	public void user_closes_browser(){
		//driver.close();
		driver.quit();
		
	}
	
	
	public void container() {
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
	
}
