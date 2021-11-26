package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class functions {


	public static void main(String[] args) {
		System.out.println(1);

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		String tagName = driver.findElement(By.id("logInPanelHeading")).getTagName();

		String text = driver.findElement(By.id("logInPanelHeading")).getText();

		System.out.println("Tag Name is "+tagName);

		System.out.println("Text is "+ text);

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");

		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

		driver.findElement(By.id("btnLogin")).click();

		String currentUrl = driver.getCurrentUrl();

		System.out.println(currentUrl);

		//System.out.println(driver.getPageSource());

		System.out.println(driver.getTitle());

		 

		driver.quit();
		

	}

}
