package day4.MultipleElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import day2.ObjectIdentification.GenericFunctions;

public class Assignment1 
{

	public static void main(String[] args) 
	{
		WebDriver driver=GenericFunctions.createInstanceOfRequiredBrowser("firefox");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.gsmarena.com");	
		WebElement phonefinderbtn = driver.findElement(By.className("icon-search-right"));
		phonefinderbtn.click();
		List<WebElement> handsetmodel = driver.findElements(By.cssSelector("aside>div>ui>li"));
		System.out.println(handsetmodel.size());
		for(int i=1;i<handsetmodel.size();i++)
		{
			String handsetbrand = handsetmodel.get(i).getText();
			System.out.println("Model Name: "+handsetmodel);
		}
		
		//List<WebElement> devicesamsung = driver.findElements(By.cssSelector("//*[@id="body"]/aside/div[1]/ul"));
		
	}

}
//*[@id="body"]/div[1]/aside/div/p[1]/a/span