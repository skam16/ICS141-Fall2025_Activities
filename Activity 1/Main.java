
import java.util.Scanner;
import java.util.Random;
public class Main
{
    
    public static double add(double num1, double num2){
       
        return num1+num2;
        
    }
    
     public static double subtract(double num1, double num2){
        return num1-num2;
        
    }
    
     public static double multiply(double num1, double num2){
        return num1*num2;
        
    }
    
    public static double divide(double num1, double num2){
        return num1/num2;
    }
    
    public static int randomGenerator(){
        Random random = new Random();
        return (random.nextInt(10)+1);
    }
    
    
    
	public static void main(String[] args) {
	    
	    Scanner keyboard = new Scanner(System.in);
	    Random random = new Random();
	    
	    
	    double num1,num2;
	    boolean menu1Flag = true;
	    
	   
	    System.out.println("Enter your name:");
	    String name = keyboard.nextLine();
	    
	    System.out.printf("Welcome %s to Simple Calculator\n",name);
	    
	    
	    while(menu1Flag==true){
	        System.out.println("1) Add");
	        System.out.println("2) Subtract");
	        System.out.println("3) Multiply");
	        System.out.println("4) Divide");
	        System.out.println("5) Generate a random between 1 and 10");
	        System.out.println("6) Exit");
	        
	    
	    switch(keyboard.nextInt()){
	        case 1:
    	            System.out.println("Enter first number");
	                num1 = keyboard.nextDouble();
	                System.out.println("Enter second number");
	                num2 = keyboard.nextDouble();
    	            System.out.println("Sum Result: "+ add(num1,num2));
    	            break;
	            
	        case 2:
	                System.out.println("Enter first number");
	                num1 = keyboard.nextDouble();
	                System.out.println("Enter second number");
	                num2 = keyboard.nextDouble();
	                System.out.println("Subtraction Result: "+ subtract(num1,num2));
	                break;
	            
	        case 3:
	                System.out.println("Enter first number");
	                num1 = keyboard.nextDouble();
	                System.out.println("Enter second number");
	                num2 = keyboard.nextDouble();
	                System.out.println("Multiplication Result: "+ multiply(num1,num2));
	                break;
	            
	        case 4:
    	            System.out.println("Enter first number");
    	            num1 = keyboard.nextDouble();
    	            System.out.println("Enter second number");
    	            num2 = keyboard.nextDouble();
    	            if(num2!=0)
    	            {System.out.println("Divide Result: "+ divide(num1,num2));}
    	            else{System.out.println("Divide by zero!");}
    	            break;
	       
	        case 5: System.out.println("Here is your random number between 1 and 10"+randomGenerator());
	                break;
	        case 6:
    	            menu1Flag=false;
    	            break;
	        default: System.out.println("Invalid Input");
	    }
	    
	    }
	    
	    
	
	}
}