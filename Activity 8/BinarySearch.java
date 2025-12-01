public class BinarySearch extends Search{
    
    @Override
    public int search(int[] arrayNums, int num){
        int low = 0;
        int high = arrayNums.length-1;
        
        
        while(low<=high){
            int mid = low + (high - low)/2;
            if(arrayNums[mid]==num){
                return mid;
            }
            
            else if(arrayNums[mid]<num){
               low = mid + 1;
            }
            
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
}