package testPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import basicPackage.driverSetup;

public class tc02_clickWriter extends driverSetup {
	
	
	    WebDriver driver;
	    
	    public tc02_clickWriter(WebDriver driver) {
	    	this.driver = driver;
	    }
	
		
	    
	    By selectWrite = By.xpath("//span[@class='menu-label-level-0'][contains(text(),'লেখক')]");
	    
	    
	    public void selectMenu(){
	    	
	    	driver.findElement(selectWrite).click();
	    	
	    }
		
		
	}

