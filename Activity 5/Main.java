
public class Main
{
	public static void main(String[] args) {
	
	
	Student s1 = new Student();
	Student s2 = new Student();
	Student s3 = new Student("John");
	Student s4 = new Student(20);
	Student s5 = new Student();
	
	System.out.println("Total number of students:"+Student.studentCount);
	System.out.println("Total number of students:"+s1.count2);
	System.out.println("Total number of students:"+s2.count2);
	System.out.println("Total number of students:"+s3.count2);
	System.out.println("Total number of students:"+s4.count2);
	System.out.println("Total number of students:"+s5.count2);
	int[] array = {10,20,30,40,50};
	System.out.println("Custom Utility:");
	System.out.println("Add two int values: "+CustomMath.add(20,30));
	System.out.println("Add two double values: "+CustomMath.add(20.10,30.05));
	System.out.println("Add 3 int values: "+CustomMath.add(20,30,40));
	System.out.println("Add an array of int: "+CustomMath.add(array));
	
	System.out.println("Constructor Overloading:");
	System.out.println("Student name: "+ s3.getName());
	System.out.println("Student name: "+ s4.ID);
	
	
	}
}