

package com.testcase;

import static org.testng.Assert.assertEquals;

import org.apache.tools.ant.property.GetProperty;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.DashBoardPage;
import com.pages.LoginPage;

import junit.framework.Assert;

public class LoginPageTest extends TestBase{
	LoginPage lp;
	DashBoardPage dp;

	@BeforeMethod
	public  void setup1() {
		setup();
		lp = new LoginPage();
	
	}
	
	
	@Test
	public void validateTitle() {
		String actualTitle=lp.validateTitle();
		String expectedTitle="OrangeHRM";
		Assert.assertEquals(expectedTitle, actualTitle);
		
		
		
	}
	
	@Test
	public void validateLogin() throws InterruptedException {
		String username=prop.getProperty("username");
		String password=prop.getProperty("password");
		dp= lp.validateLogin(username, password);
		Thread.sleep(3000);
		if(dp!=null)
		{
			Assert.assertTrue(true);
			
		}
		else
			Assert.assertTrue(false);
		
		
	}
	
	@AfterMethod
	public void closeSetup(){
		closesetup();
		
	}
}
