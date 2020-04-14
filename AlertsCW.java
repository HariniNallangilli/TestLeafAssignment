package week3.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertsCW {

	public static void main(String[] args) throws InterruptedException {
		// add system property -> webdriver.chrome.driver
				System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
				
				 // ChromeOptions
		        ChromeOptions options = new ChromeOptions();
		        options.addArguments("--disable-notifications");        
		        
		        // Open the chrome browser
		        // ChromeDriver (C) -> Written by Selenium Team
		        ChromeDriver driver = new ChromeDriver(options);

					
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

				// Load the URL :: get ->
				driver.get("http://www.leafground.com/pages/Alert.html");
			/*	1) Alert Box (OK)
				2) Confirm Box (Cancel)
				3) Prompt (Your Company)
				4) Sweet Alert Click OK

			*/	driver.findElementByXPath("//button[text()='Alert Box']").click();;
				Alert alertBox = driver.switchTo().alert();
				alertBox.accept();
	        	
	        	driver.findElementByXPath("//button[text()='Confirm Box']").click();;
	        	Alert alertBox1 = driver.switchTo().alert();
	        	alertBox1.accept();
	        	Thread.sleep(3000);
	        	driver.findElementByXPath("//button[text()='Prompt Box']").click();
	        	Alert alertBox2 = driver.switchTo().alert();
	        	
	        	alertBox2.accept();
	        			
	        	     	
	        	
	        	Thread.sleep(3000);
	        	driver.findElementByXPath("//button[text()='Sweet Alert']").click();
	        	driver.findElementByClassName("swal-button swal-button--confirm").click();
	      
	    
	    
	}

}
