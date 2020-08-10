package Genericscripts;

import org.openqa.selenium.WebDriver;

public class Webdriver {
	
	public void geturl(WebDriver driver,String a)
	{
		driver.get(a);
	}
	
	public void getwebtitle(WebDriver driver,String a)
	{
		driver.getTitle();
	}


}
