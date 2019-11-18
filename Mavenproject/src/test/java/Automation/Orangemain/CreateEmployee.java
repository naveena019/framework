package Automation.Orangemain;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameworkScript.FrameworkScript;
import Screens.EmployeeScreen;
import Screens.Logoutscreen;
import Screens.OrangeLogin;

public class CreateEmployee  extends FrameworkScript{
	@Test(dataProvider="getTestdata")
	public void createEmployee
	(String username,String password,String firstname,String lastname) {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		 OrangeLogin login = new  OrangeLogin(driver);
		 login.Login(username, password);
		 EmployeeScreen empscreen = new EmployeeScreen(driver);
		 empscreen.enterdetails(firstname, lastname);
	      Logoutscreen logout = new Logoutscreen(driver);
	      logout.Logout();
	
	}
	@DataProvider
	public String[][] getTestdata(){
		
	String[][] data={
		{"admin","admin123","naveena","m"}
	};
		
		return data;
	}
}
		
	

