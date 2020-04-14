package week3.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.deser.ValueInstantiator.Gettable;

public class FramesCW {

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
				driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
			    
				
			    //Switch to frame1 'Try it'
				driver.switchTo().frame(0);
				
				driver.findElementByXPath("//button[text()='Try it']").click();
								
				//driver.switchTo().defaultContent();
				
				Alert alertBox = driver.switchTo().alert();
				alertBox.accept();
				
	            
				
			    driver.close();
	        	
	    
	    
	}

}
