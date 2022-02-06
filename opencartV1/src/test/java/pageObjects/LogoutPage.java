package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	
	public WebDriver driver;
	
	public LogoutPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1[contains(text(),'Account Logout')]")
	WebElement logoutheader;
	
	public boolean islogoutheaderdisplayed()
	{
		boolean msg=logoutheader.isDisplayed();
		return msg;
	}
	
	

}
