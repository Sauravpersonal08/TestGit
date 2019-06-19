package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase() {
		
		
		try {
			prop= new Properties();
			FileInputStream ip= new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/crm"
					+"/qa/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException fnf) {
			fnf.printStackTrace();
	}
		catch (IOException e) {
			e.printStackTrace();
		}
	
	
}
	public static void initilizationMethod() {
		String Browser=prop.getProperty("browser");
		if(Browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","/Users/ssp34/Desktop/chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		else if(Browser.equalsIgnoreCase("Firefox")){
			System.setProperty("webdriver.chrome.driver","/Users/ssp34/Desktop/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		
		
	}
}
