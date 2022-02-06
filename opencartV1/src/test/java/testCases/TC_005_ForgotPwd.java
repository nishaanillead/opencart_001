package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ForgotPwdPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_005_ForgotPwd extends BaseClass{
	
	@Test
	public void test_forgotpwd() throws IOException
	{
		
		logger.info("Starting TC_005_ForgotPwd");
		try
		{
		
		HomePage hp=new HomePage(driver);
		hp.clickmyacc();
		hp.clicklogin();
		logger.info("clicked loginbutton in the homepage");
		
		LoginPage lp=new LoginPage(driver);
		lp.clickforgotpwd();
		logger.info("clicked fogorpassword link");
		
		ForgotPwdPage fp=new ForgotPwdPage(driver);
		fp.setEmailid(rb.getString("loginemail"));
		logger.info("provided emailid");
		fp.clickcontinue();
		logger.info("clicked continue button");
		
		String exp_msg="An email with a confirmation link has been sent your email address.";
		
		String act_msg=fp.confirmessg();
		if(act_msg.equals(exp_msg))
		{
			logger.info("forgorpasswordtest successful");
			Assert.assertTrue(true);	
		}
		else
		{
			logger.error("forgorpasswordtest failed");
			Assert.assertTrue(false);
			captureScreen(driver,"test_forgotpwd");
		}
		}
		catch(Exception e)
		{
			logger.fatal("test failed");
			Assert.fail();
		}
		
		logger.info("Finished TC_005_ForgotPwd");

		
	}
	
	

}
