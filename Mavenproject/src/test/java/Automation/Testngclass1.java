package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Testngclass1 {
	WebDriver driver = null;
	@BeforeTest
	public void Openbrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
	}
	
	@BeforeMethod
public void Login() throws Exception {
	driver.findElement(By.name("userName")).sendKeys("mercury");
	driver.findElement(By.name("password")).sendKeys("mercury");
	driver.findElement(By.name("login")).click();
	Thread.sleep(3000);
    }
	

	@Test
public void Bookaticket() {
		driver.findElement(By.name("findFlights")).click();
		driver.findElement(By.name("reserveFlights")).click();
		driver.findElement(By.name("buyFlights")).click();
	
}
	@AfterMethod
public void Logoff() {
		driver.findElement(By.linkText("SIGN-OFF")).click();
	
}
	@AfterTest
	public void CloseBrowser() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
}
