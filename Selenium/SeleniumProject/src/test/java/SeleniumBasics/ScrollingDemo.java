package SeleniumBasics;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class ScrollingDemo {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();//will maximize the output window
	        driver.get("https://www.amazon.in/");
	        JavascriptExecutor js = (JavascriptExecutor) driver;//typecasting because of diff interface
//	        js.executeScript("window.scrollBy(0,1000)");//will scroll from 0 to 1000pixels
//	        Thread.sleep(2000);
//	        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");//for scrolling to bottom of the page
	        
	        WebElement element = driver.findElement(By.xpath("//img[@alt='Printers']"));//This scrolling is used for scrolling to a particular element
	        js.executeScript("arguments[0].scrollIntoView();",element);
	        Thread.sleep(2000);
	        driver.quit();
	}

}
//*[@id="fntnjGHjylmIrk2hrqCSGg"]/div[2]/div/ul/li[2]/span/a/div[1]/div/img