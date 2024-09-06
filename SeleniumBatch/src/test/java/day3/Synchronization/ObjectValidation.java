package day3.Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import day2.ObjectIdentification.GenericFunctions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ObjectValidation {

	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver fdriver=new FirefoxDriver();
		WebDriver driver=GenericFunctions.createInstanceOfRequiredBrowser("firefox");
		driver.get("https://online.actitime.com/uts/login.do");
		WebElement userNameInputField=driver.findElement(By.id("username"));
		System.out.println("Username input field visibility status? "+userNameInputField.isDisplayed());
		System.out.println("Username input field editable status? "+userNameInputField.isEnabled());		
		String defaultValueOfUserNameInputField=userNameInputField.getAttribute("placeholder");
		System.out.println("User name input field value: "+defaultValueOfUserNameInputField);
		
		WebElement keepMeLoggedInCheckBox=driver.findElement(By.id("keepLoggedInCheckBox"));
		System.out.println("keepMeLoggedInCheckBox visibility status: "+keepMeLoggedInCheckBox.isDisplayed());
		System.out.println("keepMeLoggedInCheckBox selectable status: "+keepMeLoggedInCheckBox.isEnabled());
		System.out.println("keepMeLoggedInCheckBox default selection status: "+keepMeLoggedInCheckBox.isSelected());
		keepMeLoggedInCheckBox.click();
		System.out.println("after selection, keepMeLoggedInCheckBox status: "+keepMeLoggedInCheckBox.isSelected());
	
		WebElement loginBtn=driver.findElement(By.id("loginButton"));
		System.out.println("loginBtn visibility status? "+userNameInputField.isDisplayed());
		System.out.println("loginBtn enable or not? "+userNameInputField.isEnabled());
		System.out.println("Login button name is: "+loginBtn.getText());
	
	}

}
