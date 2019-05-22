package autobrainTests;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.Assert;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import TestBase.testbase;
import autobrainPages.CreateAccount;

public class testCreateAccount extends testbase{
	
	public WebDriver driver;

 
 @Test(priority=0)
 public void testCreateAccountWithoutDetails() throws InterruptedException, IOException
	{
	   driver= intializeBrowser();
	 
        CreateAccount account=PageFactory.initElements(driver, CreateAccount.class);
     
        account.clickOnMenu();
        account.clickOnLoginLink();
        account.clickOnSignUp();
        account.clickOnSubmit();
        
        
        SoftAssert softassert =new SoftAssert();
        String error1=driver.findElement(By.xpath("//*[@id='new_user']/small[1]")).getText();
        String error2=driver.findElement(By.xpath("//*[@id='new_user']/small[2]")).getText();
        String error3=driver.findElement(By.xpath("//*[@id='new_user']/small[3]")).getText();
        String error4=driver.findElement(By.xpath("//*[@id='new_user']/small[4]")).getText();
        String error5=driver.findElement(By.xpath("//*[@id='new_user']/small[5]")).getText();
        String error6=driver.findElement(By.xpath("//*[@id='new_user']/small[6]")).getText();
        
        
        String Expected1="cannot be blank";
        String Expected2="is invalid";
        String Expected3="must be 10 digits";
        String Expected4="must be at least 6 characters";
        String Expected5="does not match password";
        
        Assert.assertEquals(error1,Expected1);
        Assert.assertEquals(error2,Expected1);
        Assert.assertEquals(error3,Expected2);
        Assert.assertEquals(error4,Expected3);
        Assert.assertEquals(error5,Expected4);
        Assert.assertEquals(error6,Expected5);
        softassert.assertAll();
        
        
	}
	@Parameters({"fname"})
	@Test(priority=1)
	public void testWithFirstNameOnly(String fname)
	{
		CreateAccount account=PageFactory.initElements(driver, CreateAccount.class);
	    account.enterFirstName(fname);		
		account.clickOnSubmit();
		
		
		
		    SoftAssert softassert =new SoftAssert();
	       
	        String error1=driver.findElement(By.xpath("//*[@id='new_user']/small[2]")).getText();
	        String error2=driver.findElement(By.xpath("//*[@id='new_user']/small[3]")).getText();
	        String error3=driver.findElement(By.xpath("//*[@id='new_user']/small[4]")).getText();
	        String error4=driver.findElement(By.xpath("//*[@id='new_user']/small[5]")).getText();
	        String error5=driver.findElement(By.xpath("//*[@id='new_user']/small[6]")).getText();
	        
	        
	        String Expected1="cannot be blank";
	        String Expected2="is invalid";
	        String Expected3="must be 10 digits";
	        String Expected4="must be at least 6 characters";
	        String Expected5="does not match password";

	        Assert.assertEquals(error1,Expected1);
	        Assert.assertEquals(error2,Expected2);
	        Assert.assertEquals(error3,Expected3);
	        Assert.assertEquals(error4,Expected4);
	        Assert.assertEquals(error5,Expected5);
	        softassert.assertAll();     
		
	}
	
	@Parameters({"lname"})
	@Test(priority=2)
	public void testwithLastNameOnly(String lname)
	{
		CreateAccount account=PageFactory.initElements(driver, CreateAccount.class);
	    account.clearFirstName();
	    account.enterLastName(lname);
		account.clickOnSubmit();
		
		
        SoftAssert softassert =new SoftAssert();
        String error1=driver.findElement(By.xpath("//*[@id='new_user']/small[1]")).getText();
        String error2=driver.findElement(By.xpath("//*[@id='new_user']/small[3]")).getText();
        String error3=driver.findElement(By.xpath("//*[@id='new_user']/small[4]")).getText();
        String error4=driver.findElement(By.xpath("//*[@id='new_user']/small[5]")).getText();
        String error5=driver.findElement(By.xpath("//*[@id='new_user']/small[6]")).getText();
        
        
        String Expected1="cannot be blank";
        String Expected2="is invalid";
        String Expected3="must be 10 digits";
        String Expected4="must be at least 6 characters";
        String Expected5="does not match password";
        
        Assert.assertEquals(error1,Expected1);
        Assert.assertEquals(error2,Expected2);
        Assert.assertEquals(error3,Expected3);
        Assert.assertEquals(error4,Expected4);
        Assert.assertEquals(error5,Expected5);
        softassert.assertAll();
			
}
	
	@Parameters({"emailT"})
	@Test(priority=3)
	public void testWithEmailOnly(String emailT)
	{
		CreateAccount account=PageFactory.initElements(driver, CreateAccount.class);
	    account.clearLastName();
	    account.enterEmail(emailT);
		account.clickOnSubmit();
		
		
        SoftAssert softassert =new SoftAssert();
        String error1=driver.findElement(By.xpath("//*[@id='new_user']/small[1]")).getText();
        String error2=driver.findElement(By.xpath("//*[@id='new_user']/small[2]")).getText();
        String error3=driver.findElement(By.xpath("//*[@id='new_user']/small[4]")).getText();
        String error4=driver.findElement(By.xpath("//*[@id='new_user']/small[5]")).getText();
        String error5=driver.findElement(By.xpath("//*[@id='new_user']/small[6]")).getText();
        
        
        String Expected1="cannot be blank";

        String Expected2="must be 10 digits";
        String Expected3="must be at least 6 characters";
        String Expected4="does not match password";
        
        Assert.assertEquals(error1,Expected1);
        Assert.assertEquals(error2,Expected1);
        Assert.assertEquals(error3,Expected2);
        Assert.assertEquals(error4,Expected3);
        Assert.assertEquals(error5,Expected4);
        softassert.assertAll();
		
	}
	
	
	
	@Parameters({"pass"})
	@Test(priority=4)
	public void testWithPasswordOnly(String pass)
	{
		CreateAccount account=PageFactory.initElements(driver, CreateAccount.class);
	    account.clearEmail();
	    account.enterPassword(pass);
		account.clickOnSubmit();
		
		
        SoftAssert softassert =new SoftAssert();
        String error1=driver.findElement(By.xpath("//*[@id='new_user']/small[1]")).getText();
        String error2=driver.findElement(By.xpath("//*[@id='new_user']/small[2]")).getText();
        String error3=driver.findElement(By.xpath("//*[@id='new_user']/small[3]")).getText();
        String error4=driver.findElement(By.xpath("//*[@id='new_user']/small[4]")).getText();
        String error5=driver.findElement(By.xpath("//*[@id='new_user']/small[6]")).getText();
        
        
        String Expected1="cannot be blank";
        String Expected2="is invalid";
        String Expected3="must be 10 digits";
        String Expected4="does not match password";
        
        Assert.assertEquals(error1,Expected1);
        Assert.assertEquals(error2,Expected1);
        Assert.assertEquals(error3,Expected2);
        Assert.assertEquals(error4,Expected3);
        Assert.assertEquals(error5,Expected4);
       
        softassert.assertAll();
		
	}
	
	
	@Parameters({"CPass"})
	@Test(priority=5)
	public void testWithconfirmPasswordOnly(String CPass)
	{
		CreateAccount account=PageFactory.initElements(driver, CreateAccount.class);
		account.clearPassword();
	    account.enterConfirmPassword(CPass);
	
		
		
        SoftAssert softassert =new SoftAssert();
        String error1=driver.findElement(By.xpath("//*[@id='new_user']/small[1]")).getText();
        String error2=driver.findElement(By.xpath("//*[@id='new_user']/small[2]")).getText();
        String error3=driver.findElement(By.xpath("//*[@id='new_user']/small[3]")).getText();
        String error4=driver.findElement(By.xpath("//*[@id='new_user']/small[4]")).getText();
        String error5=driver.findElement(By.xpath("//*[@id='new_user']/small[5]")).getText();
       
        
        String Expected1="cannot be blank";
        String Expected2="is invalid";
        String Expected3="must be 10 digits";
        String Expected4="must be at least 6 characters";
        
        
        Assert.assertEquals(error1,Expected1);
        Assert.assertEquals(error2,Expected1);
        Assert.assertEquals(error3,Expected2);
        Assert.assertEquals(error4,Expected3);
        Assert.assertEquals(error5,Expected4);
        softassert.assertAll();
		
	}
	
	@Parameters({"fname","lname","InvalidE","num","pass"})
	@Test(priority=6)
	public void testWithInvalidEmail(String fname,String lname,String InvalidE,String num,String pass)
	{
	  CreateAccount account=PageFactory.initElements(driver, CreateAccount.class);
	  account.enterFirstName(fname);
	  account.enterLastName(lname);
	  account.enterInvalidEmail(InvalidE);
	  account.enterPhoneNumber(num);
	  account.enterPassword(pass);

		
	boolean actual=driver.findElement(By.xpath("//*[@id=\"new_user\"]/small[3]")).isDisplayed();
    Assert.assertTrue(actual);
		
		
	}
	
	@Parameters({"fname","lname","emailT", "Invalidnum", "pass"})
	@Test(priority=7)
	public void testWithInvalidPhone(String fname, String lname, String emailT, String Invalidnum, String pass)
	{
		CreateAccount account=PageFactory.initElements(driver, CreateAccount.class);
		account.clearEmail();
		//account.clearConfirmPassword();
	     account.clearPhoneNumber();
		  account.enterEmail(emailT);
		  account.enterPhoneNumber(Invalidnum);
	
		  //account.enterConfirmPassword(CPass);
		  account.clickOnSubmit();
		  
		 
		boolean actual=driver.findElement(By.xpath("//*[@id=\"new_user\"]/small[4]")).isDisplayed();
		Assert.assertTrue(actual);
	}

	@Parameters({"InvalidPass"})
	@Test(priority=8)
	public void testWithDifPassAResetPass(String InvalidPass)
	{
		
		CreateAccount account=PageFactory.initElements(driver, CreateAccount.class);
        account.clearPhoneNumber();
        account.clearConfirmPassword();
		account.enterInvalidPass(InvalidPass);
		
		boolean actual=driver.findElement(By.xpath("//*[@id=\"new_user\"]/small[6]")).isDisplayed();
	
	    Assert.assertTrue(actual);
	
	}
	
	
	@Parameters({"CPass"})
	@Test(priority=9)
	public void testWithoutFname(String CPass)
	{
		
		CreateAccount account=PageFactory.initElements(driver, CreateAccount.class);
        account.clearFirstName();
        account.clearConfirmPassword();
		account.enterConfirmPassword(CPass);
		
		boolean actual=driver.findElement(By.xpath("//*[@id=\"new_user\"]/small[1]")).isDisplayed();
	
	    Assert.assertTrue(actual);
	
	}
	
	@Parameters({"fname"})
	@Test(priority=10)
	public void testWithoutLname(String fname)
	{
		
		CreateAccount account=PageFactory.initElements(driver, CreateAccount.class);
        account.enterFirstName(fname);
        account.clearLastName();
		
		boolean actual=driver.findElement(By.xpath("//*[@id=\"new_user\"]/small[2]")).isDisplayed();
	
	    Assert.assertTrue(actual);
	
	}
	
	@Parameters({"lname"})
	@Test(priority=11)
	public void testWithoutEmail(String lname)
	{
		
		CreateAccount account=PageFactory.initElements(driver, CreateAccount.class);
         account.enterLastName(lname);
         account.clearEmail();
		
		boolean actual=driver.findElement(By.xpath("//*[@id=\"new_user\"]/small[3]")).isDisplayed();
	
	    Assert.assertTrue(actual);
	
	}
	
	
	@Parameters({"emailT"})
	@Test(priority=12)
	public void testWithoutPhone(String emailT)
	{
		
		CreateAccount account=PageFactory.initElements(driver, CreateAccount.class);
		account.enterEmail(emailT);
         account.clearPhoneNumber();
        
		
		boolean actual=driver.findElement(By.xpath("//*[@id=\"new_user\"]/small[4]")).isDisplayed();
	
	    Assert.assertTrue(actual);
	
	}
	@Parameters({"num"})
	@Test(priority=13)
	public void testWithoutPassword(String num)
	{
		
		CreateAccount account=PageFactory.initElements(driver, CreateAccount.class);
		account.enterPhoneNumber(num);
         account.clearPassword();
        
		
		boolean actual=driver.findElement(By.xpath("//*[@id=\"new_user\"]/small[5]")).isDisplayed();
	
	    Assert.assertTrue(actual);
	
	}

	@Parameters({"pass"})
	@Test(priority=14)
	public void testWithoutConfirmPassword(String pass)
	{
		
		CreateAccount account=PageFactory.initElements(driver, CreateAccount.class);
		account.enterPassword(pass);
         account.clearConfirmPassword();
        
		
		boolean actual=driver.findElement(By.xpath("//*[@id=\"new_user\"]/small[6]")).isDisplayed();
	
	    Assert.assertTrue(actual);
	
	}
	
	@Parameters({"CPass","Eemail"})
	@Test(priority=15)
	public void testWithAlreadyExistEmail(String CPass,String Eemail)
	{
		CreateAccount account=PageFactory.initElements(driver, CreateAccount.class);
		account.enterConfirmPassword(CPass);
		account.clearEmail();
        account.enterAlreadyExistEmail(Eemail);
		
        boolean actual=driver.findElement(By.xpath("//*[@id=\"new_user\"]/small[3]")).isDisplayed();
     	
 	    Assert.assertTrue(actual); 
	}
	

 /*  @AfterTest
   public void tearDown()
	{
	  driver.close();
		
	}*/
}



















	
	



