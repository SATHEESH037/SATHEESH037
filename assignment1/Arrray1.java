import java.util.*;
public class Arrray1 {

	public static void main(String[] args) {
		int[] a;
		 a=new int[10];
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the values");
		for(int i=0;i<a.length;i++) {
		a[i]=s.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
		System.out.println("   "+a[i]);
		}
	}
}

