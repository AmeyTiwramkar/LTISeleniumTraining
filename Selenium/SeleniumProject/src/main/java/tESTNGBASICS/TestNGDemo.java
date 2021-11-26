package tESTNGBASICS;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TestNGDemo {

	WebDriver driver;

	@BeforeTest

	public void DoingConfiguration() {
		System.out.println("Configurations");

	}

	@BeforeMethod

	public void setUp() {
		// WebDriverManager.chromedriver().setup();
		// driver = new ChromeDriver();
		// driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}

	public void validateUserName() {
		// boolean userName = driver.findElement(By.id("txtUsername123")).isDisplayed();
		// Assert.assertTrue(userName);
	}

	@Test(priority = 2)
	public void validateHomePage() {
		System.out.println("Validating Home Page");
		//Assert.assertTrue(false);
	}

	@Test(priority = 1, groups = "smoke",dependsOnMethods="validateHomePage")
	public void validateLogin() {
		System.out.println("Validating Login");
		Assert.assertTrue(true);
	}

	@Test(priority = 3)
	public void resetPassword() {
		System.out.println("Reset Password Testing");

	}

	@Test(priority = 4,enabled=false)//enabled false means test case will not run
	public void skippingTC() {
		System.out.println("Skipping TC");

	}

	@Test(groups = "smoke")
	public void SmokeTC1() {
		System.out.println("Smoke TC 1");

	}

	@AfterMethod
	public void tearDown() {
		// driver.quit();

	}

}
