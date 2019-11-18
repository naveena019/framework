package Automation;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGrid {
    @Test
	public static void testmethod() throws Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setPlatform(Platform.WINDOWS);
		capabilities.setBrowserName("chrome");
		WebDriver driver = new RemoteWebDriver(new URL("http://10.0.0.12:4444/wd/hub"),capabilities);
		driver.manage().window().maximize();
		driver.get("https://www.way2sms.com/");
		Thread.sleep(2000);
		driver.quit();
		
	}
}
