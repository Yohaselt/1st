package Common;
//instead of creating the whole method again and again, we can
//use this reusable class
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;

public class Reusable {
	public WebDriver driver;
	
  @BeforeMethod
  @Parameters({"browsers","website"})
  public void beforeMethod(String browser,String website) throws InterruptedException {
	  if(browser.equalsIgnoreCase("Chrome")) {
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\syoha\\eclipse-workspace\\students\\Drivers\\chromedriver.exe");
			 driver=new ChromeDriver();  
			 driver.get(website);
			 Thread.sleep(10000);
			 driver.manage().window().maximize();
			 }
	  			else if(browser.equalsIgnoreCase("Edge")) {
			  System.setProperty("webdriver.edge.driver", "C:\\Users\\syoha\\eclipse-workspace\\students\\Drivers\\msedgedriver.exe");
			  driver=new EdgeDriver();
			  driver.get(website);
				 Thread.sleep(10000);
				 driver.manage().window().maximize();
			  }
			 else if(browser.contentEquals("firefox")) {
				System.setProperty("webdriver.firefox.driver", "C:\\Users\\syoha\\eclipse-workspace\\students\\Drivers\\geckodriver.exe");
				driver=new FirefoxDriver();
				 driver.get(website);
				 Thread.sleep(10000);
				 driver.manage().window().maximize();
			 }
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(6000);
	  driver.close();
  } 
  public void screnshots() throws IOException {
	  Date dt=new Date();
	//change the date data type to string form
		 String scsh=dt.toString().replace(" ", "_").replace(":", "_");
		  System.out.println(scsh);
	  File capture=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(capture, new File("C:\\Users\\syoha\\eclipse-workspace\\students\\Pictures\\"+scsh+"Output.jpg"));
  }

}
