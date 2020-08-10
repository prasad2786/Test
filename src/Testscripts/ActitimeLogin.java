package Testscripts;

import org.testng.Reporter;

import org.testng.annotations.Test;

public class ActitimeLogin 
{
	@Test(priority=1,invocationCount=2,enabled=true)
	public void test1() 
	{	
	
		Reporter.log("login",true);
		
	}
	
	@Test(priority=2,dependsOnMethods="test1")
	public void test2() 
	{
		Reporter.log("logout",true);
	}
	
}

//@BeforeSuite
//BeforeTest
//BeforeClass
//BeforeMethod
//@Test
//AfterMethod
//AfterClass
//AfterTest
//AfterSuite


//@FindBy
//@Parameters
//DataProvider