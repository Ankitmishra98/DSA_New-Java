class Main {
    public static void printingNameNTimes(String n, int time){
        if(time<1) return;
        System.out.println(n);
        printingNameNTimes(n,time-1);
    }
    public static void main(String[] args) {
   printingNameNTimes("Ankit Mishra", 5);
    }
    }
