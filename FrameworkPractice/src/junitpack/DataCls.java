package junitpack;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DataCls {
 public WebDriver driver;

  @DataProvider(name="TestData")
  public Object[][] testData() {
    return new Object[][] {
      new Object[] { "Divya Thanniru", "12345" },
      new Object[] { "Navya Thanniru", "abcd123" },
    };
  }
  @Test(dataProvider = "TestData")
  public void f(String uid, String pswd) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divya thanniru\\Desktop\\SeleiumRC\\Jars\\chromedriver_win32 (3)\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://facebook.com");
	  driver.findElement(By.id("email")).sendKeys(uid);;
	  driver.findElement(By.id("pass")).sendKeys(pswd);;
	  
  }
}
