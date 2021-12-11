package testPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import basicPackage.driverSetup;

public class tc06_clickOrder extends driverSetup {
	
    WebDriver driver;
	public  tc06_clickOrder(WebDriver driver) {
		this.driver = driver;
		
	}
	
	By order = By.xpath("//button[@class='single_add_to_cart_button button alt ']");
	
	
	
	public void click_Order() {
		
		driver.findElement(order).click();
	}

}
