package pro.training.tech.students;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Common.Reusable;
import pages.Bestsellers;
import pages.Home;
import pages.Kindlestores;

import org.testng.annotations.BeforeMethod;

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

public class ChromeandEdge extends Reusable {
	//WebDriver driver;
  @Test
  public void f() throws InterruptedException, IOException {
	  Home ob=new Home(driver);
	  Thread.sleep(6000);
	  ob.BestsellersClick();
	  Bestsellers oj=new Bestsellers(driver);
	  Thread.sleep(6000);
	  oj.storesToClick();
	  
	  screnshots();
	  Kindlestores ok=new Kindlestores(driver);
	  String kindlestorestexts=ok.kindlestoresget();
	  System.out.println(kindlestorestexts);
	  SoftAssert sa=new SoftAssert();
	  sa.assertEquals(kindlestorestexts, "Best Sellers in Kindle Store");
	  System.out.println("This is after assertion");
	  sa.assertAll();
  }
  @Test(dependsOnMethods ="f")
  public void secondmethod() {
	  System.out.println("This is second method");
  }
  
  
 /* @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  browsers("Edge");
	  /*System.setProperty("webdriver.chrome.driver", "C:\\Users\\syoha\\eclipse-workspace\\students\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();   //driver is referance to the interface
		 System.setProperty("webdriver.Edge.driver", "C:\\Users\\syoha\\eclipse-workspace\\students\\Drivers\\msedgedriver.exe");
			driver=new EdgeDriver();
			System.setProperty("webdriver.Firefox", "C:\\Users\\syoha\\eclipse-workspace\\students\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();*/
		
		/*driver.navigate().to("https://www.amazon.com");
		Thread.sleep(16000);
		//driver.navigate().refresh();
		driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(6000);
	  driver.close();
  }
  public void browsers(String browser) {
	  if (browser.equalsIgnoreCase("chrome")) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\syoha\\eclipse-workspace\\students\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver(); }
	  
	  else if (browser.equalsIgnoreCase("Edge")) {
		  System.setProperty("webdriver.Edge.driver", "C:\\Users\\syoha\\eclipse-workspace\\students\\Drivers\\msedgedriver.exe");
		driver=new EdgeDriver();}
	  
	  else if (browser.equalsIgnoreCase("Firefox")) {
		  System.setProperty("webdriver.Firefox", "C:\\Users\\syoha\\eclipse-workspace\\students\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();}
}
  public void screnshots() throws IOException {
	  Date dt=new Date();
	//change the date data type to string form
		 String scsh=dt.toString().replace(" ", "_").replace(":", "_");
		  System.out.println(scsh);
	  File capture=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(capture, new File("C:\\Users\\syoha\\eclipse-workspace\\students\\Pictures\\"+scsh+"Output.jpg"));
  }*/
}
