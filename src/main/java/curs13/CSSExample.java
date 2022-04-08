package curs13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class CSSExample extends BaseTest {
	
	
	//List<WebElement> skills =  driver.findElements(By.cssSelector('sc_skills_total'));
	// skills.get(0) -->drama
	//skill.get(0).getText() --> 95%
	
	// XPATH : -->(//div[@class='sc_skills_total'])[1]
	//driver.findElement(by.xpath((//div[@class='sc_skills_total'])[3])).getText()

	
	// <a href="#" />
	// <a href =""...>
		//<p> Ceva</p>
	//</a>
	
	//CSS Selector --> direct cu tagname--> div[]
	//xpath --> //div
	
	//CssSelector --> div[class=...]
	//Xpath --> //div[@class=...]
	//-----------------------------------------------------------------
	

	
	@Test
	public void cssExamples1() {
		
		// Css Selector dupa ID  (#)
		//Elementul : <ul id="menu_user" class="menu_user_nav inited sf-js-enabled sf-arrows">
		//1. ul[id="menu_user"]
		//2. #menu_user --> este echivalent cu id=menu_user --> pt ca # este egal cu 'id='

		WebElement loginPopUp = driver.findElement(By.cssSelector("#menu_user"));
		System.out.println(loginPopUp.getText());
		
		//Css Selector dupa class (.)
		//element : <div class="logo_slogan">Your Favorite Bookshelf!</div>
		//1. div[class="logo_slogan"] --> tagname[atribute="valoare atribute"]
		//2.  .logo_slogan --> este echivalent cu class=menu_user --> pt ca . este egal cu 'class='
		WebElement logoSlogan = driver.findElement(By.cssSelector(".logo_slogan"));
		System.out.println(logoSlogan.getText());
			
		// 1. div[class="wpb_wrapper"]>h3[class*="sc_title_underline"]
		// 2. div.wpb_wrapper>h3.sc_title_underline
		
		//contains
		//WebElement bookTitle =  driver.findElement(By.cssSelector(""));
		
//div[class="column-1_6"] --> <div class="column-1_6">
//div[class="column-1_6 sc_column_item sc_column_item_6 even"] --><div class="column-1_6 sc_column_item sc_column_item_6 even">
//div[class*="column-1_6"] > <div class= (* =contains)	
				
		//<div class="column-1_6 sc_column_item sc_column_item_6 even">
				//<figure class="sc_image  sc_image_shape_square">
					//<img src="https://keybooks.ro/wp-content/uploads/2016/04/books7.jpg" alt="">
					//</figure>
				//<h3 class="sc_title sc_title_regular sc_align_center margin_bottom_tiny" style="margin-top: 1.4em;text-align:center;color:#121212;font-weight:700;font-size:1.059em;"><a href="storm">Storm</a></h3>

		//</div>
		
		//contains
		WebElement book =  driver.findElement(By.cssSelector("div[class*=\"sc_column_item_4\"]>h3[class*=\"sc_title_regular\"]>a[href=\"the-long-road-to-the-deep-silence\"]"));
		System.out.println(book.getText());
		
		//contains word --> match case --> ~
		//div[class~="sc_column_item_4"]
		
		//starting with --> ^
		//a[href^="sto"]
		
		//ends with --> $
		//a[href$="garden"]
		
		//NOT 
		List<WebElement> tabs =  driver.findElements(By.cssSelector("li[class*=\"sc_tabs_title\"]:not([aria-selected=\"true\"])"));
		
		for(WebElement ele : tabs) {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:2px solid red')", ele);
		}
		
		//NTH-CHILD 
		WebElement tab4 = driver.findElement(By.cssSelector("li[class*=\"sc_tabs_title\"]:nth-child(4)"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].setAttribute('style', 'background:green; border:2px solid red')", tab4);
				
	}

	
	
	
	

	
	
	
	
}
