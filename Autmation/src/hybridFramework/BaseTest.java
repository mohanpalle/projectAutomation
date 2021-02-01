package hybridFramework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConsts {
	static WebDriver driver;
	
	public void openBrowser() throws IOException
	{
		Flib flib = new Flib();
		String browserValue = flib.readPropertyData(PROP_PATH,"browser");// getting the value from prop file
		
		//RunTimePolymorphism
		if(browserValue.equals("chrome"))
		{
			System.setProperty(CHROME_KEY,CHROME_PATH);// reading the data from IautoConsts 
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			String url = flib.readPropertyData("./data/config.properties", "url");
			driver.get(url);
		}
		else if(browserValue.equals("firefox"))
		{
			System.setProperty(GECKO_KEY,GECKO_PATH);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			String url = flib.readPropertyData(PROP_PATH, "url");
			driver.get(url);
		}
		
		else
		{
			System.out.println("invalid input");
		}
	}
	
	
	
	
	public void closeBrowser() //method to close the browser
	{
		driver.close();
	}
	
	public void quitBrowser()// method to quit the browsers
	{
		driver.quit();
	}
	

}