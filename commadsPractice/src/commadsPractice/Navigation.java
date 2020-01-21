package commadsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divya thanniru\\Desktop\\SeleiumRC\\Jars\\chromedriver_win32 (3)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divya thanniru\\Desktop\\SeleiumRC\\Jars\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://gradeup.co");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//*[@id=\"contentDiv\"]/div/div/p[2]/span")).click();
		//driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div/section/div/a[2]/span"));
		driver.findElement(By.xpath("/html/body")).click();
		
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to("https://gradeup.co/contact-us");
		//driver.wait();
		driver.close();
		
		
		

	}

}
