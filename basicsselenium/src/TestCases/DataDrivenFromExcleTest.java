package TestCases;

import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

public class DataDrivenFromExcleTest {

	WebDriver driver ;
	
	@BeforeSuite
	public void browserSetUp() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file://C:/java%20App/Offline%20Website/Offline%20Website/index.html");
		driver.manage().window().maximize();
	}

	@Test(dataProvider = "loginData")
	public void loginPage(String username, String password) {
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		String title = driver.getTitle();
		Assert.assertEquals(title, "JavaByKiran | Dashboard");

	}
	
	@AfterMethod
	public void clearSetUp() {
		
		if( driver.getTitle().equals("JavaByKiran | Log in")) {
			
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("password")).clear();
		}else {
			
			driver.findElement(By.xpath("/html/body/div/header/nav/div/ul/li/a")).click();
			String Acttext=driver.findElement(By.xpath("/html/body/div/div[2]/p[2]")).getText();
			String exptext="Logout successfully";
			Assert.assertEquals(Acttext, exptext);
		}
		
	}
	

	@DataProvider
	public Object[][] loginData() throws Exception {

		Object[][] dataArray; 
		//identify excle
		FileInputStream fis = new FileInputStream("C:\\Users\\SAGAR ALASKAR\\Desktop\\login.xls");
		
		//open the excel
		Workbook wb = Workbook.getWorkbook(fis);   
		
		//open sheet from opened workbook
		Sheet st = wb.getSheet("data_to_login");  
         int rows= st.getRows();
		int col = st.getColumns();
		System.out.println(rows + "  " + col);

		dataArray = new String[rows][col];

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < col; j++) {

				Cell c = st.getCell(j, i);

				String data = c.getContents();
				System.out.println(data);
                
				dataArray[i][j] = data;
			}

		}

		return dataArray;
	}
}
