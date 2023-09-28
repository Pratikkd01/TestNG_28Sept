package dataprovider;

import org.testng.annotations.DataProvider;

public class DataproviderClass {
  @DataProvider(name ="dataClass")
  public Object[][] dataprovidermethod() {
    return new Object[][] {{ "data number 1" },{ "data number 2" },{"data number 3"}};
  }
}
