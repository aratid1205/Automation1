package day1.browserInstances;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Assignment2 {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		WebDriver driver=createInstanceOfRequiredBrowser("Chrome");
		driver.get("https://www.flipkart.com");
		String applicationTitle=driver.getTitle();
		System.out.println("Application Title Is:"+applicationTitle);
		System.out.println("No.Of Characters Present in Application Title is:"+applicationTitle.length());
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
		}
		else
			if(browserName.equalsIgnoreCase("edge"))	
			{
				driver=new EdgeDriver();
			}
		    return driver;
}
}