package com.testNG;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testone {
WebDriver driver;
String testname ="";

  @Test(description="searchCargo", priority=1, enabled=false)  // html file testcase description
  public void searchCargo() throws InterruptedException {
			  driver.get("https://www.google.com/");
			  driver.findElement(By.name("q")).sendKeys("Cargo");
			  Thread.sleep(2000);
			  driver.findElement(By.className("gNO89b")).click();
			  long id = Thread.currentThread().getId();
			  System.out.println("Thread id for CargoTest" + id);
			  Thread.sleep(2000);
			  Assert.assertEquals(true,true,"Test Case passed");
		  }

  @Test(description="searchApple", priority=2, expectedExceptions=NoSuchElementException.class)
  public void searchApple() throws InterruptedException {
			  driver.get("https://www.google.com/");
			  Thread.sleep(2000);
			  driver.findElement(By.name("w")).sendKeys("Apple");
			  Thread.sleep(2000);
			  driver.findElement(By.className("gNO89b")).click();
			  long id = Thread.currentThread().getId();
			  System.out.println("Thread id for AppleTest" + id);
		  }
  
  @Test(description="searchSelenium", dependsOnMethods="searchSelenium1", alwaysRun=true)
  public void searchSelenium() throws InterruptedException {
			  driver.get("https://www.google.com/");
			  Thread.sleep(2000);
			  driver.findElement(By.name("q")).sendKeys("Selenium");
			  Thread.sleep(2000);
			  driver.findElement(By.className("gNO89b")).click();
			  long id = Thread.currentThread().getId();
			  System.out.println("Thread id for SeleniumTest" + id);
			  Thread.sleep(2000);
			  }
  @Test(description="searchSelenium1", dependsOnMethods="searchApple", alwaysRun=true)
  public void searchSelenium1() throws InterruptedException {
			  driver.get("https://www.google.com/");
			  Thread.sleep(2000);
			  driver.findElement(By.name("q")).sendKeys("Selenium");
			  Thread.sleep(2000);
			  driver.findElement(By.className("gNO89b")).click();
			  long id = Thread.currentThread().getId();
			  System.out.println("Thread id for SeleniumTest" + id);
			  Thread.sleep(2000);
			  }
  @Test(expectedExceptions =ArithmeticException.class, enabled=false)
  public void divideExample() {
	  int e = 1/0;
	  
  }
  @BeforeSuite
		  public void beforeSuite() {
			  driver = new FirefoxDriver();
		  }
  @BeforeMethod
  public void beforetest() {
	  System.out.println("beforetest method of testone class");
  }
  @AfterMethod
  public void aftertest() {
	  System.out.println("AfterTest method of testone class");
  }
@AfterSuite
		  public void afterSuite() {
			  driver.close();
		  }
  }
