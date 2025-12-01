abstract class Search{
    
    public abstract int search(int[] arrayNums, int num);
    
    public void printArray(int[] arrayNums){
        
        for(int i = 0; i < arrayNums.length; i++){
            System.out.printf("Num %d : %d",i,arrayNums[i]);
        }
        
    }
}