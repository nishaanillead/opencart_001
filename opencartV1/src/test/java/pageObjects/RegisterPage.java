package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RegisterPage {
	
	WebDriver driver;
	
	public RegisterPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txtfname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txtlname;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtemail;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement txtphone;

	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtpwd;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement txtconfirmpwd;
	
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement chkprvcypolicy;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	WebElement btncontinue;
	
	@FindBy(xpath="//h1[contains(text(),'Your Account Has Been Created!')]")
	WebElement confirmationmsg;
	
	//action methods
	
	public void setfname(String fname)
	{
		txtfname.sendKeys(fname);
	}
	
	public void setlname(String lname)
	{
		txtlname.sendKeys(lname);
	}
	
	public void setemail(String email)
	{
		txtemail.sendKeys(email);
	}
	
	public void setphone(String phone)
	{
		txtphone.sendKeys(phone);
	}
	
	public void setpwd(String pwd)
	{
		txtpwd.sendKeys(pwd);
	}
	
	public void setconfirmpwd(String pwd)
	{
		txtconfirmpwd.sendKeys(pwd);
	}
	
	public void clickprvcyplcy()
	{
		chkprvcypolicy.click();
	}
	
	public void clickcontinue1()
	{
		btncontinue.click();
	}
	
	
	public String confirmregistration()
	{
		try
		{
		 return confirmationmsg.getText();
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
