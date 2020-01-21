package commadsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsCls {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Divya thanniru\\\\Desktop\\\\SeleiumRC\\\\Jars\\\\chromedriver_win32 (3)\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		WebElement companies=driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[3]/a/div"));
		Actions act=new Actions(driver);
		act.moveToElement(companies).build().perform();
		driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[3]/div/ul/li[2]/a")).click();;
		//driver.quit();
		//1)create webElement for moving the cursor to companies block location
		//import actions class
		//perform build on webElement
		//click on required link by driver.findElement
		
		
		
	
	}

}
