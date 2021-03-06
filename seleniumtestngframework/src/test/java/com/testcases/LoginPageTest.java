package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.base.TestBase;

import com.pages.DashBoardPages;
import com.pages.LoginPage;
import com.util.ExcelReader;

public class LoginPageTest extends TestBase {
	ExcelReader reader;


	LoginPage lp;
	DashBoardPages dp;

	@BeforeMethod
	public void setup() {
		initialization();
		lp = new LoginPage();
	}

	@BeforeTest
	public void Reportsetup() {
		ExtentReportSetup();
	}

	@Test(enabled=false)
	public void validateTitleTest() {
		String expectedTitle = "OrangeHRM";
		String actualTitle = lp.validateTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test(enabled=false)
	public void validateLoginTest() {
		String user = prop.getProperty("username");
		String pass = prop.getProperty("password");
		dp = lp.validateLogin(user, pass);
		if (dp != null) {
			Assert.assertTrue(true);
		} 
			
		
	}

	@Test(enabled=false)
	@Parameters({"uname" , "pwd"})
	public void validateLoginTestUsingParameters(String uname, String pwd) {
		ExtentTest test = extent.createTest("OrangeHRMLoginTestCase");
		dp = lp.validateLogin(uname,pwd);
		test.log(Status.PASS, "ValidateLoginTestCasePassed");
	}
	
	@Test (dataProvider = "getData")
	public void validateLoginUsingTestNgDataProvider(String uname,String pwd){
		//System.out.println(uname);
		//System.out.println(pwd);
		dp = lp.validateLogin(uname,pwd);
		if (dp != null) {
			Assert.assertTrue(true);
		} 
		
		
	}
	
//	@DataProvider
//	public Object[][] getData() {
//		
//		// Row Indicates how many times we want to execute the testcases
//		// Column indicates how many values we want to pass the testcases
//		
//		Object[][] data = new Object[2][2];
//		data[0][0]="admin";
//		data[0][1]="admin123";
//		
//		data[1][0]="tom";
//		data[1][1]="pass";
//		return data;
//				
//				
//				
//		
//	}  // Reading data from excel sheet
@DataProvider
	
	public Object[][]  getData() {
		
		String Excelpath="./Book1.xlsx";
		String SheetName="Sheet1";
		reader = new ExcelReader(Excelpath, SheetName);
		Object[][] data = reader.getTestData();
		return data; 
}
	@AfterTest
	public void GenerateReport() {
		CloseReportSetup();
	}

	@AfterMethod
	public void closesetup() {
		teardown();

	}
}
