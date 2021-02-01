package handlingtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class TableHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/HP/Desktop/tab.html");
		Thread.sleep(7000);
		
		List<WebElement> alltrs=driver.findElements(By.tagName("tr"));
		System.out.println("The number of trs present in the table : "+alltrs.size());
		 
		WebElement table2=driver.findElement(By.id("table2"));
		List<WebElement> alltds=driver.findElements(By.tagName("td"));
		System.out.println("The number of tds:" +alltds.size());
		
		WebElement tr1 = driver.findElement(By.xpath("//tr[1]"));
		  List<WebElement> tdsinrow1 = tr1.findElements(By.tagName("td"));
		  System.err.println("The number of tds in row 1 : "+tdsinrow1.size() );
		  for(WebElement tdValues:tdsinrow1)
		  {
			  System.out.println(tdValues.getText());
		  }

	}

}
