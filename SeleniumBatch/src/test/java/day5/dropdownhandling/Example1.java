package day5.dropdownhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import day2.ObjectIdentification.GenericFunctions;

public class Example1 {

	public static void main(String[] args) {
		WebDriver driver=GenericFunctions.createInstanceOfRequiredBrowser("firefox");
		driver.get("https://demo.automationtesting.in/Register.html");
		// Step1: Identify Dropdown Uniquely
		WebElement skillDropdown=driver.findElement(By.id("Skills"));
		// Step2: Create an instance of select class & pass above dropdown to its constructor
		Select skillSelect=new Select(skillDropdown);
		System.out.println("is this dropdown allowed multiple selection? "+skillSelect.isMultiple());
		System.out.println("Already Selected Value in Dropdown: "+skillSelect.getFirstSelectedOption().getText());
		// To Select Value From Dropdown, you can use following
		skillSelect.selectByIndex(3);
		System.out.println("After 1St selection using index, Selected Value in Dropdown:"+skillSelect.getFirstSelectedOption().getText());
		
		skillSelect.selectByValue("Android");
		System.out.println("After 2Nd selection using Value, Selected Value in Dropdown:"+skillSelect.getFirstSelectedOption().getText());
		
		skillSelect.selectByVisibleText("AutoCAD");
		System.out.println("After 3Rd selection using VisibleText, Selected Value in Dropdown:"+skillSelect.getFirstSelectedOption().getText());
		
		List<WebElement> skillList=skillSelect.getOptions();
		System.out.println("Skill count= "+skillList.size());
		for(int i=0;i<skillList.size();i++)
		{
			System.out.println(skillList.get(i).getText());
		}
		
	}
	

}
