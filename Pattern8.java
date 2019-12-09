
public class Pattern8 {

	public static void main(String[] args) {
	 for(int i=1;i<=5;i++) {
		 for(int j=5;j>i;j--) {
			 System.out.print("3");
		 }
		 for(int k=1;k<=(2*i)-1;k++) {
			 System.out.print("*");
		 }
		 for(int m=5;m>i;m--) {
			 System.out.print("4");
		 }
		 System.out.println();
	 }
	 for(int i=1;i<=4;i++) {
		 for(int j=1;j<=i;j++) {
			 System.out.print("5");
			 }
		  for(int k=7;k>=(2*i)-1;k--) {
			 System.out.print("*");
		 }
		  for(int m=1;m<=i;m++) {
			  System.out.print("6");
		  }
		 
		 System.out.println();
	 }
	 
	}

}

/*

3333*4444
333***444
33*****44
3*******4
*********
5*******6
55*****66
555***666
5555*6666

*/