package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pages.NavigationMenuPage;
import pages.ShopPage;
import utils.BaseTest;

public class ActionClassExample extends BaseTest{
	
	
	@Test(priority =1)
	public void hoverExample() throws InterruptedException {
		
		NavigationMenuPage navMenu =  new NavigationMenuPage(driver);
		
		navMenu.hoverMenu(navMenu.aboutLink);
		navMenu.hoverMenu(navMenu.blogLink);
		navMenu.navigateTo(navMenu.postFormatPageLink);
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/category/post-formats123/");
	
	}
	
	//@Test(priority =2)
	public void dragAndDropExample() throws InterruptedException {
		NavigationMenuPage navMenu =  new NavigationMenuPage(driver);
		navMenu.navigateTo(navMenu.shopLink);
		
		ShopPage shopPage =  new ShopPage(driver);
				
		shopPage.dragAndDropSlider(shopPage.leftSlider, 100, 0);
		shopPage.dragAndDropSlider(shopPage.rightSlider, -100, 0);
		shopPage.clickOnButton(shopPage.filterButton);
		
		shopPage.doubleClick(shopPage.addToCartButton);
		
		
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/?min_price=13&max_price=15");
	}
	//@Test(priority =3)
	public void doubleClickExample() {
		
		ShopPage shopPage =  new ShopPage(driver);
		shopPage.doubleClick(shopPage.addToCartButton);
		WebDriverWait wait =  new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(shopPage.cartItems), "2"));
		assertEquals(shopPage.getElementText(shopPage.cartItems), "2");
	}
	
	

}
