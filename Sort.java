package Arrays;
import java.util.*;
public class Sort {

	public static void main(String[] args) {
		String name[]=new String[5];
		String temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the names ");
		for(int i=0;i<name.length;i++) {
			name[i]=sc.nextLine();
		}
		for (int i = 0; i < name.length; i++) {
			for (int j = i + 1; j < name.length; j++) {
				if (name[i].compareTo(name[j]) > 0){
					temp = name[i];
					name[i] = name[j];
					name[j] = temp;
				}
			}
		}
		System.out.println("the sorted strings are");
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);

	}
		    // integer starts from here

		int a[] = new int[5];    
		int temp1 = 0;
		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter elments into array");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc1.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp1 = a[i];
					a[i] = a[j];
					a[j] = temp1;
				}
			}
		}
		System.out.println("the elements in sorted order are");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
}
}
}