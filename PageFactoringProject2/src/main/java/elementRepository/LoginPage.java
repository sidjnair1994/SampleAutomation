package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
    WebDriver driver;
    
	@FindBy(xpath="//input[@name='uid']")
	WebElement username;
	
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@name='btnLogin']")
	WebElement loginbutton;
	
	public void typeUsername(String userName) 
	{
		username.sendKeys(userName);
	}
	
	public void typePassword(String passWord) 
	{
		password.sendKeys(passWord);
	}
	
	public void click() 
	{
		loginbutton.click();
	}
	
	


public LoginPage(WebDriver driver) 
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
}
