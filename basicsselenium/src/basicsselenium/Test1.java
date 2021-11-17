package basicsselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/SAGAR%20ALASKAR/AppData/Local/Temp/Offline%20Website/Offline%20Website/index.html");
		System.out.println("page 1 open");
		
		driver.findElement(By.id("email")).sendKeys("sghbhbbj");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		
		String errorshow=driver.findElement(By.xpath("//*[@id=\"email_error\"]")).getText();
		System.out.println(errorshow);
		
		if(errorshow.equals("Please enter email as kiran@gmail.com")) {
			
			System.out.println("correct errorMessage show");
		}else{
			System.out.println("wrong errorMessage show");
		}
	
		

	}

}
