package testPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import basicPackage.driverSetup;

public class tc03_scrollDown extends driverSetup {
	
	WebDriver driver;
	public tc03_scrollDown(WebDriver driver) {
		this.driver = driver;
	    }
	
	
    By scroll = By.xpath("//a[@class='page-numbers' and text()='2']");
    
    
    public void scrollingDown() {
    	
    	JavascriptExecutor js = (JavascriptExecutor) driver; 
        js.executeScript("window.scrollBy(1348,1371)");
    
    		driver.findElement(scroll).click();
    }
}
	


