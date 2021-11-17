package Utility;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage {
	
	
	
	
	WebDriver driver;

	String email;

	public LoginPage() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		this.driver = new ChromeDriver();
	}

	public void getImage() {

		boolean actResult = driver.findElement(By.xpath("/html/body/div/center/img")).isDisplayed();
		Assert.assertEquals(actResult, true);

	}

	public void displayLogo() {

		boolean actResult = driver.findElement(By.xpath("/html/body/div/div[1]/a/b")).isDisplayed();
		Assert.assertEquals(actResult, true);
		String actText = driver.findElement(By.xpath("/html/body/div/div[1]/a/b")).getText();
		Assert.assertEquals(actText, "Java By Kiran");

	}

	public void getHeadingOfLoginBox() {

		boolean actResult = driver.findElement(By.xpath("/html/body/div/div[1]/a/h4")).isDisplayed();
		Assert.assertEquals(actResult, true);

		String actHeadingText = driver.findElement(By.xpath("/html/body/div/div[1]/a/h4")).getText();
		Assert.assertEquals(actHeadingText, "JAVA | SELENIUM | PYTHON");
	}

	public void EnterURL(String url) {
		driver.get(url);
	}

	public WebElement getUserTextBox() {
		return driver.findElement(By.id("email"));
			}

	public void enterPassword(String password) {

		if (password == "123456") {

			boolean actualresult = driver.findElement(By.id("password")).isEnabled();
			Assert.assertEquals(actualresult, true);
			driver.findElement(By.id("password")).sendKeys(password);
		}

		/*
		 * else if (password == "") {
		 * 
		 * String errorMesssge1 = driver.findElement(By.id("password_error")).getText();
		 * Assert.assertEquals(errorMesssge1, "Please enter password.");
		 * 
		 * } else {
		 * 
		 * String errorMesssge2 = driver.findElement(By.id("password_error")).getText();
		 * Assert.assertEquals(errorMesssge2, "Please enter password 123456");
		 * 
		 * }
		 */
	}

	public void clickButton() {

		boolean actualresult = driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).isEnabled();
		Assert.assertEquals(actualresult, true);
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
	}

	public void backToLoginPage() {

		driver.navigate().back();
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle, "JavaByKiran | Log in");
	}

	public void openedDashBoaredPage() {

		String title = driver.getTitle();
		Assert.assertEquals(title, "JavaByKiran | Dashboard");
	}

	public void getResisterLink() {

		boolean actIsDisplayed = driver.findElement(By.linkText("Register a new membership")).isDisplayed();
		Assert.assertEquals(actIsDisplayed, true);
		boolean actIsEnabled = driver.findElement(By.linkText("Register a new membership")).isEnabled();
		Assert.assertEquals(actIsEnabled, true);
        driver.findElement(By.linkText("Register a new membership")).click();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Registration Page");
	}

}


