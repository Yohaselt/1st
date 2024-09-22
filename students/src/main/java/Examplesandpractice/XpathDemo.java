package Examplesandpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*syntax for xpath
//tagname[@attributte='attribute value']
//img[@title='your Store']   OR

//*[@attribute='value']
 //*[@title='your Store']
 */
/*the difference between Absolute and Relative xpath
 * 1, Absolute xpath starts with /
 *    Relative xpath starts with //
 * 2, Absolute xpath do not use attributes
 *    Relative xpath works with attribute
 * 3, Absolut xpath traverse through each node till it finds element
 *    Relative xpath directly jump and find the element by using attribute
 */

public class XpathDemo {
	

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		
		
	}

}
