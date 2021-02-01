package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sumo {
  @Test
  public void fun() {
	  Reporter.log("Hi am from fun from sumo", true);
  }
}
