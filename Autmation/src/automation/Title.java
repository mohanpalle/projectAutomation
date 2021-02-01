package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Title {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		//used to launch the browser/open the browser
		WebDriver driver=new FirefoxDriver();
		
		//this get() is used to launch the browser
		driver.get("https://www.google.com/");
		//this quit method is used to close the parent browser window along with all of its child browser windows
//		driver.quit();
		//this method is used to get the title of the current webpage 
		String title = driver.getTitle();
		System.out.println(title);
		//this method is used to get the source code of current webpage of an web application
		String sourceCode = driver.getPageSource();
		System.out.println(sourceCode);
		
		

	}

}

