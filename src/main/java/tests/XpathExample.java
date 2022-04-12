package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import utils.BaseTest;

public class XpathExample extends BaseTest {
	
	//@Test
	@Ignore
	public void xpathExample1() {
		
		driver.findElement(By.xpath("//li[@class='menu_user_login']")).click();
		//logical OR
		driver.findElement(By.xpath("//input[@id='log' or @name='log']")).sendKeys("TestUser");
		//logical AND
		driver.findElement(By.xpath("//input[@id='password' and @name='pwd']")).sendKeys("12345@67890");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//assertion
		String text = driver.findElement(By.xpath("//span[@class='user_name']")).getText();	
		assertEquals(text, "Test User");
		WebElement element = driver.findElement(By.xpath("//span[@class='user_name']"));
		assertEquals(element.getText(), "Test User");	
	}
	
	
	//@Test(priority= 1)
	public void xpathExample2() {
		
		driver.get("https://keybooks.ro/account/");
		driver.findElement(By.xpath("//p/a[contains(text(), 'recent orders')]")).click();
		
		boolean isThere = driver.findElement(By.xpath("//th[contains(@class, 'woocommerce-orders-table__header-order-number')]")).isDisplayed();
		assertTrue(isThere);
		
		driver.findElement(By.xpath("//td[contains(@class, 'woocommerce-orders-table__cell-order-number')][@data-title=\"Order\"]/a[contains(text(), '#1675')]")).click();
		
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/account/view-order/1675/");
		
	}
	
	@Test(priority=1)
	public void xpathExample3() throws InterruptedException {
		driver.get("https://keybooks.ro/shop/");
		//not
		String rating = driver.findElement(By.xpath("//div[@class='star-rating']/span[not(contains(@style, 'width:100%'))]")).getText();
		System.out.println(rating);
		assertTrue(rating.contains("Rated"));
		//starts -with
		driver.findElement(By.xpath("//a[starts-with(@title, 'Show')][not(contains(@title, 'Show products as thumbs'))]")).click();
		//select by index
		driver.findElement(By.xpath("(//a[contains(@class, 'add_to_cart_button')])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='View cart']")).click();
		//preceeding - cel dupa
		driver.findElement(By.xpath("//td[contains(@class, 'product')]/a[preceding::td[@class='product-thumbnail']]"));
		//following - cel dinainte
		driver.findElement(By.xpath("//td[contains(@class, 'product')]/a[following::td[@class='product-thumbnail']]"));

		
		
	}
	

}
