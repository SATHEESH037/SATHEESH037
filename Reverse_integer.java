package Arrays;
import java.util.*;
public class Reverse_integer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[5];
		System.out.println("enter elemnets into array :");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("the reverse of elements are :");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}
	}

}
