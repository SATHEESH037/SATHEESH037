package Arrays;
import java.util.*;
public class Average_array {

	public static void main(String[] args) {

		int[] array = new int[5];
		int sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter elemnets into array");
		for (int i = 0; i < array.length; i++) {
			array[i] = s.nextInt();
		}
		for (int i = 0; i < array.length; i++) {

			sum = sum + array[i];

		}
		System.out.println("the sum is" + sum);
		System.out.println("the average of array is" + (sum / array.length));
	}

}
