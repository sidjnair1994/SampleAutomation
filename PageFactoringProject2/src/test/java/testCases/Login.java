package testCases;

import org.testng.annotations.Test;

import constants.Constants;
import elementRepository.LoginPage;
import generalUtility.UtilityRepositoryRevise;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Login extends BaseClass
{ 
 // WebDriver driver; //no need to initialise again as it is already initialised in base class


  
  
  @Test(priority='1')
  public void invalidUsernameandPassword()
  {
	  LoginPage loginobj = new LoginPage(driver);
	  loginobj.typeUsername(Constants.username);
	 // loginobj.typeUsername("Siddharth"); //To be imported by excel at a later point of time.
	  loginobj.typePassword("Tester");
	  loginobj.click();
	  String actualtext= utilobj.alertGetText();  // To be pulled by excel
	  String expectedtext="User or Password is not valid";
	  System.out.println(actualtext);
	  System.out.println(expectedtext);
	  utilobj.alertAccept();
	  Assert.assertEquals(actualtext, expectedtext);
	  
  }
  
  @Test(priority='2')
  public void validatewithoutusernameorpassword()
  {
	  LoginPage loginobj = new LoginPage(driver);
	  
	 // loginobj.typeUsername("Siddharth"); //To be imported by excel at a later point of time.
	//  loginobj.typePassword("Tester");
	  loginobj.click();
	  String actualtext= utilobj.alertGetText();  // To be pulled by excel
	  String expectedtext="User or Password is not valid";
	  System.out.println(actualtext);
	  System.out.println(expectedtext);
	  utilobj.alertAccept();
	  Assert.assertEquals(actualtext, expectedtext);
	  
  }
  
  @Test(priority='3')
  public void validatewithjustusername()
  {
	  LoginPage loginobj = new LoginPage(driver);
	  
	 loginobj.typeUsername("Siddharth"); //To be imported by excel at a later point of time.
	//  loginobj.typePassword("Tester");
	  loginobj.click();
	  String actualtext= utilobj.alertGetText();  // To be pulled by excel
	  String expectedtext="User or Password is not valid";
	  System.out.println(actualtext);
	  System.out.println(expectedtext);
	  utilobj.alertAccept();
	  Assert.assertEquals(actualtext, expectedtext);
	  
  }
  
  @Test(priority='4')
  public void validatewithjustpassword()
  {
	  LoginPage loginobj = new LoginPage(driver);
	  
	// loginobj.typeUsername("Siddharth"); //To be imported by excel at a later point of time.
	  loginobj.typePassword("Tester");
	  loginobj.click();
	  String actualtext= utilobj.alertGetText();  // To be pulled by excel
	  String expectedtext="User or Password is not valid";
	  System.out.println(actualtext);
	  System.out.println(expectedtext);
	  utilobj.alertAccept();
	  Assert.assertEquals(actualtext, expectedtext);
	  
  }

}
