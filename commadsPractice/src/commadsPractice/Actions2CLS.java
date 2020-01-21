package commadsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.interactions.touch.Down;

import com.beust.jcommander.JCommander.Builder;

public class Actions2CLS {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Divya thanniru\\\\Desktop\\\\SeleiumRC\\\\Jars\\\\chromedriver_win32 (3)\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		//System.out.println("launched APP");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.F5).build().perform();
		//System.out.println("Actions started");
		WebElement element=driver.findElement(By.id("email"));
		element.sendKeys("divya");
		//System.out.println("sending emain as divya");
		Thread.sleep(3000);
		WebElement element1=driver.findElement(By.xpath("//*[@id=\"month\"]"));
		act.moveToElement(element1).click();
		Thread.sleep(3000);
		//System.out.println("moved to the month dropdown and performing keys down and up operations");
		act.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.UP).build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.UP).build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.UP).build().perform();
		Thread.sleep(3000);
		//System.out.println("selecting one month by enter button");
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		//System.out.println("right click checking");
		act.contextClick(driver.findElement(By.xpath("//*[@id=\"facebook\"]/body"))).build().perform();
		Thread.sleep(3000);
		//System.out.println("double click checking");
		act.doubleClick(element).build().perform();
		Thread.sleep(3000);
		
		

	}

}
