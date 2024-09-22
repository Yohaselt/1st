package pro.training.tech.students;
//Day 24
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
//first it execute BEFORE METHOLD then TEST and finally AFTER METHOLD
public class Setupbrowsers {
WebDriver driver;  //make global in order to use it in different methods
	
  @Test
  public void f() throws InterruptedException {
	  String currentwindow=driver.getWindowHandle();// windowhandle helps to get session id
		System.out.println(currentwindow); //to get the session id 
		WebElement bestseler=driver.findElement(By.linkText("Best Sellers"));
		Actions ob=new Actions(driver);
		ob.keyDown(Keys.LEFT_SHIFT).build().perform();
		bestseler.click();
		ob.keyUp(Keys.LEFT_SHIFT).build().perform();
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
  @BeforeMethod
  
  public void beforeMethod() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\syoha\\eclipse-workspace\\students\\Drivers\\chromedriver.exe");
	 driver=new ChromeDriver();   //driver is referance to the interface
	  Thread.sleep(12000);
	driver.navigate().to("https://www.amazon.com");
	Thread.sleep(16000);
	driver.navigate().refresh();
	driver.manage().window().maximize();
  }
@Test
public void keyboards() throws InterruptedException {
	WebElement search=driver.findElement(By.name("field-keywords"));
	search.sendKeys("Computer");
	Actions ob=new Actions(driver);
	Thread.sleep(5000);
	ob.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	ob.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	Thread.sleep(5000);
	search.clear();
	Thread.sleep(3000);
	search.click();
	ob.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

}
  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(6000);
	  driver.close();
  }

}
