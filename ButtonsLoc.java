package week1.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonsLoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://www.leafground.com/pages/Link.html");
	    
	//    String elelink = driver.findElementByXPath("Find where am supposed to go without clicking me?").getAttribute("href");
	    
	
	    
	WebElement elelink = driver.findElementByLinkText("Find where am supposed to go without clicking me?");
	    String linkwhere = elelink.getAttribute("href");
	    System.out.println(linkwhere);
	    
	    WebElement eleverify = driver.findElementByLinkText("Verify am I broken?");
	    eleverify.click();
	    String title = driver.getTitle();
	    if ( title.contains("404")) {
	    	System.out.println("Broken");
	    }else {
	    	System.out.println("Looks Good");
	    }
	    
	    }
	}

