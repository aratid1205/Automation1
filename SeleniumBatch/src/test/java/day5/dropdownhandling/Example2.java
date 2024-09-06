package day5.dropdownhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import day2.ObjectIdentification.GenericFunctions;

public class Example2 {

	public static void main(String[] args) {
		WebDriver driver=GenericFunctions.createInstanceOfRequiredBrowser("firefox");
		driver.get("https://omayo.blogspot.com/");
		WebElement dropDown=driver.findElement(By.id("multiselect1"));
		Select select=new Select(dropDown);
		System.out.println("is this dropdown allowed multiple selection:"+select.isMultiple());
		List<WebElement> skillList=select.getOptions();
		System.out.println("Skill count:"+skillList.size());
		for(int i=0;i<skillList.size();i++)
		{
			System.out.println(skillList.get(i).getText());
		}
		
		select.selectByIndex(0);
		System.out.println("After 1St selection using index, selected value in dropdown: "+select.getFirstSelectedOption().getText());
		
		select.selectByValue("swiftx");
		System.out.println("After 2Nd selection using index, selected value in dropdown: "+select.getFirstSelectedOption().getText());
		
		select.selectByVisibleText("Audi");
		System.out.println("After 3Rd selection using index, selected value in dropdown: "+select.getFirstSelectedOption().getText());
		
		System.out.println("**************Options Got Selected***************");
		List<WebElement> selectedOptions=select.getAllSelectedOptions();
		for(WebElement element:selectedOptions)
		{
			System.out.println(element.getText());
		}
		
		// To deselect value from dropdown
		/*select.deselectByIndex(0);
		select.deselectByValue("swiftx");
		select.deselectByVisibleText("Audi");*/
		select.deselectAll();
		selectedOptions=select.getAllSelectedOptions();
		System.out.println("After deselectedAll, selected element count: "+selectedOptions.size());
		
	}

}
