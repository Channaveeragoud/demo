package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoHomePage {
WebDriver driver;
public DemoHomePage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
	
	
	@FindBy(xpath = "//a[@class='ico-register']")
	WebElement lnkregister;
	
	@FindBy(xpath = "//a[@class='ico-login']")
	WebElement lnklogin;
	
	
	public void clickonregister() 
	 {
		 lnkregister.click();
		
	}
	public void clickononlogin()
	{
		lnklogin.click();
		
	}

}
