package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	WebDriver driver;
	
	public SearchPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//div[@class='caption']/h4/a")
	WebElement Searchtext;
	
	public String getSearchtext()
	{
		return Searchtext.getText();
	}
	public void click_SearchText()
	{
		Searchtext.click();
	}

}
