package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.ArgumentHandler.Factory;

public class LoginPage extends TestBase {
	
	@FindBy(id="txtUsername") WebElement user1;
	@FindBy(id="txtPassword") WebElement pass1;
	@FindBy(name="Submit") WebElement login;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}
	

	public String validateTitle() {

		return driver.getTitle();
	}

	public DashBoardPages validateLogin(String a,String b) {
		
		
//		driver.findElement(By.id("txtUsername")).sendKeys(a);
//		driver.findElement(By.name("txtPassword")).sendKeys(b);
//		driver.findElement(By.name("Submit")).click();
//		return new DashBoardPages();
//		            OR
		user1.sendKeys(a);
		pass1.sendKeys(b);
		login.click();
		
		
		
		return new DashBoardPages();
		
		
	}

	
}