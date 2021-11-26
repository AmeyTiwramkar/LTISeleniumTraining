package testNgDemo;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//import org.junit.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.*;



	

public class codility1 {
	WebDriver webdriver;
	@BeforeMethod
	 public  void setup() {
	 WebDriverManager.chromedriver().setup();
	 webdriver=new ChromeDriver();
	 webdriver.get("https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_login_page/9a83bda125cd7398f9f482a3d6d45ea4/static/attachments/reference_page.html");
	 }
	
	@Test
	    public void e() throws InterruptedException{
		webdriver.findElement(By.id("login-button")).click();
		String mail = webdriver.findElement(By.xpath("//*[@id=\"messages\"]/div[1]")).getText();
		String pass = webdriver.findElement(By.xpath("//*[@id=\"messages\"]/div[2]")).getText();
		Assert.assertEquals(mail,"Email is required");
		Assert.assertEquals(pass,"Password is required");
	    

	    }
}	