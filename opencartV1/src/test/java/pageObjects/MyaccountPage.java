package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyaccountPage {

	
	public WebDriver driver;
	
	public MyaccountPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='search']")
	WebElement txt_Search;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	WebElement btn_Search;
	
	@FindBy(xpath="//div[@class='list-group']//a[text()='Logout']")
	WebElement lnklogout;
	
	public void clicklogout()
	{
		lnklogout.click();
	}
	
	public void setSearchText(String text)
	{
		txt_Search.sendKeys(text);
		
	}
	
	public void Click_Search()
	{
		btn_Search.click();
	}
	
	
	
	
	
	
	
	
	
}
