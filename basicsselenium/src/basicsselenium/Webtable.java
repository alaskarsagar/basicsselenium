package basicsselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SAGAR ALASKAR" + "\\eclipse-workspace\\Seleniumpractice\\chromedriver.exe");
		System.out.println("1");
		WebDriver driver = new ChromeDriver();
		System.out.println("2");

		driver.get(
				"file:///C:/Users/SAGAR%20ALASKAR/AppData/Local/Temp/Offline%20Website/Offline%20Website/index.html#");

		System.out.println("3");

		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kiran@gmail.com");
		System.out.println("4");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		System.out.println("5");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		System.out.println("6");

		driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[6]/a")).click();
		System.out.println("7");

		List<WebElement> rows = driver
				.findElements(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table//tr"));

		System.out.println("8");

		System.out.println("Total no of rows>>>>  " + rows.size());
		System.out.println("9");

		int rowcount = rows.size();
		System.out.println("10");

		List<WebElement> coloums = driver
				.findElements(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[1]/th"));
		System.out.println("Toatal no. of coloums>>>  " + coloums.size());
		System.out.println("11");

		int coloumcount = coloums.size();
		System.out.println("12");

		for (int i = 1; i <= 1; i++) {

			for (int j = 1; j <= 8; j++) {
				String text = driver.findElement(By.xpath(
						"/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[" + i + "]/th[" + j + "]"))
						.getText();
				System.out.print(text + "    ");
			}
			System.out.println();
		}

		for (int i = 2; i <= rowcount; i++) {

			for (int j = 1; j <= coloumcount; j++) {
				String text = driver.findElement(By.xpath(
						"/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[" + i + "]/td[" + j + "]"))
						.getText();
				System.out.print(text + "    ");
			}
			System.out.println();
		}

	}

}

