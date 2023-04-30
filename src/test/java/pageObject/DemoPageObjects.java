package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoPageObjects
{
	WebDriver driver;
	

	
	@FindBy(xpath = "//input[@id='gender-male']")
	WebElement lnkgender;
	
	 @FindBy(xpath = "//input[@id='FirstName']")
	 WebElement txtfname;
	 
	 @FindBy(xpath = "//input[@id='LastName']")
	 WebElement txtlname;
	 
	 @FindBy(xpath = "//input[@id='Email']")
	 WebElement txtemail;
	 
	 @FindBy(xpath = "//input[@id='Password']")
	 WebElement txtpwd;
	 
	 @FindBy(xpath = "//input[@id='ConfirmPassword']")
	 WebElement txtconfpwd;
	
	 @FindBy(xpath = "//input[@id='register-button']")
	 WebElement regbutton;
	 
	 @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]")
	 WebElement confmsg;
	 public DemoPageObjects(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	 public void selgender() 
	 {
		 lnkgender.click();
	}
	 
	 public void fstname(String fname) 
	 {
		 txtfname.sendKeys(fname);
		
	}
	 
	 public void lastname(String lname) 
	 {
		 txtlname.sendKeys(lname);
		
	}
	 public void usemail(String email) 
	 {
		 txtemail.sendKeys(email);
		 
		
	}
	 public void password(String pwd) 
	 {
		 txtpwd.sendKeys(pwd);
	}
	 public void confpwd(String cpwd)
	 {
		 txtconfpwd.sendKeys(cpwd);
		
	}
	 public void submitreg() 
	 {
		 regbutton.click();
		
	}
	 
	 public String getconfmsg() 
	 {
		 return confmsg.getText();
		
	}

}


