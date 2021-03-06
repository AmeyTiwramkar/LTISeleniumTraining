package StepDefination;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageSetDef {

	WebDriver driver;

//we have to convert each line in feature file

//to a method 

	@Given("User is on Login Page")

	public void user_is_on_Login_Page() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

	}

//	@When("User enters correct username")
//
//	public void user_enters_correct_username() {
//
//		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		}
	
	@When("User enters correct username as {string}")

	public void user_enters_correct_username(String username) {

		driver.findElement(By.id("txtUsername")).sendKeys(username);
		}

//	@When("User enters correct password")
//
//	public void user_enters_correct_password() {
//
//		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//
//	}
	
	@When("User enters correct password as {string}")

	public void user_enters_correct_password(String password) {

		driver.findElement(By.id("txtPassword")).sendKeys(password);

	}
	

    @When("^User enters username as  (.+)$")
    public void user_enters_username_as(String username) throws Throwable {
    	//driver.findElement(By.id("txtUsername")).sendKeys(username);
        throw new PendingException();
    }

    @And("^User enters password as (.+)$")
    public void user_enters_password_as(String password) throws Throwable {
    	//driver.findElement(By.id("txtPassword")).sendKeys(password);
    	
        throw new PendingException();
    }
	
	

	@Then("User should be logged in successfully")

	public void user_should_be_logged_in_successfully() {

		driver.quit();

	}

	@When("User enters incorrect username")

	public void user_enters_incorrect_username() {

		driver.findElement(By.id("txtUsername")).sendKeys("Admin_test");

	}

	@When("User enters incorrect password")

	public void user_enters_incorrect_password() {

		driver.findElement(By.id("txtPassword")).sendKeys("admin123_test");

	}

	@Then("User should not be allowed to logged in")

	public void user_should_not_be_allowed_to_logged_in() {

		driver.quit();

	}

}
