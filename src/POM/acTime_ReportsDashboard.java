package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class acTime_ReportsDashboard 
{
	@FindBy(xpath="//span[.='New Report']")
	private WebElement reportbutton;
	
	public acTime_ReportsDashboard(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void click()
	{
		reportbutton.click();
	}
	
}
