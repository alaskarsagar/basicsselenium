package basicsselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResisterForNewMembership {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/SAGAR%20ALASKAR/AppData/Local/Temp/Offline%20Website/Offline%20Website/index.html");
		//System.out.println("1");
		
		boolean img = driver.findElement(By.xpath("/html/body/div/center/img")).isDisplayed();
		System.out.println(img);
		
		driver.findElement(By.linkText("Register a new membership")).click();
		//System.out.println("2");
		
		driver.findElement(By.id("name")).sendKeys("Swapnil");
		//System.out.println("3");
		
		driver.findElement(By.id("mobile")).sendKeys("9988776655");
		//System.out.println("4");
		
		driver.findElement(By.id("email")).sendKeys("swapnil@gmail.com");
		//System.out.println("5");
		
		driver.findElement(By.id("password")).sendKeys("9999999999");
		//System.out.println("6");
		
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[5]/div/button")).click();
		//System.out.println("7");

		//check member resister successfully or not
		
		String text=driver.switchTo().alert().getText();
		//System.out.println(text);
		
		if(text.equals("User registered successfully.")) {
			
			System.out.println(" registered successfully.");
		}else {
			
			System.out.println("registered not successfull.");
		}
		
		driver.switchTo().alert().accept();
		
		driver.close();
		  
		
		

	}

}
