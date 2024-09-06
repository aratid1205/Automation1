package day8.screenshotJs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import day2.ObjectIdentification.SeleniumUtility;
import day2.ObjectIdentification.GenericFunctions;

public class TS2 {

	public static void main(String[] args) throws IOException
	{
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("firefox", "https://online.actitime.com/uts/login.do");
		
		s1.takeScreenShotOfThePage(".\\src\\test\\resources\\Screenshot\\LoginPage.jpg");
		
		// type user name
		driver.findElement(By.id("username")).sendKeys("admin01", Keys.chord(Keys.CONTROL, "a"),
				Keys.chord(Keys.CONTROL, "c"));
		s1.takeScreenShotOfThePage(".\\src\\test\\resources\\Screenshot\\AfterUserName.jpg");
		
		// type password and press enter button
		driver.findElement(By.name("pwd")).sendKeys(Keys.chord(Keys.CONTROL, "v"), Keys.ENTER);
		s1.getCurrentTitleOfApplication("actiTIME - Enter Time-Track");
		s1.takeScreenShotOfThePage(".\\src\\test\\resources\\Screenshot\\HomePage.jpg");
	}
}
