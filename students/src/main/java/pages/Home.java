package pages;
//Day 25
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//AFTER CREATING THE CLASS IN EACH CLASS WE HAVE TO DO 3 THINGS
//1, locate the element i.e" driver.findelement"
//2, page factory constructor
//3,create a method for each element according to action
	
public class Home {//from home page we need the best seller
	WebDriver driver;
	@FindBy(linkText = "Best Sellers")// this is locator
	public WebElement BestsellersLink;//save the locator
	
	
	//page factory constructor
public Home(WebDriver driver) {//we have to make a global before creating this method
	this.driver=driver;
	PageFactory.initElements(driver, this);//use "this" to connect the local driver with global driver 
	//page factory constructor is always the same,but we have to change the name of the class
}
public void BestsellersClick() {
	BestsellersLink.click(); 
	
}
}
