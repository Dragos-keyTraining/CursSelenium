package curs10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstScript {
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver =  new ChromeDriver();
		
		driver.get("https://keybooks.ro/");
		
	}
	
	@Test
	public void checkPageTitle() throws InterruptedException {
		Thread.sleep(10000);
		System.out.println(driver.getTitle());
	}
	
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}

}
