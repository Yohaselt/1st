package pro.training.tech.students;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popups {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syoha\\eclipse-workspace\\students\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   //driver is referance to the interface
		driver.navigate().to("https://www.cheapoair.com/");
		Thread.sleep(6000);
		driver.navigate().refresh();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement flight=driver.findElement(By.xpath("//*[@aria-label='Choose a departure date. expanded']"));
		flight.click();
		Thread.sleep(6000);
		WebElement flightdate=driver.findElement(By.xpath("//*[@aria-label='5 September 2024']"));
		flightdate.click();
		Thread.sleep(6000);
		WebElement retur=driver.findElement(By.xpath("//*[@aria-label='Choose a return date. expanded']"));
		retur.click();
		Thread.sleep(6000);
		WebElement returdate=driver.findElement(By.xpath("//*[@aria-label='25 October 2024']"));
		returdate.click();
		Thread.sleep(6000);
		WebElement hotels=driver.findElement(By.id("hotels"));
		hotels.click();
		Thread.sleep(6000);
		driver.findElement(By.name("HotelName")).click();
		
		
	}

}
