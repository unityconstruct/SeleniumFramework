package com.uc.test.selenium.pageactions;

import com.uc.test.selenium.pageobjects.Home_Page;

public class Home_Actions {

	
    public static void Execute(int iTestCaseRow) throws Exception{
	

    	// Here we are sending the UserName string to the UserName Textbox on the LogIN Page
    	// This is call Page Object Model (POM)
    	// For use of POM, please see http://www.toolsqa.com/page-object-model/
        //Home_Page.txtbx_Username().sendKeys(sUserName);
    	Home_Page.link_Home().click();
    	Home_Page.link_Music().click();
    	

        
    }
    
    
    
    
}
