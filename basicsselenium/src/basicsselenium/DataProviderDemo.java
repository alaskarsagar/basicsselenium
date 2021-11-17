package basicsselenium;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class DataProviderDemo {

	public static WebDriver driver = null;

	@BeforeSuite
	public void browserOpened() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test(dataProviderClass = DPclass.class, dataProvider = "loginData")
	public void login(String uName, String pass) {

		driver.get(
				"file:///C:/Users/SAGAR%20ALASKAR/AppData/Local/Temp/Offline%20Website/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
	    String title=driver.getTitle();
		Assert.assertEquals(title, "JavaByKiran | Dashboard");

	}

	@AfterSuite
	public void close() {

		driver.close();
	}

}
