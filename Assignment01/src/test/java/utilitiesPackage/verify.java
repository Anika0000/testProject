package utilitiesPackage;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import basicPackage.driverSetup;
import testPackage.tc01_visitSite;
import testPackage.tc02_clickWriter;
import testPackage.tc03_scrollDown;
import testPackage.tc04_selectAuthor;
import testPackage.tc05_viewBookDetails;
import testPackage.tc06_clickOrder;
import testPackage.tc07_orderComplete;
import testPackage.tc08_provideInfo;

public class verify extends driverSetup {
	
	public static String baseUrl = "https://www.wafilife.com/";
	
	
	@Test
	public static void siteVisit() throws InterruptedException {
		
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		tc01_visitSite site = new tc01_visitSite(driver);
		site.quitButton();
		
		
		tc02_clickWriter writer = new tc02_clickWriter(driver);
		writer.selectMenu();
		Thread.sleep(5000);
		
		
		tc03_scrollDown scrolling = new tc03_scrollDown(driver);
		scrolling.scrollingDown();
		Thread.sleep(5000);
		
		tc04_selectAuthor authorGetSelected = new tc04_selectAuthor(driver);
		authorGetSelected.selectAnyAuthor();
		Thread.sleep(5000);
		
		tc05_viewBookDetails booksInfo = new tc05_viewBookDetails(driver);
		booksInfo.bookDetails();
		Thread.sleep(5000);
		booksInfo.imagesPg();
		Thread.sleep(5000);
		booksInfo.bookImg();
		Thread.sleep(5000);
	
		tc06_clickOrder order = new tc06_clickOrder(driver);
		order.click_Order();
		Thread.sleep(5000);
		
		tc07_orderComplete complete = new tc07_orderComplete(driver);
		complete.order_Complete();
		Thread.sleep(5000);
		
		tc08_provideInfo info = new tc08_provideInfo(driver);
		info.typeCheck();
		Thread.sleep(3000);
		
		info.typePassword("1234567");
		Thread.sleep(3000);
		
		info.typeUserName("Anita");
		Thread.sleep(3000);
		
	    info.typePhone("01730000003");
		Thread.sleep(3000);
		
		info.typeAltPhone("01730000013");
		Thread.sleep(3000);
		
		info.typeEmail("anita@gmail.com");
		Thread.sleep(3000);
		
		info.drpdown();
		Thread.sleep(3000);
		
		info.drpDown1();
		Thread.sleep(3000);
		
		
		info.typeRad();
		Thread.sleep(5000);
		
		 info.typeRadio();
		Thread.sleep(5000);
		
		info.typeAddress("124,Ghigatolla,Dhaka");
		Thread.sleep(3000);
		
		info.typeComment("please deliver me as early as possible");
		Thread.sleep(5000);
		
		info.selectButton();
		Thread.sleep(3000);
		
		
		
		
	}
	
        /*
	    public static void  websiteIsSecure() {
		 String myUrl  = driver.getCurrentUrl();
		 if(myUrl.contains("https")) {
			 System.out.println("website is secure");
		 }else {
			 System.out.println("website is not secure");
		 }
	 }
    */
}
