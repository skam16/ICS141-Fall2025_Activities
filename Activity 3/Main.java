
import java.util.Scanner;

public class Main{
    
    //Scanner input from keyboard
    static Scanner keyboard = new Scanner(System.in);
    
    
    
    //getArray method
    
    public static int[] getArray(){
        System.out.println("Enter size of array");
        int size = keyboard.nextInt();
        int[] numbers = new int[size];
       
        
        for(int i = 0; i<size;i++){
            System.out.printf("Enter number %d: ",(i+1));
            numbers[i] = keyboard.nextInt();
           
        }
        
        return numbers;
       
       
        
    }
    
    //finding Minimum
    public static void findMin(int[] numbers){
        
        int min = numbers[0];
        
        for(int number: numbers){
            if(number<min){
                min = number;
            }
        }
    
        System.out.printf("Minimum number: %d",min);
        
    }
    
    //method to display a sample ragged array
    public static void print2dArrayRagged(){
        
        int[][] sample = {{2,3,4,5,6},{4,5,6,7},{3,4}};
        
        
        for(int i = 0;i<sample.length;i++){
            
            for(int j = 0; j<sample[i].length;j++){
                System.out.printf("%d\t",sample[i][j]);
                
            }
            System.out.println();
            
        }
        
        
    }
    
    
    public static void print2dArray(){
        
        System.out.println("Enter number of rows");
        int rows = keyboard.nextInt();
        
        
        System.out.println("Enter number of columns");
        int cols = keyboard.nextInt();
        
        
        int[][] twoD = new int[rows][cols];
        
        for(int i=0;i<twoD.length;i++){
            
            for(int j = 0;j< twoD[i].length;j++){
                
                System.out.printf("Enter the number: ");
                twoD[i][j] = keyboard.nextInt();
            }
            
        }
        
        //printing to console
         for(int i=0;i<rows;i++){
            
            for(int j = 0;j< cols;j++){
                
                System.out.printf("%d\t",twoD[i][j]);
               
            }
            
            System.out.println();
            
        }
            
        
    }
    
 
    
    public static void main(String[] args){
        
        //int[] numbers = getArray();
        
        //findMin(numbers);
        
        //Ragged Arrays
        //print2dArrayRagged();
        
        //2d array
        
        //print2dArray();
        
        
       
       
       //column wise traversal
    //   int[][] test =  {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{11,12,13,14,15},{11,12,13,14,15}};
       
       
    //   for(int i = 0; i<test.length;i++){
           
           
    //       for(int i = 0; i<test.length;i++){
               
    //           System.out.printf("%d\t",test[j][i]);
    //       }
           
    //       System.out.println();
               
    
    //   }

     
    }

}