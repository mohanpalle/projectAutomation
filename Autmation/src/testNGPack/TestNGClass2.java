package testNGPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGClass2 {
  @Test(dependsOnMethods = "login", priority = 2)
  public void homepage() {
	  Reporter.log("Home Page", true);
  }
  
  @Test(priority = 0)
  public void login()
  {
	  Reporter.log("Login Successful",true);
  }
  
  @Test(priority = 3, dependsOnMethods = "login")
  
	  public void logout()
	  {
		  Reporter.log("Logout Successful",true);
	  }
}
