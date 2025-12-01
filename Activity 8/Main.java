import java.util.Scanner;

class Main{
    //returning index found
    public static int linearSearch(int []arrayNums, int num){
        
        for(int i = 0; i<arrayNums.length;i++){
            if(num == arrayNums[i]){
                return i;
            }
        }
        return -1;
    }
    
    //Element found checker
    
    public static void elementFound(int index){
        
        if(index!=-1){
            System.out.printf("Found at Index: %d\n", index);
            }
            
        else{
            System.out.println("Not Found");
        }
        
    }
    
    
    
    public static void main(String args[]){
        
        int[] arrayNums = {3,5,8,9,10,25,23,0};
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number to search:");
        int num = keyboard.nextInt();
        int index = linearSearch(arrayNums,num);
        
        System.out.printf("Linear Search Found at Index: %d\n ", index);
        
        // // Binary Search
        // int[] binarySearch = {2,3,4,5,6,7,8,9,10};
        
        
        // System.out.println("Enter number to search:");
        // num = keyboard.nextInt();
        
        // BinarySearch bSearch = new BinarySearch();
        // index = bSearch.search(binarySearch, num);
        
        // elementFound(index);
        
        //Reverse Binary Search
        int[] reverseArray = {10,9,8,7,6,4,3,1,0};
        
        ReverseBinarySearch revBSearch = new ReverseBinarySearch();
        
        System.out.println("Enter Reverse Binary number to search:");
        num = keyboard.nextInt();
        index = revBSearch.search(reverseArray, num);
        elementFound(index);
        
        
        
        // Insertion short
        
    //   int[] arraySort = {2,6,8,9,10,20,-1};
       
    //   arraySort = selectionSort(arraySort);
       
    //   for(int k: arraySort){
    //       System.out.printf("%d\t",k);
    //   }
        
        
        
        
    }
    
    
    public static int[] selectionSort(int[] arrayNums){
        //outer loop
        for(int i = 0; i<arrayNums.length;i++){
            int minIndex = i;
            
            for(int j = i+1; j<arrayNums.length;j++ )
            {
                if(arrayNums[j] < arrayNums[minIndex]){
                    minIndex = j;
                }
                
            }
            
            
            if(minIndex != i){
                int temp = arrayNums[i];
                arrayNums[i] = arrayNums[minIndex];
                arrayNums[minIndex] = temp;
            }
             for(int k: arrayNums){
                    System.out.printf("%d\t",k);
                 }
                 System.out.println();
        
        }
        return arrayNums;
    }
    
    
}