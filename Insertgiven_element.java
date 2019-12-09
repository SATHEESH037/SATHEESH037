package Collections;
import java.util.*;
public class Insertgiven_element {

	public static void main(String[] args) {
		String str=new String();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		str=sc.nextLine();
		ArrayList list_object=new ArrayList();  //Creating a new Array List
		list_object.add(1);
		list_object.add("Orange");       //adding elements into array list.
		list_object.add("Blue");
		list_object.add(2);
		list_object.add("Yellow");
		list_object.add(5, "arjun");       //inserting "arjun" to 5th position.
		list_object.add(6, str); //inserting element string from user to 6th index position.
		System.out.println("The colours and numbers are :");
		System.out.println(list_object);    //printing the array list elements.
		


	}

}
