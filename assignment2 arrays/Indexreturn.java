package Arrays;
import java.util.*;
public class Indexreturn {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[5];
		System.out.println("enter elemnets into array");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("enter the number to find index");
		int number = sc.nextInt();
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				System.out.println("the index of number :" + array[i] + " is :" + i);
			}
		}

	}
}
