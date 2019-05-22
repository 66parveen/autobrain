package autobrainPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import Helper.Helper;

public class CreateAccount {
	
public WebDriver driver;


    @FindBy(xpath="//*[@id=\"top_wrapper\"]/div[1]/div[3]/button/span[2]")
	WebElement menu;
    @CacheLookup
	
	@FindBy(linkText="Login")
	WebElement LoginLink;
    @CacheLookup

	@FindBy(linkText="SIGN UP")
	WebElement SignUp;
    @CacheLookup
	
    @FindBy(xpath="//input[@id='user_first_name']")
	WebElement firstname;
    @CacheLookup

    @FindBy(xpath="//input[@id='user_last_name']")
	WebElement lastname;
    @CacheLookup

    @FindBy(xpath="//input[@id='user_email']")
	WebElement email;
    @CacheLookup

    @FindBy(xpath="//*[@id='user_contacts_attributes_0_data']")
	WebElement phonenumber;
    @CacheLookup

    @FindBy(xpath="//*[@id='user_password']")
	WebElement password;
    @CacheLookup

    @FindBy(xpath="//*[@id='user_password_confirmation']")
	WebElement confirmpassword;
    @CacheLookup
    
    @FindBy(xpath="//*[@type='submit']")
   	WebElement submit;
   
    
    public CreateAccount(WebDriver driver)
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
    
    
    public void  clickOnSignUp() throws InterruptedException
    {
    	Helper.clickOn(driver, SignUp, 10, null);

    }
    
    
    public void enterFirstName(String fname)
    {
    	
     Helper.sendKeys(driver, firstname, 5, fname);
  
    }
    
    
    public void enterLastName(String lname)
    {
    	Helper.sendKeys(driver, lastname, 5, "Singh");
    
		
    }
    
    public  void enterEmail(String emailT)
    {
    	Helper.sendKeys(driver, email, 5, emailT);
    
    }
    
    public  void enterPhoneNumber(String num)
    {
    	
    Helper.sendKeys(driver, phonenumber, 5, num);

    }
    
    public  void enterPassword(String pass)
    {
    	Helper.sendKeys(driver, password, 5, pass);
    
    }
    
    
    public void enterConfirmPassword(String CPass)
    {
    	Helper.sendKeys(driver, confirmpassword, 5, CPass);
    	
    	
    }
    
    
    public void enterInvalidEmail(String InvalidE)
    {
    	Helper.sendKeys(driver, email, 8, InvalidE);
    	
    }
    
    public void clearFirstName()
    {
    	firstname.clear();

    	
    }
    
    
    public void clearLastName()
    {
    	lastname.clear();
		
    	
    }
    
    public void clearEmail()
    {
    	email.clear();
	
    	
    }
    
    public void clearPassword()
    {
    	password.clear();
		
    	
    }
    public void clearConfirmPassword()
    {
    	confirmpassword.clear();
		
    	
    }
    
    public void clearPhoneNumber()
    {
    	
    phonenumber.clear();
		
    	
    }
    
    public void enterInvalidPass(String InvalidPass)
    {
    	Helper.clickOn(driver, confirmpassword, 3, InvalidPass);
    
    	
    }
    
    public void enterAlreadyExistEmail(String Eemail)
    {
    	Helper.clickOn(driver, confirmpassword, 3, Eemail);
    
    	
    }
    
    
    public void  clickOnSubmit()
    {
    	Helper.clickOn(driver, submit, 3, null);
	
    	
    }

}
