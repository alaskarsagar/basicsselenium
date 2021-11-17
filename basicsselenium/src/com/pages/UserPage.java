package com.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class UserPage {

	WebDriver driver = null;

	int i = 0;
	int j = 0;

	@FindBy(xpath = "html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr")
	private List<WebElement> rows;

	public UserPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void printUsersTable() {

		for (WebElement row : rows) {

			List<WebElement> webElentList;

			if (rows.indexOf(row) == 0) {
				webElentList = row.findElements(By.tagName("th"));
			} else {

				webElentList = row.findElements(By.tagName("td"));
			}

			for (WebElement webElement : webElentList) {

				String actValue = webElement.getText();

				System.out.print(actValue + "   ");

			}

			System.out.println();

		}

	}

}
