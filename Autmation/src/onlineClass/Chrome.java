package onlineClass;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		ChromeDriver driver=new ChromeDriver();

	}

}
