package parameter_xml;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OptionalValue {
	@Parameters({"optional-value"})
	@Test
		public void optionalMethod(@Optional("Optional value from Class")String value) {
			System.out.println("The value is- "+value);
  }
}
