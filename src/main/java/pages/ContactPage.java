package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactPage {
	
	public WebDriver driver;
	
	public ContactPage(WebDriver driver) {
		this.driver =  driver;
	}
	
	
	//locatori
	public By zoomInButton = By.cssSelector("button[title='Zoom in']");
	public By zoomOutButton = By.cssSelector("button[title='Zoom out']");
	public By iframe =  By.tagName("iframe");
	public By outsideMapLink = By.partialLinkText("map");
	
	
	//metode
	public void zoomMap(By locator) {
		WebElement iFrame  =  driver.findElement(iframe);
		driver.switchTo().frame(iFrame);
		driver.findElement(locator).click();
		
	}
	
	public void redirectMap() {
		driver.findElement(outsideMapLink).click();
	}

}
