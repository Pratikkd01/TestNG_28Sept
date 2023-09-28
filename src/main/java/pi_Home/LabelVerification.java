package pi_Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LabelVerification {
	public WebDriver driver;
	String actual;
	String expected;
	
	@BeforeSuite(description="Lunch the chromedriver before starting test")
	public void lunchbrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pratik_kadam\\eclipse-workspace\\com.testNG\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test(priority=1)
	public void Home() {
		driver.get("https://persistentsystems.sharepoint.com/sites/Pi/SitePages/Pi-Home.aspx");
		driver.manage().window().maximize();
		expected ="Pi-Home";
		actual =driver.getTitle();
		Assert.assertEquals(actual, expected);
		System.out.println("Test passed and title verified");
	}
	@Test(priority=2, alwaysRun=true)
	public void OnePersistent() {
		driver.get("https://persistentsystems.sharepoint.com/sites/Pi/SitePages/Pi-Home.aspx");
		driver.manage().window().maximize();
		WebElement onepersistent = driver.findElement(By.xpath("//span[@class='h-icon h-one-psl-icon']"));
		onepersistent.click();
		actual = "One-Persistent";
		expected = driver.getTitle();
		Assert.assertEquals(actual, expected);
		System.out.println("Test passed and Onepersistent verified");
	}
	@Test(priority=3, alwaysRun=true)
	public void MyWork() {
		driver.get("https://persistentsystems.sharepoint.com/sites/Pi/SitePages/Pi-Home.aspx");
		driver.manage().window().maximize();
		WebElement Mywork = driver.findElement(By.xpath("//span[@class='h-icon h-my-work-icon']"));
		Mywork.click();
		actual = "My-Work";
		expected =driver.getTitle();
		Assert.assertEquals(actual, expected);
		System.out.println("Test passed and Mywork verified");
	}
}
