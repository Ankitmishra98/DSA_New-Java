
class Main {
    public static void main(String[] args) {
   int[] arr = {1, 3, 2, 3, 4, 3, 5, 3, 6}; int element=0, maxCount= Integer.MIN_VALUE; 
     int[] visited= new int[arr.length]; 
     for(int i=0; i<arr.length; i++){
         int count=0;
        if(visited[i]==1) continue;
        for(int j=0; j<arr.length; j++){
            if(arr[i] == arr[j]){
             count++;
             visited[arr[i]]=1;
         }
         }
         if(maxCount<count){
             maxCount=count;
             element=arr[i];
         }
     }
     System.out.println("maxCounted: "+maxCount);
     System.out.println("Element: "+element);
     
    }
}
