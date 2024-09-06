package day5.dropdownhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import day2.ObjectIdentification.GenericFunctions;

public class Example3 {

	public static void main(String[] args) {
		WebDriver driver=GenericFunctions.createInstanceOfRequiredBrowser("firefox");
		driver.get("https://thompsonsj.com/bootstrap-select-dropdown/");
		driver.findElement(By.cssSelector(".dropdown-toggle")).click();
		List<WebElement> countryList = driver.findElements(By.cssSelector(".dropdown-menu-right.show>div>a"));
		System.out.println(countryList.size());
		for(WebElement element:countryList)
		{
			System.out.println(element.getText());
		}
		
		countryList.get(5).click();
	}

}
