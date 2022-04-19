package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.NavigationMenuPage;
import utils.BaseTest;
import utils.Log;
import utils.TestNgListener;

@Listeners(TestNgListener.class)
public class LoginTest extends BaseTest{
	
	@Parameters({"user", "pass"})
	@Test
	public void loginTest(String username, String password) {
		NavigationMenuPage navMenu = new NavigationMenuPage(driver);
		navMenu.navigateTo(navMenu.loginLink);
		Log.info("Logger in metoda Login tests");
		//assertTrue(false);
		LoginPage loginPage =  new LoginPage(driver);
		loginPage.loginInApp(username, password);
		
		
	}

}
