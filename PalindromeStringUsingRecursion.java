

class Main {
    public static String check(char[] arr, int i){
        if(i>= arr.length/2){
        //  System.out.println(new String(arr));
        
            return new String(arr);
        }
        char temp= arr[arr.length-i-1];
        arr[arr.length-i-1]= arr[i];
        arr[i]=temp;
        return check(arr, i+1);
        
    }
    
    public static void main(String[] args) {
       String s="madam";
      String reversed=check( s.toCharArray(), 0);
      System.out.print(reversed.equals(s) ? "Palindrome String":"Not a Palindrome String");
    //   System.out.print(s==s);
    }
}
