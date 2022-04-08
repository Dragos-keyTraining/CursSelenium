package tests;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.NavigationMenuPage;
import utils.BaseTest;

public class LoginTest extends BaseTest{
	
	@Test
	public void loginTest() {
		NavigationMenuPage navMenu = new NavigationMenuPage(driver);
		navMenu.navigateTo(navMenu.loginLink);
		
		LoginPage loginPage =  new LoginPage(driver);
		loginPage.loginInApp("TestUser", "12345@67890");
		
		
	}

}
