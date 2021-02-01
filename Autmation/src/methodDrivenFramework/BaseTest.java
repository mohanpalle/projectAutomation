package methodDrivenFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {


	static WebDriver  driver;
	public void setUp() throws IOException
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get(	new Flib().getPropertyData("./data/config.properties", "url"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}



	public void tearDown()
	{
		driver.quit();
	}

}
