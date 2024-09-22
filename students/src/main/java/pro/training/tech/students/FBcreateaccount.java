package pro.training.tech.students;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ByAll;

public class FBcreateaccount {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syoha\\eclipse-workspace\\students\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.facebook.com");
		WebElement createNewaccount=driver.findElement(By.linkText("Create new account"));
		createNewaccount.click();
		Thread.sleep(6000);
		WebElement firstName=driver.findElement(By.name("firstname"));
		firstName.sendKeys("John");
		Thread.sleep(6000);
		WebElement lastName=driver.findElement(By.name("lastname"));
		lastName.sendKeys("Seltene");
		WebElement mobilenumber=driver.findElement(By.name("reg_email__"));
		mobilenumber.sendKeys("someone@gmail.com");
		WebElement creatpass=driver.findElement(By.id("password_step_input"));
		creatpass.sendKeys("123456789");
		Thread.sleep(5000);
		WebElement birthmonth=driver.findElement(By.name("birthday_month"));
		birthmonth.click();
		Thread.sleep(5000);
		WebElement month=driver.findElement(By.id("month"));
		month.sendKeys("february");
		Thread.sleep(5000);
		WebElement birthday=driver.findElement(By.name("birthday_day"));
		birthday.click();
		WebElement day=driver.findElement(By.name("birthday_day"));
		day.sendKeys("2");
		WebElement birthyear=driver.findElement(By.name("birthday_year"));
		birthyear.click();
		WebElement year=driver.findElement(By.id("year"));
		year.sendKeys("1999");
		WebElement gender=driver.findElement(By.xpath("//input[@value=\"2\"]"));
		gender.click();
		WebElement signup=driver.findElement(By.name("websubmit"));
		signup.click();
		
	}

}
