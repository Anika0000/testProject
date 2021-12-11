package testPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import basicPackage.driverSetup;

public class tc05_viewBookDetails extends driverSetup {
	
	
	WebDriver driver;
	
	public tc05_viewBookDetails(WebDriver driver) {
		this.driver = driver;
	}
	
	
	By book = By.xpath("//div[@class='product_thumbnail_wrapper']");
	By view = By.xpath("//img[@class='attachment-shop_single size-shop_single wp-post-image']");
	By img = By.xpath("//a[@class='custom-close-modal']");
	
	
	
	public void bookDetails() {
		
	    WebElement viewBook = driver.findElement(By.xpath("//div[@class='product_thumbnail_wrapper']"));
		Actions actions = new Actions(driver);
	    actions.moveToElement(viewBook).perform();
	    
	    driver.findElement(book).click();
			
	}
	
	
	public void imagesPg() {
		driver.findElement(view).click();
	}
	
	
	
	public void bookImg() {
		driver.findElement(img).click();
	}
	
}
