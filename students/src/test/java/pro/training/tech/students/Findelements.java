package pro.training.tech.students;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Common.Reusable;

public class Findelements extends Reusable {
  @Test
  public void f() {
	 List<WebElement> links= driver.findElements(By.tagName("a"));
	 int sizes=links.size();
	 System.out.println(sizes);
	  
  }
}
