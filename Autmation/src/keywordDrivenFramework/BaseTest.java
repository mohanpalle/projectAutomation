package keywordDrivenFramework;


	import java.io.IOException;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class BaseTest {

	    static WebDriver driver;
		public void openBrowser() throws IOException, InterruptedException
		{
			ReadProperty browser = new ReadProperty();
			String browserValue = browser.getPropertyData("./data/config.properties", "browser");
			String urlValue = browser.getPropertyData("./data/config.properties", "url");
			
			

			if(browserValue.equals("chrome"))
			{   
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				driver=new ChromeDriver();
				driver.get(urlValue);
				

			}

			else if(browserValue.equals("firefox"))
			{

				System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
				driver=new FirefoxDriver();
				driver.get(urlValue);
			
			}
			else
			{
				System.out.println("Invalid browser");
			}

		}


		public void closeBrowser()
		{
			driver.close();
		}


	}


