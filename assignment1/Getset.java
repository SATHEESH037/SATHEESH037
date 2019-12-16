import java.io.ObjectInputStream.GetField;

public class Getset {
	int a;
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	float b;
	int c;

	public static void main(String[] args) {
		Getset obj=new Getset();
		obj.setA(5);
		obj.setB(5.4F);
		obj.setC(6);
		System.out.println(geta);
		 

	}

}
