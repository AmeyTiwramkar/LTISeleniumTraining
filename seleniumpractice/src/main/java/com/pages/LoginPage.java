package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage extends TestBase{
	
	public LoginPage() {
	PageFactory.initElements(driver, this);
	
	}
	@FindBy(id="txtUsername") WebElement user;
	@FindBy(id="txtPassword") WebElement pass;
	@FindBy(name="Submit") WebElement login;
	
	
	public String validateTitle() {
		
		return driver.getTitle();
		}
	
	public DashBoardPage validateLogin(String username,String password) {
		
//		driver.findElement(By.id("txtUsername")).sendKeys(username);
//		driver.findElement(By.name("txtPassword")).sendKeys(password);
//		driver.findElement(By.name("Submit")).click();
		
		user.sendKeys(username);
		pass.sendKeys(password);
		login.click();
		return new DashBoardPage();
		 
		
		
		
	}

}
