package pro.training.tech.students;
//Day 25
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.opentelemetry.sdk.metrics.data.Data;
import pages.Bestsellers;
import pages.Home;
import pages.Kindlestores;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
//import java.sql.Date;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v125.page.model.Screenshot;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;

public class PageObjectModel {
	WebDriver driver;
  @Test(priority=1)
  public void f() throws InterruptedException {
	 Home ob=new Home(driver);// create an object to call from class
	 Thread.sleep(10000);
	 ob.BestsellersClick();
	 Bestsellers oj=new Bestsellers(driver);
	 Thread.sleep(10000);
	 oj.storesToClick();
	
	 screenshots();
	 Kindlestores ok=new Kindlestores(driver);
	 String kindlestorestexts= ok.kindlestoresget();
	 System.out.println(kindlestorestexts);
	 SoftAssert sa=new SoftAssert();//change from simple assert to soft assert by creating an object called "sa"
	// assertEquals(kindlestorestexts, "Best Sellers in Kindle Store");
	 sa.assertEquals(kindlestorestexts, "Best Sellers in Kindle Store");
	 System.out.println("This is after assertion");
	 sa.assertAll();
	 //assertequals is helping to verify the actual result and the expected text
	 //two types of assert  i.e simple assert  and soft assert
	 /*if the verification is faild during simple assert, it stop the execution right away
	  * and will not continue with the rest of the code
	  * during soft assert eventhoe there is a failure, it execute the code  but verify where the 
	  * failure is. we have to use 'assert all' before the execution  
	  */
	 
  }
 private void screenshots() {
	// TODO Auto-generated method stub
	
}
// @Test(priority=2)   		//priority
  @Test(dependsOnMethods = "f")
  public void Aseconds(){
	  System.out.println("This is second method");
	  /*the test execution is happening by alphabet "Aseconds" test went first 
	   * because the method name begins with "A" and the second one comes right away cosz it 
	   * started with "F".if i want to control the flow of the test by myself, i can give  priority 
	   * to the one i want execute first.
	   * DEPENDS ON METHOD is when one method is depends on other method. even if there is an 
	   * error the one depends it will skip and execute the other one 
	   */
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException, IOException {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\syoha\\eclipse-workspace\\students\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();   //driver is referance to the interface
		Thread.sleep(12000);
		driver.navigate().to("https://www.amazon.com");
		Thread.sleep(16000);
		//driver.navigate().refresh();
		driver.manage().window().maximize();
		
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(6000);
	  driver.close();
  }

 
 
}
