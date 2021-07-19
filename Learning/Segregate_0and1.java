class Solution {
    void segregate0and1(int[] arr, int n) {
        int count=0;
        for ( int i = 0 ; i < n ; i++){
            // if ( arr[i] >= 1){
            //     int temp = arr[n-1];
            //     arr[n-1] = arr[i];
            //     arr[i]=temp;
            // }
            if (arr[i] == 0)
            {
             count++ ;                
                
            } }
            for ( int i = 0 ; i<count ; i++){
                arr[i] = 0;
                
            }
            for ( int i = count ; i <n ; i++)
            {
                arr[i] =1 ;
            }
            
        
    }

}
