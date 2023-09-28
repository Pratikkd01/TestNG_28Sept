package pi_Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmployeeSearch extends LabelVerification {
//	public void employee() {
//		WebDriver driver;
//		String actual;
//		String expected;
//	}
	
	@DataProvider(name="Login")																								
	public Object[][]createData(){
		return new Object[][] {
			{"Pratik Kadam"},
//			{"Ashok"},
//			{"Abhijeet Jadhav"},
		};
	}
	@Test(dataProvider="Login")
	public void searchName(String data) {
		driver.get("https://persistentsystems.sharepoint.com/sites/Pi/SitePages/Pi-Home.aspx");
		driver.manage().window().maximize();
		WebElement EmpName= driver.findElement(By.xpath("//input[@class='form-control search-ih search-text']"));
		WebElement search = driver.findElement(By.xpath("//i[@class='glyphicon h-search-icon']"));
		EmpName.sendKeys(data);
		search.click();	
	}
}
