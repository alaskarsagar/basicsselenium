package basicsselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestOnWrongPassword {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/SAGAR%20ALASKAR/AppData/Local/Temp/Offline%20Website/Offline%20Website/index.html");
		System.out.println("1");
		
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		
		String password_error= driver.findElement(By.id("password_error")).getText();
		System.out.println("Error message >>"+password_error);
		System.out.println();
		
		//test password_error show correct or not
		
		System.out.println("Test to check password Error Message");
		System.out.println("----------------------------");
		
		if(password_error.equals("Please enter password 123456")) {
			
			System.out.println("Result >>"+"TestPassed");
		}else{
			System.out.println("Result >>"+"TestFailed");
		}
		driver.close();
		
		

	}

}
