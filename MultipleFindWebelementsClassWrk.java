package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MultipleFindWebelementsClassWrk {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();

	    driver.get("http://www.leafground.com/pages/Link.html");
	    Thread.sleep(3000);

	  
	    String Title1 = driver.getTitle();
	    System.out.println(Title1);
	    
	      
	    //Find how many links are available in the given page
	    List<WebElement> allLinks = driver.findElementsByTagName("a");
	    System.out.println(allLinks.size());
	    
	    // Similar code - Count the number of links in the page
	    // int size = allLinks.size();
	    // System.out.println(size);
	    	    
	    //Click on the first link
	    allLinks.get(0).click();
	    
	    System.out.println(driver.getTitle());
	    
	    Thread.sleep(2000);
	    //Navigate back
	    driver.navigate().back();
	    
	    //Find 'Go to Home Page' last link using list
	   WebElement GotoHomeLink = driver.findElementByXPath("(//a[text()='Go to Home Page'])[last()]/following-sibling::label");
       System.out.println(GotoHomeLink.getText());
	    
       //OR other code
        //Click on the last 'Go to Home Page' link
     		/*List<WebElement> GotoHomeLink = driver.findElementsByLinkText("Go to Home Page");
     		System.out.println(GotoHomeLink.size());
     		GotoHomeLink.get(GotoHomeLink.size()-1).click();*/
	    
	    
	}

}
