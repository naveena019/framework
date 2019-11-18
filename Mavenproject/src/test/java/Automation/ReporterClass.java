package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterClass {

	@Test
	public void Openbrowser() throws Exception {
		WebDriver driver = new ChromeDriver();
		Reporter.log("create driver object");
		driver.manage().window().maximize();
		driver.get("https://www.way2sms.com/");
		driver.findElement(By.name("mobileNo")).sendKeys("9398566763");
		driver.findElement(By.name("password")).sendKeys("9398566763");
		Reporter.log("Browser minimised");
		Thread.sleep(3000);
	}
	
}
