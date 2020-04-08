package week1.day2;

import org.openqa.selenium.chrome.ChromeDriver;

// Assigment : Open Gmail log in page and close.
public class OpenGmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
ChromeDriver driver = new ChromeDriver();

driver.get("https://accounts.google.com/");

String title = driver.getTitle();
System.out.println(title);

driver.navigate().refresh();

//driver.get("https// google.com");
driver.navigate().to("https://accounts.google.com/");

//Thread.sleep(2000);
//close the browser      
driver.close();


	}

}
