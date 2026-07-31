
class Main {
    public static void main(String[] args) {
      int[] arr= {1,5,5,2,3,6,5,1,1,1,1,5,2,0};
      int[] hashingArr= new int[arr.length];
     for(int i=0; i<=arr.length-1; i++){
         hashingArr[arr[i]]+=1;
     }
    //   for(int i:hashingArr) System.out.println(i);  //for testing all frequency
     
    //   Now checking The frquency of 1, 5,2;
    System.out.println("The Frequency of 1 in given array: "+ hashingArr[1]);
    System.out.println("The Frequency of 5 in given array: "+ hashingArr[5]);
    System.out.println("The Frequency of 2 in given array: "+ hashingArr[2]);
    }
}
