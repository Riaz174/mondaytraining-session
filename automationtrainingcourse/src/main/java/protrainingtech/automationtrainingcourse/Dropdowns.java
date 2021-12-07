package protrainingtech.automationtrainingcourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {
	public static WebDriver driver;

public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\automationtrainingcourse\\src\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.navigate().to("https://www.facebook.com");
	//WebElement Firstname=driver.findElement(By.xpath("//*[text()='First name']"));
	//Firstname.click();
	//WebElement Mobilephonenumber=driver.findElement(By.xpath("//*[text()='Mobile number or email address']"));
	//Mobilephonenumber.click();

	//WebElement birthofday=driver.findElement(By.name("birthday_day"));
		//Select ob=new Select(birthofday);
			//ob.selectByVisibleText("29");
	//WebElement birthofmonth=driver.findElement(By.name("birthday_month"));
	//Select ot=new Select(birthofmonth);
	//ot.selectByIndex(10);
	WebElement years=driver.findElement(By.name("birthday_year"));
	Select io=new Select(years);
	io.selectByVisibleText("1953");
	
		
			
		

}

}
