package dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {
  @Test(dataProvider ="myDataPovider")
  public void DataTest(Integer n, String s) {
	  System.out.println("Name of Student is - "+s);
	  System.out.println("Roll no of student is - "+n);
	  System.out.println("********************************");
  }
  
  @DataProvider
  public Object[][] myDataPovider(){
	return new Object[][] {
		new Object[] {1,"Pratik"}, 
		new Object[] {2,"Kunal"},
		new Object[] {3,"Omkar"}
	  };
}
}