package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SearchPage;
import testBase.BaseClass;

public class TC_006_Search extends BaseClass {
	
	@Test
	public void test_Search()
	{
		logger.info("Starting TC_006_Search");
		HomePage hp=new HomePage(driver);
		String searchValue = "iMac";
		hp.setSearch(searchValue);
		hp.clickSearch();
		SearchPage sp=new SearchPage(driver);
		String srchtext=sp.getSearchtext();
		if(srchtext.equals(searchValue))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
