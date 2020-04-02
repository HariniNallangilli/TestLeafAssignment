package week1.day3;

import org.openqa.selenium.chrome.ChromeDriver;

public class Printnextcharinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  
	   String orgstring = "A1B2C3";
	   String nextstring=new String();
	   //We can convert char to int in java using various ways.
	   // If we direct assign char variable to int, it will return ASCII value of given character.
		for(int i=0;i<orgstring.length();i++){
			nextstring+=(char)(orgstring.charAt(i)+1); //ASCII A -65
		
		}
		System.out.println(nextstring);
		   
	   }
			   
	   
	   
	   		

	}
