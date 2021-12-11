package testPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import basicPackage.driverSetup;

public class tc04_selectAuthor extends driverSetup {

	
	WebDriver driver;
	
	public tc04_selectAuthor(WebDriver driver) {
		this.driver = driver;
		
	}
	
	By authorSelect = By.xpath("//h3[contains(text(),'AKM Shafi')]");
	
	
	public void selectAnyAuthor()  {
		
		driver.findElement(authorSelect).click();
	
	}
	
}
	
	
	 

