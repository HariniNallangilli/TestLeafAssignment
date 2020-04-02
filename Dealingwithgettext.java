package week1.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dealingwithgettext {

	private static WebElement eleh2;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
    
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    //Load the URL :: get ->
    driver.get("http://leaftaps.com/opentaps/control/main");
    Thread.sleep(3000);
    
    /*//CLick on the link that contains partial text "am"
    driver.findElementByPartialLinkText("am-harin").click();
    
    //Page Title
    String Title = driver.getTitle();
    System.out.println(Title);
    */
    WebElement eleh2 = driver.findElementByTagName("h2");
    String webelemtext = eleh2.getText();
    System.out.println(webelemtext);
    
    String attribute = driver.findElementById("login").getAttribute("method");
    System.out.println(attribute);
    
    

   
    
    
    
   
  
   
     //close the browser      
    // driver.close();


	}

}
