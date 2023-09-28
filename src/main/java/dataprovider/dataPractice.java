package dataprovider;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class dataPractice {
  @Test(dataProvider = "Mydata")
  public void TestData (Integer n, String s) {
	  System.out.println("Name of student is "+s);
	  System.out.println("Sr Number is "+n);
	  System.out.println("---------------*********---------------");
	  
  }

  @DataProvider
  public Object[][] Mydata() {
    return new Object[][] {
      new Object[] { 1, "Pratik Kd" },
      new Object[] { 2, "Vishwas" },
      new Object[] { 3, "Shreya" },
      new Object[] { 4, "Mahesh" },
      new Object[] { 5, "Tushar" },
    };
  }
}
