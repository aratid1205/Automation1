package day2.ObjectIdentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VtigerLogin {

	public static void main(String[] args) 
	{
		//WebDriverManager.chromedriver().setup();
		//ChromeDriver cdriver=new ChromeDriver();
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver fdriver=new FirefoxDriver();
        WebDriver driver=GenericFunctions.createInstanceOfRequiredBrowser("firefox");
		
		 driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		 
				WebElement userName=driver.findElement(By.id("username"));
				userName.clear();
				userName.sendKeys("admin");
				System.out.println(driver.getTitle());
				
				WebElement passwordField=driver.findElement(By.id("password"));
				passwordField.clear();
				passwordField.sendKeys("admin");
				
				WebElement loginButton=driver.findElement(By.className("button"));
				loginButton.click();
				
				String currenUrl=driver.getCurrentUrl();
				System.out.println("Home Page Validation Status:"+(!currenUrl.contains("login")));
				System.out.println(driver.getTitle());
				String title=driver.getTitle();
				if(title.equals("Dashboard"))
				{
					System.out.println("Test Case Pass");
				}
				else
				{
					System.out.println("Test Case Fail");
				}
		
			}
}

