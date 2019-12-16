// Addition of two numbers and division


public class Add {
	public void Addition(int a,int b, int c) {
		
		System.out.println("the addition of numbers is : "+(a+b+c) );
	}
	
	 public void Subtraction(double a ,int b) {
		
		System.out.println("the division of two numbers is :"+(b/a));
		
	}
	public void Multiplication(float a ,double b) {
		
		System.out.println("the multiplication of two nums is :"+(a*b));
		
	}
	public void Remainder(float h ,double m) {
		
		System.out.println("the remainder of two nums is : "+(h%m));
		
	}
	
	 public void Division(float a, float b) {
		 System.out.println("the division of two numbers is :"+(b/a));
		
	}
	
	
	public static void main(String[] args) {
		Add obj=new Add();
		obj.Addition(6, 5, 9);
		obj.Subtraction(22.5, 66);
		obj.Multiplication(9, 5);
		obj.Division(9, 5);
		obj.Remainder(3, 5);
	

	}
}
