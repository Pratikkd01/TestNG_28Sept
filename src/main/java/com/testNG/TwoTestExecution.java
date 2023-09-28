package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TwoTestExecution {
	  WebDriver driver;
  @Test
  public void SerachTest001() throws InterruptedException {
		  driver.get("https://www.google.com/");
		  driver.findElement(By.name("q")).sendKeys("TestNG");
		  Thread.sleep(2000);
		  driver.findElement(By.className("gNO89b")).click();
		  long id = Thread.currentThread().getId();
		  System.out.println("Thread id for TestNGTest" + id);
	  }  
  @Test
	  public void SerachTest002() throws InterruptedException {
		  driver.get("https://www.google.com/");
		  Thread.sleep(2000);
		  driver.findElement(By.name("q")).sendKeys("Covid-19");
		  Thread.sleep(2000);
		  driver.findElement(By.className("gNO89b")).click();
		  long id = Thread.currentThread().getId();
		  System.out.println("Thread id for Covid19Test" + id);
	  } 
	  @BeforeSuite
	  public void beforeSuite() {
		  driver = new FirefoxDriver();
	  }
	  @AfterSuite
	  public void afterSuite() {
		  driver.close();
	  }
	  @BeforeMethod
	  public void beforeMethod() throws InterruptedException {
		  System.out.println("Inside beforeMethod");
		  Thread.sleep(2000);
	  }
	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("Inside afterMethod ");
	  }
	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("Inside beforeClass ");
	  }
	  @AfterClass
	  public void afterClass() {
		  System.out.println("Inside afterClass");
	  }
	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("Inside beforeTest");
	  }
	  @AfterTest
	  public void afterTest() {
		  System.out.println("Inside beforeTest");
	  }
  
}
