package Arrays;
import java.util.*;
public class Remove_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[5];
		System.out.println("enter elemnets into array");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("enter a  number to remove");
		int element = sc.nextInt();
		System.out.println("the elements after removal is :");
		for (int i = 0; i < array.length; i++) {
			if (array[i] == element) {
				continue;
			}
			System.out.println(array[i]);
		}

	}

}
