package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage (WebDriver driver)
			{
				this.driver=driver;
				PageFactory.initElements(driver, this);
			}
	
	//locating the elements
	
	@FindBy(xpath="//span[contains(text(),'My Account')]")
	WebElement lnkmyaccount;
	
	@FindBy(xpath="//a[contains(text(),'Register')]")
	WebElement lnkRegister;
	
	@FindBy(xpath="//a[contains(text(),'Login')]")
	WebElement lnkLogin;
	
	@FindBy(xpath="//input[@name='search']")
	WebElement txtSearchbox;
	
	@FindBy(xpath="//div[@id='search']//button")
	WebElement btnSearch;
	
	
	
	//action methods
	
	public void clickmyacc()
	{
		lnkmyaccount.click();
	}
	
	public void clickregister()
	{
		lnkRegister.click();
	}
	
	public void clicklogin()
	{
		lnkLogin.click();
	}
	
	public void setSearch(String text)
	{
		 txtSearchbox.sendKeys(text);
	}
	
	public void clickSearch()
	{
		btnSearch.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
