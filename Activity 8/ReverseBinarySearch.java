public class ReverseBinarySearch extends Search{
    
    @Override
    public int search(int[] arrayNums, int num){
        int low = 0;
        int high = arrayNums.length-1;
        
        /*int[] reverseArray = {10,9,8,7,6,4,3,1,0};*/
        while(low<=high){
            int mid = low + (high - low)/2;
            if(arrayNums[mid]==num){
                return mid;
            }
            
            
            else if(arrayNums[mid]>num){
               low = mid + 1;
            }
            
            else{
                high = mid -1;
            }
        }
        return -1;
    }
}