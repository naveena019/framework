package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefinitions {

	WebDriver driver = null;
	
	@Given("openbrowser and enter url")
	public void openbrowser_and_enter_url() {
		
		WebDriverManager .chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
	    	}

	@Then("enter user name and password")
	public void enter_user_name_and_password() {
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
	}

	@Then("user logged in to application")
	public void user_logged_in_to_application() {
	
		driver.findElement(By.name("findFlights")).click();
		driver.findElement(By.name("reserveFlights")).click();
		driver.findElement(By.name("passFirst0")).sendKeys("naveena");
		driver.findElement(By.name("passLast0")).sendKeys("naveen");	
		driver.findElement(By.name("buyFlights")).click();
	}
	

	@Then("user clicked on sign off")
	public void user_clicked_on_sign_off() {
		driver.findElement(By.linkText("SIGN-OFF")).click();
	   
	}

	@Then("user loged out from the application")
	public void user_loged_out_from_the_application() throws Exception {
	   Thread.sleep(3000);
	   driver.quit();
	}

}
