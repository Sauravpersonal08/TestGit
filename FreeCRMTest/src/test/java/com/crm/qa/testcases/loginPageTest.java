package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class loginPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	
	 public loginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initilizationMethod();
		loginpage=new LoginPage();	
		}
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}
	
	@Test
	public void LoginPageTitleTest() {
		String title=loginpage.validateloginpagetitle();
		Assert.assertEquals(title, "#1 Free CRM software in the cloud for sales and service");
		
	}
	
	@Test
	public void crmloginlogo() {
		Boolean value=loginpage.validatecrmlogo();
		Assert.assertTrue(value);
	}
	
	@Test
	public void loginTest() {
		homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		
	}
	
	

}
