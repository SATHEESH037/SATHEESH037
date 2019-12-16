package Arrays;
import java.util.*;
public class Incert_element {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[5];
		System.out.println("enter elemnets into array");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("enter an index to replace");
		int index = sc.nextInt();
		System.out.println("enter the value to replace");
		int number = sc.nextInt();
		for (int i = 0; i < array.length; i++) {
			if (array[i] == array[index]) {
				array[i] = number;
			}
			System.out.println(array[i]);
		}
	}

}
 
