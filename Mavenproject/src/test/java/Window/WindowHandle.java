package Window;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {
	WebDriver driver = null;
	@Test
		public void window1() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.get("https://www.hondacarindia.com/");
		driver.findElement(By.xpath("//i[@class='menuIcon serviceIcon']")).click();
		Set<String>windowids = driver.getWindowHandles();
		for(String windowid :windowids) {
			System.out.println(windowid);
			if(driver.switchTo().window(windowid).getTitle().
					equals("Honda Cars India | Honda Hatchback, Sedan, SUV Cars")) ;
				break;
			
					}
					driver.findElement(By.xpath("//span[text()='BOOK A SERVICE']")).click();
					Thread.sleep(2000);
					driver.quit();
		
		}
		}

		
	


