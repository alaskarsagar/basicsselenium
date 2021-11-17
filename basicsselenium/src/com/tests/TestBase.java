package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import com.pages.LoginPage;

public class TestBase {
	
	public static WebDriver driver;
	
	
	public WebDriver initialization() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/java%20App/Offline%20Website/Offline%20Website/index.html");
		
		return driver;
		}
	

}
