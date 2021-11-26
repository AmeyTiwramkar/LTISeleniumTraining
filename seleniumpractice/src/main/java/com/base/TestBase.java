package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
public static WebDriver driver;
public static Properties prop;

public TestBase() {
	prop = new Properties();
try {
	FileInputStream fis=new FileInputStream("./src/main/java/com/config/config.properties");
	prop.load(fis);
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
	public static void setup() {
		String browser=prop.getProperty("browser");
		String url=prop.getProperty("url");
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(browser.equals("ie"))
		{
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		}
		driver.get(url);
		
		
	}
	
	public static void closesetup(){
		driver.quit();
	}

}
