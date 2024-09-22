package pro.training.tech.students;

import java.sql.Driver;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ibrowser {
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		//how to setup the browser and how to open the website into the browser
		//set up the chrome driver
		//webdriver is a java interface 
		//webdriver is an API (Application Programming Interface)
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syoha\\eclipse-workspace\\students\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   //driver is referance to the interface
		driver.navigate().to("https://facebook.com");
		/*Thread.sleep(6000);
		driver.navigate().refresh();
		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.navigate().back();
		Thread.sleep(6000);
		driver.navigate().forward();
		String sessions=driver.getWindowHandle();  // get session id for the browser
		System.out.println(sessions);
		String titles=driver.getTitle();
		System.out.println(titles);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.close();*/
		
		/*1, ID 2,linktex  3, partiallinktext  4,classname  5, name  6,xpath  7, Css selector  8,Tagname
		 * thise are locators
		 */
		
		WebElement emailenters =driver.findElement(By.id("email"));
		emailenters.sendKeys("abcd");
		WebElement psswrd=driver.findElement(By.name("pass"));
		
		psswrd.sendKeys("someone");
		
		//WebElement forgotpasslk=driver.findElement(By.linkText("Forgot password?"));
		//forgotpasslk.click();
		WebElement forgotpasslk=driver.findElement(By.partialLinkText("Forgot"));
		forgotpasslk.click();

		
		
		

	}

}
