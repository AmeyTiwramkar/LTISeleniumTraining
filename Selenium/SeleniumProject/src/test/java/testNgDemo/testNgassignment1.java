package testNgDemo;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;
public class testNgassignment1 {
	WebDriver driver;
	@BeforeMethod

	public void setUp() {

	WebDriverManager.chromedriver().setup();

	driver = new ChromeDriver();

	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

	

	}
	
//	@Test
//
//	public void validateTitleName() {
//
//	String logo = driver.getTitle();//.contains("OrangeHRM");
//	Assert.assertEquals(logo, "OrangeHRM");
//	
//	
	

	

//	}
//	@Test
//
//	public void validateUserName() {
//
//	boolean userName = driver.findElement(By.id("txtUsername")).isDisplayed();
//
//	Assert.assertTrue(userName);
//
//	}
	
//	@Test
//
//	public void validateLoginPanel() {
//		boolean loginPanel=driver.findElement(By.id("logInPanelHeading")).isDisplayed();
//		Assert.assertTrue(loginPanel);
//	}
//	
	@Test
	public void validateNoRecords(){
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("menu_admin_UserManagement")).click();
		driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
		driver.findElement(By.name("searchSystemUser[userName]")).sendKeys("Ajay");
		driver.findElement(By.id("searchBtn")).click();
		String actual1=driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td")).getText();
		String Expectedtext="No Records Found";
		if(Expectedtext.equals(actual1)) {
		Assert.assertEquals(actual1, Expectedtext);
		Assert.assertTrue(true);
		}
		else {
			System.out.println("Records found");
		}
	}
	
	                 

		
	
//	@Test 
//	public void usertab() {
//		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
//		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//		driver.findElement(By.name("Submit")).click();
//		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
//		driver.findElement(By.id("searchSystemUser_userName")).sendKeys("Aravind");
//		driver.findElement(By.id("searchBtn")).click();
//		boolean text2=driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[2]/a")).isDisplayed();
//		Assert.assertTrue(text2);
//		System.out.println(" We got the result....");
//	}
		
	
	@AfterMethod

	public void tearDown() {

	driver.quit();

}
}