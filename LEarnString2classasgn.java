package week1.day3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LEarnString2classasgn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();

	    driver.get("http://leaftaps.com/opentaps/control/main");
	    Thread.sleep(3000);
		
		
		 driver.findElementById("username").clear();
		    driver.findElementById("username").sendKeys("DemoSalesmanager");
		    driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		    driver.findElementByClassName("decorativeSubmit").click();
		    Thread.sleep(2000);
		   /* 
		    WebElement webPageTxt = driver.findElementByXPath("//h2[contains(.,'Welcome Demo Sales Manager')]").;
		    webPageTxt.getAttribute("value");
		    System.out.println(webPageTxt); */
		    
		    WebElement eleh2 = driver.findElementByTagName("h2");
		    String webelemtext = eleh2.getText();
		  //  System.out.println(webelemtext);
		    
		   String substring2 = webelemtext.substring(8, 26);
			 System.out.println(substring2);
   
	}

}
