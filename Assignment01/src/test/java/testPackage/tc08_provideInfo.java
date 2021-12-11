package testPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import basicPackage.driverSetup;


public class tc08_provideInfo extends driverSetup {
	
	
    WebDriver driver;
	
	public tc08_provideInfo(WebDriver driver) {
		this.driver = driver;
	}
	
	By psward = By.id("account_password");
	
	By username = By.id("billing_first_name");
	
	By phone = By.id("billing_phone");
	
	By altPhn = By.id("billing_alternative_phone");
	
	By email = By.id("billing_email");
	
	By findList = By.id("select2-billing_state-container");
	
	By findList1 = By.id("billing_area");
	
	By address = By.id("billing_address_1");
	
	By comment = By.id("order_comments");
	
	By btn = By.xpath("//button[@id='place_order']");
	
	
	public void typeCheck() {
		WebElement check = driver.findElement(By.xpath("//input[@id='createaccount']"));
    	check.click();
		
	}
	
	
	public void typePassword(String PasswordValue){
        driver.findElement(psward).sendKeys(PasswordValue);
    }
	
	
	public void typeUserName(String Name){
	        driver.findElement(username).sendKeys(Name);
	    }
	
	
	public void typePhone(String Number){
        driver.findElement(phone).sendKeys(Number);
    }
	
	
	public void typeAltPhone(String Num){
        driver.findElement(altPhn).sendKeys(Num);
    }
	
	
	public void typeEmail(String Id){
        driver.findElement(email).sendKeys(Id);
    }
	
	
	
	
	 
	
	public void drpdown() {
		
		driver.findElement(findList).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//li[@class='select2-results__option']"));

	       for (WebElement ele : list)
	  
	       {
	        System.out.println("Values " + ele.getAttribute("innerHTML"));
	      	if (ele.getAttribute("innerHTML").contains("Bandarban")) {
	        		 
	               
	    
	                ele.click();
	                
	    
	               break;
		
		
	            }
	
	       }
	}
	
	
	public void drpDown1() {
		
		driver.findElement(findList1).click();
		Select drop = new Select(driver.findElement(By.id("billing_area")));
	    drop.selectByValue("103");
	        
		
	}
	
	public void typeAddress(String Add){
        driver.findElement(address).sendKeys(Add);
    }
	
	
	public void typeComment(String Comment){
        driver.findElement(comment).sendKeys(Comment);
    }
	

	
	public void typeRad() {
		WebElement rad = driver.findElement(By.id("shipping_method_0_flat_rate2"));
    	rad.click();
		
	}
	
	
    public void typeRadio() {
     	WebElement rad1 = driver.findElement(By.id("payment_method_bkash"));
	   	rad1.click();
    	
    }
	
	
	public void selectButton(){
    	
    	driver.findElement(btn).click();
    	
    }
	
}
	
	
	





