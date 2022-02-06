package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListPage {
	
	public WebDriver driver;
	
	public WishListPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//table[@class='table table-bordered table-hover']/tbody/tr[1]/td[2]")
	WebElement WishListPdt;
	
	public String GetWishListPdt()
	{
		return WishListPdt.getText();
	}
	

}
