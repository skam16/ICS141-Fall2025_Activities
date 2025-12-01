
public class Main{
    
    public static void main(String args[]){
        
        System.out.println("Student Management System");
        
        Student student1 = new Student("Kam");
        
        // student1.setName("Kam");
        System.out.println(student1.getName());
        
       
        //Create new student
        Student student2 = new Student("John",2);
        
        // student2.setName("John");
        
        Student student3 = new Student("Doe");
        // student3.setName("Doe");
        
        System.out.println("Static value: "+Student.number);
        student3.number = 30;
        
        System.out.println("Static value from student 1:" +student1.number);
        System.out.println("Static value from student 1:" +student2.number);
        System.out.println("Static value from student 1:" +student3.number);
        
        student2.number= 20;
        
        System.out.println("Static value from student 1:" +student1.number);
        System.out.println("Static value from student 1:" +student2.number);
        System.out.println("Static value from student 1:" +student3.number);
        
        System.out.println();
        System.out.println();
        
        
        System.out.println("Static value from student 1:" +student1.getName());
        System.out.println("Static value from student 1:" +student2.getName());
        System.out.println("Static value from student 1:" +student3.getName());
        
        
        System.out.println("Add = "+Student.add(10,20));
        System.out.println();
        
        // Create Student Array
        
        Student[] studentList = new Student[4];
        
        studentList[0] = student1;
        studentList[1] = student2;
        studentList[2] = student3;
        
        System.out.println(studentList[0]);
        
        System.out.println("For student1 equals student1"+student1.equals(student1));
        System.out.println("For student1 equals student2 "+student1.equals(student2));
        
        System.out.println("");
        
        System.out.println(student1==student2);
        
        
        System.out.println("");
        
        // System.out.println(studentList[3].getName());
        
        
        // student3.name ="Null";
        System.out.println(student3.getName());
        
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
         // Course courseIcs141 = new Course();
        // courseIcs141.setCourseName("ICS 141-01");
        
        // student1.setCourse(courseIcs141);
        
        // System.out.println(student1.getCourseName());
        

        // Course courseIcs240 = new Course();
        // courseIcs240.setCourseName("ICS 240-01");
        
        
        // student2.setCourse(courseIcs240);
        
        
        
