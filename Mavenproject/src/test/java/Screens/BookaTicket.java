package Screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookaTicket {
	
	@FindBy(name="passFirst0")
	private WebElement txtfirstname =null; 
	@FindBy(name="passLast0")
	private WebElement txtlastname = null;
	@FindBy(name="buyFlights")
	private WebElement btnbuyFlights= null;
	@FindBy(linkText = "SIGN-OFF")
	private WebElement btnSIGNOFF =null;
	
	public BookaTicket( WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enterdetails(String firstname,String lastname) {
		txtfirstname.sendKeys(firstname);
		txtlastname.sendKeys(lastname);
		btnbuyFlights.click();
		btnSIGNOFF.click();
		
		
		
	}
}


