package Automation;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefinitions1 {
	WebDriver driver = null;
	@Given("open browser and enter url")
	public void open_browser_and_enter_url() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.indeed.co.in/");
		Thread.sleep(3000);
	   	}

	@Given("click on post your resume")
	public void click_on_post_your_resume() throws Exception {
		driver.findElement(By.linkText("Post your resume")).click();
		Thread.sleep(3000);
	   	}

	@Then("click on upload ur resume")
	public void click_on_upload_ur_resume()throws Exception {
		driver.findElement(By.xpath( "//button[text()='Upload your resume']")).click();
		Thread.sleep(3000);
	   	}

	@Then("give the file loaction of resume")
	public void give_the_file_loaction_of_resume() throws Exception {
		Workbook workbook = WorkbookFactory.create(new File("D:\\Resume.xls"));
		workbook.close();
		System.out.println("file not uplaoded");
		
	
	   	}


}
