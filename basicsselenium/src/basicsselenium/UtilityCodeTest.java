package basicsselenium;

import org.openqa.selenium.WebDriver;

public class UtilityCodeTest {

	public static void main(String[] args) {
		
		WebDriver driver=UtilityCode.getOpenedBrowser();
		
		UtilityCode.openedURL(driver, "file:///C:/Users/Offline%20Website/Offline%20Website/index.html");
		
		UtilityCode.enterText(driver, "xpath", "//*[@id=\"email\"]", "kiran@gmail.com");
		UtilityCode.enterText(driver, "id", "password", "123456");
		UtilityCode.clickButton(driver, "xpath", "//*[@id=\"form\"]/div[3]/div/button");
	

	}

}
