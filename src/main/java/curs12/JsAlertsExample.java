package curs12;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utils.BaseTest;

public class JsAlertsExample extends BaseTest {
	
	
	@Test
	public void testJsAlert() throws InterruptedException {
		
		driver.findElement(By.cssSelector("button[onclick*=\"Alert\"]")).click();
		Thread.sleep(3000);
		Alert alertJs = driver.switchTo().alert();
		alertJs.accept();
		
		//driver.switchTo().alert().accept();
		
		String resultText2 = driver.findElement(By.cssSelector("p[id='result']")).getText();
		System.out.println(resultText2);
		assertEquals(resultText2, "You successfully clicked an alert");
		
	}
	
	@Test(priority=1)
	public void testConfirmAlert() throws InterruptedException {
		driver.findElement(By.cssSelector("button[onclick*=\"Confirm\"]")).click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().dismiss();
		
		String resultText2 = driver.findElement(By.cssSelector("p[id='result']")).getText();
		System.out.println(resultText2);
		assertEquals(resultText2, "You clicked: Cancel");
	}
	
	@Test(priority=2)
	public void testPromptAlert() throws InterruptedException {
		driver.findElement(By.cssSelector("button[onclick*=\"Prompt\"]")).click();
		Thread.sleep(3000);
		
		Alert alertaJs = driver.switchTo().alert();
		alertaJs.sendKeys("Test ceva");
		alertaJs.accept();
		
		String resultText2 = driver.findElement(By.cssSelector("p[id='result']")).getText();
		System.out.println(resultText2);
		assertEquals(resultText2, "You entered: Test ceva");
		
		
		//You entered: dawda
		
	}
	
	

}
