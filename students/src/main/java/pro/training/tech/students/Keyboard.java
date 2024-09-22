package pro.training.tech.students;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
// Day 23
public class Keyboard {
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syoha\\eclipse-workspace\\students\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   //driver is referance to the interface
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(16000);
		driver.navigate().refresh();
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.name("field-keywords"));
		search.sendKeys("Computer");
		Actions ob=new Actions(driver);
		Thread.sleep(5000);
		ob.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();//ctrl A to select
		ob.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(5000);
		search.clear();
		Thread.sleep(3000);
		search.click();
		ob.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	
	}

}

