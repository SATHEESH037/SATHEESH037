package Collections;
import java.util.*;
public class Trim_arraylist {

	public static void main(String[] args) {
		List l=new ArrayList();
		l.add("satheesh");
		l.add("chintu");
		l.add("rock");
		System.out.println("Original array list: " + l);
          System.out.println("Let trim to size the above array: ");
          ((ArrayList) l).trimToSize();
          System.out.println(l);
		
	}

		
}
