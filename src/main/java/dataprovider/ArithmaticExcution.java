package dataprovider;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class ArithmaticExcution {
	public ArithmaticOperation service;
	
	@BeforeClass 
	public void init() {
		service = new ArithmaticOperation();
	}
  @Test(dataProvider = "testSumInput")
  public void testSum(Integer a, Integer b) {
	  int result = service.sum(a,b); 
	  System.out.println("Sum of integers - "+result);
	  Assert.assertTrue(true);
	  Assert.assertEquals(result,a+b);
  }
  
  @Test(dataProvider = "testSubInput")
  public void testSub(Integer a, Integer b) {
	  int result = service.sub(a,b); 
	  System.out.println("Sub of integers " + result);
	  Assert.assertEquals(result,a-b);
  }
  @Test(dataProvider = "testMultiInput")
  public void testMulti(Integer a, Integer b) {
	  int result = service.multi(a,b); 
	  System.out.println("Multiplication of integers " + result);
	  Assert.assertEquals(result,a*b);
  }
  
  @Test(dataProvider = "testDivInput")
  public void testDiv(Integer a, Integer b) {
	 int result = service.div(a,b); 
	 System.out.println("Div of integers "+result);
	  Assert.assertEquals(result,a/b);
  }

  @DataProvider 
  public Object[][] testSumInput() {
     return new Object[][]{ {10, 5},{ 20,10},{30, 5} };
    }
   @DataProvider
   public Object[][] testSubInput() {
    	   return new Object[][] {{ 10, 5},{ 50,10},{ 40, 5}};
      }
      @DataProvider
      public Object[][] testMultiInput() {
         return new Object[][] {{ 10, 5},{ 50,10},{ 40, 5}};
         }
         @DataProvider
         public Object[][] testDivInput() {
            return new Object[][] {
              new Object[] { 60, 10},{ 400,20},{ 40, 5}
            };
  }
}
