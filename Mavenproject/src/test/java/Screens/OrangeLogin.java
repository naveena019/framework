package Screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeLogin {
	@FindBy(id="txtUsername")
	private WebElement txtUsername=null;
	@FindBy(id="txtPassword")
	private WebElement txtPassword =null;
	@FindBy(id="btnLogin")
	private WebElement btnLogin =null;
	
	public  OrangeLogin (WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void Login(String username,String password) {
		txtUsername.sendKeys( username);
		txtPassword.sendKeys( password);
		btnLogin.click();
	}
}
