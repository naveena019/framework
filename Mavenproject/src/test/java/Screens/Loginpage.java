package Screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy(name="userName")
	private WebElement txtusername =null;
	@FindBy(name="password")
	private WebElement txtpassword =null;
	@FindBy(name="login")
	private WebElement btnlogin= null;
	public  Loginpage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	}
	public void login(String userName,String password ) {
		
		txtusername.sendKeys(userName);
		txtpassword.sendKeys(password);
		btnlogin.click();
	}
}
