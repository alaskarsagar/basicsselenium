package com.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {    
	
	public WebDriver driver;
	
	// 1 2 3 4 5
	// driver.findElement(By.id("email"));
	
	public LoginPage(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(id = "email")
	private WebElement uname;

	@FindBy(id = "password")
	private WebElement pass;

	@FindBy(xpath = "//*[@id=\"form\"]/div[3]/div/button")
	private WebElement clickBtn;
	
	
	@FindBy(partialLinkText="Resister")
	private List <WebElement> links;
	
	

	public void enterUname(String text) {

		uname.sendKeys(text);
	}
	
	

	public void enterPass(String text) {

		pass.sendKeys(text);
	}
	
	

	public void clickLoginButton() {
		
		clickBtn.click();
	}
	
	
	public DashboardPage validLogin() {
		
		enterUname("kiran@gmail.com");
		enterPass("123456");
		clickLoginButton();
		return new DashboardPage(driver);
		
		}
	
	
	
	
}
