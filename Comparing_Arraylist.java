package Collections;

import java.util.*;

public class Comparing_Arraylist {

	public static void main(String[] args) {
		// 1st arraylist
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("mobile");
		a1.add("lap");
		a1.add("tv");
		a1.add("watch");
		System.out.println("1st arraylist is :"+a1);
		
		//2nd arraylist
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("mobile");
		a2.add("lap");
		a2.add("tv");
		a2.add("watch");
		System.out.println("2nd arraylist is :"+a2);
		
		//comparing both the arraylist
		boolean check=a1.equals(a2);  //output is true both lists are equal
		System.out.println(check);
		
		a2.add("remote");  //adding string to the 2nd arraylist
		System.out.println(a2);
		boolean check1=a1.equals(a2);
		System.out.println(check1); //output is false both are not true
		

	}

}
