package onlineClass;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Title {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com");
		
//		String sourcePage=driver.getPageSource();	
//		System.out.println(sourcePage);
//		
		String title=driver.getTitle();
		System.err.println(title);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		driver.quit();

	}

}
