package Arrays;
import java.util.*;
public class Combination_total {

	public static void main(String[] args) {
		int array[] = new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter numbers into array");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("enter a number  :");
		int number = sc.nextInt();
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if ((array[i] + array[j]) == number) {
					System.out.println("THE sum of these numbers" + array[i] + "+" + array[j] + "=" + number);
				}
			}
		}
	}

}
 