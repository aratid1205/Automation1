package day1.browserInstances;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Assignment4 {

	public static void main(String[] args) 
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=createInstanceOfRequiredBrowser("Edge");
		driver.get("https://www.amezon.com");
		String applicationTitle=driver.getTitle();
		System.out.println("Application Title Is:"+applicationTitle);
		System.out.println("No.Of Characters Present In Application Title Is:"+applicationTitle.length());
		String applicationUrl=driver.getCurrentUrl();
		System.out.println("Application Url:"+applicationUrl);
		String pageSource=driver.getPageSource();
		System.out.println("Character in Page Source:"+pageSource.length());
		driver.close();
	}

	public static WebDriver createInstanceOfRequiredBrowser(String browserName)
	{
		WebDriver driver=null;
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}else
			if(browserName.equalsIgnoreCase("Edge"))
			{
				driver=new EdgeDriver();
			}
				
		   return driver;

 }
}