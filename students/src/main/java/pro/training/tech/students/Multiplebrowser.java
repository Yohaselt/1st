package pro.training.tech.students;
//Day 24
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.matcher.StringSetMatcher;

public class Multiplebrowser {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syoha\\eclipse-workspace\\students\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   //driver is referance to the interface
		driver.navigate().to("https://amazon.com");
		Thread.sleep(6000);
		driver.navigate().refresh();
		driver.manage().window().maximize();
		
		String currentwindow=driver.getWindowHandle();// windowhandle helps to get session id
		System.out.println(currentwindow); //to get the session id 
		WebElement bestseler=driver.findElement(By.linkText("Best Sellers"));
		Actions ob=new Actions(driver);
		ob.keyDown(Keys.LEFT_SHIFT).build().perform();//to open new window
		bestseler.click();
		ob.keyUp(Keys.LEFT_SHIFT).build().perform();//to release the key
		//driver.getwindowhandle can get only the the windowhandle for the current window
		//driver.get windowhandles will get the session id for both windows
		Set<String>windowhandlesbrowsers=driver.getWindowHandles();
		Iterator<String> iterators=windowhandlesbrowsers.iterator();
		//iterator used to get the value from the set
		String firstwindowhandle=iterators.next();
		String secondwindowhandle=iterators.next();
		System.out.println("This is first handle="+firstwindowhandle);
		System.out.println("This is second handle="+secondwindowhandle);
		driver.switchTo().window(secondwindowhandle);
		Thread.sleep(6000);
		WebElement stores=driver.findElement(By.linkText("Kindle Store"));
		stores.click();
		
		
		
		
		
		
		
		
	}

}
