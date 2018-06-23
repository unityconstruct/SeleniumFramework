package com.uc.test.selenium.util;


public class Constant {

    public static final String URL = "https://www.unityconstruct.org";
    public static final String Username = "super";
    public static final String Password ="2wire";
	//public static final String Path_TestData = ".//src//TestData/";
	public static final String Path_TestData = ".//src//com//uc//test//selenium//tests//testdata//TestData.xlsx";
	public static final String File_TestData = "TestData.xlsx";
	public static final String Path_TestData2 = "W:\\w\\svn\\SeleniumFramework\\src\\com\\uc\\test\\selenium\\tests\\testdata\\TestData.xlsx";
	//public static final String Path_log4j = ".//src//com//uc//test//selenium//tests//testdata//log4j2b.xml";
	public static final String Path_log4j = ".//src//log4j2.xml";
	

	// XPATH Library
	public enum LoginPageElements	{
		LOGIN_TXT_USERNAME ("//id="), 
		LOGIN_TXT_PASSWORD ("//id="),
		LOGIN_BTN_SUBMIT ("//id=");
		
		private String value;
		LoginPageElements(String value){
			this.value = value;
		}
				
		public String getValue() {
			return value;
		}
		
	}
	
	
	public enum Wtf
	{
		one("a"), 
		two("b"),
		three("c");
		
		private final String letter;
		Wtf(String letter){
			this.letter = letter;
		}
		
		private String letter() {return letter; }
		
		public String getLetter() {
			return letter();
		}
		
		
	}
	
	
	
	
	
	
	
	
	

	//Test Data Sheet Columns
	//	use .ordinal() to get its index for use as Col#
	
	public enum DataSheet
	{
		Col_TestCaseName,
		Col_URL,
		Col_UserName,
		Col_Password,
		Col_Browser,
		Col_Platform,
		Col_DUTSN,
		Col_TopMenu,
		Col_SubMenu,
		Col_Selection1,
		Col_Selection2,
		Col_Selection3,
		Col_Selection4,
		Col_DeviceSearch1,
		Col_DeviceSearch2,
		Col_DeviceSearch3,
		Col_DeviceSearch4,
		Col_DeviceSearch5,
		Col_DeviceView1,
		Col_DeviceView2,
		Col_DeviceView3,
		Col_DeviceView4,
		Col_DataSet1 ,
		Col_DataSet2,
		Col_DataSet3,
		Col_TopMenuVerify,
		Col_SubMenuVerify,
		Col_SectionNameVerify,
		Col_TopMenuPrep,
		Col_SubMenuPrep,
		Col_Selectionprep1,
		Col_Selectionprep2,
		Col_Selectionprep3,
		Col_APIPrep1,
		Col_APIPrep2,
		Col_APIPrep3,
		Col_Result;
		private int value;
		
		  public int getValue() {
			    return value;
			  }
	}
	
	public enum DBDataSheet
	{
		Col_TestCaseName,
		Col_DUTSN,
		Col_OUI,
		Col_DBHostURL,
		Col_DBUserName,
		Col_DBPassword,
		Col_DBService;
		private int value;
		
		  public int getValue() {
			    return value;
			  }
	}

	
	public static final String Path_ScreenShot = "./src/Screenshots/";
	
	
	
}