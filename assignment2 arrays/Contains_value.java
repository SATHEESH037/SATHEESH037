package Arrays;
import java.util.*;
public class Contains_value {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = { 3, 4, 6, 9, 9, 0, 5 };
		int j = 0;
		System.out.println("enter a value");
		int value = sc.nextInt();
		for (int i = 0; i < array.length; i++) {
			if (array[i]==value) {
				j++;
			}
		} 
		if(j>0) {
			System.out.println("array contains the element");	
			}
		else {
			System.out.println("array does not contain the value");
		}
}
}