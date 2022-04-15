package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopPage {
	
	public WebDriver driver;
	
	public ShopPage(WebDriver driver) {
		this.driver =  driver;
		
	}
	
	//locators
	public By leftSlider = By.cssSelector("span[style='left: 0%;']");
	public By rightSlider = By.cssSelector("span[style='left: 100%;']");
	public By filterButton = By.cssSelector("button[class='button']");
	public By addToCartButton = By.cssSelector("a[class*='add_to_cart_button']");
	public By cartItems = By.cssSelector("span[class='cart_items']");
	
	//methods
	
	public void dragAndDropSlider(By locator, int x, int y) {
		WebElement element = driver.findElement(locator);
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(element, x, y).perform();
		//actions.clickAndHold(element).moveByOffset(x, y).release().build().perform();
		//actions.clickAndHold(element).moveToElement(element).release().build().perform();
		
	}
	
	public void clickOnButton(By locator) {
		WebElement element = driver.findElement(locator);
		WebDriverWait wait =  new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();	
	}
	
	public void doubleClick(By locator) {
		WebElement element =  driver.findElement(locator);
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();
	}
	
	public String getElementText(By locator) {
		
		return driver.findElement(locator).getText();
		
	}
	
	
}
