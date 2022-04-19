package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utils.BaseTest;

public class FileUploadExample extends BaseTest{
	
	
	@Test
	public void fileUploadTest() throws InterruptedException {
		
		driver.get("https://the-internet.herokuapp.com/upload");
		
		driver.findElement(By.id("file-upload")).sendKeys("/Users/dragostanta/curs_testare_automata5/CursSelenium/file.txt");
		Thread.sleep(5000);
		driver.findElement(By.id("file-submit")).click();
		
		String actualText =  driver.findElement(By.id("uploaded-files")).getText();
		assertEquals(actualText, "file.txt");
		
		
	}

}
