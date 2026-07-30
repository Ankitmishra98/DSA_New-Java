
class Main {
    public static void reverse(int[] arr, int i){
        if(i>= arr.length/2) return ;
        
        int temp= arr[arr.length-1-i];
        arr[arr.length-1-i]= arr[i];
        arr[i]=temp;
    reverse(arr, i+1);
    }
    public static void main(String[] args) {
    int[] arr={10,20,30,40,50,60};
    System.out.println("The Original Array: ");
    for(int i: arr){
        System.out.print(i+" , ");
    }
    reverse(arr, 0);
        System.out.println("\nThe Reverse Array: ");
    for(int i: arr){
        System.out.print(i+" , ");
    }
    
    }
}
