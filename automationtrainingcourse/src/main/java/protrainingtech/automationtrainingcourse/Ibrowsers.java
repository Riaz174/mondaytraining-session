package protrainingtech.automationtrainingcourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ibrowsers {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\automationtrainingcourse\\src\\Drivers\\chromedriver.exe");
driver=new ChromeDriver();
driver.navigate().to("https://www.amazon.com");
driver.navigate().refresh();
//Thread.sleep(6000);
driver.navigate().back();
//Thread.sleep(6000);
driver.navigate().forward();
//Thread.sleep(6000);
driver.manage().window().maximize();
String windowofhandle=driver.getCurrentUrl();
System.out.println(windowofhandle);
String currenturlpage=driver.getCurrentUrl();
System.out.println(currenturlpage);
	}

}
