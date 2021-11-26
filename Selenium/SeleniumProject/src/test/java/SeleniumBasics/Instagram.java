//PRACTICE

package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Instagram {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();	//Used to launch chrome
		driver.get("https://www.instagram.com/accounts/login/");//Used to launch facebook on chrome
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.className(   "         qF0y9          Igw0E     IwRSH      eGOV_         _4EzTm    bkEs3                        "
				+ "  CovQj                  jKUp7          DhRcB ")).click();
		
	}

}
