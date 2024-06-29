package testCases;

import org.testng.annotations.Test;

import generalUtility.UtilityRepositoryRevise;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;

public class BaseClass

{ WebDriver driver;
  UtilityRepositoryRevise utilobj= new UtilityRepositoryRevise();
  
  public static Properties po;
  
  public static void testBasic() throws Exception  
  {
	  po =new Properties();
	  FileInputStream file= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\propertyFiles\\Configuration.properties");
	  po.load(file);
  }
 
  @BeforeMethod
  public void beforeMethod()
  {
	  
  }

  @AfterMethod
  public void afterMethod(ITestResult result) throws Exception
  {
	  if(ITestResult.FAILURE==result.getStatus())
	  {
	  
		  Date d = new Date();
		  String date = d.toString().replace(":", "_").replace(" ", "_") + ".png";
		  TakesScreenshot ts=(TakesScreenshot)driver;
		  File source=ts.getScreenshotAs(OutputType.FILE);
		  FileHandler.copy(source, new File("./Screenshots/"+result.getName()+date));
		  System.out.println("Screenshot taken");
		  
			 
	  }
	  
	  
	  
  }
  
  @Parameters({"browser"}) 
  @BeforeTest
  public void beforeTest(String browser) throws Exception
  {   
	  testBasic();
	  driver= utilobj.browserlaunch(po.getProperty("URL"),browser);
  }

  @AfterTest
  public void afterTest() 
  {
	  driver.close();
  }

}
