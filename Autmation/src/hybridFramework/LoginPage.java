package hybridFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
// We achieve the encapsulation in the POM class because we take the help of the getters and setters  to acces the private WebElements
public class LoginPage {
	//declaration
	@FindBy(name="username") private WebElement username;
	@FindBy(name="pwd") private WebElement psw;
	@FindBy(id="loginButton") private WebElement loginBtn;
	@FindBy(xpath="//span[contains(.,'invalid')]") private WebElement errMsg;
	
	
	
	//initialization
	//initElement() is used to instruct all the @FindBy to take the current WebElement Address
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

  // we use the getters to get the address of the private WebELement members
	public WebElement getUsername() {
		return username;
	}


	public WebElement getPsw() {
		return psw;
	}


	public WebElement getLoginBtn() {
		return loginBtn;
	}
	//we have created the generic reusable method because before testing any positive scenario we need to login
	public void LoginProcess(String username1,String password1) throws InterruptedException
	{
		Thread.sleep(2000);
		username.sendKeys(username1);
		Thread.sleep(2000);
		psw.sendKeys(password1);
		Thread.sleep(2000);
		loginBtn.click();
		Thread.sleep(2000);
		

	}


	public WebElement getErrMsg() {
		return errMsg;
	}
	
	public String getErrorMsgText()
	{
		String data = errMsg.getText();
		return data;
		
	}
	
}