

class Main {
    public static boolean check(String s , int i){
        if(i>= s.length()/2) return true;
        
        if(s.charAt(s.length()-i-1) != s.charAt(i)){
            return false;
        }
        return check(s, i+1);
    }
    public static void main(String[] args) {
      System.out.println(check("madam", 0)); // true
      System.out.println(check("abba", 0)); // true
      System.out.println(check("racecar", 0)); // true
      System.out.println(check("abcba", 0)); // true
      System.out.println(check("sir", 0)); // false
      System.out.println(check("hello", 0)); // false
    }
}
