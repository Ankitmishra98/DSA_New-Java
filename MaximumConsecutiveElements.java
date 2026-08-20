class Solution {
    public int maxConsecBits(int[] arr) {
        // code here
        int max=1; int count=1;
        for(int i=0; i<arr.length-1;i++){
            if(arr[i] == arr[i+1]){
                count++;
                if(max<count){
                    max=count;
                }
            }
            else{
                count=1;
            }
            }
        
        return max;
    }
}

