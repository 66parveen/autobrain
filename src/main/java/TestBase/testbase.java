package TestBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class testbase {

	public WebDriver driver;
	
	public WebDriver intializeBrowser() throws IOException
	{
	Properties prop=new Properties();
	FileInputStream fis= new FileInputStream("/home/ucreate-8/Public/autobrain/src/main/java/Resources/data.properties");
	prop.load(fis);
	
	String browserName=prop.getProperty("browser");

	
	if(browserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "/home/ucreate-8/Downloads/chromedriver_linux64/chromedriver");
		driver=new ChromeDriver();
	}
	
	else if(browserName.equals("firefox"))
	{
		System.setProperty("","");
		driver=new FirefoxDriver();
	}
	
	else if(browserName.equals("IE"))
	{
		System.setProperty("", "");
		driver=new InternetExplorerDriver();
	}
	
    driver.get("https://www.autobrain.com/");
	return driver;
}



}


