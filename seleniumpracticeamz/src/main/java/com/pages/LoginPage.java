package com.pages;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;

import com.base.TestBase;

public class LoginPage extends TestBase {


	public String validateTitle() {

		return driver.getTitle();
	}
	
	public String validateLogin() throws InterruptedException {
		
		driver.findElement(By.id("nav-link-accountList")).click();
		driver.findElement(By.id("ap_email")).sendKeys("9226595335");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Amey@1999");
		driver.findElement(By.id("auth-signin-button")).click();
		
		Thread.sleep(3000);
		
		String a=driver.getCurrentUrl();
		
		System.out.println(a);
		return a;
		
	}
	
	
	public boolean validateAddressDisplay()
	{
		boolean add=driver.findElement(By.id("nav-global-location-popover-link")).isDisplayed();
		return add;
	}
}
