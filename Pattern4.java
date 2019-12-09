import java.util.*;
public class Pattern4 {

	public static void main(String[] args) {
		int n;
		Scanner p=new Scanner(System.in);                 
		System.out.println("enter the no of colmns :");
		n=p.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
   p.close();
	}

}

/*

*****
****
***
**
*

*/

 