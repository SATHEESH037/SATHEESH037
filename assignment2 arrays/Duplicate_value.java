package Arrays;
import java.util.*;
public class Duplicate_value {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[5];
		System.out.println("enter elemnets into array :");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j] ) {    //&& (i != j)) {

					System.out.println("the duplicate value is :" + array[j]);
				}
			}
		}

	}

}
 