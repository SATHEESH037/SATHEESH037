package comparable;
import java.util.*;
public class ComparableEg {
	public static void main(String args[])
	{
	ArrayList<Student> al=new ArrayList<Student>();  
	al.add(new Student(101,"Vijay",23));  
	al.add(new Student(106,"Ajay",27));  
	al.add(new Student(105,"Jai",21));  
	  
	Collections.sort(al);  
	for(Student object:al){  
	System.out.println(object.rollnum+" "+object.name+" "+object.age);  
	}  

}
}
