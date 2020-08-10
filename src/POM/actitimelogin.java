package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actitimelogin 
{
	@FindBy(id="username")
	private WebElement unname;
	
	@FindBy(name="pwd")
	private WebElement pwd;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement login;
	
	@FindBy(xpath="//input[@id='keepLoggedInCheckBox']")
	private WebElement checbox;
	
	
	public actitimelogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setuname(String s1)
	{
		unname.sendKeys(s1);
	}
	public void setpwd(String s1)
	{
		pwd.sendKeys(s1);
	}
	
	public void click()
	{
		login.click();
	}
	public void check()
	{
		checbox.click();
	}
}
