package packageTwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testcase3 {
	WebDriver driver;
	
  @Test
  public void searchcase3() throws InterruptedException {
	  driver.get("https://www.google.com/");
	  driver.findElement(By.name("q")).sendKeys("ApachePOI");
	  Thread.sleep(2000);
	  driver.findElement(By.name("btnK")).click();
  }
  
  @Test
  public void searchcase4() throws InterruptedException {
	  driver.get("https://www.google.com/");
	  Thread.sleep(2000);
	  driver.findElement(By.name("q")).sendKeys("Linux");
	  Thread.sleep(2000);
	  driver.findElement(By.name("btnK")).click();
  }
  
  @BeforeSuite
  public void beforeSuite() {
	  driver = new FirefoxDriver();
  }
//@BeforeMethod
//public void beforetest() {
//System.out.println("beforetest method of TestCase3 class");
//}
//@AfterMethod
//public void aftertest() {
//System.out.println("AfterTest method of testone class");
//}
@AfterSuite
  public void afterSuite() {
	  driver.close();
  }
}
