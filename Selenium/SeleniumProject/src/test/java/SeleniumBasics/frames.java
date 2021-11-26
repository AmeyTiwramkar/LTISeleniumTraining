package SeleniumBasics;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class frames {

	public static void main(String[] args) throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.get("http://the-internet.herokuapp.com/iframe");
//		List<WebElement> frames =  driver.findElements(By.tagName("iframe"));//creating a list of all the frames present in the window
//		System.out.println(frames);
//		System.out.println(frames.size());// to see how many frame are there in window 
//		driver.switchTo().frame(0);// to access the frame through index because all the frames are stored in list called as WebElements
//		driver.findElement(By.id("tinymce")).clear(); 
//		driver.findElement(By.id("tinymce")).sendKeys("Ajay");
//		Thread.sleep(3000);
//		driver.switchTo().parentFrame();
//
//		driver.quit();
		
		//ANOTHER METHOD BY FINDIND ELEMENTS
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/iframe");
//		List<WebElement> frames =  driver.findElements(By.tagName("iframe"));//this will give all the frame ids present in the window
//		System.out.println(frames);
//		System.out.println(frames.size());
		WebElement frame=  driver.findElement(By.id("mce_0_ifr"));// this is the frame id which we required and we find it by inspecting the element(paragraph where Ajay is written) in which we have to enter the data and see in which frame the element is there and then copy the id of that particular frame
		//driver.findElement(By.className("tox-icon tox-tbtn__icon-wrap")).click();
		
		System.out.println(frame);

		driver.switchTo().frame(frame);// to switch from parent window to frame which we required

		driver.findElement(By.id("tinymce")).clear();
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div[2]/div[1]/iframe")).clear();
		driver.findElement(By.id("tinymce")).sendKeys("Ajay");

		Thread.sleep(3000);

		driver.switchTo().parentFrame();

		//driver.quit();
		
		
	}

}
