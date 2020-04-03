package week1.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DealingwithButtonColorpos {

	private static WebElement eleh2;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
    
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    //Load the URL :: get ->
    driver.get("http://leaftaps.com/opentaps/control/main");
    Thread.sleep(3000);
   /* 
    WebElement eleButton1 = driver.findElement(By.id("home"));
    eleButton1.click();
    Print location = 
    
    System.out.println(location);
    
    */
    
    String color = driver.findElementByTagName("h2").getCssValue("background-color");
    System.out.println(color);
    
    Dimension fontsize = driver.findElementByXPath("//label[@for='username']").getSize();
    System.out.println(fontsize);
    
    int i = driver.findElementByClassName("decorativeSubmit").getSize().getWidth();
    System.out.println(i);
    
    WebElement elepos = driver.findElementById("username");
    Point elelocation = elepos.getLocation();
    //System.out.println(elelocation);
    
    System.out.println(elelocation.getX());
    
    
    
   
    

   
    
    
    
   
  
   
     //close the browser      
    // driver.close();


	}

}
