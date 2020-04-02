package week1.day3;

import org.openqa.selenium.chrome.ChromeDriver;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  // System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
	  // ChromeDriver driver = new ChromeDriver();
       
	   String orgstring = "Welcome";
	   char[] charArray = orgstring.toCharArray();
	   int length = charArray.length;
		   for (int i = length-1; i>=0 ; i--) {  
		   System.out.print(charArray[i]);
		   
	   }
			   
	   
	   
	   		

	}

}
