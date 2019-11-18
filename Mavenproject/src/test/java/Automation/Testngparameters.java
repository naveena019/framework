package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testngparameters {
WebDriver driver =null;
@Parameters("http://newtours.demoaut.com/")
	public void Openbrowser(String browser) {
	
driver.manage().window().maximize();

      }
@Parameters(("username,password"))
@Test
public void Bookaticket(String username,String password) throws Exception {
	driver.findElement(By.name("userName")).sendKeys("username");
	driver.findElement(By.name("password")).sendKeys("password");
	driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
	}
@AfterTest
public void Closebrowser() {
	driver.quit();
}
}
