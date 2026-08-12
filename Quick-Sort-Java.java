class Main{
    public static void quickSort(int[] arr, int start, int end){
        if(start >=end) return;
        int pivot= partition(arr, start, end);
        quickSort(arr, start, pivot-1);
        quickSort(arr,  pivot+1, end);
    }
    public static int partition(int[] arr, int start, int end){
     int pos=start;
     for(int i=start; i<=end; i++){
        if(arr[i] <= arr[end]){
            int temp= arr[i];
            arr[i]=arr[pos];
            arr[pos]=temp;
            pos++;
        }
     }
     return pos-1;  
    }
    public static void main(String[] args){
        int[] arr = {42, 17, 8, 31, 23, 4, 56, 12, 9, 38};
        quickSort(arr,0,arr.length-1);
        for(int j: arr){
            System.out.print(j+" , ");
        }
    }
}
