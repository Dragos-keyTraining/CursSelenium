package tests;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.NavigationMenuPage;
import utils.BaseTest;

public class TestNavigation extends BaseTest{
	
	@Test
	public void navigateExample() throws InterruptedException {
		
		NavigationMenuPage navMenu = new NavigationMenuPage(driver);
		
		navMenu.navigateTo(navMenu.contactLink);
		Thread.sleep(3000);
		navMenu.navigateTo(navMenu.shopLink);
		Thread.sleep(3000);
		navMenu.navigateTo(navMenu.loginLink);
		LoginPage loginPage =  new LoginPage(driver);
		loginPage.loginInApp("TestUser", "12345@67890");
	}

}
