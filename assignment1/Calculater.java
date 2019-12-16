import java.util.*;

public class Calculater {

	public static void main(String[] args) {
		double a,b,output;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st num");
		a=sc.nextDouble();
		System.out.println("enter 2nd num");
		b=sc.nextDouble();
		System.out.println("enter the operator(+,-,*,/)");
		char operator=sc.next().charAt(0);
	switch(operator)
	{
	case '+':
		output=a+b;
		System.out.println(output);
		break;
	case '-':
		output=a-b;
		System.out.println(output);
		break;
	case '*':
		output=a*b;
		System.out.println(output);
		break;
	case '/':
		output=a/b;
		System.out.println(output);
		break;
	default :
		System.out.println("you have entered wrong operator");
	}
 

	}
		
	}

