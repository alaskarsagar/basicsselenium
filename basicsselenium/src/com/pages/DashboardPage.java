package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	WebDriver driver;
	@FindBy(xpath="/html/body/div[1]/aside/section/ul/li[3]/a/span")
	private WebElement users; 
	
	public DashboardPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public UserPage clickUsers() {
		users.click();
		return new UserPage(driver);
		
	}

}
