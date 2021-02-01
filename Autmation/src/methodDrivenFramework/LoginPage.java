package methodDrivenFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement pass;
	@FindBy(id="loginButton") private WebElement loginbutton;
	
	
	
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public WebElement getUsn() {
		return usn;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getloginbutton() {
		return loginbutton;
	}
	
	
	
	public void loginProces(String username,String password) throws InterruptedException
	{
		Thread.sleep(3000);
//usn.click();
//usn.sendKeys(username);
		pass.sendKeys(password);
		loginbutton.click();
	}
	
	
	
	

}
