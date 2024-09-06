package day6.KeyboardAndMouseOpns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import day2.ObjectIdentification.GenericFunctions;

public class Ass1 {

	public static void main(String[] args) {
		WebDriver driver=GenericFunctions.createInstanceOfRequiredBrowser("firefox");
		driver.get("https://www.espncricinfo.com/");
		//create an instance of actions class and pass driver instance to its constructor
		Actions action = new Actions(driver);
		List<WebElement> MenuList=driver.findElements(By.cssSelector(".ds-flex>div>div>a"));
		
		//List<WebElement> MenuList=driver.findElements(By.xpath("//div[@class='ds-flex ds-items-center ds-justify-between ds-flex-1']"));
		
		//hover on Live Scores link
		action.moveToElement(MenuList.get(0)).perform();
		
	   for(int i=0;i<MenuList.size();i++)
		{
			action.moveToElement(MenuList.get(i)).perform();
		}
			
	}
}