package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEquals {
@Test
public void  VerifyTitle() throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	String expectedTitle ="Google";
	String actualtitle =driver.getTitle();
	 Assert.assertEquals(actualtitle, expectedTitle);
	 Thread.sleep(3000);
	
	driver.quit();
	
}
}
