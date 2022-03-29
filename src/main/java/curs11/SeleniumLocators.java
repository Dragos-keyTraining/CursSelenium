package curs11;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumLocators {
	
WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		//System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver =  new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://keybooks.ro/");
		
	}
	
	
	
	
	@Test
	public void linkTextLocator() {
		
		WebElement booksLink = driver.findElement(By.linkText("BOOKS"));
		booksLink.click();
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/");	
   //<a href="https://keybooks.ro/shop/">Books</a>
	//<a href....> </a>	
	//getText() --> <a href....> textul de aici </a>	
		
	}
	
	// linkText si partialLinkText functioneaza doart pe tagname-uri de tip <a ..>
	
	
	@Test(priority=1)
	public void partialLinkTextLocator() {
		
		WebElement cookingBookLink = driver.findElement(By.partialLinkText("Cooking"));
		cookingBookLink.click();
		String actualPageUrl = driver.getCurrentUrl();
		assertEquals(actualPageUrl, "https://keybooks.ro/shop/cooking-with-love/");
		//<a href="https://keybooks.ro/shop/cooking-with-love/">Cooking with love</a>		
	}
	
	@Test(priority =2)
	public void classNameLocator() {
		WebElement price =  driver.findElement(By.className("price"));
		assertTrue(price.isDisplayed());
		String priceValue = price.getText();
		System.out.println(priceValue);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:2px solid red')", price);
		
	}
	//1. driver.findElement.click
	//2. Actions .click
	//3. javasciprExecutor.click
	
	@Test(priority=3)
	public void idLocator() {
		WebElement tabReview =  driver.findElement(By.id("tab-title-reviews"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:2px solid red')", tabReview);
		tabReview.click();	

	}
	
	@Test(priority=4)
	public void xpathLocator() {
		WebElement  commentBox =  driver.findElement(By.xpath("//textarea[@id='comment']"));
		commentBox.sendKeys("My Comment");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:2px solid red')", commentBox);
	}
	
	// cand da selenium click vs cand este browserul pregatit
	// Thread.sleep (6000)
	// browserul poate este pregatit dupa 3 sec 
	
	//Waits --> implicit si explcit
	//explicit--> wait.until.Conditie (elementul, 10) --> in spate face poll la 500ms si verifica conditia
	//elementul este pregatit dupa 3 sec -- face resume 
	
	
	@Test(priority=5)
	public void nameLocator() throws InterruptedException {
		
		WebElement nameBox = driver.findElement(By.name("author"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:2px solid red')", nameBox);
		nameBox.sendKeys("Test Ceva");
		Thread.sleep(3000);
		nameBox.clear();
		Thread.sleep(3000);
		nameBox.sendKeys("Jhonny Bravo");
		
	}
	@Test(priority=6)
	public void cssSelector() {
		// input[type='email']  --> cssSelector
		// //input[@type='email']  --> Xpath
		WebElement emailBox = driver.findElement(By.cssSelector("input[type='email']"));
		emailBox.sendKeys("test@test.ceva");
		
		
	}
	
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}

}
