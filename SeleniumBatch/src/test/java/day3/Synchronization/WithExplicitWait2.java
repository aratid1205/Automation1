package day3.Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import day2.ObjectIdentification.GenericFunctions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WithExplicitWait2 {

	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver fdriver=new FirefoxDriver();
		WebDriver driver=GenericFunctions.createInstanceOfRequiredBrowser("firefox");
		driver.get("https://online.actitime.com/uts/login.do");
		driver.findElement(By.id("username")).sendKeys("admin01");//0-30 sec		
		driver.findElement(By.name("pwd")).sendKeys("admin01");//0-30 sec		
		driver.findElement(By.id("loginButton")).click();//0-30 sec
		String expectedTitle="actiTIME - Enter Time-Track";
		//explicit wait- WebDriverWait
				WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));	
				//wait for title to be changed
				wait.until(ExpectedConditions.titleIs(expectedTitle));		
				
				String actualTitle=driver.getTitle();//we need explicit wait to wait for certain condition/element
				System.out.println("Actutal Title: "+actualTitle);
				boolean status=actualTitle.equals(expectedTitle);
				System.out.println("Is login validation successful? "+status);
				
				//wait till login button is clickable with in given time
				wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
				driver.findElement(By.id("logoutLink")).click();
	}

}
