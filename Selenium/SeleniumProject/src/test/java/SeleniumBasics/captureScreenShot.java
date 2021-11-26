package SeleniumBasics;
import java.io.File;
import java.io.IOException;
//import java.util.concurrent.TimeUnit;
 
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
import io.github.bonigarcia.wdm.WebDriverManager;

public class captureScreenShot {

	public static void main(String[] args) throws IOException {
		System.out.println(1);
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");	
        TakesScreenshot ts = (TakesScreenshot) driver; //typecasting because web driver and Screenshot method is of diff interface
        File screenshot = ts.getScreenshotAs(OutputType.FILE);//Storing the SS in variable name screenshot with datatype as File
        FileUtils.copyFile(screenshot, new File("./src/test/java/Screenshots12/pic2345.png"));//give the path and name of the file pic12.png is name of file
        driver.quit();
	}

}
