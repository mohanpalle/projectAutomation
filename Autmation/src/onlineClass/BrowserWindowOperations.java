package onlineClass;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		Dimension d=new Dimension(800, 200);
		driver.manage().window().setSize(d);

	}

}
