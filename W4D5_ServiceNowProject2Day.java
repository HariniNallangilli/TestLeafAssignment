package projectday;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class W4D5_ServiceNowProject2Day {

		public static void main(String[] args) throws InterruptedException {

			// Set the system property
			//System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
			
			// Open the Chrome browser
			ChromeDriver driver = new ChromeDriver();
		
			// Open the URL
			driver.get(" https://dev49668.service-now.com/");

			// Implicitly wait for 10 seconds
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			// Navigate to frame
			driver.switchTo().frame("gsft_main");

			// Enter username
			driver.findElementById("user_name").sendKeys("admin");

			// Enter Password
			driver.findElementById("user_password").sendKeys("Sakthi1111<3");

			// Click Login button
			driver.findElementById("sysverb_login").click();
			Thread.sleep(5000);
		
		// Enter in navigation filter
		driver.findElementById("filter").sendKeys("change");
		Thread.sleep(5000);
		
	
        
		//Click Create new
		driver.findElementByXPath("(//div[text()='Create New'])[3]").click();
		
		// Navigate to frame
		driver.switchTo().frame("gsft_main");
		
		Thread.sleep(3000);

		// Click On the link
		//driver.findElementByLinkText("Normal: Changes without predefined plans require approval and/or CAB authorization.").click();
		driver.findElementByXPath("//a[contains(text(),'							Normal: Changes without predefined plans require approval and/or CAB authorization.')]").click();
		
		

		String text1 = driver.findElementById("change_request.number").getAttribute("value");
	      System.out.println("change_request.number:" +text1);
	      
	      driver.findElementById("change_request.short_description").sendKeys("Project Day");
	      
	      
	      driver.findElementById("sysverb_insert_bottom").click();
	      
		  driver.findElementByXPath("(//span[text()='Press Enter from within the input to submit the search.']/following::input)[1]").sendKeys(text1,Keys.ENTER);
          System.out.println("Successfully Created Change Request");
          
		
	}

}
