package Arrays;
import java.util.*;
public class Commen_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String array[] = new String[5];
		String array1[] = new String[5];
		System.out.println("enter strings into first array :");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextLine();
		}
		System.out.println("enter strings into second array :");
		for (int i = 0; i < array1.length; i++) {
			array1[i] = sc.nextLine();
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array1.length; j++) {
				if (array[i].equals(array1[j])) { // && (i != j)) {

					System.out.println("the duplicate value is :" + array[i]);
				}
			}
		}

	}
}
