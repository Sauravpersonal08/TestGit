package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//*[@type='submit']")
	WebElement signin;
	
	@FindBy(xpath="//*[@id=\"navbar-collapse\"]/ul/li[2]/a")
	WebElement signup;
	
	@FindBy(xpath="//*[@class='img-responsive'][1]")
	WebElement crmlogo;
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateloginpagetitle() {
		return driver.getTitle();
	}
	
	public boolean validatecrmlogo() {
		return crmlogo.isDisplayed();
		
	}
	
	public HomePage login(String us, String pwd) {
		username.sendKeys(us);
		password.sendKeys(pwd);
		signin.click();
		
		return new HomePage();
	}

}
