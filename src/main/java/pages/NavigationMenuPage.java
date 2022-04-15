package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

//clasa de Page Objects
public class NavigationMenuPage {
	
	//initalizarea variabilei
	WebDriver driver;
	
	//constructor
	public NavigationMenuPage(WebDriver driver) {
		this.driver =  driver;
		
	}
	
	//driver.findElement(By.linkText("BOOKS")).click();
	
	//locatori
	public By shopLink = By.linkText("BOOKS");
	public By homeLink = By.linkText("HOME");
	public By contactLink = By.linkText("CONTACTS");
	public By loginLink = By.linkText("Login");
	public By blogLink =  By.linkText("BLOG");
	public By aboutLink = By.linkText("ABOUT");
	public By postFormatPageLink = By.linkText("Post Formats");
	
	
	//metode specifice 
	public void navigateTo(By locator) {
		driver.findElement(locator).click();
		
	}
	
	public void hoverMenu(By locator) {
		WebElement element =  driver.findElement(locator);
		Actions actions =  new Actions(driver);
		actions.moveToElement(element).perform();
			
	}
	
	
	
	
	

}
