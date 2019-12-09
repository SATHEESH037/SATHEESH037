package Collections;
import java.util.*;
public class Linkedlist {

	public static void main(String[] args) {
		LinkedList o=new LinkedList();
		o.add("ram");
		o.add("rom");
		o.add("lap");
		o.remove(1);
		o.add(0,"stranger" );
		o.addLast("rock");
		o.addFirst("john cena");
		Iterator i=o.iterator();
		while(i.hasNext())
		{
		System.out.println(i.next());	
		}
	}

}
