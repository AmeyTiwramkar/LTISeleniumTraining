package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class alert {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		//driver.findElement(By.id("alert")).click();
		driver.findElement(By.partialLinkText("Alert")).click();
		String text = driver.switchTo().alert().getText();
		System.out.println(text);// it is used to get text of the alert that appears on the screen
		
		String textExpected="Please share this website with your friends and in your organization."; //if else is used to match both the strings.String stored in text and string stored in textExpected.
		if (text.contentEquals(textExpected)) {
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case fail");
		}
		Thread.sleep(3000); //used to slow down the below step to see the click
		driver.switchTo().alert().accept();	//to accept the alert
		driver.switchTo().alert().dismiss();//to dismiss the alert
	}

	
	

}
