package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://newtours.demoaut.com/");
driver.findElement(By.name("userName")).sendKeys("mercury");
driver.findElement(By.name("password")).sendKeys("mercury");
driver.findElement(By.name("login")).click();
	Thread.sleep(3000); 
	driver.quit();
	
	}

}
