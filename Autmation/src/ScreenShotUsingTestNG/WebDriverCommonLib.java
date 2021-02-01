package ScreenShotUsingTestNG;

public class WebDriverCommonLib extends Base{
	
	
	public String getTitleOfWebPage()
	{
		String title = driver.getTitle();
		return title;
		
	}
	
	
	
//	public void verifyTitle(String actual,String expected,String pageName)
//	{
//	if(actual.equals(expected))
//	{
//		System.out.println("Test Case is pass");
//	}
//	
//	else
//	{
//		
//	}
//	}

}
