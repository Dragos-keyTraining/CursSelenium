package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utils.BaseTest;

public class JSExecutorExample extends BaseTest{
	
	//@Test
	public void jsScrollTest() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 2500)");
		
		Thread.sleep(3000);
		WebElement signUp = driver.findElement(By.cssSelector("input[value='Sign up']"));
		//js.executeScript("arguments[0].scrollIntoView()", signUp);
		
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.moveToElement(signUp).perform();
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		Thread.sleep(3000);

		js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");

	}
	
	//@Test
	public void reloadPage() {
		JavascriptExecutor js = (JavascriptExecutor)driver;

		driver.get("https://keyfood.ro/");
		driver.navigate().back();
		driver.navigate().to("http://emag.ro");
		js.executeScript("window.location='https://amazon.com'");
		js.executeScript("window.history.go(-1)");
		
		driver.navigate().refresh();
		
		js.executeScript("window.history.go(0)");
		
		Actions action  =  new Actions(driver);
		action.keyDown(Keys.CONTROL).sendKeys(Keys.F5).perform();
		
	}
	@Test
	public void jsExecutorExample2() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement comingSoonLink = driver.findElement(By.linkText("COMING SOON"));
		js.executeScript("arguments[0].click()", comingSoonLink);
		comingSoonLink.click();
		
		WebElement searchIcon = driver.findElement(By.cssSelector("button[class*='search_submit']"));
		WebElement searchInput = driver.findElement(By.cssSelector("input[class*='search_field']"));
		
		//js.executeScript("arguments[0].click()", searchIcon);
		//js.executeScript("arguments[0].value='cooking'", searchInput);
		
		js.executeScript("arguments[0].click();arguments[1].value='cooking'", searchIcon,searchInput);

		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(3000);


		
		
		
		
	}


}
