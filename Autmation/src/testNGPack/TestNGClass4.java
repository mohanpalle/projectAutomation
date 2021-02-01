package testNGPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGClass4 {
	@Test(description = "https://www.google.com is launched")
	public void launchUrl()//4
	{
		Reporter.log("Hi I am from E",true);
	}
	
	@Test(priority=2)//1
	public void a()
	{
	    
		Reporter.log("Hi I am From A",true);
		
	}
	
	@Test(priority = 3)//5
	public void b()
	{
		Reporter.log("Hi I am from B",true);
	}
	
	
	@Test()
	public void c()//2
	{
		Reporter.log("Hi  I am from C",true);
	}
	
	
	@Test()
	public void d()//3
	{
		Reporter.log("Hi  I am from D",true);
	}

}
