package week1.day2;

//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenTapleaf {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();

    driver.get("http://leaftaps.com/opentaps/control/main");
    Thread.sleep(3000);

   // WebElement eleUserName = driver.findElementById("username");
  //  eleUserName.clear(); //clear the default value in the field if it is already filled
  //  eleUserName.sendKeys("DemoSalesManager"); //Type
    
    driver.findElementById("username").clear();
    driver.findElementById("username").sendKeys("DemoSalesmanager");
    driver.findElementByName("PASSWORD").sendKeys("crmsfa");
    driver.findElementByClassName("decorativeSubmit").click();
    Thread.sleep(2000);
    driver.findElementByLinkText("CRM/SFA").click();
 
     //close the browser      
     driver.close();


	}

}
