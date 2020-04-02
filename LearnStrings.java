package week1.day3;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//Declaring Strings 2 ways
		//Way1
		String txt = " Welcome to Testleaf  "; //literal
		String txt1 = " ver 2.0 ";
		int ph = 1234;
		
		System.out.println(txt);
		System.out.println(txt1);
		
		//Way2 
		String Obj = new String("Testleaf"); //Object
		System.out.println(Obj);
        
		//Count of String( length is the method.
		int count = txt.length();
		System.out.println(count);
		
		//charAt() is a method returns a particular/single char from entire string
		char ch = txt.charAt(3); //- > index =3
		System.out.println(ch);
		
		int indexNum = txt.indexOf('s');
		System.out.println(indexNum);
		
		//lastindexof starts counting right to left (t0e1s2t3l4e5a6f7)
		 int lastIndexOf = txt.lastIndexOf('s');
		 System.out.println(lastIndexOf); // result is 8
		 
		 //removing spaces from the text begining and end "   test leaf   "
		 String trim = txt.trim();
		 System.out.println(trim);
		 
		 // concatinate 2 strings
		 String concat = txt.concat(txt1);
		 System.out.println(concat);
		 
		//System.out.println(txt.concat(txt1));
		 // thhe below code also concates strings but if one string is Null ,then concat funcat throws a an exception
		 // as it expects a string value.
		 System.out.println(txt + txt1);//(e.g txt= testleaf txt1= null throws excep)
		 
		 // con 2 diff value and both are diff data types
		 System.out.println(txt +ph);
		 
		 System.out.println((txt.toLowerCase()));
		 System.out.println(txt.toUpperCase());
		 
		 char[] charArray = txt.toCharArray();
		 System.out.println(charArray[7]);
		 
		 //split - > returns collection of words txt = 'Welcome to testleaf"
		 String[] split = txt.split("");// java declaration of array
		 System.out.println(split[2]);
		 //String split[] = txt.split(""); -> C sharp, dot net declation of array
		
		 // Pick txt = "Welcome to Testleaf" -substring (index num n)
		 String substring = txt.substring(11); // result = Testleaf
		 System.out.println(substring);
		 
		// Pick txt = "Welcome to Testleaf" -substring (0- 6+1) (0 - n+1) gives "Welcome"
		 // eg 2. substring (0 6) -> returns "Welcom"
		 String substring2 = txt.substring(0, 7);
		 System.out.println(substring2);
		 
		 //equals is a function to compare 2 different strings
		  boolean equals = txt1.equals("ver 2.0");
		  System.out.println(equals);
		  
		 // returns a boolean value
		 System.out.println(txt1.equals("ver 2.0"));
		 
		 //equalsIngoreCase ignores case sensitivity
		 System.out.println(txt1.equalsIgnoreCase("Ver 2.0"));
		 
		 System.out.println(txt1.startsWith("ve"));
		 
		 System.out.println(txt1.endsWith("0"));
		 
		 System.out.println(txt1.replace('v', 'V'));
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
	

}
