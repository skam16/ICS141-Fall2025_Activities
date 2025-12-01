public class Student{
    
    static int studentCount=0;
    private String name;
    int ID;
    int count2=0;
    
    Student(){
        this.name=null;
        studentCount+=1;
        count2+=1;
    }
    
    Student(String name){
        this.name = name;
    }
    Student(int ID){
        this.ID = ID;
    }
    
    public  void setName(String name){
        this.name=name;
    }
    
    public String getName(){
        return name;
    }
}