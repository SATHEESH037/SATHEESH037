package Collections;
import java.util.*;
public class Incertinto_position {

	public static void main(String[] args) {
		ArrayList list_object=new ArrayList();  //Creating a new Array List
		list_object.add(1);
		list_object.add("Orange");       //adding elements into array list.
		list_object.add("red");
		list_object.add(2);
		list_object.add("Yellow");
		list_object.add(2, 3);       //inserting element "5" to 2nd index position.
		System.out.println("The colours and numbers are :");
		System.out.println(list_object);    //printing the array list elements.
		
	}
		

	
}
