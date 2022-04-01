package curs12;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utils.BaseTest;

public class WaitsExample extends BaseTest{
	
	@Test
	public void waitExample() throws InterruptedException {

		
		 driver.findElement(By.tagName("button")).click();
		//Thread.sleep(5000);
		 WebElement finish = driver.findElement(By.id("finish"));

		
		//explicit wait
		WebDriverWait wait  =  new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBePresentInElement(finish, "Hello World!"));
		
		String result = finish.getText();
		System.out.println("Finish text :" + result);	
		assertEquals(result, "Hello World!");
	}
	
	

}
