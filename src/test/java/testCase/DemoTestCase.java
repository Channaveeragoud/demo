package testCase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.DemoHomePage;
import pageObject.DemoPageObjects;
import testBase.BaseClass;

public class DemoTestCase extends BaseClass
{
	

	@Test(priority = 1)
	public void registrationTestCase()
	{
		try
		{
		logger.info("test case started");
		driver.get("https://demowebshop.tricentis.com/");
		logger.info("Home Page");
		driver.manage().window().maximize();
		DemoHomePage dhp=new DemoHomePage(driver);
		dhp.clickonregister();
		logger.info("clicked on register");
		DemoPageObjects po=new DemoPageObjects(driver);
				po.selgender();
				logger.info("selected gender");
				po.fstname("swara");
				logger.info("entered first name");
				po.lastname("gouda");
				logger.info("entered second name");
				po.usemail(RandomStringUtils.randomAlphabetic(5)+"@gmail.com");
				logger.info("email entered");
				po.password("swara123");
				logger.info("password ");
				po.confpwd("swara123");
				logger.info("conf password entered");
				po.submitreg();
				logger.info("submitted register");
				
				String confrmmsg=po.getconfmsg();
				
				{
				if(confrmmsg.equals("Your registration completed1"))
				{
					logger.info("testcase Successful");
					Assert.assertTrue(true);
				}
				
				else
				{
					logger.error("testcase failed");
					Assert.assertTrue(false);
				}
				}
		}
		catch(Exception e)
		{
			logger.error("testcase failed");
			Assert.assertTrue(false);
		}
		logger.info("test case ended");
		}
				
				
		
	}
	
	
	
	

