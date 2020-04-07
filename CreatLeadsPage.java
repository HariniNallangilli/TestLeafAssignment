package WeekEnd1.Java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreatLeadsPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		
		//open the chrome browser
		ChromeDriver driver = new ChromeDriver();
			
		// Open the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
			
		// Implicit wait for 10 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Enter the username
		driver.findElementById("username").sendKeys("DemoSalesManager");
				
		//Enter the password
		driver.findElementById("password").sendKeys("crmsfa");
				
		// Clicking Login button
		driver.findElementByClassName("decorativeSubmit").click();
				
		// Click on CRM/SFA
		driver.findElementByLinkText("CRM/SFA").click();
		
		// Click on Leads
		driver.findElementByLinkText("Leads").click();
		
		// Click on Create Leads
		driver.findElementByLinkText("Create Lead").click();
		Thread.sleep(3000);
	
		//Enter First Name 
		driver.findElementById("createLeadForm_firstName").sendKeys("Harini");
		
		// Enter Last name
		driver.findElementById("createLeadForm_lastName").sendKeys("Nallan");
		
		//Enter Company Name
		driver.findElementById("createLeadForm_companyName").sendKeys("Accenture");
		
		//Enter the Phone Area Code
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("123");
		
		//Enter the Phone Number
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9209144");
		// Click Create Leads button
		driver.findElementByName("submitButton").click();
		Thread.sleep(2000);
		
		
		//Verify the title
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		// close the browser
		driver.close();
		
		}
				
	}