package testPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import basicPackage.driverSetup;

public class tc07_orderComplete extends driverSetup {
	

	WebDriver driver;
	
	public tc07_orderComplete(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	By orderCom = By.xpath("//span[contains(text(),'অর্ডার সম্পন্ন করুন')]");
	
	
	public void order_Complete() {
		
		driver.findElement(orderCom).click();
	}

}
