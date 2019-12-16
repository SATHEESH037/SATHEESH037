package comparable;

//import java.lang.*;
public class Student implements Comparable<Student> {
	int rollnum;

	String name;
	int age;

	Student(int rollnum, String name, int age) {
		this.rollnum = rollnum;

		this.name = name;
		this.age = age;
	}

	public int compareTo(Student object) {
		if (age == object.age)
			return 0;
		else if (age > object.age)
			return 1;
		else
			return -1;
	}

}
