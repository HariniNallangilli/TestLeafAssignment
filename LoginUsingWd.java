package week1.day2;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginUsingWd {

	public static void main(String[] args) throws InterruptedException {
	// add a sys property ->
	System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	  
	// Open the Chrome browser
    // ChromeDriver (C) -> Written by SE team
    ChromeDriver driver = new ChromeDriver();
      
      //Load the URL : get();
      driver.get("http://leaftaps.com/opentaps/control/main");
      
      //Navigate backwards
      //driver.navigate().back();
      
      // Print the title
      String title = driver.getTitle();
      System.out.println(title);
      
      //Refresh the page
      driver.navigate().refresh();
      
      Thread.sleep(2000);
      
      //Nagivate to a webpage
      //driver.get("https// google.com"); or see 'to' method below.
      driver.navigate().to("https://www.google.com");
      
   // find the method -> Print the full URL
      String currentUrl = driver.getCurrentUrl();
      System.out.println(currentUrl); 
      
   // Find method to print the browser name    
      String browserName = driver.getCapabilities().getBrowserName();
      System.out.println(browserName);
      
   // Find the method to get and print the browser version   
      String version= driver.getCapabilities().getVersion();
      System.out.println(version);

   // Find the method to get the platform of the browser   
      Platform platform = driver.getCapabilities().getPlatform();
      System.out.println(platform);            
      
   //close the browser      
      driver.close();
      
	}

}
