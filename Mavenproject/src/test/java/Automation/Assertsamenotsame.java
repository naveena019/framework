package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertsamenotsame {

	public void VerifyTitle() {
		WebDriver driver1 = new ChromeDriver();
		WebDriver driver2 = new ChromeDriver();
		Assert.assertNotSame(driver1, driver2);
		WebDriver driver3 = new ChromeDriver();
		Assert.assertSame(driver3, driver1);
		
		
		
	}
	
}
