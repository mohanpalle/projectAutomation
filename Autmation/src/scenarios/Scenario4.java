package scenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Scenario4 {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("//input[@id='gh-ac']"));
		
		WebElement dropdown = driver.findElement(By.id("gh-cat"));
		Select sel = new Select(dropdown);
		
		sel.selectByValue("267");
		
		List<WebElement> li = sel.getAllSelectedOptions();
		
		
		for(WebElement we:li)
		{
			String data = we.getText();
		}
	}

}
