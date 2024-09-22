package Examplesandpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicingwebdriver {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syoha\\eclipse-workspace\\students\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://youtube.com");
		//driver.navigate().to("https://youtube.com");
		//Thread.sleep(5000);
		
		driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.findElement(By.name("search_query")).sendKeys("selenium with java");
		//driver.findElement(By.className("style-scope ytd-mini-guide-entry-renderer")).click();
		Thread.sleep(2000);
		boolean logodisplaystatus=driver.findElement(By.id("logo-icon")).isDisplayed();
		System.out.println(logodisplaystatus);
		
		//boolean logoDisplaystatus=driver.findElement(By.id("logo-icon")).isDisplayed();
		//Thread.sleep(5000);
		//driver.navigate().back();
		//Thread.sleep(5000);
		/*driver.navigate().forward();
		String sessions=driver.getWindowHandle();
		System.out.println(sessions);
		String titles=driver.getTitle();
		System.out.println(titles);
		String curl=driver.getCurrentUrl();
		System.out.println(curl);*/
		//driver.close();
		
		
		
	}

}
