package day3.Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import day2.ObjectIdentification.GenericFunctions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonValidation 
{
    public static void main(String[] args)
	{
    	// 1. Launch browser of your choice say., firefox, chrome etc.
		WebDriver driver=GenericFunctions.createInstanceOfRequiredBrowser("firefox");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// 2.Open this URL -  www.amazon.in
		driver.get("https://www.amazon.in");
		// 3. Maximize or set size of browser window.
		driver.manage().window().maximize();
		// 4.Get the page title and print it.
		System.out.println(driver.getTitle());
		WebElement topbtn=driver.findElement(By.className("hm-icon-label"));
		System.out.println("Name="+topbtn.getText());
		topbtn.click();
		// 5. Click on first menu link, say 'Amazon Pay'.
		WebElement button=driver.findElement(By.className("hmenu-item"));
		System.out.println("Login Button Name Is: "+button.getText());
		button.click();
		
		String title=driver.getTitle();
		if(title.equals("Dashboard"))
		{
			System.out.println("Test Case Pass");
		}
		else
		{
			System.out.println("Test Case Fail");
		}
		
		// 6. Page title and verify it with expected value.
		//7.Navigate back to Home Page. 
		driver.navigate().back();
		
		//9.Repeat steps 5 to 8 for other menu links. 
		//10.Close the browser.
		driver.close();
	}

}

/*Steps to Automate:
1. Launch browser of your choice say., firefox, chrome etc.
2. Open this URL -  www.amazon.in
3. Maximize or set size of browser window.
4. Get the page title and print it.
5. Click on first menu link, say 'Amazon Pay'.
6. Get Page title and verify it with expected value.
7. Navigate back to Home Page. 
8. Get Page title and verify it with expected value. 
9. Repeat steps 5 to 8 for other menu links. 
10. Close the browser.
*/