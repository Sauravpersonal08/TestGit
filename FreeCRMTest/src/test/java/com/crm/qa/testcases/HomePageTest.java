package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	
	HomePage homepage;
	ContactsPage contactpage;
	LoginPage loginPage;
	TestUtil test;
	
	
	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initilizationMethod();
		loginPage= new LoginPage();
		test= new TestUtil();
		homepage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
		
	}
	
	@Test
	public void verifyTitleHome() {
		String homepagetitle= homepage.verifyHomePageTitle();
		Assert.assertEquals(homepagetitle, "CRMPRO");
		
	}
	
	@Test
	public void verifyLoginLabel() {
		test.switchFrame();
		Boolean flag=homepage.usernameLabel();
		Assert.assertTrue(flag);
	
}
	@Test
	public void verifyContactClick() {
		test.switchFrame();
		contactpage=homepage.ClickContact();
	}


}
