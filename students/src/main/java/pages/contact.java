package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contact {
	WebDriver driver;
	@FindBy(id = "form-field-name")
	WebElement FirstNmaeField;

	@FindBy(name = "form_fields[name]")
	WebElement LastNameField;
	
	@FindBy(name = "form_fields[email]")
	WebElement Email;
	
	public contact(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void FirstNameTexts(String name) throws InterruptedException {
		FirstNmaeField.clear();
		FirstNmaeField.sendKeys(name);
		Thread.sleep(6000);
		
	}
	public void LastNameTexts(String LastName) throws InterruptedException {
		LastNameField.clear();
		LastNameField.sendKeys(LastName);
		Thread.sleep(6000);
	}
	public void EmailTexts(String EmailTexts) throws InterruptedException {
		Email.clear();
		Email.sendKeys(EmailTexts);
		Thread.sleep(6000);
	}
}
