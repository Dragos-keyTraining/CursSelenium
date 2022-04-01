package curs12;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import utils.BaseTest;

public class DropdownExample extends BaseTest {
	
	
	@Test
	public void dropdownSelectByVisibleText() {
		
		driver.findElement(By.linkText("BOOKS")).click();
		
		WebElement dropdown =  driver.findElement(By.cssSelector("select[class='orderby']"));
		
		Select select = new Select(dropdown);
		select.selectByVisibleText("Sort by price: low to high");
		
		assertEquals(driver.getCurrentUrl(),"https://keybooks.ro/shop/?orderby=price");
		//reidentifici pentru org.openqa.selenium.StaleElementReferenceException
		WebElement dropdown2 =  driver.findElement(By.cssSelector("select[class='orderby']"));
		Select select2 = new Select(dropdown2);
		assertEquals(select2.getFirstSelectedOption().getText(),"Sort by price: low to high");
		
		
		//org.openqa.selenium.StaleElementReferenceException
		//1. identifici element
		//2. faci actiune pe element
		//3. aplicatia face refresh (moment in care selenium indentifica alta sesiune)
		//
		
		
	}

}
