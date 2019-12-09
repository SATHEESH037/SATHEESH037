import java.util.*;
public class Pattern7 {

	public static void main(String[] args) {
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the nom of rows");
		num=s.nextInt();
		 for(int i=1;i<=num;i++) {
			 for(int j=num;j>i;j--) {
				 System.out.print("1");
			 }
			 for(int k=1;k<=(2*i)-1;k++) {
				 System.out.print("*");
			 }
			 for(int m=num;m>i;m--) {
				 System.out.print("2");
			 }
		 System.out.println();
		 } 
	}

}

/*


1111*2222
111***222
11*****22
1*******2
*********

*/