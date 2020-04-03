package week1.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DealingwithcheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://www.leafground.com/pages/checkbox.html");
	    
	    WebElement elecheckbox = driver.findElementByXPath("(//label[text()='Confirm Selenium is checked']/following::input)[1]");
	    boolean checked = elecheckbox.isSelected();
	    System.out.println(checked);
	    
	    if(!checked) {
	    	elecheckbox.click();
	    	
	    }
	    }
	    
	    
	    

	}


