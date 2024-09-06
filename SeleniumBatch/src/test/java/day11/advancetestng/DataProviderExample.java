package day11.advancetestng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import day2.ObjectIdentification.SeleniumUtility;
public class DataProviderExample extends SeleniumUtility {
	/*
	 * This test method declares that its data should be supplied by the Data
	 * Provider "getdata" is the function name which is passing the data Number of
	 * columns should match the number of input parameters
	 */
	@Test(dataProvider = "getData")
	public void setData(String username, String password) {
		System.out.println("you have provided username as::" + username);
		System.out.println("you have provided password as::" + password);
	}

	@Test(dataProvider = "testData")
	public void testLoginOfVtiger(String browser, String username, String password) {
		setUp(browser, "https://demo.vtiger.com/vtigercrm/index.php");
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password, Keys.ENTER);
		driver.quit();
	}

	@DataProvider(name = "testData")
	public Object[][] getUserDetails() {
		/*
		 * Rows - Number of times your test has to be repeated. Columns - Number of
		 * parameters in test data.
		 */
		Object[][] data = new Object[3][3];
		// 1st row
		data[0][0] = "chrome";
		data[0][1] = "admin";
		data[0][2] = "admin";
		// 2rd row
		data[1][0] = "firefox";
		data[1][1] = "pass123";
		data[1][2] = "admin";
		// 3rd row
				data[2][0] = "edge";
				data[2][1] = "";
				data[2][2] = "";
		return data;
	}

	@DataProvider
	public Object[][] getData() {
		/**
		 * Rows - Number of times your test has to be repeated. Columns - Number of
		 * parameters in test data.
		 */
		Object[][] data = new Object[3][2];

		// 1st row
		data[0][0] = "admin";
		data[0][1] = "admin";
		// 2nd row
		data[1][0] = "";
		data[1][1] = "";
		// 3rd row
		data[2][0] = "guestuser3";
		data[2][1] = "pass123";
		return data;
	}
}
/*
Create a method with return type as Multidimension array of Object type
and also add @DataProvider tag
*/