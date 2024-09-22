package pro.training.tech.students;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropable {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syoha\\eclipse-workspace\\students\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   //driver is referance to the interface
		driver.navigate().to("https://jqueryui.com/droppable/");
		Thread.sleep(6000);
		driver.navigate().refresh();
		driver.manage().window().maximize();
		Actions ob=new Actions(driver);
		driver.switchTo().frame(0);
		Thread.sleep(6000);	
		WebElement dra=driver.findElement(By.id("draggable"));
		WebElement dro=driver.findElement(By.id("droppable"));
		ob.dragAndDrop(dra, dro).build().perform();
		//iframe  happen in this particular web. ifrafme means a website inside a webside.
		//during inspect if thare are a multiple "html" tag that means there are multiple websites.
		//sometimes they write "iframe" itself.		
		//to solve the problem use **driver.switchTo().frame(0);**
		//if to come out from iframe back to parent window
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("Resizable")).click();

	}

}
