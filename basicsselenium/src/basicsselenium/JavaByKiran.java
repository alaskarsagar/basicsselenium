package basicsselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaByKiran {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAGAR ALASKAR" + "\\eclipse-workspace\\Seleniumpractice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	     Thread.sleep(5000);
		driver.get("https://javabykiran.com/");
		
		List<WebElement> menubarlist=driver.findElements(By.xpath("//*[@id=\"page\"]/div[1]/div/div/nav"));
		System.out.println(menubarlist);

	}

}
