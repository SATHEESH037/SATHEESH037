package Arrays;
import java.util.*;
public class Commen_integer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[5];
		int array1[] = new int[5];
		System.out.println("enter elemnets into array :");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("enter elements into second array :");
		for (int i = 0; i < array1.length; i++) {
			array1[i] = sc.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array1.length; j++) {
				if (array[i] == array1[j]) { // && (i != j)) {

					System.out.println("the duplicate value is :" + array[i]);
				}
			}
		}

	}

}
