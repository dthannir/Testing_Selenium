package junitpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeTestNG {
	
	public WebDriver driver;
	@Test(priority = 1, groups = ("Functional"))
	  public void x() {
		  driver.findElement(By.id("email")).sendKeys("Navya");
		 boolean a= driver.findElement(By.id("pass")).isDisplayed();
		 Assert.assertEquals(true, a);
		  boolean b=driver.findElement(By.id("pass")).isEnabled();
		  Assert.assertEquals(true, b);
		  driver.findElement(By.id("pass")).sendKeys("1234");
	  }
  @Test(priority = 2,  groups = ("Regression"))
  public void f11() {
	  driver.findElement(By.id("email")).sendKeys("Divya");
	 boolean a= driver.findElement(By.id("pass")).isDisplayed();
	 Assert.assertEquals(true, a);
	  boolean b=driver.findElement(By.id("pass")).isEnabled();
	  Assert.assertEquals(true, b);
	  driver.findElement(By.id("pass")).sendKeys("1234");
  }
  @BeforeMethod
  public void launchApp() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divya thanniru\\Desktop\\SeleiumRC\\Jars\\chromedriver_win32 (3)\\chromedriver.exe");
	   driver=new ChromeDriver();
	  driver.get("http://facebook.com");
  }
  @AfterMethod
  public void closeApp() {
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.close();
  }
}
