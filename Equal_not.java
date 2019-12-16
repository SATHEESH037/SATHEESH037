package Arrays;
import java.util.*;
public class Equal_not {

	public static void main(String[] args) {
		int[] array1 = new int[5];
		int array2[] = new int[5];
		int count = 0;
		int count1 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter elements into first array");
		for (int i = 0; i < array1.length; i++) {
			array1[i] = sc.nextInt();
		}
		System.out.println("enter elements into second array");
		for (int i = 0; i < array1.length; i++) {
			array2[i] = sc.nextInt();

		}
		if (array1.length == array2.length) {
			for (int i = 0; i < array1.length; i++) {
				if (array1[i] != array2[i]) {
					count1++;// System.out.println("the two arrays are not equal ");
				} else {
					count++;
				}
			}
			if (count == (array1.length - 1)) {
				System.out.println("two arrays are equal");
			} else if (count1 > 0) {
				System.out.println("the two arrays are not equal");
			}
		}

	}

}
 