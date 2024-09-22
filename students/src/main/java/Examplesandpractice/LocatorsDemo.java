package Examplesandpractice;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {
	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
		
		//name
		driver.findElement(By.name("search")).sendKeys("mac");
		Thread.sleep(6000);
		
		//id
		//boolean logodisplaystatus=driver.findElement(By.id("logo")).isDisplayed();
		//System.out.println(logodisplaystatus);
		
		//link text & partial link text
		//driver.findElement(By.linkText("Cameras")).click();
		//Thread.sleep(4000);
		//driver.findElement(By.partialLinkText("Table")).click();
		List<WebElement> headerlink= driver.findElements(By.className("list-inline-item"));
		System.out.println("total number of headerlink="+ headerlink.size());
		
	}

}
