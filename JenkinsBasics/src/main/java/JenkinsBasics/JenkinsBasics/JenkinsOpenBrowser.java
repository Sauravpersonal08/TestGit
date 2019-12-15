package JenkinsBasics.JenkinsBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class JenkinsOpenBrowser {
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ssp34\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://google.com");
		driver.quit();
	}

}
