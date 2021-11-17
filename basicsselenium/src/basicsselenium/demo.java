package basicsselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/SAGAR%20ALASKAR/AppData/Local/Temp/Offline%20Website/Offline%20Website/index.html");
		System.out.println("page 1 open");
		
		driver.findElement(By.id("email")).sendKeys("sghbhbbj");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		
		
	}
	

}
