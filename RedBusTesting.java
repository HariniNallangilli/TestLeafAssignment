package week1.day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class RedBusTesting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Disable Notifications in the Chrome browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    driver.get("https://www.redbus.in/");
	    
	    
	    //Enter From Place as " Chennai"
	  //  driver.findElementById("src").sendKeys("Chennai",Keys.TAB);
	    Thread.sleep(5000);
	    driver.findElementById("src").sendKeys("Chennai");
       //click chennai from dropdown
	   driver.findElementByXPath("(//li[@class='selected'])[1]").click();
	   Thread.sleep(5000);
	   
	    //Enter To Place "Bangalore""
	    driver.findElementById("dest").sendKeys("Bangalore (All Locations)");
	  //driver.findElementById("dest").sendKeys("Bangalore (All Locations)",Keys.TAB);
	    Thread.sleep(5000);
	 
	    //click Bangalore from drop down
        driver.findElementByXPath("//li[text()='Bangalore (All Locations)']").click();
	   
	    //Enter date
	    driver.findElementByXPath("//span[contains(@class,'fl icon-calendar')]").click();
	    Thread.sleep(5000);
	    //Select date
	    driver.findElementByXPath("(//td[text()='30'])[2]").click();
	    Thread.sleep(5000);
	    
	    
	    //Click Search button
	    driver.findElementById("search_btn").click();
	   // driver.findElementByClassName("fl button").click();
	      Thread.sleep(3000);
	      
	     //MAximize
	      driver.manage().window().maximize();
	    //Check "After 6 PM " 
	     driver.findElementByXPath("(//label[@for='dtAfter 6 pm'])[1]").click();
	     Thread.sleep(6000);
	    //Check Sleeper under "Bus type"
	    driver.findElementByXPath("(//label[@for='bt_SLEEPER'])[1]").click();
	    Thread.sleep(2000);
	    //Click Seat Available
	    driver.findElementByXPath("(//div[contains(@class,'w-15 fl')]//a)[2]").click();
	    
	       
	    driver.close();
	    
	    
	    
	    
	    
	    
	    
	    
	    
	           
	    
	    
	    
	  
	  
	    
	}   
}
