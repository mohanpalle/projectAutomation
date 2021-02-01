package snippet;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Grid_2 {
	WebDriver driver;
	String baseUrl,nodeURL;
	
	
	@BeforeTest
	public void setUp() throws MalformedURLException
	{
		
		baseUrl="https://www.google.com";
		nodeURL="http://192.168.1.100:4444/wd/hub";
		
		
		DesiredCapabilities capability=DesiredCapabilities.chrome();
		capability.setBrowserName("chrome");
		capability.setPlatform(Platform.WINDOWS);
		driver=new RemoteWebDriver(new URL(nodeURL),capability);
			
	}
	
	@AfterTest
	public void afterTest()
	{
		driver.quit();
	}
	
	@Test
	public void simpleTest()
	{
		driver.get(baseUrl);
		driver.switchTo().activeElement().sendKeys("selenium grid");
	}

}