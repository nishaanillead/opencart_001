package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.PdtComaprisonPage;
import pageObjects.ProductDispalyPage;
import pageObjects.SearchPage;
import testBase.BaseClass;

public class TC_007_PdtComparison extends BaseClass {
	
	@Test
	public void test_PdtComparison()
	{
		
		HomePage hp =new HomePage(driver);
		String text="iMac";
		hp.setSearch(text);
		hp.clickSearch();
		SearchPage sp=new SearchPage(driver);
		sp.click_SearchText();
		ProductDispalyPage pdp=new ProductDispalyPage(driver);
		pdp.click_comparePdtbtn();
		
		boolean msg=pdp.display_SuccessMsg();
		if(msg==true)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		pdp.click_pdtComplnk();
		
	//	PdtComaprisonPage pcp=new PdtComaprisonPage(driver);
		
		
//		pdp.PdtDetails();
//		if(pdp.PdtDetails()==true)
//		{
//			Assert.assertTrue(true);
//		}
//		else
//		{
//			Assert.assertTrue(false);
//		}
		
		
//		String text2=.getPdtname();
		
//		if(text.equals(text2))
//		{
//			Assert.assertTrue(true);
//		}
//		else
//		{
//			Assert.assertTrue(false);
//		}
//		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
