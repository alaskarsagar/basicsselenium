package basicsselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestOnBlankUserName {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/SAGAR%20ALASKAR/AppData/Local/Temp/Offline%20Website/Offline%20Website/index.html");
		System.out.println("1");
		
       driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
	   System.out.println();
		
		//Test to check If user name is blank 
		
		System.out.println("Test to check If user name is blank ");
		System.out.println("--------------------------------------");
		
		String emailerror=driver.findElement(By.id("email_error")).getText();
		System.out.println("ErrorMessage >>"+emailerror);
		System.out.println();
       if(emailerror.equals("Please enter email")) {
			
			System.out.println("Result >>  "+"TestPassed");
		}else{
			System.out.println("Result >>  "+"TestFailed");
		}
		driver.close();
		
		

	}

}
