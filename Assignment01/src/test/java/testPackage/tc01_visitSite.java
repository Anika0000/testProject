package testPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import basicPackage.driverSetup;

public class tc01_visitSite extends driverSetup {
	
	
		
		    WebDriver driver;
		    
		    public tc01_visitSite(WebDriver driver) {
		    	this.driver = driver;
		    }
		
			
		    
		    By quit = By.xpath("//button[contains(text(),'X')]");
		    
		   
		    public void quitButton(){
		    	
		    	driver.findElement(quit).click();
		    	
		    }
		
  }
