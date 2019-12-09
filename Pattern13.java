
public class Pattern13 {

	public static void main(String[] args) {           
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("9");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++){
			System.out.print("6");
		}
			for(int k=5;k>=i;k--) {
				System.out.print(" *");
				/*for(int k=5;k>=(2*i)-1;k--){
				if(i=2&&j=5||3&&4||3&&6||4&&3||4&&5||4&&7||5&&2||5&&4||5&&6||5&&8) {
					System.out.print("*");
					else
						System.out.print(" ");
				}
				//System.out.print(" *");
			}*/
			}
		System.out.println();
	}

}
}
/*
 
99999 *
9999 * *
999 * * *
99 * * * *
9 * * * * *
6 * * * * *
66 * * * *
666 * * *
6666 * *
66666 *

*/

