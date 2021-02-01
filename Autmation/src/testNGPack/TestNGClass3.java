package testNGPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGClass3 {
	@Test(dependsOnMethods = "login",priority = 2,alwaysRun = true)
	public void homePage()
	{
		Reporter.log("Home page",true);
	}
	
	@Test(priority=0)
	public void login()
	{
	    
		Reporter.log("login successful",true);
		
	}
	
	@Test(priority = 3,dependsOnMethods = "homePage")
	public void logout()
	{
		Reporter.log("logout successful",true);
	}
}
