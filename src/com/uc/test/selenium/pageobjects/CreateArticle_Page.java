package com.uc.test.selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class CreateArticle_Page extends PageBaseClass {

	private static WebElement element = null;
	
	public CreateArticle_Page(WebDriver driver){
		super(driver);
	}
	
	public static String get_PageTitle() {
		return driver.getTitle();
	}
	
	public static WebElement txtbx_Title() {
		element = driver.findElement(By.id("edit-title-0-value"));
		return element;
	}
	
	public static WebElement txtbx_Body() {
		element = driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, Body field']"));
		//click into the iframe so text can be entered
		element.click();
		return element;
	}
	
	
	//
	public static WebElement txtbx_Tags() {
		element = driver.findElement(By.id("edit-field-tags-target-id"));
		return element;
	}
	

	/*
	@Then("^user moves to new contact page$")
	public void user_moves_to_new_contact_page() throws Throwable {	
	
	//move to frame ( view frame source )

//	wasn't working
//	driver.switchTo().frame("mainpanel");
	el = driver.findElement(By.xpath("//frame[@name='mainpanel']"));
	driver.switchTo().frame(el);
	
	//mouse over the menu item
	Actions action = new Actions(driver); //new action
	// findElement.... build action to MOVE to element.... 
	action.moveToElement(driver.findElement(By.xpath("//a[contains(.,'Contacts')]"))).build().perform();

//		wasn't working
//	driver.findElement(By.xpath("//a[contains(.,'New Contact']")).click();
	
	// THEN click
	action.moveToElement(driver.findElement(By.xpath("//a[contains(.,'New Contact')]"))).build().perform();

	el = driver.findElement(By.xpath("//a[contains(.,'New Contact')]"));
	el.click();
	
	
	}*/
	
}
