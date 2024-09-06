package day2.ObjectIdentification;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericFunctions {
	public static WebDriver createInstanceOfRequiredBrowser(String browserName)
	{
		WebDriver driver=null;
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			
			driver=new ChromeDriver();
		}
		else
			if(browserName.equalsIgnoreCase("edge"))	
			{
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
			}
			else
				if(browserName.equalsIgnoreCase("firefox"))	
				{
					WebDriverManager.firefoxdriver().setup();
					driver=new FirefoxDriver();
				}
		    driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    return driver;
	}
	
	public static void setSleep(long time) 
	{
		try 
		{
			Thread.sleep(time);
		} catch (InterruptedException e) 
		{
			// TODO Auto-generated method stub
            e.printStackTrace();
		}
	}
}
