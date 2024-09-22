package Examplesandpractice;

import java.awt.image.FilteredImageSource;
import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LinkImageLinktxt {
	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement contact=driver.findElement(By.linkText("Contact"));
		contact.click();
		Thread.sleep(6000);
		
		
		
		WebElement close=driver.findElement(By.xpath("//*[@class='btn btn-secondary']"));
		close.click();
		Thread.sleep(6000);
		//partial linktext
		WebElement Home=driver.findElement(By.partialLinkText("Ho"));
		Home.click();
		Thread.sleep(6000);
		//linktext
		WebElement laptops=driver.findElement(By.linkText("Laptops"));
		laptops.click();
		Thread.sleep(6000);
		WebElement telephones=driver.findElement(By.linkText("Phones"));
		telephones.click();
		
		Thread.sleep(6000);
		WebElement samsungphone=driver.findElement(By.linkText("Samsung galaxy s7"));
		samsungphone.click();
		//finding the headers
		/*List<WebElement>headers=driver.findElements(By.className("nav-item"));
		System.out.println("number of headlink="+headers.size());
		
		//total number of links
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("total number of links="+links.size());
		
		//total number of image
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println("total number of images="+images.size());
		*/
		

	}
}
