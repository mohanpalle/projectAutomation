package methodDrivenFramework;

import java.io.IOException;

public class ActiTimeValidLogin extends BaseTest {


	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		bt.setUp();
		
		String username = flib.getPropertyData("./data/config.properties", "un");
		String password = flib.getPropertyData("./data/config.properties", "psw");
		System.out.println(username);
		System.out.println(password);
		lp.loginProces(username,password);
		     
	}

}
