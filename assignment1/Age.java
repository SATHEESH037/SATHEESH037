
import java.util.*;
public class Age {

	public static void main(String[] args) {
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		age=sc.nextInt();     //age = sc.nextInt();
		if(age>=18) {
			System.out.println("you are eligible to vote");
		}
		else {
			System.out.println("you are not eligible to vote ");
		}
		
	}

}
