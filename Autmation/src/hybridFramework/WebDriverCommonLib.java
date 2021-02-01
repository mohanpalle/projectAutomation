package hybridFramework;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;
// this class contains the methods which can be reused  in several test script depending on the requirment
public class WebDriverCommonLib extends BaseTest {

	public String getTitleOfTheWebPage()
	{
		String titleOfWebpage = driver.getTitle();
		return  titleOfWebpage;
	}

	public void verifyTheTitleOfTheWebpage(String expectedTitle,String actualtitle,String pageName)
	{
		if(expectedTitle.equals(actualtitle))
		{
			System.out.println("The " +pageName+ " page is displayed : TEST CASE IS PASSED");
		}

		else 
		{
			System.out.println("The " +pageName+ " page is not displayed : TEST CASE IS FAILED");

		}
		
	}
	
	public void selectDropDownByIndex(WebElement element,int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	
	
	public void selectDropDownByVisibleText(WebElement element,String text)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	
	public void selectDropDownByValue(WebElement element,String value)
	{
		Select sel = new Select(element);
		sel.selectByValue(value);
	}
	
	public void switchFrameByindex(int index)
	{
		driver.switchTo().frame(index);
	}
	
	
	public void switchFrameByNameOrId(String nameOrId )
	{
		driver.switchTo().frame(nameOrId);
	}

	
	public void switchFrameByindex(WebElement frameAddress)
	{
		driver.switchTo().frame(frameAddress);
	}
	
	public void  takeTheScreenShot(String folderName,String fileName) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File ss = new File("./"+folderName+"/"+fileName+".png");
		Files.copy(src, ss);
		
	
		
	}
	
	public void waitForlement(int time)
	{
		driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);
	}
	
	
	public void waitForPageLoad(int time,String expectedTitle)
	{
		WebDriverWait wait = new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.titleContains(expectedTitle));
	}
	
	
	
	public void mouseHover(WebElement ele)
	{
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
	}
	
	
	public void rightClick(WebElement ele)
	{
		Actions act = new Actions(driver);
		act.contextClick(ele).perform();
	}
	
	public void doubleClick(WebElement ele)
	{
		Actions act = new Actions(driver);
		act.doubleClick(ele).perform();
	}
	
	
	public void dragAndDrop(WebElement srcElement,WebElement targetElement)
	{
		Actions act = new Actions(driver);
		act.dragAndDrop(srcElement, targetElement).perform();
	}
	
	
	public void VerifyTheErrorMessgae(String expectedErrorMsg,String actualErrorMessage)
	{
		if(expectedErrorMsg.equalsIgnoreCase(actualErrorMessage))
		{
			System.out.println("Error message Test cas is pass");
		}
		else
		{
			System.out.println("Error message Test Case is failed");
		}
	}
		
}