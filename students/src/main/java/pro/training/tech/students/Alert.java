package pro.training.tech.students;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syoha\\eclipse-workspace\\students\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   //driver is referance to the interface
		driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(6000);
		driver.navigate().refresh();
		driver.manage().window().maximize();
		WebElement submission=driver.findElement(By.name("submit"));
		submission.click();
		Thread.sleep(6000);
		driver.switchTo().alert().accept();// to accept the alert
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		//driver.switchTo().alert().dismiss(); //in order to dismiss 
		driver.close();
		
		
	}

}
