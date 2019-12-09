
public class Pattern14 {       //pattern13

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			 for(int j=5;j>i;j--) {
				 System.out.print("3");
			 }
			 for(int k=1;k<=i;k++) {
				 System.out.print(" *");
			 }
			 System.out.println();
		  }
	 }
}
 /*

3333 *
333 * *
33 * * *
3 * * * *
 * * * * *

*/
