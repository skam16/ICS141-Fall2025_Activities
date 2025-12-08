
public class Main
{
    
    public static int arraySum(int index, int[] arrayNums){
        
        if(index == 0){
            System.out.println("Last call "+ arrayNums[0]);
            return arrayNums[0];
        }
        
        else{
            System.out.printf("Call for arrayNums[%d] + arrySum(%d -1, arrayNums)\n", index, index);
            return arrayNums[index] + arraySum(index - 1, arrayNums);
        }
    }
    
    public static int factorial(int n){
        if(n==0 || n==1){
            System.out.println("Base Case reached: 1");
            return 1;
        }
        
        else{
            System.out.printf("Call: %d * factorial(%d - 1)\n",n,n );
            return n * factorial(n-1);
        }
    }
    
	public static void main(String[] args) {
	    int[] arrayNums = {8,9,10,21,39,44,6,7};
	    int index = arrayNums.length -1;
	    
	    System.out.println("Answer for Array Sum: "+ arraySum(index,arrayNums));
	    
	    System.out.println("Answer for Factorial:"+factorial(100000));
	}
}