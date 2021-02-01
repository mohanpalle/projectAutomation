package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class actiTime {
	
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-quhe408/login.do");
		
	}


	
	@DataProvider(name = "TestInvalidData")
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		
		data[0][0]="admin";
		data[0][1]="manager123";
		
		data[1][0]="admin$123";
		data[1][1]="manager123$123";
		
		data[2][0]="admin$123";
		data[2][1]="manager123$123";
		
		
		return data;
		
	}


	@Test(dataProvider ="TestInvalidData")
	public void f(String username,String password) throws InterruptedException {
		
		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(3000);
		driver.findElement(By.name("pwd")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		
		
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}

