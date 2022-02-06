package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ProductDispalyPage;
import pageObjects.SearchPage;
import pageObjects.ShoppingCartPage;
import testBase.BaseClass;

public class TC_009_AddToCart extends BaseClass {
	

	@Test
	public void test_addtoCArt()
	{
		HomePage hp=new HomePage(driver);
		String text="iMac";
		hp.setSearch(text);
		hp.clickSearch();
		
		SearchPage sp=new SearchPage(driver);
		sp.click_SearchText();
		
		ProductDispalyPage pdp=new ProductDispalyPage(driver);
		pdp.click_btnaddtocart();
		boolean msg=pdp.PdtAddedtocartMsg();
//		if(msg=true)
//		{
//			Assert.assertTrue(true);
//		}
//		else
//		{
//			Assert.assertTrue(false);
//		}
		pdp.Click_lnkshoppingCart();
		
		ShoppingCartPage scp=new ShoppingCartPage(driver);
		String returnValue = scp.pdtsInShoppingCart();
		
		if(returnValue.equals(text))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		System.out.println(text);
		System.out.println(returnValue);
			
		
	}

}
