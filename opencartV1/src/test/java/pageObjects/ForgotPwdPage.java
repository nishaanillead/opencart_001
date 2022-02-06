package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPwdPage {
	
	public WebDriver driver ;
	public ForgotPwdPage( WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=" //input[@id='input-email']")
	WebElement txtemailid;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	WebElement btncontinue;
	
	@FindBy(xpath="//body/div[@id='account-login']/div[1]")
	WebElement confirmmsg;
	
	public void setEmailid(String email)
	{
		txtemailid.clear();
		txtemailid.sendKeys(email);
	}
	
	public void clickcontinue()
	{
		btncontinue.click();
	}
	
	public String confirmessg()
	{
		String msg=confirmmsg.getText();
		return msg;
	}

}
