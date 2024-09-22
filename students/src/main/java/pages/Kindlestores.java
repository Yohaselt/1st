package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kindlestores {
	WebDriver driver;
	@FindBy(xpath = "//*[text()='Best Sellers in Kindle Store']")
	public WebElement kindlestorestexts;
	//*[text()='Best Sellers in Kindle Store'] in order to display the text
	
	 
	public Kindlestores(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public String  kindlestoresget() {
		String storesjk=kindlestorestexts.getText();//to get the specific element
		return storesjk; 
	}

}
