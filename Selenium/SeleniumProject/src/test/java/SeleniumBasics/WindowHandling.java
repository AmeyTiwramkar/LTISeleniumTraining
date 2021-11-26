package SeleniumBasics;

import java.util.Iterator;
import java.util.List;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		System.out.println(driver.getTitle());
		String parentWindow = driver.getWindowHandle();

		System.out.println("Parent window id is " + parentWindow);

		driver.findElement(By.id("button1")).click();
		
		Set<String> handles =  driver.getWindowHandles();
		System.out.println(handles);// in handles of all the open windows is stored
		
		Iterator<String> itr = handles.iterator(); //iterator is used to iterate the handles string and get the childwindow id.

		itr.next();

		String childWindow = itr.next();
		System.out.println("Child Window id is "+ childWindow);
		
		//switching between windows

		driver.switchTo().window(childWindow);

		 

		System.out.println(driver.getTitle());

		driver.switchTo().window(parentWindow);

		System.out.println(driver.getTitle());

		
	}

}
