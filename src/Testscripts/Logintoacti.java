package Testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import POM.actitimelogin;

public class Logintoacti 
{
	@Test
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		Thread.sleep(3000);
		
		actitimelogin p1=new actitimelogin(driver);
		p1.setuname("admin");
		p1.setpwd("manager");
		p1.click();
		

		
		
	}
}
