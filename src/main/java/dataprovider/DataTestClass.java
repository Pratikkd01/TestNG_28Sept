package dataprovider;

import org.testng.annotations.Test;

public class DataTestClass {
  @Test(dataProvider="dataClass", dataProviderClass=DataproviderClass.class)
  public void TC001(String data) {
	  System.out.println(data);
	  System.out.println("------------**********-------------");
  }
}
