package Automation;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Capturescreenshot {
	@Test
	public static void testmethod1() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.way2sms.com/");
		TakesScreenshot takesScreenshot =(TakesScreenshot)driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\Image.PNG");
		FileHandler.copy(source, dest);
		Thread.sleep(2000);
		driver.quit();
		
				
		
	}

	
}
