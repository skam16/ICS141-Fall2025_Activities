import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main
{
    
    public static void divide() throws DivideByZeroException{
        int num1 = 10;
        int num2 = 0;
        
        if(num2==0){
            throw new DivideByZeroException();
        }
        
        else{
            int ans = num1/num2;
        }
    }
    
    
	public static void main(String[] args) throws FileNotFoundException {
		//Keyboard Input
		Scanner keyboard = new Scanner(System.in);
		
		//File Object for error Log
		File errorFile = new File("errorLog.txt");
	    
	    //Initializing PrintWriter to Write to Error File
		PrintWriter writeError = new PrintWriter(errorFile);
		boolean flag = true;
		
		//Menu Loop
		while(flag){
		    System.out.println("Select an Option:");
		    System.out.println("1. Divide By Zero!");
		    System.out.println("2. Array Index Out of Bounds!");
		    System.out.println("3. File Not Found!");
		    System.out.println("4. Divide by Zero Custom Unchecked!");
		    System.out.println("5. Exit!");
		    
		    System.out.println();
		    int option = keyboard.nextInt();
		    
		    switch(option){
		        
		        case 1: try {
		                    int num1=20;
		                    int num2=0;
		                    int ans = num1/num2;
		                    }
		                    catch(ArithmeticException e){
		                        System.out.println("Divide by Zero!!!");
		                        writeError.println("Divide by Zero Exception!");
		                        System.out.println();
		                    }
		                    break;
		        
		        case 2: try {
		                        int[] arrayNums = {1,2,3};
		                        System.out.println(arrayNums[3]);
		                    }
		                    catch(ArrayIndexOutOfBoundsException e){
		                        System.out.println("Array Index Out of Bounds!!!");
		                        writeError.println("Array Index Out Of Bounds!");
		                        System.out.println();
		                    }
		                    break;
		        
		        case 3: try {
		                        File file = new File("SomeText.txt");
		                        Scanner scanFile = new Scanner(file);
		                    }
		                    catch(FileNotFoundException e){
		                        System.out.println("File Not FOund!!!");
		                        writeError.println("File Not Found Exception!");
		                        System.out.println();
		                    }
		                    break;
		        
		        case 4: try{
		                divide();
		                }
		                catch(DivideByZeroException e){
		                    System.out.println("Divide By Zero Custom Exception!");
		                     writeError.println("Divide By Zero Custom Exception!");
		                }
		                    break;
		        case 5: flag=false;
		                writeError.close();
		                break;
		        
		        default: System.out.println("Invalid Option!");
		                 System.out.println();
		    }
		}
		
	}
}