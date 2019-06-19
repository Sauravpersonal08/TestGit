package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactPageTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	ContactsPage contactpage;
	TestUtil test;
	
	public ContactPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initilizationMethod();
		test =new TestUtil();
		loginpage= new LoginPage();
		homepage= new HomePage();
		homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		test.switchFrame();
		homepage.ClickContact();	
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();		
	}
		
//	@Test
//	public void verifyContactTitle() {
//		Boolean  flag=contactpage.verifyContactLabel();
//		Assert.assertTrue(flag);
//		
//	}
//	
//	@Test
//	public void verifyContactsList() {
//		contactpage.verifyContacts("Saurabh Bhattacharya");
//	}
	
	@Test
	public void validateCreateNewContact() {
		homepage.clickOnNewContact();
		contactpage.createNewContact("Mr.", "Suarav12", "Peter", "Infosys");
	}

}
