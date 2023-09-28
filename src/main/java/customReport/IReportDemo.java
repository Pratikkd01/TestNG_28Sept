package customReport;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class IReportDemo {
  @Test
  public void TC001() {
	  System.out.println("TestCase has passed");
	  Reporter.log("TC001 Executed");
  }
  
  @Test
  public void TC002() {
	  System.out.println("Test Case failed");
	  Assert.assertTrue(false);
	  Reporter.log("TC002 Executed");
  }
  
  @Test
  public void TC003() {
	  System.out.println("Test case will pass");
	  Reporter.log("TC003 Executed");
  }
}
