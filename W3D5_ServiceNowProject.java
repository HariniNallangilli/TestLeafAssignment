package week3.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class W3D5_ServiceNowProject {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
        // Open the chrome browser
	    ChromeDriver driver = new ChromeDriver();
	       
	      driver.get(" https://dev92474.service-now.com/");
	     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	     
	    		
	      
	      driver.switchTo().frame(0);
	      driver.findElementById("user_name").sendKeys("admin");
	      driver.findElementById("user_password").sendKeys("India@123");
	      
	      driver.findElementById("sysverb_login").click();
	      //driver.switchTo().defaultContent();
	      
	      driver.getWindowHandle();
	      Thread.sleep(4000);
	      driver.findElementByName("filter").click();
	      driver.findElementByName("filter").sendKeys("Incident");
	      
	    
	      // 4. Click on Create new option Under Incident
	      driver.findElementByXPath("//div[text()='Create New']").click();
	      Thread.sleep(5000);	
	      
	      // 5. Get the text of Number Field and Store it in a String
	       driver.switchTo().frame("gsft_main");
	       
	      String text1 = driver.findElementById("incident.number").getAttribute("value");
	      System.out.println("Incident Number:" +text1);
	      
	      // 6. Click on the Search Button Available in the Caller Field & Choose First Value Opened in the new Window
	      driver.findElementById("lookup.incident.caller_id").click();
	      
	      List<String> allWindow = new ArrayList<>(driver.getWindowHandles());
  		  System.out.println("Second Window " +allWindow.get(1));
		  driver.switchTo().window(allWindow.get(1));
		
		  List<WebElement> fResult = driver.findElementsByXPath("(//td[contains(@class,'list_decoration_cell col-small')]/following-sibling::td)[1]");
	      System.out.println(fResult.size());
		  WebElement firstRsltMatch = fResult.get(0);
		  System.out.println("First Caller Name : " +firstRsltMatch.getText());
		
		  //firstRsltMatch.click();
		  driver.findElementByXPath("(//a[@class='glide_ref_item_link'])[1]").click();
		  
	      driver.switchTo().window(allWindow.get(0));
		
	      // 7. Select the Value as Software in Category Field
		  driver.switchTo().frame("gsft_main");
		
	/*	  WebElement dropdown1 = driver.findElementById("incident.category");
	      Select dd = new Select(dropdown1);
		  dd.selectByVisibleText("Software");
	*/	  
		
	      //  8. Select Internal Application in Sub Category Field
		  WebElement dropdown2 = driver.findElementById("incident.subcategory");
		  Select dd2 = new Select(dropdown2);
		  dd2.selectByIndex(3);
		
	      //  9. Select Walk-in in Contact Type Field
		  WebElement dropdown3 = driver.findElementById("incident.contact_type");
	      Select dd3 = new Select(dropdown3);
		  dd3.selectByVisibleText("Walk-in");
			
	      // 10. Select state as In-Progress 
	      WebElement dropdown4 = driver.findElementById("incident.state");
		  Select dd4 = new Select(dropdown4);
		  dd4.selectByVisibleText("In Progress");
					
		  //11. Select Urgency as High 
		  WebElement dropdown5 = driver.findElementById("incident.urgency");
		  Select dd5 = new Select(dropdown5);
		  dd5.selectByVisibleText("1 - High");
								
					
		  //12. Click on the Search Button Available in the Assignment Group  
		  //driver.switchTo().frame("AC.incident.caller_id_shim");
		  driver.findElementByXPath("(//span[@class='icon icon-search'])[4]").click();
						
		  Thread.sleep(2000);
		  
		  //12 a.Switch to the new search window
		  Set<String> allWindowSet1 = driver.getWindowHandles();
		  List<String> allWindowList1 = new ArrayList<>(allWindowSet1);
		  String secW1 = allWindowList1.get(1);
		  System.out.println("Second Window " +allWindowList1.get(1));
		  driver.switchTo().window(secW1);
			
		  //12 b. Choose Last Residing Value Opened in new Window
		  List<WebElement> assessGrp = driver.findElementsByClassName("glide_ref_item_link");
   		  int size1 = assessGrp.size();
		  System.out.println(size1);// Print the size of the list
		  WebElement lastassessGrp = assessGrp.get(size1-1);// get size-1 for the last item
		  
		  String lastR = lastassessGrp.getText();
		  System.out.println("Last Assessment Group : " +lastR);
		  
		  // Click the last value in the list
		  lastassessGrp.click();
						
		  //switch to main window
		  driver.switchTo().window(allWindow.get(0));
				        
 //Switch to the frame
          driver.switchTo().frame("gsft_main");
		  
		  //13. Enter Short Description as "Creating Incident For the Purpose of Management"
		  driver.findElementById("incident.short_description").sendKeys("Creating Incident For the Purpose of Management");
		  System.out.println("Short Description Updated");
		  
		  //14. Click on the Submit Button
		  driver.findElementById("sysverb_insert").click();
						
	      //15. Enter The Incident Number Newly created in Search Field and Press Enter
		  Thread.sleep(3000);
		  driver.findElementByXPath("(//span[text()='Press Enter from within the input to submit the search.']/following::input)[1]").sendKeys(text1,Keys.ENTER);
					
   		   //16. Click on the newly Created Incident Displayed
		   Thread.sleep(3000);
		   driver.findElementByXPath("(//a[@class='linked formlink'])[1]").click();
						
			//	17. Verify the Incident Number
			String verIncNum = driver.findElementById("incident.number").getAttribute("value");
			if(text1.equals(verIncNum)){
							System.out.println("Incident Number Match");
						}
						
			//	18. Update Impact as High
			WebElement dropdown6 = driver.findElementById("incident.impact");
			Select dd6 = new Select(dropdown6);
			dd6.selectByVisibleText("1 - High");
			
			//	19. Update Description as "Successfully Created an incident"
			driver.findElementById("incident.description").sendKeys("Successfully Created an incident");
			
			//switch to main window
			  driver.switchTo().window(allWindow.get(0));
			  
// Switch back from Frame
//			driver.switchTo().defaultContent();
			
	/*		// 20. Enter Work Notes as "Done Right"
            Thread.sleep(5000);
	*/		driver.findElementById("activity-stream-textarea").sendKeys("Done Right");
							
			//	21. Click on the Update button.
			driver.findElementById("sysverb_update").click();
			driver.switchTo().defaultContent();
					
			// Click logout
			driver.findElementByXPath("//span[text()='System Administrator']").click();
			
			driver.findElementByXPath("//a[text()='Logout']").click();
			
			// Close the browser
			driver.close();
	      
     
	      
	}

}
