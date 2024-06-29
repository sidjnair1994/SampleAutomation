package generalUtility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilityRepository 
{    WebDriver driver;
     

	public WebDriver browserlaunch(String url, String browsername) 
	{
		
		if(browsername.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		else if(browsername.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
	/*	switch (browsername)
		{
		case "Chrome" : WebDriverManager.chromedriver().setup();
			            driver= new ChromeDriver();
		                break;
			
		
		case "Edge" :  WebDriverManager.edgedriver().setup();
		               driver= new EdgeDriver();
		               break;
		               
		 default: 
			           break;
		    }
		
		*/
		
		driver.manage().window().maximize();
		driver.get(url);
		
		return driver;
				
		}
	
	public void utilityclickcommand(By property)
	{
	
		driver.findElement(property).click();
		
		
	} 
	
	public void sendkeysMethodUtility(By property, String text)
	{
	
		driver.findElement(property).sendKeys(text);
		
		
	} 
	
	public void utilityclearcommand(By property)
	{
	
		driver.findElement(property).clear();
		
		
	} 
	

	
	}
	
	
		
	


