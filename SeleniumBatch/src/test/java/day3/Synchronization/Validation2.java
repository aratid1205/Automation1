package day3.Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import day2.ObjectIdentification.GenericFunctions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Validation2 
{

	public static void main(String[] args)
	{
		//1.Open any browser 
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver fdriver=new FirefoxDriver();
		WebDriver driver=GenericFunctions.createInstanceOfRequiredBrowser("firefox");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// 2.enter application url https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//3.Click on login button 
		driver.findElement(By.className("orange-hrm-login-button:")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.attributeToBe(oxd-input-group_message, class, oxd-input-group_message));
		String expectedError="Required Username or Password";
		WebElement msg=driver.findElement(By.className(oxd-input-group_message));
		String ActualError=msg.getText();
		System.out.println("Error msg validation "+ActualError.equals(expectedError));
		
		// 4.Validate 	
		// 1. error msg color & 
		System.out.println("Error msg color code in RGBA format : "+msg.getCssValue("color"));
		
		// 2. error below username input field
		Point errorMsgPoint=msg.getLocation();
		int errorMsg_x=errorMsgPoint.getX();
		int errorMsg_y=errorMsgPoint.getY();
		System.out.println("Error msg x and y cords are: "+errorMsg_x +","+errorMsg_y);
		WebElement userNameInputField=driver.findElement(By.name("username"));
		Point userNameInputFieldPoint=userNameInputField.getLocation();
		int userNameInputField_x=userNameInputFieldPoint.getX();
		int userNameInputField_y=userNameInputFieldPoint.getY();
        System.out.println("userNameInputField x and y cords are: "+userNameInputField_x +","+userNameInputField_y);
		System.out.println("Is error msg displayed below username input field? "+(errorMsg_y > userNameInputField_y));
		//5.Get the username and password from UI
		//6.Enter username in username input field
		//7.Enter password in password input field
		//8.Click on login button
	}

}
