package curs12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class FindElementsExample extends BaseTest{
	
	
	//figure[class="sc_image  sc_image_shape_square"] --> match case-- exact match
	
	//figure[class*="sc_image"] --> match case-- exact match -->* il transforma in contains

	//<figure class="sc_image  sc_image_shape_square">
	
	@Test
	public void testFindElements() throws InterruptedException {
		
		//WebElement element = driver.findElement(By.cssSelector(...))
		List<WebElement> elements = driver.findElements(By.cssSelector("figure[class*='sc_image']"));
		
		for(WebElement obiectDinLista : elements) {
			
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:2px solid red')", obiectDinLista);
			Thread.sleep(1000);
		}
		}
	
	@Test(priority=1)
	public void testClickFindElements() {
	
		List<WebElement> books =  driver.findElements(By.cssSelector("h3[class*=\"sc_title\"]"));
		books.get(2).click();
		
	}
	
	

}
