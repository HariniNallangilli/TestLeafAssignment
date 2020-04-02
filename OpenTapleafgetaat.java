package week1.day3;

import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenTapleafgetaat {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();

    
    driver.get("http://leafground.com/pages/Edit.html");
    Thread.sleep(3000);
    
    driver.findElementById("email").sendKeys("harinie89@gmail.com");
    driver.findElementByXPath("//input[@value='Append ']").sendKeys("Babu",Keys.TAB);
    Thread.sleep(3000);
    String attribute = driver.findElementByName("username").getAttribute("value");
    System.out.println(attribute);
    Thread.sleep(3000);
    driver.findElementByXPath("(//input[@name='username'])[2]").clear();
    
    
    boolean enabled=  driver.findElementByXPath("//input[@disabled='true']").isEnabled();
    System.out.println(enabled);
    String Title = driver.getTitle();
    System.out.println(Title);

   
      //close the browser      
     //driver.close();


	}

}
