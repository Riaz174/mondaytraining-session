package protrainingtech.automationtrainingcourse;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
public static WebDriver driver;
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\automationtrainingcourse\\src\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.papajohns.com.pk/?locale=en-PK");
		//WebElement STARTYOURORDER=driver.findElement(By.name("START YOUR ORDER"));
		//STARTYOURORDER.click();
		//WebElement Delivery=driver.findElement(By.name("    Delivery           "));
		//Delivery.click(); 
		//WebElement Takeaway=driver.findElement(By.name("   Take away"));
		//Takeaway.click();
		
		

	}
 
}
