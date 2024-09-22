package pages;
//Day 25
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bestsellers {
	WebDriver driver;
	@FindBy(linkText = "Kindle Store")
	public WebElement stores;
	
	
	public Bestsellers(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	
	public void storesToClick() {
		stores.click(); 
	}
	
	
	
	
}
