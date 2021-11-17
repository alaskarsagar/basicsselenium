package basicsselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtilityCode {
      public static WebDriver getOpenedBrowser() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		System.out.println("1");

		WebDriver wd = new ChromeDriver();
		System.out.println("2");
		return wd;
	}

	public static void openedURL(WebDriver driver, String url) {
		driver.get(url);
		System.out.println("3");
	}

	public static void enterText(WebDriver driver, String locatorName, String locatorValue, String dataToEnter) {

		if (locatorName.contentEquals("id")) {
			driver.findElement(By.id(locatorValue)).sendKeys(dataToEnter);
			System.out.println("4");

		} else if (locatorName.contentEquals("name")) {
			driver.findElement(By.name(locatorValue)).sendKeys(dataToEnter);
			System.out.println("5");

		} else if (locatorName.contentEquals("xpath")) {
			driver.findElement(By.xpath(locatorValue)).sendKeys(dataToEnter);
			System.out.println("6");
			}
	}
       public static void clickButton(WebDriver driver, String locatorName, String locatorValue) {
		if (locatorName.contentEquals("id")) {
			driver.findElement(By.id(locatorValue)).click();
			System.out.println("7");
		} else if (locatorName.contentEquals("name")) {
			driver.findElement(By.name(locatorValue)).click();
			System.out.println("8");

		} else if (locatorName.contentEquals("xpath")) {
			driver.findElement(By.xpath(locatorValue)).click();
			System.out.println("9");
          }
		}
	}
