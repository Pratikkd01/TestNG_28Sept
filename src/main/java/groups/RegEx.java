package groups;

import org.testng.annotations.Test;

public class RegEx {
  @Test(groups={"windows.funct"})
  public void TC001() {
	  System.out.println("windows funct test");
  }
  @Test(groups={"windows.check"})
  public void TC002() {
	  System.out.println("windows checkin test");
  }
  @Test(groups={"windows.funct","linux.funct"})
  public void TC003() {
	  System.out.println("windows funct and linux funct test");
  }
}
