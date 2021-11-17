package basicsselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/SAGAR%20ALASKAR/AppData/Local/Temp/Offline%20Website/Offline%20Website/index.html");
		System.out.println("page 1 open");
		
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		System.out.println("2 page open");
		
		driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a/span")).click();
		System.out.println("3 page open");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();
		System.out.println("4 page open");
		
		driver.findElement(By.id("username")).sendKeys("swapnil@gmail.com");
		driver.findElement(By.id("mobile")).sendKeys("8698326199");
		driver.findElement(By.id("email")).sendKeys("swapnil@gmail.com");
		driver.findElement(By.id("course")).sendKeys("java");
		
		
		
		//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("12345678");
		
		
		
		
	}

}
