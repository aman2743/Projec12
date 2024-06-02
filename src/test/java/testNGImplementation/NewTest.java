package testNGImplementation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void Test() {
	  System.out.println("Inside Test Method");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Inside beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Inside afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Inside beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Inside beforeClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Inside beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Inside afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Inside beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Inside afterSuite");
  }

}
