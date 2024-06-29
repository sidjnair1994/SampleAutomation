package generalUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilityRepositoryGrocery 
{
	WebDriver driver;
	
	public WebDriver browserlaunch(String url, String browser) 
	{
		
		if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		else if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
	/*	switch(browser) 
		{
		case "chrome" : WebDriverManager.chromedriver().setup();
		                driver= new ChromeDriver();
		                break;
		                
		case "edge"   : WebDriverManager.edgedriver().setup();
		                driver = new EdgeDriver();
		                break;
		                
		default       : break;
		                
		
		}
		
		*/
		
		driver.manage().window().maximize();
		driver.get(url);
		
		return driver;
		
	}
	
	
	
	

}
