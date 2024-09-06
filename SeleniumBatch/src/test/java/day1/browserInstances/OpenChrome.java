package day1.browserInstances;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenChrome 
{

	public static void main(String[] args) 
	{
		  WebDriverManager.chromedriver().setup();
		  ChromeDriver cdriver=new ChromeDriver();
		 // WebDriverManager.
		//FirefoxDriver cdriver=new FirefoxDriver();
	

	}

}
