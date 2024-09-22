package pro.training.tech.students;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsjk {
	

	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syoha\\eclipse-workspace\\students\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   //driver is referance to the interface
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(6000);
		driver.navigate().refresh();
		driver.manage().window().maximize();
		WebElement signes=driver.findElement(By.id("nav-link-accountList"));
		Actions ob=new Actions(driver);
		Thread.sleep(6000);
		ob.moveToElement(signes).build().perform();
		Thread.sleep(6000);
		//driver.findElement(By.linkText("Music Library")).click();
		WebElement musics=driver.findElement(By.linkText("Music Library"));
		ob.moveToElement(musics).click().perform();
		
		
		
		
		
		
		
	}

}
