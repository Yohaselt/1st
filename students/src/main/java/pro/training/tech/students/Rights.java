package pro.training.tech.students;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Rights {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syoha\\eclipse-workspace\\students\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   //driver is referance to the interface
		driver.navigate().to("https://deluxe-menu.com/popup-mode-sample.html");
		//Thread.sleep(6000);
		driver.navigate().refresh();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement rightjk=driver.findElement(By.xpath("//img[@style='cursor: pointer;']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@style='cursor: pointer;']")));
		Actions ob=new Actions(driver);
		//Thread.sleep(6000);
		ob.contextClick(rightjk).build().perform();
		
		
		
		//Implicit use to synchronize. eventho there is an error it will wait until the time we gave is finished.
		//we only use once in the whole method
		//no error execute no need to wait 
		//driver.manage().timeouts().implicitlywait(10, TimeUnit.SECONDS);
		
		
		
	}

}
