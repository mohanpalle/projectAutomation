package hybridFramework;

import java.io.IOException;

public class TestActitimeUsers extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		LoginPage lp = new LoginPage(driver); 
		Flib flib = new Flib();
		String username1 = flib.readPropertyData(PROP_PATH, "un");
		String password1 = flib.readPropertyData(PROP_PATH, "pwd");
		lp.LoginProcess(username1, password1);
		
		HomePage hp = new HomePage(driver);
		hp.clickOnUser();
		
	}

}