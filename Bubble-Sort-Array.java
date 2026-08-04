
class Main {
    public static void main(String[] args) {
int[] arr = {5, 2, 8, 1, 9, 3};

for(int i=arr.length-1; i>=0; i--){
    boolean isSwapped=false;
    for(int j=0; j<=i-1; j++){
        if(arr[j]>arr[j+1]){
            int temp= arr[j+1];
            arr[j+1]=arr[j];
            arr[j]=temp;
            isSwapped=true;
        }
    }
    if(!isSwapped){
        break;
    }
}

for(int i:arr){
    System.out.print(i+" , ");
}
    }
}
