package day8.screenshotJs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import day2.ObjectIdentification.SeleniumUtility;
public class Example3 extends SeleniumUtility {

	public static void main(String[] args) throws InterruptedException 
	{
		
		Example3 e1=new Example3();
		e1.testCase1();
	}

	public void testCase1() throws InterruptedException {
		WebDriver driver=setUp("chrome", "https://www.amazon.in/ref=nav_logo");

		JavascriptExecutor js=(JavascriptExecutor)driver;
		//vertical scrolling
//		js.executeScript("window.scrollBy(0,2500)");
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,-2500)");
		
		//scroll till bottom of the page
	js.executeScript("window.scrollTo(0,document.body.scrollHeight);");

		
		//Horizontal scrolling
		//js.executeScript("window.scrollBy(500,0)");
		
	}
}
