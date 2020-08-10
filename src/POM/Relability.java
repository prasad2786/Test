package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Relability 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://localhost/login.do");
		
		Thread.sleep(2000);
		
		WebElement ele=driver.findElement(By.xpath("//div[.='Login ']"));
		
		ele.click();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		ele.click();
	}
}
