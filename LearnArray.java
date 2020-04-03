package week1.day4;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String txt = 
		
		// way 1:
		//int [5] outbound exception
		int[] a = new int[4]; // int[-1] neg array size  -> sizeexception
		a[0]=100;
		a[1]=200;
		a[3]=300;
		a[4]=400;
		
		// for count
        //System.out.println(a.length);
		//int [] x = a.clone();
		//System.out.println(x[0]);
		


System.out.println(a.length);
  
		for (int i=0 ; i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		//way 2:
		int[] b = {700,800,300,400}; 
		
		for (int i=0 ; i<b.length;i++) {
			System.out.println(b[i]);
		}
		
		System.out.println("***********");
		System.out.println(b); //b returns memory address of b
		System.out.println(b[0]); // b return value at b[0]
		Arrays.sort(b); // sortinh
		

		for (int i=0 ; i<b.length;i++) {
			System.out.println(b[i]);
		}
		
		
		}
		

	}


