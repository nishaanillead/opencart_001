package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	
	public WebDriver driver;
	public ShoppingCartPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//table[@class='table table-bordered']/tbody/tr/td[2]/a")
	WebElement ShoppingCartPdt;
	
	public String pdtsInShoppingCart()
	{
		 return ShoppingCartPdt.getText();
		
	}
}



