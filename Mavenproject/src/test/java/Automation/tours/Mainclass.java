package Automation.tours;

import org.testng.annotations.Test;

import FrameworkScript.FrameworkScript;
import Screens.Flightfinder;
import Screens.Loginpage;

public class Mainclass  extends FrameworkScript{
	
	
	@Test
	public void  BookaTicket() {
	
		driver.get("http://newtours.demoaut.com/");
		Loginpage loginpage = new Loginpage(driver);
		loginpage.login("mercury", "mercury");
		 Flightfinder flightfinder = new  Flightfinder(driver);
		 flightfinder.clickoncontinue();
		Screens.BookaTicket bookaticket = new  Screens.BookaTicket(driver);
		 
		 bookaticket.enterdetails("naveen", "naveena");
		
	
		
	}

}
