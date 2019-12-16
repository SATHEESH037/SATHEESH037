package Arrays;
import java.util.*;
public class Copy_array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int array1[] = new int[5];
		int array2[] = new int[10];
		System.out.println("enter elemnets into array");
		for (int i = 0; i < array1.length; i++) {
			array1[i] = sc.nextInt();
		}
		for (int i = 0; i < array1.length; i++) {
			array2[i] = array1[i];
			System.out.print(" " + array2[i]);
		}
	}

}