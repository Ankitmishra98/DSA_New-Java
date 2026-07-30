class Main {
    public static void printing1ToN(int n){
        if(n<1) return;
        printingNameNTimes(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
   printingNameNTimes( 5);
    }
    }
