package practiceWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import com.sun.tools.javac.util.List;

public class PracticeDrvierClass {

	
		public WebDriver driver;
		
		public void LaunchApp(String url) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Divya thanniru\\Desktop\\SeleiumRC\\Jars\\geckodriver.exe");
			driver=new FirefoxDriver();
		
			driver.get(url);
			driver.manage().window().maximize();
		}
		public void closeApp(){
			driver.close();
		}
		public void elementAvailable(String elementLocation, boolean exp) {
			WebElement a=driver.findElement(By.id(elementLocation));
			boolean b=a.isDisplayed();
			if(b=exp) {
				System.out.println("pass the case");}
			else {
					System.out.println("fail the case");
				}
			}
		
		public void elementsCount(String locator,int exp) {
		List <WebElement> elements=driver.findElements(By.tagName(locator));
		if(elements.size()==exp) {
			System.out.println("same size");
			for(int i=0; i<elements.size();i++) {
				System.out.println(elements.get(i).getText()+" "+elements.get(i).getAttribute("href"));
			}
			
		}
			else {
				System.out.println("difeerent size i.e   "+elements.size());
				for(int i=0; i<elements.size();i++) {
					System.out.println(elements.get(i).getText()+" "+elements.get(i).getAttribute("href"));
				}}
				
		}
		}


