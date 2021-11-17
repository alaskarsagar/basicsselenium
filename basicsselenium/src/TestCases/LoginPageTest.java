package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utility.LoginPage;

public class LoginPageTest {
	
	
     WebDriver driver;
     
	LoginPage obj1 = new LoginPage();

	@Test(priority = 1)
	public void VerifyURL() {
	obj1.EnterURL("file:///C:/java%20App/Offline%20Website/Offline%20Website/index.html");
	String title=driver.getTitle();
	System.out.println(title);
	String expTitle="JavaByKiran | Log in";
		
		Assert.assertEquals(title,expTitle );
	}

	@Test(priority = 2)
	public void VerifyUserTextBox() {
	WebElement element=	obj1.getUserTextBox();
	boolean actual=element.isEnabled();
	boolean expected=true;
	Assert.assertEquals(actual, expected);
	element.sendKeys("kiran@gmail.com");
}

	@Test(priority = 3)
	public void VerifyPasswordTextBox() {
		obj1.enterPassword("123456");
	}

	@Test(priority = 7)
	public void VerifyclickButton() {
		obj1.clickButton();
	}

	@Test(priority = 8)
	public void getDashBoardPage() {

	}

	@Test(priority = 9)
	public void Back() {
		obj1.backToLoginPage();
	}

	@Test(priority = 4)
	public void VerifyImage() {
		obj1.getImage();
	}

	@Test(priority = 5)
	public void VerifyHeading() {
		obj1.getHeadingOfLoginBox();
	}

	@Test(priority = 6)
	public void VerifyLogo() {
		obj1.displayLogo();
	}

	@Test(priority = 10)
	public void VerifyregisterLink() {
		obj1.getResisterLink();
		obj1.backToLoginPage();

	}



}	
	