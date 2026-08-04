        //arrays-selection-sort
class Main {
    public static void main(String[] args) {
       int[] arr = {4, 2, 7, 4, 8, 2, 4, 1, 2, 4, 5, 2, 4};
       System.out.println("UnSortedArray:");
       for(int ele:arr){
       System.out.print(ele+" , ");
       }
       
       for(int i=0; i<arr.length-1; i++){
           int min=i;
           for(int j=i+1; j<arr.length; j++){
               if(arr[min]>arr[j]){
                   min=j;
               }
           }
            int temp= arr[i];
               arr[i]=arr[min];
               arr[min]=temp;
       }
        System.out.println("\nSortedArray:");
        for(int ele:arr){
       System.out.print(ele+" , ");
       }  
       
    }
}
