package testNGPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGClass1 {
  @Test(invocationCount = 4)
  public void a() {
	  Reporter.log("Hi i am method  A", true);
  }
  
  @Test()
  public void b()
  {
	  Reporter.log("Hi i am method B",true);
  }
  
  @Test
  public void c()
  {
	  Reporter.log("Hi i am method C",true);
  }
}
