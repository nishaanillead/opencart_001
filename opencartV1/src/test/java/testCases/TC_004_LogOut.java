package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.LogoutPage;
import pageObjects.MyaccountPage;
import testBase.BaseClass;

public class TC_004_LogOut extends BaseClass

{
	
	@Test
	public void test_logout()
	{
		logger.info("starting TC_004_LogOut");
		try
		{
		
		HomePage hp=new HomePage(driver);
		hp.clickmyacc();
		hp.clicklogin();
		logger.info("clicked loginbutton");
		
		LoginPage lp=new LoginPage(driver);
		lp.setloginemail(rb.getString("loginemail"));
		logger.info("Provided emailid");
		lp.setloginpwd(rb.getString("loginpwd"));
		logger.info("Provided password");
		lp.clicklogin();
		logger.info("clicked on login");
		
		MyaccountPage mp=new MyaccountPage(driver);
		mp.clicklogout();
		logger.info("clicked on logout button");
		
		LogoutPage lgp=new LogoutPage(driver);
		boolean status=lgp.islogoutheaderdisplayed();
		if(status==true)
		{
			logger.info("logout test is success");
			Assert.assertTrue(true);
		}
		else
		{
			logger.error("logout test is failed");
			Assert.assertTrue(false);
			captureScreen(driver,"test_logout");
		}
		}
		catch(Exception e)
		{
			logger.fatal("logout is fail");
			Assert.fail();
		}
		
		logger.info("finished TC_004_LogOut");
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
