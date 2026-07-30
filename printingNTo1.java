class Main {
    public static void printingNTo1(int n){
        if(n<1) return;
        System.out.println(n);
       printingNTo1(n-1);
    }
    public static void main(String[] args) {
printingNTo1(5);
    }
    }
