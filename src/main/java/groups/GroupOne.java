package groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupOne {
  @Test(groups={"Smoke"})
  public void Testone() {
	  System.out.println("Smoke group and Testone");
  }
  
  @Test(groups={"Smoke","Funct"})
  public void Testtwo() {
	  System.out.println("Smoke and Funct group and Testtwo");
  }
  
  @Test(groups={"Funct","Check"})
  public void Testthree() {
	  System.out.println("Funct and Check group and Testthree");
  }
  @Test(groups={"Smoke"})
  public void Testfour() {
	  System.out.println("Smoke group and Testfour");
  }
  @Test(groups={"Funct"})
  public void Testfive() {
	  System.out.println("Funct group and Testfive");
  }
  @Test(groups={"Check"})
  public void Testsix() {
	  System.out.println("Check group and Testsix");
  }
  
  @Test(groups={"Smoke","Check"})
  public void Testseven() {
	  System.out.println("Smoke and Check group and Testseven");
  }
  
  @BeforeGroups("Smoke")
	  public void beforegroup() {
		  System.out.println("*******@beforegroups executed brfore smoke gorup *************");
	  }
  
  @AfterGroups("Smoke")
  public void aftergroup() {
	  System.out.println("*******@aftergroups executed after smoke gorup ***********");
  }
}


