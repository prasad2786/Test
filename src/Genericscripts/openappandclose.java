package Genericscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class openappandclose 
{
	public WebDriver driver;
	static
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
	}

	@BeforeTest
	public void openapp() throws InterruptedException
	{
	
	driver=new FirefoxDriver();
	
	driver.get("https://www.facebook.com/");
	
	Thread.sleep(2000);
	}
	
	@AfterTest
	public void closeapp() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
}
