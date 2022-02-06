package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyaccountPage;
import pageObjects.ProductDispalyPage;
import pageObjects.SearchPage;
import pageObjects.WishListPage;
import testBase.BaseClass;

public class TC_010_AddToWishlist extends BaseClass {
	
	@Test
	public void test_wishList()
	{
		HomePage hp=new HomePage(driver);
		hp.clickmyacc();
		hp.clicklogin();
		
		LoginPage lp=new LoginPage(driver);
		lp.setloginemail(rb.getString("loginemail"));
		lp.setloginpwd(rb.getString("loginpwd"));
		lp.clicklogin();
		
		MyaccountPage mp=new MyaccountPage(driver);
		String text="iMac";
		mp.setSearchText(text);
		mp.Click_Search();
		
		SearchPage sp=new SearchPage(driver);
		sp.click_SearchText();
		
		ProductDispalyPage pdp=new ProductDispalyPage(driver);
		pdp.click_addtowishList();
		
		
		boolean msg=pdp.Display_WishListMsg();
		
		if(msg==true)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		pdp.Click_wishListMsg();
		WishListPage wp=new WishListPage(driver);
		String pdt=wp.GetWishListPdt();
		if(pdt.equals(text))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}

}
