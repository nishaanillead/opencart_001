package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtemail;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtpwd;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	WebElement btnlogin;
	
	@FindBy(xpath="//h2[contains(text(),'My Account')]")
	WebElement headingmsg;
	
	@FindBy(xpath="//div[@class='list-group']//a[text()='Forgotten Password']")
	WebElement lnkforgotpwd;
	
	
	public void setloginemail(String email)
	{
		txtemail.clear();
		txtemail.sendKeys(email);
	}
	
	public void setloginpwd(String pwd)
	{
		txtpwd.clear();
		txtpwd.sendKeys(pwd);
	}
	
	public void clicklogin()
	{
		btnlogin.click();
	}
	
	public boolean isMyaccountPageExists()
	{
		try
		{
		return(headingmsg.isDisplayed()); //if it is not displayed this statement will throw some exception
		}
		catch(Exception e)
		{
			return(false);
		}
	}
	
	public void clickforgotpwd()
	{
		lnkforgotpwd.click();
	}
	

}
