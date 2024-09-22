package pro.training.tech.students;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectors {
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syoha\\eclipse-workspace\\students\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   //driver is referance to the interface
		driver.navigate().to("https://facebook.com");
		//Thread.sleep(6000);
		driver.navigate().refresh();
		driver.manage().window().maximize();
		WebElement createanaccount=driver.findElement(By.linkText("Create new account"));
		createanaccount.click();
		Thread.sleep(6000);
		WebElement month=driver.findElement(By.name("birthday_month"));
		Select ob=new Select(month);
		ob.selectByIndex(1);
		Thread.sleep(6000);
		ob.selectByValue("5");
		Thread.sleep(6000);
		ob.selectByVisibleText("Oct");
		Thread.sleep(4000);
		WebElement bday=driver.findElement(By.name("birthday_day"));
		Select obb=new Select(bday);
		obb.selectByValue("2");
		WebElement year=driver.findElement(By.name("birthday_year"));
		Select oby=new Select(year);
		oby.selectByVisibleText("1990");
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("number of links="+links.size());
		List<WebElement>images=driver.findElements(By.tagName("img"));
		System.out.println("total number of images="+images.size());
		
		WebElement female=driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/input)[1]"));
		female.click();
		
		WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
		
		Thread.sleep(5000);
		WebElement lastname=driver.findElement(By.name("lastname"));
		driver.close();
		/*Locators are addresses that identify a web element uniquely within the page.
		 * Locators  -ID, NAME, LINKTEXT, PARTIALLINKTEXT, CLASS NAME, TAGNAME
		 * Customised locators - CSS Selectors ,  XPath
		 *liktext is available only for links, innertext is available for every element
		 *when ever see "a" and href  it represent a link
		 *multiple elements can have a same tag name such as for an image IMG, for links "a" which is anchor tag, 
		 *for input boxes INPUT, for buttons BUTTON tag 
		 *that is the reason not to use in locators TAGNAME as a locator
		 *class is also a category so it is not allowed to use as class as a tag name
		 *we use this locators "tag name and class" to  get a group of web elements not for specific web element
		 *
		 */
		 
		 
		
		

	}

}
