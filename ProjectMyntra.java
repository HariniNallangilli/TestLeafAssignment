package week2.day5;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ProjectMyntra {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	  	//Create chrome options to set notification prefs
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		//Now initialize chrome driver with chrome options which will switch off this browser notification on the chrome browser
		ChromeDriver driver = new ChromeDriver(options); 
		
	    //1) Open https://www.myntra.com/
	    driver.get("https://www.myntra.com/");
	    Thread.sleep(3000);
 
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    
	    //2) Mouse over on WOMEN (Actions -> moveToElement)
        WebElement moveToWomenTab =   driver.findElementByXPath("//a[text()='Women'][1]");
	    //pre-requiste for the Actions Class
        Actions builder = new Actions(driver);
	    builder.moveToElement(moveToWomenTab).perform();
	   
	    Thread.sleep(2000);
	    
	    //3) Click Jackets & Coats
        driver.findElementByXPath("//a[text()='Jackets & Coats']").click();;
        
        //4) Find the total count of item (top) -> getText -> String (//Myntra Womens->Jackets/Coats section total number of items displayed on the topleft corner)
        
	    String str = driver.findElementByClassName("title-count").getText();
	    String text = str.replaceAll("\\D","");// -> String
	    Integer.parseInt(text);// -> int
	    System.out.println("Total Item Count Displayed" +text);
	   
        //5) Validate the sum of categories count matches
	    //driver.findElementByXPath("//div[@class='common-checkboxIndicator']").click();
    
	    String str1 = driver.findElementByClassName("categories-num").getText();
	    String text1 = str1.replaceAll("\\D","");// -> String
	    Integer.parseInt(text1);// -> int
	    System.out.println(" Total Item count by category" +text1); 
	     
	    //6) Check Coats
	    driver.findElementByXPath("(//div[@class='common-checkboxIndicator'])[2]").click();
	     
	    JavascriptExecutor js = ((JavascriptExecutor) driver);
	    js.executeScript("window.scrollTo(0,200)");
	     
	    //7) Click + More option under BRAND    
	    driver.findElementByXPath("//div[@class='brand-more']").click();
	     
	    //8) Type MANGO and click checkbox
	    driver.findElementByClassName("FilterDirectory-searchInput").sendKeys("Mango");
	    driver.findElementByXPath("//span[@class='FilterDirectory-count']/following-sibling::div[1]").click();
	     
	    //9) Close the pop-up x
	    driver.findElementByXPath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']").click();
	     
	    Thread.sleep(3000);
	    
	    //10) Confirm all the Coats are of brand MANGO
	    //findElements (brand) -> List<WebElement> //foreach -> getText of each brand //compare > if(condition)
	    List<WebElement> brndMangoList = driver.findElementsByClassName("product-brand");
	    int size = brndMangoList.size();
		System.out.println(size);
			
		//List<WebElement> brndMangoList = driver.findElementsByXPath("//h3[@class='product-brand']");
		for (WebElement eachItemMango : brndMangoList) {
		         String ch = eachItemMango.getText();
		         if (ch.equals("MANGO")) {
		         System.out.println("All the items in the page are from brand 'MANGO' ");
		         }
			}
	    //11) Sort by Better Discount
	    	 
	    driver.findElementByXPath("//span[text()='Recommended']").click();;
	    driver.findElementByXPath("//label[text()='Better Discount']").click();
	        
	        
	    //12) Find the price of first displayed item
	    //findElements (price) -> List<WebElement> 
	    //get(0) -> WebElement -> getText -> String -> int
	    List<WebElement> disPrice1st = driver.findElementsByClassName("product-discountedPrice");
	    String Fdiscount = disPrice1st.get(0).getText();
	    System.out.println("First Discount Price is :" +Fdiscount);
	    Thread.sleep(3000);
	    
	    js.executeScript("window.scrollTo(0,200)");
	  
	     // Mouse hover on size of first item
	 		WebElement getSizeList = driver.findElementByXPath("//span[@class='product-discountedPrice']");
	 		WebElement getSize = driver.findElementByXPath("//span[@class='product-sizeInventoryPresent'][1]");
	 		
	 		builder.moveToElement(getSizeList).moveToElement(getSize).perform();
	 		
	 		String getSizeText = driver.findElementByXPath("//span[text()='S, '][1]").getText();
	 		System.out.println(getSizeText);
	 		

	 		// Click on wishlist
	 		driver.findElementByXPath("//span[@class='product-actionsButton product-wishlist product-prelaunchBtn']").click();
	 		System.out.println(driver.getTitle());
	        Thread.sleep(3000);                
	         
	       //15) Close Browser
	       driver.close();
	      
	    
	     
	     
 		  
 	

  
	}

}
