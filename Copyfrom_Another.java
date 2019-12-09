package Collections;
import java.util.*;
public class Copyfrom_Another {

	public static void main(String[] args) {
		ArrayList list1=new ArrayList<>();  //create a list
		ArrayList list2=new ArrayList<>();     //create another list
		list1.add(1);
		list1.add("Satheesh");
		list1.add("Chintu");       //adding elements into first list1
		list1.add(360037);
		list1.add("hii");
		list2.addAll(list1);   //adding list1 into list2.
		System.out.println("the first list is :"+list1);
	System.out.println("the second list is :"+list2);
	}

}
