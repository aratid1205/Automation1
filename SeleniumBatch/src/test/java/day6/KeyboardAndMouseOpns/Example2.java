package day6.KeyboardAndMouseOpns;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import day2.ObjectIdentification.GenericFunctions;

public class Example2 {

	public static void main(String[] args) {
		WebDriver driver=GenericFunctions.createInstanceOfRequiredBrowser("firefox");
		driver.get("https://online.actitime.com/uts/login.do");
		
		// type username
		driver.findElement(By.id("username")).sendKeys("admin01",Keys.chord(Keys.CONTROL,"a"),
				                                                 Keys.chord(Keys.CONTROL,"c"));
		
		// type password and press enter button
		driver.findElement(By.name("pwd")).sendKeys(Keys.chord(Keys.CONTROL,"v"),
				Keys.ENTER);
		

	}
}
