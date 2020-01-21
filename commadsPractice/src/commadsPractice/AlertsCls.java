package commadsPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsCls {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divya thanniru\\Desktop\\SeleiumRC\\Jars\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver drvier=new ChromeDriver();
		drvier.get("https://mail.rediff.com/cgi-bin/login.cgi");
		drvier.manage().window().maximize();
		drvier.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		//System.out.println(drvier.switchTo().alert().getText());
		Alert a=drvier.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		//a.dismiss();
		drvier.close();


	}

}
