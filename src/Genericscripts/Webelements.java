package Genericscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Webelements {

	public void fetchelements(WebElement ele,String a)
	{
		ele.findElements(By.tagName(a));
	}
	
}