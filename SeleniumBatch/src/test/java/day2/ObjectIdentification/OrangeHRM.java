package day2.ObjectIdentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {

	public static void main(String[] args) 
	{
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver cdriver=new FirefoxDriver();
		//ChromeDriver cdriver=new ChromeDriver();
        WebDriver driver=GenericFunctions.createInstanceOfRequiredBrowser("firefox");
		
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//Identify email input field
		 
		        
				WebElement usernameInputField=driver.findElement(By.name("username"));
				usernameInputField.clear();
				usernameInputField.sendKeys("Admin");
				
				WebElement passwordInputField=driver.findElement(By.name("password"));
				passwordInputField.clear();
				passwordInputField.sendKeys("admin123");
			
				
				//identify login button
				WebElement loginButton=driver.findElement(By.className("oxd-button"));
				//perform required action i.e click
				loginButton.click();
				
				//String expectedUrlContent="login";
				String currenUrl=driver.getCurrentUrl();
				System.out.println("Home page validation status: "+(!currenUrl.contains("login")));
				
				//WebElement logoutButton=driver.findElement(By.className("logout-button"));
				//perform required action i.e click
				//logoutButton.click();
				
			}

		

	}


