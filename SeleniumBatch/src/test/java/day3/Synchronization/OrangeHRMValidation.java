package day3.Synchronization;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import day2.ObjectIdentification.GenericFunctions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMValidation 
{
	 public static void main(String[] args) 
	 {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver fdriver=new FirefoxDriver();
		WebDriver driver=GenericFunctions.createInstanceOfRequiredBrowser("firefox");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement userName=driver.findElement(By.name("username"));
		System.out.println(driver.getTitle());
		System.out.println("Username input field visibility status? "+userName.isDisplayed());
		System.out.println("Username input field editable status? "+userName.isEnabled());
		String defaultValueOfUName=userName.getAttribute("placeholder");
		System.out.println("User Name Field Value: "+defaultValueOfUName);
		
		WebElement passwordField=driver.findElement(By.name("password"));
		System.out.println("Username input field visibility status? "+passwordField.isDisplayed());
		System.out.println("Username input field editable status? "+passwordField.isEnabled());
		String defaultValueOfpassword=userName.getAttribute("placeholder");
		System.out.println("User Name Field Value: "+defaultValueOfpassword);
		
		WebElement loginbutton=driver.findElement(By.className("orangehrm-login-button:"));
		System.out.println("loginbutton Visibility Status: "+userName.isDisplayed());	
		System.out.println("Login Button enable or Not :"+userName.isEnabled());
		System.out.println("Login Button Name Is: "+loginbutton.getText());
		
		String currenUrl=driver.getCurrentUrl();
		System.out.println("Home Page Validation Status:"+(!currenUrl.contains("login")));
		System.out.println(driver.getTitle());
		String title=driver.getTitle();
		if(title.endsWith("Dashboard"))
		{
			System.out.println("Test Case Pass");
		}
		else
		{
			System.out.println("Test Case Fail");
		}
	}
}