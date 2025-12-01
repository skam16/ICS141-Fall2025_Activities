import java.util.Scanner;

public class Main
{
    
    //method to calculate average takes total and an array as input return avearge(double) as output
    public static double average(int total, int[] numbers){
        
        double average = (double)total/numbers.length;
        return average;
        
    }
    
    // get size and initialize an array using user input and return the array
    public static int[] getArray(){
        Scanner keyboard = new Scanner(System.in);
	    
	    System.out.println("Enter size of array:");
	    int size = keyboard.nextInt();
	    
	    int[] numbers = new int[size];
	    
	    for(int i = 0; i<numbers.length;i++){
	    System.out.println("Enter the number:");
	    numbers[i] = keyboard.nextInt();
	    
	    }
	    
	    return numbers;
    }
    
    
    
    // print the array
    public static void printArray(int[] numbers){
        for(int j = 0;j< numbers.length;j++){
	        System.out.printf("Number %d: \t %d\n",j,numbers[j]);
	    }
	    
    }
    
    //calculate the running total of the input array
    public static int getTotal(int[] numbersArray){
        
         int total = 0;
	    for (int k = 0; k< numbersArray.length; k++){
	        total+= numbersArray[k];
	        
	    }
	    
	    return total;
        
        
    }
    
    
    // Sequential Search
    //go over the array look for the match
    //once you find it display found and at what Index
    //if not display not found
    
    public static int search(int numbers[]){
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number to search");
        int searchNum = keyboard.nextInt();
        for(int i = 0; i<numbers.length;i++){
            
            if(numbers[i]==searchNum){
                return i;
            }
            
        }
        return -1;
    }
    
    
    
    
    
	public static void main(String[] args) {
	    
	    
	    
	    //Get the array
	    int[] numbers = getArray();
	    
	    // print the Array
	    printArray(numbers);
	    
	    //Get the total
	    int total = getTotal(numbers);
	    
	    System.out.println("Total = "+total);
	    
	    
	    
	    //Calculate the average
	    System.out.printf("Average = %.2f",average(total,numbers));
	    
	    
	    //find the number
	    
	    int found = search(numbers);
	    
	    if(found!=-1)
	    {
	        System.out.println("Found at "+ found);
	        
	    }
	    
	    else{
	        System.out.println("Not found");
	        
	    }
	   
	   
	    
	 
		
	}
}
