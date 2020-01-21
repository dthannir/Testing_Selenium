package commadsPractice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class WindowHandlerCls {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Divya thanniru\\Desktop\\SeleiumRC\\Jars\\chromedriver_win32 (3)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://transfer.pcloud.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body")).click();
		System.out.println("****");
		
		  //Thread.sleep(10000);
		 /* 
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"recipients\"]/div/div/div[1]/div[3]/input")).sendKeys(
		 * "1781.divya@gmail.com");
		 * driver.findElement(By.xpath("//*[@id=\"sendermail\"]")).sendKeys(
		 * "divya.thanniru1781@gmail.com");
		 * driver.findElement(By.xpath("/html/body")).sendKeys("hello");
		 * driver.findElement(By.xpath("//*[@id=\"ppaccepted\"]")).click();
		 * driver.findElement(By.xpath("//*[@id=\"begin-transfer\"]")).click();
		 * 
		 * //// *[@id="upload-form"]/div/div[2]/div/div[1]/a/img[3]
		 * 
		 * // driver.close();
		 */
		Runtime.getRuntime().exec("C:\\Users\\Divya thanniru\\Documents\\aa.exe");
		System.out.println("@@@@@@");
	}

}
