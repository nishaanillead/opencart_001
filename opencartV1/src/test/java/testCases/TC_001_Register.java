package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegisterPage;
import testBase.BaseClass;

public class TC_001_Register extends BaseClass{
	
	
	@Test
	public void test_Register() throws InterruptedException, IOException
	{
		logger.info("Starting TC_001_Register");
		
		HomePage hp=new HomePage(driver);
		hp.clickmyacc();
		logger.info("clicked on my account");
	
	hp.clickregister();
	logger.info("clicked on Register button");
	
	RegisterPage rp=new RegisterPage (driver);
	rp.setfname("nisha");
	logger.info("Provided firstname");
	rp.setlname("mohan");
	logger.info("Provided lastname");
	rp.setemail(randomstring()+"@gmail.com");
	logger.info("Provided email");
	rp.setphone("12345678");
	logger.info("Provided phonenumber");
	rp.setpwd("nishamohan");
	logger.info("Provided password");
	rp.setconfirmpwd("nishamohan");
	logger.info("confirmed password");
	rp.clickprvcyplcy();
	logger.info("clicked on privacypolicy checkbox");
	rp.clickcontinue1();
	logger.info("clicked on continue button");
	Thread.sleep(3000);
	String msg=rp.confirmregistration();
	
	if(msg.equals("Your Account Has Been Created!!!"))
	{
		logger.info("Registration is success");
		Assert.assertTrue(true);
		
	}
	else
	{
		captureScreen(driver,"test_Register");
		logger.error("Registration is failed");
		Assert.assertTrue(false);
	}

		logger.info("Finished TC_001_Register");
		
	
	}
	
	
	
	

	

}
