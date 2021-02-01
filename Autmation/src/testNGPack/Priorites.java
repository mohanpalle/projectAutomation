package testNGPack;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priorites {
  @Test
  public void c() {
	  Reporter.log("Hi I am method C", true);
  }
  
  @Test
  public void d() {
	  Reporter.log("Hi I am method D", true);
  }
  
  @Test(priority = 6)
  public void a() {
	  Reporter.log("Hi I am method A", true);
  }
  
  @Test(priority = 0)
  public void b() {
	  Reporter.log("Hi I am method B", true);
  }
  
  @Test(priority = 6)
  public void e() {
	  Reporter.log("Hi I am method E", true);
  }
  
  @Test(priority = 1)
  public void f() {
	  Reporter.log("Hi I am method F", true);
  }
  
  
}
