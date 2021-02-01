package ScreenShotUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomListener.class)
public class ScreenShot extends Base{
	
	@BeforeMethod
	public void setUp()
	{
		initialize();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

	
//	@Test// test case which will fail
//    public void  VerifyTheLoginPageTitle()
//    {
//		String title = new WebDriverCommonLib().getTitleOfWebPage();
//		Assert.assertEquals(title, "act - Login");
//    }
	
	@Test// test case which will fail
    public void flipkart2()
    {
		Assert.assertEquals(false, true);
    }
	
	
	
	@Test// test case which will fail
    public void  flipkart3()
    {
		Assert.assertEquals(false, true);
    }
	
	
	
	@Test// test case which will fail
    public void  flipkart4()
    {
		Assert.assertEquals(false, true);
    }
	
	
	
	
	@Test// test case which will fail
    public void flipkart5()
    {
		Assert.assertEquals(false, true);
    }
	
	
	
	@Test// test case which will fail
    public void  flipkart6()
    {
		Assert.assertEquals(false, true);
    }
	
	
	
}