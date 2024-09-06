package day3.Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import day2.ObjectIdentification.GenericFunctions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VtigerValidation 
{

	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver fdriver=new FirefoxDriver();
		WebDriver driver=GenericFunctions.createInstanceOfRequiredBrowser("firefox");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String url = "https://demo.vtiger.com/vtigercrm/index.php";
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		WebElement userName=driver.findElement(By.id("username"));
		System.out.println("User Name Visibolity Status:" +userName.isDisplayed());
		System.out.println("User Name Editable Status:" +userName.isEnabled());
		String defaultValueOfUserName=userName.getAttribute("placeholder");
		System.out.println("User Name Field Value: "+defaultValueOfUserName);
		userName.clear();
		userName.sendKeys("admin");
		
		WebElement passwordField=driver.findElement(By.id("password"));
		System.out.println("Password Visibility Status: "+passwordField.isDisplayed());
		System.out.println("Password Field is Editable: "+passwordField.isEnabled());
		String defaultValueOfpassword=passwordField.getAttribute("placeholder");
		System.out.println("Default Value Of Password Field Is: "+defaultValueOfpassword);
		passwordField.clear();
		passwordField.sendKeys("admin");
		
		
		WebElement loginButton=driver.findElement(By.className("button"));
		System.out.println("loginbutton Visibility Status: "+loginButton.isDisplayed());	
		System.out.println("Login Button enable or Not :"+loginButton.isEnabled());
		System.out.println("Login Button Name Is: "+loginButton.getText());
		loginButton.click();
		
		WebElement profilebtn=driver.findElement(By.className("fa-user"));
		System.out.println("Profile button Visibility Status: "+profilebtn.isDisplayed());
		System.out.println("Profile button Visibility Status: "+profilebtn.isEnabled());
		profilebtn.click();
		
		
		WebElement SignOutbtn =driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT"));
		System.out.println("SignOutButton Visibility Status: "+SignOutbtn.isDisplayed());	
		System.out.println("SignOutButton enable or Not :"+SignOutbtn.isEnabled());
		System.out.println("SignOutButton Name Is: "+SignOutbtn.getText());
		SignOutbtn.click();
		if(driver.getCurrentUrl().equals(url))
				{
		          System.out.println("Sign Out Successfully");
				}
		else
		{
			System.out.println("Sign Out Unsuccessfully");
		}
		
	}
}
