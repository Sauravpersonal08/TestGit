package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {
	
	 public ContactsPage() {
		 PageFactory.initElements(driver, this);
	 }
	
	
	@FindBy(xpath="//*[@class='mainpanel']")
	WebElement contactLabel;
	
	@FindBy(xpath="//*[@id='first_name']")
	WebElement firstname;
	
	
	@FindBy(xpath="//*[@id='surname']")
	WebElement surname;
	
	@FindBy(xpath="//*[@name='client_lookup']")
	WebElement company;
	
	
	@FindBy(xpath="//input[@type='submit' and @class='button']")
	WebElement save;
	
	
	 
	 public boolean verifyContactLabel() {
		 return contactLabel.isDisplayed();
	 }
	 
	 
	 public void verifyContacts(String name) {
		 driver.findElement(By.xpath("//a[text()='\"+name+\"']//parent::td[@class='datalistrow']\"\r\n" + 
		 		"				+ \"//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();
	 }
	 
	 public void createNewContact(String title, String frstname, String srname, String cmpany) {
		 Select select=new Select(driver.findElement(By.name("title")));
		 select.selectByVisibleText(title);
		 
		 firstname.sendKeys(frstname);
		 surname.sendKeys(srname);
		 company.sendKeys(cmpany);
		 save.click();
		 
		 
		 
	 }
	

}
