package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void run() {
	 Reporter.log("Hi i am from run method from demo class");
  }
  @Test
  public void gun() {
	 Reporter.log("Hi i am from gun method from demo class",true);
  }
  

}
