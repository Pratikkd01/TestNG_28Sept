package parameter_xml;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest {
	
	@Test
	@Parameters({"Firstname","Lastname","Age"})
	public void searchname(String fname,String lname, int age) {
	  System.out.println("First name of person is "+ fname );
	  System.out.println("Last name of person is "+ lname);
	  System.out.println("Age of person is "+ age);
  }
}
