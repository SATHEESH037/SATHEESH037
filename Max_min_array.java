package Arrays;
import java.util.*;
public class Max_min_array {

	public static void main(String[] args) {
		int array[] = new int[5];

		int temp1 = 0;
		int max = 0, min = 0;
		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter elments into array");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc1.nextInt();
		}
		max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}

		}
		min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}

		}
		System.out.println("max value is" + max);
		System.out.println("min value is " + min);

	}

}
 