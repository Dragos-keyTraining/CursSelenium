package tests;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import pages.ContactPage;
import pages.NavigationMenuPage;
import utils.BaseTest;

public class IframeExample extends BaseTest {
	
	@Test
	public void iFrameTest() throws InterruptedException {
		NavigationMenuPage navPage = new NavigationMenuPage(driver);
		navPage.navigateTo(navPage.contactLink);
		
		ContactPage contactPage =  new ContactPage(driver);
		contactPage.zoomMap(contactPage.zoomInButton);
		Thread.sleep(3000);		
		System.out.println(driver.getWindowHandles());
		contactPage.redirectMap();
		Thread.sleep(3000);		
		System.out.println(driver.getWindowHandles());
		List<String> browserTabs =  new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(browserTabs.get(1));
		driver.close();
		Thread.sleep(5000);		

		

		
	}

}
