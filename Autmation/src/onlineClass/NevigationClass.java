package onlineClass;

import org.openqa.selenium.chrome.ChromeDriver;

public class NevigationClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.flipkart.com");
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.amazon.com");
		

	}

}
