package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//td[@class='headertext'][1]")
	WebElement usernamelabel;
	
	
	@FindBy(xpath="//a[@title='Contacts']")
	WebElement contacts;
	
	
	@FindBy(xpath="//a[@title='Deals']")
	WebElement deals;
	
	@FindBy(xpath="//a[@title='Tasks']")
	WebElement tasks;
	
	@FindBy(xpath="//a[@title='New Contact']")
	WebElement newcontacts;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public ContactsPage ClickContact() {
		contacts.click();
		return new ContactsPage();
	}
	
	public DealsPage clickDeals() {
		deals.click();
		
		return new DealsPage();
	}
	
	public TasksPage clickTasks() {
		tasks.click();
		return new TasksPage();
	}
	
	public Boolean usernameLabel() {
		return usernamelabel.isDisplayed();
	}
	
	public void clickOnNewContact() {
		Actions action= new Actions(driver);
		action.moveToElement(contacts).build().perform();
		newcontacts.click();
	}
	

}
