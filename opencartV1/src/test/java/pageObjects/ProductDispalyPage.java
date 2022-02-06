package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDispalyPage {
	
	public WebDriver driver;
	
	public ProductDispalyPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class='btn btn-default']//i[@class='fa fa-exchange']")
	WebElement comparePdtButton;
	
	@FindBy(xpath="//div[@class='btn-group']//button[@data-original-title='Add to Wish List']")
	WebElement addtoWishlist;
	
	@FindBy(xpath="//div/a[contains(.,'wish list')]")
	WebElement WishListMsg;
	
	@FindBy(xpath="//a[contains(text(),'wish list')]")
	WebElement txt_WishListMsg;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible'][contains(text(),' Success: You have added ')]")
	WebElement successMsg;
	
	@FindBy(xpath="//a[contains(.,'product comparison')]")
	WebElement pdtComplnk;
	
	@FindBy(xpath="//li[1]//a[@class='thumbnail']")
	WebElement img_thumbnail;
	
	@FindBy(xpath="//button[@title='Next (Right arrow key)']")
	WebElement btn_rightarrow;
	
	@FindBy(xpath="//button[@title='Previous (Left arrow key)']")
	WebElement btn_leftarrow;
	
	@FindBy(xpath="//button[@id='button-cart']")
	WebElement btn_addtocart;
	
	@FindBy(xpath="//body/div[@id='product-product']/div[1]")
	WebElement msg_pdtAddedtocart;
	
	
	@FindBy(xpath="//a[contains(text(),'shopping cart')]")
	WebElement lnk_shoppingCart;
	
	
	public void click_comparePdtbtn()
	{
		comparePdtButton.click();
	}
	
	public void click_addtowishList()
	{
		addtoWishlist.click();
	}
	public boolean Display_WishListMsg()
	{
		return WishListMsg.isDisplayed();
	}
	public void Click_wishListMsg()
	{
		txt_WishListMsg.click();
	}
	
	public boolean display_SuccessMsg()
	{
		boolean message=successMsg.isDisplayed();
		return message;
	}
	
	public void click_pdtComplnk()
	{
		pdtComplnk.click();
	}
	
	public void click_img()
	{
		img_thumbnail.click();
	}
	
	public void click_rightbtn()
	{
		btn_rightarrow.click();
	}
	
	public void click_leftbtn()
	{
		btn_leftarrow.click();
	}

	public void click_btnaddtocart()
	{
		btn_addtocart.click();
	}
	
	public boolean PdtAddedtocartMsg()
	{
		return msg_pdtAddedtocart.isDisplayed();

	}
	
	public void Click_lnkshoppingCart()
	{
		lnk_shoppingCart.click();
	}
	
	

}
