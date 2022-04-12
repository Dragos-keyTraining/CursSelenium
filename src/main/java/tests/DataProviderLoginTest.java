package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.NavigationMenuPage;
import utils.BaseTest;

public class DataProviderLoginTest extends BaseTest{
	
	
	@DataProvider(name="loginTestData")
	public Object[][] loginTestData(){
		
		//String[] textArray =  new String[3];
		//textArray[0] = "text index 0";
		//textArray[1] = "text index 1";

		Object[][] data =  new Object[4][3];
		
		data[0][0] = "TestUser";
		data[0][1] = "12345@67890";
		data[0][2] = true;
		
		data[1][0] = "userGresit";
		data[1][1] =  "parolaGresita";
		data[1][2] = false;
		
		data[2][0] = "test.test";
		data[2][1] =  "test.test@123";
		data[2][2] = true;
		
		data[3][0] = "userGresit123";
		data[3][1] =  "parolaGresita1231";
		data[3][2] = false;
		
		return data;

	}
	
	@Test(dataProvider = "loginTestData")
	public void loginTests(String user, String pass, boolean sucess) throws InterruptedException {
		
		NavigationMenuPage navMenu = new NavigationMenuPage(driver);
		navMenu.navigateTo(navMenu.loginLink);
		
		LoginPage loginPage =  new LoginPage(driver);
		loginPage.loginInApp(user, pass);
		
		if(sucess) {
			loginPage.logoutFromApp();

		}else if(!sucess) {
			Thread.sleep(4000);
			
			
			loginPage.closePopUp();
			
		}
		
		
		
		
	}
	
	
	

}
