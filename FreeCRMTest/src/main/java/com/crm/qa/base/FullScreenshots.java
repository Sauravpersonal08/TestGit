package com.crm.qa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class FullScreenshots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ssp34\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://mypayflex-philly.payflex.com/SignIn/SignIn/Index/member");
		driver.findElement(By.xpath("//*[@id='signInUserName']")).sendKeys("fundalone1234");
		driver.findElement(By.xpath("//*[@id='signInPassword']")).sendKeys("test1234");
		driver.findElement(By.xpath("//*[@id='signInBtn']")).click();
		//driver.findElement(By.xpath("//*[@id=\"mainDiv\"]/div[3]/div[2]/div/div[3]/div/div/div[8]/div/div[1]/div/span[7]/a")).click();
		//Actions action = new Actions(driver);
		//action.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'Help & Support') and @class='setOutlineNone']"))).click();
		driver.findElement(By.xpath("//*[contains(text(),'Help & Support') and @class='setOutlineNone']")).click();
		Shutterbug.shootPage(driver).withName("testing").save();
		

	}

}
