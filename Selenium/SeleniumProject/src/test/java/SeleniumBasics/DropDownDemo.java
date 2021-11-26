package SeleniumBasics;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		
		WebElement fruitsDropDwon = driver.findElement(By.id("fruits"));
	
		
		Select select = new Select(fruitsDropDwon);// for handling drop down we create object of select
		List<WebElement> options = select.getOptions();//Storing the values of drop down menu in list named option
		
		for (WebElement webElement : options) {// for each loop for printing the name of elements in drop down menu

			System.out.println(webElement.getText());

			}
		
		
		//select.selectByValue("orange");
		select.selectByIndex(1);

		 

		//select.selectByValue("orange");

		//select.selectByVisibleText("Grape");


	}

}
