package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
	
	
	//metode specifice 
	public void navigateTo(By locator) {
		driver.findElement(locator).click();
		
	}
	
	

}
