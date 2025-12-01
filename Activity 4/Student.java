
class Student{
    
    private int ID;
    private String name;
    static int number = 10;
    
    
    // Student(){
    //     this.ID=0;
    //     this.name=null;
    // }
    
    Student(String name){
        this.name = name;
    }
    
    Student(String name, int ID){
        this(name);
        this.ID=ID;
        
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public String getName(){
        return this.name;
    }
    
    
    public static int add(int a, int b){
        return a+b;
    }
    
    
    @Override
    public String toString(){
        
        String output = "Name:"+this.name+" ID: "+this.ID;
        return output;
    }
    
    
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj==null) return false;
        if(getClass() != obj.getClass()) return false;
        Student other = (Student) obj;
        return this.ID == other.ID;
    }
    
   
    
}
























 // public void setCourse(Course course){
    //     this.course = course;
    // }
    
    // public Course getCourse(){
    //     return this.course;
    // }
    
    // public String getCourseName(){
    //     return this.course.getCourseName();
    // }
    