package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alert_assignment1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
//		driver.findElement(By.id("alertButton")).click();
//		driver.switchTo().alert().accept();
		
//		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//
		driver.findElement(By.id("timerAlertButton")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Alert alert1;
		alert1 = wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
//		
//		driver.switchTo().alert().accept();
		
		
//		driver.findElement(By.id("confirmButton")).click();
//		//driver.switchTo().alert().accept();
//		Thread.sleep(3000);
//		driver.switchTo().alert().dismiss();
		
		
//		driver.findElement(By.id("promtButton")).click();
//		
//		driver.switchTo().alert().sendKeys("AMEY");
//		
//		driver.switchTo().alert().accept();
		
		
	}


}
