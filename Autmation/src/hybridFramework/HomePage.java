package hybridFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//a[@class='content users']") private WebElement users;
	@FindBy(xpath="//a[@class='content administration']") private WebElement settings;
	@FindBy(xpath="//a[@class='content reports']") private WebElement reports;
	public WebElement getUsers() {
		return users;
	}
	public WebElement getSettings() {
		return settings;
	}
	public WebElement getReports() {
		return reports;
	}
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnUser()
	{
		users.click();
	}
	
	
	public void cklickOnReports()
	{
		reports.click();
	}
	
}