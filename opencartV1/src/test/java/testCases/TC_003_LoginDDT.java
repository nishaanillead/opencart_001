package testCases;

import java.io.File;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyaccountPage;
import testBase.BaseClass;
import utilities.XLUtility;


public class TC_003_LoginDDT extends BaseClass 
{
	@Test(dataProvider="loginDDT")
	public void test_loginDDT(String email,String pwd,String exp) throws IOException
	{
	
	HomePage hp=new HomePage(driver);
	hp.clickmyacc();
	hp.clicklogin();
	logger.info("Clicked on login button ");
	
	
	LoginPage lp=new LoginPage(driver);
	lp.setloginemail(email);
	lp.setloginpwd(pwd);
	lp.clicklogin();
	
	boolean status=lp.isMyaccountPageExists();
	
	if(exp.equals("valid"))
	{
		if(status==true)
	{
		logger.info("logintest successful");
		MyaccountPage mp=new MyaccountPage(driver);
		mp.clicklogout();
		Assert.assertTrue(true);
		
	}
	else
	{
		logger.error("Logintest failed");
		Assert.assertTrue(false);
		captureScreen(driver,"test_loginDDT");
	}
	
	}
	
	if(exp.equals("invalid"))
	{
		if(status==true)
		{
			logger.info("logintest failed");
			MyaccountPage mp=new MyaccountPage(driver);
			mp.clicklogout();
			Assert.assertTrue(false);
		}
		else
		{
			logger.info("logintest successful");
			Assert.assertTrue(true);
			
		}
		
	}

	}	


@DataProvider(name="loginDDT")
public String[][] loginDataDriven() throws IOException

{
	String path=System.getProperty("user.dir")+"\\testData\\loginDDT .xlsx";
	//String path=System.getProperty(new File(".").getCanonicalPath() + "\\testData\\loginDDT .xlsx");
	
	//XLUtility XLUtils=new XLUtility(new File(".").getCanonicalPath() + path);
	XLUtility XLUtils=new XLUtility(path);
	int row_num=XLUtils.getRowCount("Sheet1");
	int cell_num= XLUtils.getCellCount("Sheet1", 1);
	
	String logindata[][]=new String[ row_num][cell_num];
	
	for(int i=1;i<row_num;i++)
	{
		for(int j=0;j<cell_num;j++)
		{
			
		 logindata[i-1][j]=XLUtils.getCellData("Sheet1", i, j);
		}
		
	}
	return logindata;
	
	
}


}
