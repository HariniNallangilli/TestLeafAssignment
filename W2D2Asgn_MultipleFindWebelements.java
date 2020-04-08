package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.reporters.jq.NavigatorPanel;

public class W2D2Asgn_MultipleFindWebelements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();

	    driver.get("http://www.leafground.com/pages/Link.html");
	    Thread.sleep(3000);

	    //Find how many links are available in the given page
	    List<WebElement> allLinks = driver.findElementsByTagName("a");
	    System.out.println(allLinks.size());
	    	    
	    //Click on the first link 'Go to Home Page'
	    allLinks.get(0).click();
	    
	    Thread.sleep(2000);
	   
	    //1.Go to images, Find out how many images are available
	    //1a.Click on Images
	     driver.findElementByXPath("//img[@alt='Images']/preceding-sibling::h5").click();
	  
	   //1b.Find How many images are present inside the Images Page (Exclude the TestLeaf Image)
	    List<WebElement> imageNos = driver.findElementsByTagName("img");
	    System.out.println(imageNos.size());
  
	   //2.Click on the last Image
        driver.findElementByXPath("//label[text()='Click me using Keyboard or Mouse'][last()]/following::img").click();
	    
       //3.Go to radio buttons, find how many radio buttons are present in the page
        driver.findElementByXPath("//h5[text()='Radio Button']/following::img").click();
        List<WebElement> radiobtns = driver.findElementsByTagName("input");
 	    System.out.println(radiobtns.size()); 
 	    
 	   driver.navigate().back();
 	    
        
	   //4.Go to the check box, check all the check box(Mark/select all the check box ) using findElement
 	   driver.findElementByXPath("//h5[text()='Checkbox']/following::img").click();
 	  List<WebElement> allCheckbox = driver.findElementsByXPath("//input[@type='checkbox']");
 	  System.out.println(allCheckbox.size());
 	  
 	 for (WebElement ele : allCheckbox) {
 	    if (ele.isSelected()) {
 	        ele.click();
 	    }
 	}
 	 
 	  for (int i=0 ; i<allCheckbox.size() ; i++) {
 		 if(allCheckbox.get(i).isSelected());
 		allCheckbox.get(i).click();
 		  
 		  
 	  }
  driver.close();
  
	}

}
