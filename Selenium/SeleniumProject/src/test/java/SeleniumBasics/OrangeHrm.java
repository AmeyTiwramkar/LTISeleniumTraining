package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrm {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[2]/input")).sendKeys("Admin");//Full Xpath
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");//Partial Xpath
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		//driver.findElement(By.name("Submit")).click();
		//driver.findElement(By.linkText("Forgot your password?")).click();//we have to type the exact match if one word misses it will show error
		//driver.findElement(By.partialLinkText("Forgot your pas")).click();//we dont have to type exact match because it is matching link test
		driver.quit();
		
		/*
		 * Locators available
		 * id
		 * name
		 * tagname
		 * class
		 * css
		 * xpath
		 * 
		 * For link/URL
		 * link text
		 * partial link test
		 */
	}

}
