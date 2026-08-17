class Solution {
    int missingNum(int arr[]) {
        // code here 
        long actualSum=0;
        long calSum=((long)(arr.length+1)*(arr.length+2))/2;
    for(int i=0; i<arr.length;i++){
        actualSum+=arr[i];
    }
    return (int) (calSum-actualSum);
    }
}
