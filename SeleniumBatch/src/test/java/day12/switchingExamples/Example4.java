package day12.switchingExamples;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import day2.ObjectIdentification.SeleniumUtility;

public class Example4 extends SeleniumUtility {
	@Test
	public void testWindowHandling() {
		driver=setUp("edge", "https://etrain.info/in");
		//current window id
		String homeWinId=driver.getWindowHandle();
		String homeTitle=getCurrentTitleOfApplication();
		System.out.println("Home page title: "+homeTitle);
		clickOnElement(driver.findElement(By.cssSelector(".icon-twitter")));
		
		//get all window ids opened by current driver instance
		Set<String> allWinIds=driver.getWindowHandles();
		
		//get child window id
		allWinIds.remove(homeWinId);		
		Iterator<String> itr=allWinIds.iterator();
		String childWinId=itr.next();
		
		driver.switchTo().window(childWinId);
		String expectChildPageTitle="Log in to X / X";
		String childPageTitle=getCurrentTitleOfApplication(expectChildPageTitle);
		Assert.assertEquals(childPageTitle, expectChildPageTitle);
		
		//if you don't need child window dn close it
		//driver.close();
		
		//move control back to main page
		driver.switchTo().window(homeWinId);
		homeTitle=getCurrentTitleOfApplication();
		System.out.println("After coming to home page title is: "+homeTitle);
		
		//driver.close();
		//this will close all browser instance opened using current driver instance
		driver.quit();
		
	}
	
 
}
