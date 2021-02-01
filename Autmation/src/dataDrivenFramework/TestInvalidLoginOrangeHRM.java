package dataDrivenFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestInvalidLoginOrangeHRM {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		//it is used to launch the browser/or to open the browser
		WebDriver driver =new FirefoxDriver();
		//it is used to maximize the browser
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Flib flib = new Flib();
		int rc = flib.getRowCount("./data/OrangeHRMTestData.xlsx", "InvalidCredentials");
		for(int i=1;i<=rc-1;i++)// this is needed to iterate the rows for multiple rows
		{
		String username = flib.getCellData("./data/OrangeHRMTestData.xlsx", "InvalidCredentials", i, 0);
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		Thread.sleep(3000);
		String password = flib.getCellData("./data/OrangeHRMTestData.xlsx", "InvalidCredentials", i, 1);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		}


	}

}
