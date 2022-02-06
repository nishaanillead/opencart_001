package testBase;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	
	public Logger logger; //make it as a global variable
	public ResourceBundle rb;
	
	@BeforeClass
	@Parameters({"browser"})
	public void setup(String br)
	{
		rb=ResourceBundle.getBundle("config"); //load config.properties file
		
		logger=LogManager.getLogger(this.getClass()); // initiate the logger variable inside the setup method.
		//this.getClass() method will dynamically get the classname whichever is executing at the runtime and will substitute that inside the logger.
		
		if(br.equals("chrome"))
		{
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();	
		logger.info("Launched the chromebrowser");
		}
		else if(br.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			logger.info("Launched the edgedriver");
		}
		else if(br.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			logger.info("Launched the firefoxdriver");
		}
		
		driver.get(rb.getString("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterClass
	public void teardown()
	
	{
		driver.close();
	}
	
	
	public String randomstring()
	{
		String generatedString=RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}
	
	public int randomnumbers()
	{
		String generatednumber=RandomStringUtils.randomNumeric(5);
		return (Integer.parseInt(generatednumber));
	}
	
	public void captureScreen(WebDriver driver,String tname) throws IOException
	{
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target= new File(System.getProperty("user.dir")+"\\screenshots\\"+tname+".png");
		FileUtils.copyFile(source, target);

	}
	
	
	
	
	
	
	
	
	

}
