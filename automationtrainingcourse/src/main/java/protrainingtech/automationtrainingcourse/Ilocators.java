package protrainingtech.automationtrainingcourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ilocators {
public static WebDriver driver;
	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\automationtrainingcourse\\src\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.navigate().to("http://www.amazon.com");
	driver.manage().window().maximize();
	//Thread.sleep(6000);
	WebElement searchbutton=driver.findElement(By.id("loginbutton"));//Automate sign-in function for facebook
	searchbutton.click();
	//Thread.sleep(6000);
	WebElement forgotpassword=driver.findElement(By.id("Forgot password"));//Automate Forgot password function for facebook
	forgotpassword.click();
	//Thread.sleep(6000);
WebElement firstname=driver.findElement(By.name("firstname"));
	}  
}

	































  


    
    





            


            






            

        








            


























  














  



        
        
        
  








    
    


            


            






            

        








            























  




















