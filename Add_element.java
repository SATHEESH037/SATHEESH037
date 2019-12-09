package Collections;
import java.util.*;
public class Add_element {

	public static void main(String[] args) {
		// creating an arraylist and incerting elements
		List<String> l1=new ArrayList<String>();
		l1.add("satheesh");
		l1.add("chintu");
		l1.add("lohith");
		l1.add("siva");
		System.out.println(l1);
		l1.set(3, "radha"); //update 3rd element into the list
		System.out.println(l1); //printing the list after updating
		

	}

}
