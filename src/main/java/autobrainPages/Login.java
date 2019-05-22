package autobrainPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import Helper.Helper;

public class Login {
	
public WebDriver driver;

   @FindBy(xpath="//*[@id=\"top_wrapper\"]/div[1]/div[3]/button/span[2]")
	WebElement menu;
   @CacheLookup
	
	@FindBy(linkText="Login")
	WebElement LoginLink;
   @CacheLookup
   
    @FindBy(name="user[email]")
	WebElement username;
    @CacheLookup
	
	@FindBy(id="user_password")
	WebElement pass;
    @CacheLookup

	@FindBy(xpath="//input[@type='submit']")
	WebElement LoginAuto;
    
    
    public Login(WebDriver driver)
    {
    	this.driver=driver;
    }
    
    public void clickOnMenu() throws InterruptedException
    {
    	
    Helper.clickOn(driver, menu, 5, null);
    	
    }
    
    public void  clickOnLoginLink() throws InterruptedException
    {
       Helper.clickOn(driver, LoginLink, 5, null);
	   
    }
    public void enterUsername()
    {
       Helper.sendKeys(driver, username, 3, "arvinder@ucrete.co.in");
    }
    
    public void enterPassword()
    {
    	 Helper.sendKeys(driver, pass, 3, "Kabir123");
    }
    
    
    
    public void clearUsername()
    {
    	username.clear();	
    }
    
    
    public void clearPassword()
    {
    	pass.clear();
    }
    
 
    public void ClickLogin()
    {
    Helper.clickOn(driver, LoginAuto, 3, null);
    	
    }


}
