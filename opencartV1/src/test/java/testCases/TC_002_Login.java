package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_002_Login extends BaseClass {
	
	@Test
	public void test_login()
	
	{
		
		logger.info("Sarting TC_002_Login");
		try
		{
		HomePage hp=new HomePage(driver);
		hp.clickmyacc();
		hp.clicklogin();
		logger.info("login page opens");
		
		LoginPage  lp= new LoginPage (driver);
		lp.setloginemail(rb.getString("loginemail"));
		logger.info("provided loginemail");
		lp.setloginpwd(rb.getString("loginpwd"));
		logger.info("provided password");
		lp.clicklogin();
		logger.info("clicked login button");
		
		boolean status=lp.isMyaccountPageExists();
		if(status==true)
		{
			logger.info("login is success");
			Assert.assertTrue(true);
		}
		else
		{
			logger.error("login failed");
			Assert.assertTrue(false);
		}
		}
		catch(Exception e)
		{
			logger.fatal("login failed");
			Assert.fail();
		}
		
		logger.info("Finished TC_002_Login");
	
		
	}
	
	
	
	
	
	
	
	
	
	

}
