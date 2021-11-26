package testNgDemo;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.*;

public class codility {
	WebDriver webdriver;

	@BeforeMethod
	public void b() {
		WebDriverManager.chromedriver().setup();
		webdriver = new ChromeDriver();
		webdriver.get(
				"https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_search/6f03f4361b080eeb747193aadd94cd2b/static/attachments/reference_page.html");

	}

	@Test()
	public void a() throws InterruptedException {

		webdriver.findElement(By.id("search-input")).sendKeys("isla");
		webdriver.findElement(By.id("search-button")).click();
		Thread.sleep(3000);
		List<WebElement> list = webdriver.findElements(By.id("search-results"));
		Assert.assertTrue(list.size() >= 1);

	}

	@Test()
	public void d() {
		webdriver.findElement(By.id("search-input")).sendKeys("castle");
		webdriver.findElement(By.id("search-button")).click();
		boolean a = webdriver.findElement(By.id("error-no-results")).isDisplayed();// getText();
		// String b="No results";
		// Assert.assertEquals(a, b);
		Assert.assertTrue(a);

	}

	@Test()
	public void e() throws InterruptedException {
		webdriver.findElement(By.id("search-input")).sendKeys("Port Royal");
		webdriver.findElement(By.id("search-button")).click();
		List<WebElement> list = webdriver.findElements(By.id("search-results"));
		//Thread.sleep(3000);
		Assert.assertTrue(list.size() == 1);
	}

	@Test
	public void g() {
		boolean a = webdriver.findElement(By.id("search-input")).isDisplayed();
		boolean b = webdriver.findElement(By.id("search-button")).isDisplayed();
		Assert.assertTrue(a);
		Assert.assertTrue(b);
	}

	@Test
	public void h() {

		webdriver.findElement(By.id("search-button")).click();
		boolean a = webdriver.findElement(By.id("search-results")).isDisplayed();
		Assert.assertTrue(a);
	}

}
