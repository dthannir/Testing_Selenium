package junitpack;

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
  public void f() {
	  System.out.println("tesst1");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("method1");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("methodend");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeCls");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("aftercls");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforetest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("aftertEST");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BEFOREsuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Aftersuite");
  }

}
