package basicsselenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class DataProviderDemo2 {

	@Test(dataProviderClass = DPclass.class, dataProvider = "registerData")
	public void f(String name, String mobile, String email, String pass) {
		if (DataProviderDemo.driver.getTitle().contains("JavaByKiran | Log in"))
			DataProviderDemo.driver.findElement(By.linkText("Register a new membership")).click();
		
		DataProviderDemo.driver.findElement(By.id("name")).clear();
		DataProviderDemo.driver.findElement(By.id("name")).sendKeys("name");
		DataProviderDemo.driver.findElement(By.id("mobile")).clear();
		DataProviderDemo.driver.findElement(By.id("mobile")).sendKeys("mobile");
		DataProviderDemo.driver.findElement(By.id("email")).clear();
		DataProviderDemo.driver.findElement(By.id("email")).sendKeys("email");
		DataProviderDemo.driver.findElement(By.id("password")).clear();
		DataProviderDemo.driver.findElement(By.id("password")).sendKeys(pass);
		DataProviderDemo.driver.findElement(By.xpath("//*[@id=\"form\"]/div[5]/div/button")).click();

	    String alertMessage=DataProviderDemo.driver.switchTo().alert().getText();
		
	    Assert.assertEquals(alertMessage, "User registered successfully.");
	    DataProviderDemo.driver.switchTo().alert().accept();

	}

}
