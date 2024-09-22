package PageObject;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.Bestsellers;
import pages.Home;
import pages.Kindlestores;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

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
// assertEquals(kindlestorestexts, "Best Sellers in Kindle Store");
//we use 'assert' to specify the text is displayed on the website

/*hard assert-  it will stop the execution as soon as the assert is fail
 *soft assert - it will execute all the program and at the end it gives the result that how many
 *				assert pass and how many fail.*/
/* dependent= if making dependent one method over another method and if it fails it will not execute the whole method
 * 			and if the dependent method is passed it will execute the other method as well.
 */
public class PagObjModel {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException, IOException {
	  Home ob=new Home(driver);
	  Thread.sleep(6000);
	  ob.BestsellersClick();
	  Bestsellers oj=new Bestsellers(driver);
	  Thread.sleep(6000);
	  oj.storesToClick();
	  
	 screenshots();
	  Kindlestores ok=new Kindlestores(driver);
	  String kindlestorestexts=ok.kindlestoresget();
	  System.out.println(kindlestorestexts);
	  SoftAssert ass=new SoftAssert();
	  ass.assertEquals(kindlestorestexts,  "Best Sellers in Kindle Store");//this became soft assert
	 
	  System.out.println("This is after assertion");
	  ass.assertAll();
	  //assertequals is helping to verify the actual result and the expected text
		 //two types of assert  i.e simple assert  and soft assert
		 /*if the verification is faild during simple assert, it stop the execution right away
		  * and will not continue with the rest of the code
		  * during soft assert eventhoe there is a failure, it execute the code  but verify where the 
		  * failure is. we have to use 'assert all' before the execution  
		  */
	   
  }
  @Test(dependsOnMethods ="f")
  public void SecondMethod(){
	  System.out.println("This is second method");
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException, IOException {
	  browsers("Firefox");
	  	/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\syoha\\eclipse-workspace\\students\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();   
		System.setProperty("webdriver.Edge.driver", "C:\\Users\\syoha\\eclipse-workspace\\students\\Drivers\\msedgedriver.exe");
		driver=new EdgeDriver();
		System.setProperty("webdriver.Firefox", "C:\\Users\\syoha\\eclipse-workspace\\students\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();*/
		driver.navigate().to("https://www.amazon.com");
		Thread.sleep(16000);
		driver.manage().window().maximize();
		screenshots();
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
  public void screenshots() throws IOException {
	  Date  dt=new Date();
	  //change the date data type to string form
	 String scsh=dt.toString().replace(" ", "_").replace(":", "_");
	  System.out.println(scsh);
	 File capture=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileHandler.copy(capture, new File("C:\\Users\\syoha\\eclipse-workspace\\students\\newpicture\\"+scsh+"output.jpg"));
  }
  
}
