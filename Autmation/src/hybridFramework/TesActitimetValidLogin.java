package hybridFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

/*we use the inheritence as well as the abstraction in this class 
inheritence because we always extends our test Script to the BaseTest and abstraction because we never write any implementation 
of the method in this class we always use our method in this class and we are not bothered about the implementation of the emthods*/

public class TesActitimetValidLogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();// creating the object of BaseTest to access the openBrowser Method
		bt.openBrowser();//opening the browser and doing the common steps mentiponed in baseTest
		WebDriverCommonLib wb = new WebDriverCommonLib();
		String title = wb.getTitleOfTheWebPage();
		System.out.println(title);
		wb.verifyTheTitleOfTheWebpage("actiTIME - Login", title, "Login  ");//verify the title and print the status
		Flib flib = new Flib();
		String username = flib.readPropertyData(PROP_PATH, "un");// reading the valid  username
		String password = flib.readPropertyData(PROP_PATH, "pwd");// reading the valid  password
		
		LoginPage lp = new LoginPage(driver);// creating the object of LoginPage POM class to access the loginProcess method
		PageFactory.initElements(driver, lp);
		//we achieve code reusability over here
		lp.LoginProcess(username,password);
		wb.takeTheScreenShot("data", "login");
		
		String homeTitle = wb.getTitleOfTheWebPage();
		wb.verifyTheTitleOfTheWebpage("actiTIME - Enter Time-Track",homeTitle , "Home");//we are using this method from WebDriverCommonLib(C)
//		lp.getErrMsg();
//		wb.mouseHover(lp);
		bt.closeBrowser();// close the browser
		
	}

}