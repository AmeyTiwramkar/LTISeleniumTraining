package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.base.TestBase;
import com.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	
LoginPage lp;
	
	
	@BeforeMethod
	public void setup() {
		initialization();
		lp = new LoginPage();
	}
	
	@BeforeTest
	public void Reportsetup() {
		ExtentReportSetup();
	}
	
	@Test()
	public void validateTitleTest() {
		ExtentTest test = extent.createTest("AmazonTitleTestCase");
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualTitle = lp.validateTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		test.log(Status.PASS, "ValidateTitleTestCasePassed");

}
	
	@Test
	public void validateLogin() throws InterruptedException {
		ExtentTest test = extent.createTest("AmazonLoginTestCase");
		
		String expectedurl="https://www.amazon.in/?ref_=nav_ya_signin&";   
		String actualurl=lp.validateLogin();
		Assert.assertEquals(actualurl, expectedurl);
		test.log(Status.PASS, "ValidateLoginTestCasePassed");
		
		
	}
	
	@Test
	public void validateAddressDisplayTest()
	{
		ExtentTest test = extent.createTest("AmazonAddressTestCase");
		Assert.assertTrue(lp.validateAddressDisplay());
		test.log(Status.PASS, "ValidateAddressTestCasePassed");
	}
	
	@AfterTest
	public void GenerateReport() {
		CloseReportSetup();
	}
	
	@AfterMethod
	public void close1() {
		close();

	}
}