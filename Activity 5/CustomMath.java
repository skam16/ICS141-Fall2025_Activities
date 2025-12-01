public class CustomMath{
    
    public static int add(int a, int b){
        return a+b;
    }
   
    
    public static int add(int a, int b,int c){
        return a+b+c;
    }
    
    public static double add(double a, double b){
        return a+b;
    }
    
    public static double add(double a, double b, double c){
        return a+b;
    }
    
    public static int add(int[] array){
        int total=0;
        for(int num: array){
           total+= num; 
        }
        
        return total;
    }
   
}