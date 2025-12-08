import java.util.Scanner;

public class Main
{
    
    // public static int arraySum(int index, int[] arrayNums){
        
    //     if(index == 0){
    //         System.out.println("Last call "+ arrayNums[0]);
    //         return arrayNums[0];
    //     }
        
    //     else{
    //         System.out.printf("Call for arrayNums[%d] + arrySum(%d -1, arrayNums)\n", index, index);
    //         return arrayNums[index] + arraySum(index - 1, arrayNums);
    //     }
    // }
    
    // public static int factorial(int n){
    //     if(n==0 || n==1){
    //         System.out.println("Base Case reached: 1");
    //         return 1;
    //     }
        
    //     else{
    //         System.out.printf("Call: %d * factorial(%d - 1)\n",n,n );
    //         return n * factorial(n-1);
    //     }
    // }
    
	public static void main(String[] args) {
	    //int[] arrayNums = {8,9,10,21,39,44,6,7};
	   // int index = arrayNums.length -1;
	    
	   // System.out.println("Answer for Array Sum: "+ arraySum(index,arrayNums));
	    
	   // System.out.println("Answer for Factorial:"+factorial(10));
	   
	   Scanner keyboard = new Scanner(System.in);
	   
	   Rectangle rectangle1 = new Rectangle();
	   
	   System.out.println(rectangle1);
	   
	   System.out.println(rectangle1.calculatePerimeter());
	   
	   
	   int width = rectangle1.getWidth();
	   
	   rectangle1.setWidth(width*2);
	   
	   System.out.println(rectangle1);
	   
	   //rectangle1.setWidth(rectangle1.getWidth()*2);
	   
	   //Print the perimeter out
	   System.out.println(rectangle1.calculatePerimeter());
	   boolean flag = true;
	   while(flag==true){
	   
	   try{
	       System.out.println("Enter width");
	       int width1 = keyboard.nextInt();
	       rectangle1.setWidth(width1);
	       flag= false;
	   }
	   
	   catch(RuntimeException e){
	       System.out.println(e);
	   }
	   }
	   
	}
}