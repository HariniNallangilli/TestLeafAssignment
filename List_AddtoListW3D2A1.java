package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class List_AddtoListW3D2A1 {

	public static void main(String[] args) throws InterruptedException {
		// add system property -> webdriver.chrome.driver
				System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
				
				 // ChromeOptions
		        ChromeOptions options = new ChromeOptions();
		        options.addArguments("--disable-notifications");        
		        
		        // Open the chrome browser
		        // ChromeDriver (C) -> Written by Selenium Team
		        ChromeDriver driver = new ChromeDriver(options);

					
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                
			/*	1) https://erail.in/trains-between-stations/mgr-chennai-ctr-MAS/ksr-bengaluru-SBC 
			 *  2) Click on Sort on Date 
			 *  3) Get all the Train Names    Xpath: //div[@id='divTrainsList']//td[@class=''][2]  
			 *  findElements -> List<WebElement> 
			 *  4) Create another List using ArrayList (trainNames) 
			 *  5) for each loop : List<WebElement> 
			 *  6) You will get each WebElement : get its text  
			 *  7) Add the text to your created list (trainNames.add()) 
			 * 8) After the loop ends, sort it 
			 * 9) Print it with the loop!!
	        */			
				
				 // 1) Load the URL :: 
				driver.get("https://erail.in/trains-between-stations/mgr-chennai-ctr-MAS/ksr-bengaluru-SBC");
				
				// 2) Click on Sort on Date 
				
				WebElement chkSort = driver.findElementById("chkSelectDateOnly");
				boolean isChecked = chkSort.isSelected();
				if(!isChecked) {
					chkSort.click();
				}
				
				
				// 3) Get all the Train Names
			   List<WebElement> eColmn = driver.findElementsByXPath("//div[@id='divTrainsList']//td[@class=''][2]");
			   int trainCountsize = eColmn.size();
			   System.out.println("Total number of rows : "+eColmn.size());
			   
			   List<String> getTrainNames = new ArrayList<String>();
			   
			   int rowNum = 1;
			   for (WebElement rowEle : eColmn) {
				   String trainNames = rowEle.getText();
				   getTrainNames.add(trainNames);
				  System.out.println("The Train names are : "+trainNames);
				   rowNum++;
				   
			  }
	    	  Collections.sort(getTrainNames);
	    	  
	    	  for (int i = 0; i < getTrainNames.size(); i++) {
	    		  System.out.println("My Sorted Train list " +getTrainNames.get(i));
	    		  
				
			}
	    	 
				
		
				
				
			
	        	
	        	
	    
	    
	}

}
