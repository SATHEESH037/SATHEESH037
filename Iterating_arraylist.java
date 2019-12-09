package Collections;
import java.util.*;
public class Iterating_arraylist {

	public static void main(String[] args) {
		// initilizing arraylist
		List<Integer> l1=Arrays.asList(1,5,4,7,8,3,9);
		// iterating of an arraylist
		for(int i=0;i<l1.size();i++) { //for (Integer i : numbers) 
            System.out.print(i + " "); 

			System.out.print(l1.get(i)+" ");
		}

	}

}
