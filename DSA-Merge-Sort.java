class Solution {
    public void mergeSort(int[] arr, int start, int end) {
        if(start >= end) return;
        int mid=(start+end)/2;
        mergeSort(arr,start, mid);
        mergeSort(arr,mid+1, end);
        sorting(arr, start, mid, end);
    }
    
    public void sorting(int[] arr,int start, int mid, int end ){
        int[] tempArr=new int[end-start+1];
        int left=start, right=mid+1, index=0;
        while(left<=mid && right<=end){
            if(arr[left]<=arr[right]){
                tempArr[index]=arr[left];
                left++; index++;
            }
            else{
                tempArr[index]=arr[right];
                right++; index++;
            }}
            while(left<=mid){
                tempArr[index]=arr[left];
                left++; index++;
            }
            while(right<=end){
                tempArr[index]=arr[right];
                right++; index++;
            }
            index=0;
            while(start<=end){
                arr[start]=tempArr[index];
                start++; index++;
            }
    } 
    }
