package day6.KeyboardAndMouseOpns;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import day2.ObjectIdentification.GenericFunctions;

public class Example1 {

	public static void main(String[] args) {
		WebDriver driver=GenericFunctions.createInstanceOfRequiredBrowser("firefox");
		driver.get("https://online.actitime.com/uts/login.do");
		//type user name
		driver.findElement(By.id("username")).sendKeys("admin01");
		//type password and press enter button
		driver.findElement(By.name("pwd")).sendKeys("admin01",Keys.ENTER);
	}

}
