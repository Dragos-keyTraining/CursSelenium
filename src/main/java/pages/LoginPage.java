package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver =  driver;
	}
	
	//locatori
	public By username = By.id("log");
	public By password = By.id("password");
	public By loginButton = By.cssSelector("input[class='submit_button']");
	
	public By logoutButton = By.xpath("//li[@class='menu_user_logout']");
	public By closePopUpButton = By.xpath("//a[@class='popup_close']");
	
	//metode
	public void loginInApp(String user , String pass) {
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginButton).click();
		
	}
	
	public void logoutFromApp() {
		driver.findElement(logoutButton).click();
	}
	
	public void closePopUp() {
		driver.findElement(username).clear();
		driver.findElement(password).clear();
		driver.findElement(closePopUpButton).click();
	}
	
	

}
