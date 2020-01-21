package practiceWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * System.setProperty(
		 * "webdriver.chrome.driver","C:\\Users\\Divya thanniru\\Desktop\\SeleiumRC\\Jars\\chromedriver.exe"
		 * ); WebDriver driver=new ChromeDriver(); driver.get("http://facebook.com"); //
		 * public launchApp(Satring url) { //driver.get("url");
		 */		
		
		PracticeDrvierClass d=new PracticeDrvierClass();
		d.LaunchApp("http://facebook.com");
		d.elementAvailable("email", true);
		d.elementAvailable("pass", false);
		
		d.elementsCount("a", 20);
		d.elementsCount("img", 30);
		
		
		d.closeApp();

				
	}
		
	}


