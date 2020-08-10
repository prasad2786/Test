package Testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Loginacti 
{
	@Test
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		Thread.sleep(3000);
		String title=driver.getTitle();
		System.out.println(title);
		

		SoftAssert sa=new SoftAssert();
		sa.assertEquals("actiTIME - Login123", title);
		sa.assertAll();
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[.='TASKS']")).click();
		Thread.sleep(3000);
		
		String title1=driver.getTitle();
		System.out.println(title1);
		Assert.assertEquals("actiTIME - Tasklist123", title1);
		
	}
}
