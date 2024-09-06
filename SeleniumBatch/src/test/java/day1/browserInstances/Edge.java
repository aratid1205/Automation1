package day1.browserInstances;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edge 
{

	public static void main(String[] args) 
	{
		WebDriverManager.edgedriver().setup();
		EdgeDriver edriver=new EdgeDriver();
	
	}

}
