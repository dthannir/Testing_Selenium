package practiceWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromedRIVER {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divya thanniru\\Desktop\\SeleiumRC\\Jars\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver drvier=new ChromeDriver();
		drvier.get("http://qshore.com");

	}

}
