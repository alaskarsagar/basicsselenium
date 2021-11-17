package basicsselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitDemo {

	public static void main(String[] args) {

		seleniumwait();
	}

	public static void seleniumwait() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Implicit Waits
		
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		// driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation step
		// by step");
		// driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.RETURN);

		
		//Explicit Waits
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("abcd")));
		driver.findElement(By.id("abcd")).click();
		

		// driver.close();
		// driver.quit();

	}

}
