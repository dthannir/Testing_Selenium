package junitpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice2 {
  
  public WebDriver driver;
	@Test(priority = 1, groups = ("Functional"))
	  public void x() {
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("Navya");
		 boolean a= driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).isDisplayed();
		 Assert.assertEquals(true, a);
		  boolean b=driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).isEnabled();
		  Assert.assertEquals(true, b);
		  driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();;
	}
	  
@Test(priority = 2,  groups = ("Regression"))
public void f11() {
	  driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("divya");
	 boolean a= driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).isDisplayed();
	 Assert.assertEquals(true, a);
	  boolean b=driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).isEnabled();
	  Assert.assertEquals(true, b);
	  driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();;
}
@BeforeMethod
public void launchApp() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divya thanniru\\Desktop\\SeleiumRC\\Jars\\chromedriver_win32 (3)\\chromedriver.exe");
	   driver=new ChromeDriver();
	  driver.get("http://gmail.com");
}
@AfterMethod
public void closeApp() {
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.close();
}
}
