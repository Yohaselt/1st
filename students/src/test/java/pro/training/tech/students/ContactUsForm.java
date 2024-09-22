package pro.training.tech.students;

import org.testng.annotations.Test;

import pages.contact;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class ContactUsForm {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  contact ob= new contact(driver);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
}
