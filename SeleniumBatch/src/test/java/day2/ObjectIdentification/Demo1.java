package day2.ObjectIdentification;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;
public class Demo1 {

	public static void main(String[] args)
	{
		//WebDriverManager.firefoxdriver().setup();
		//FirefoxDriver cdriver=new FirefoxDriver();
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver cdriver=new ChromeDriver();
        WebDriver driver=GenericFunctions.createInstanceOfRequiredBrowser("chrome");
		
		 driver.get("https://demowebshop.tricentis.com/login");
		//Identify email input field
				WebElement emailIdInputField=driver.findElement(By.id("Email"));
				//perform required action i.e type email id
				emailIdInputField.sendKeys("tester01@vomoto.com");
				
				//identify password input field
				WebElement passwordInputField=driver.findElement(By.name("Password"));
				//perform required action i.e type password
				passwordInputField.sendKeys("Abc@12345");
				
				//identify login button
				WebElement loginButton=driver.findElement(By.className("login-button"));
				//perform required action i.e click
				loginButton.click();
				
				String expectedUrlContent="login";
				String currenUrl=driver.getCurrentUrl();
				System.out.println("Home page validation status: "+(!currenUrl.contains(expectedUrlContent)));
			}
	}
	


